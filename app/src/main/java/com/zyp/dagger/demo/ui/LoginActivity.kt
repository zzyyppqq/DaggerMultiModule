package com.zyp.dagger.demo.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.zyp.dagger.demo.AppApplication
import com.zyp.dagger.demo.R
import com.zyp.dagger.demo.di.LoginComponent
import com.zyp.dagger.demo.ui.viewmodel.LoginViewModel
import javax.inject.Inject

class LoginActivity : AppCompatActivity() {

    //private val mainViewModel: MainViewModel by viewModels()

    /**
     * LoginComponent 是在 Activity 的 onCreate() 方法中创建的，
     * 将随着 Activity 的销毁而被隐式销毁。
     */
    lateinit var loginComponent: LoginComponent

    @Inject
    lateinit var loginViewModel: LoginViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        // Creation of the login graph using the application graph
        loginComponent = (applicationContext as AppApplication)
            .appComponent.loginComponent().create()
        // Make Dagger instantiate @Inject fields in LoginActivity
        loginComponent.inject(this)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login_activity)
    }
}