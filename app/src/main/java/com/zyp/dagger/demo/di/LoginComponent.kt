package com.zyp.dagger.demo.di

import com.zyp.dagger.demo.di.scope.ActivityScope
import com.zyp.dagger.demo.ui.LoginActivity
import com.zyp.dagger.demo.ui.LoginPasswordFragment
import com.zyp.dagger.demo.ui.LoginUsernameFragment
import dagger.Component
import dagger.Subcomponent
import javax.inject.Singleton

/**
 * LoginComponent
 */
@ActivityScope
@Subcomponent
interface LoginComponent {
    // 在 LoginComponent 内定义子组件 factory，以便 ApplicationComponent 知道如何创建 LoginComponent 的实例
    @Subcomponent.Factory
    interface Factory {
        fun create(): LoginComponent
    }

    /**
     * LoginActivity 应从 LoginComponent 获得注入，因为它具有特定于登录的配置。
     * 这可免于从 ApplicationComponent 类注入 LoginActivity
     */
    fun inject(activity : LoginActivity)
    fun inject(usernameFragment: LoginUsernameFragment)
    fun inject(passwordFragment: LoginPasswordFragment)
}