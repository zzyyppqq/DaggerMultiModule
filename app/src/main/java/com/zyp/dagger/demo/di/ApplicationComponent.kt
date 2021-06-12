package com.zyp.dagger.demo.di

import dagger.Component
import javax.inject.Singleton

/**
 * 为了使 Dagger 图了解NetworkModule模块，您必须将其添加到 @Component 接口
 */
@Singleton
@Component(modules = [NetworkModule::class, SubcomponentsModule::class])
interface ApplicationComponent {
    // This function exposes the LoginComponent Factory out of the graph so consumers
    // can use it to obtain new instances of LoginComponent
    fun loginComponent(): LoginComponent.Factory
}