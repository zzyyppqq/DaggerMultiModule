package com.zyp.dagger.demo.ui

import android.content.Context
import androidx.fragment.app.Fragment
import com.zyp.dagger.demo.ui.viewmodel.LoginViewModel
import javax.inject.Inject

class LoginPasswordFragment: Fragment() {

    // Fields that need to be injected by the login graph
    @Inject
    lateinit var loginViewModel: LoginViewModel

    override fun onAttach(context: Context) {
        super.onAttach(context)

        (activity as LoginActivity).loginComponent.inject(this)

        // Now you can access loginViewModel here and onCreateView too
        // (shared instance with the Activity and the other Fragment)
    }
}