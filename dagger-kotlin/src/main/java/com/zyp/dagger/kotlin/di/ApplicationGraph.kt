package com.zyp.dagger.kotlin.di

import com.zyp.dagger.kotlin.repository.UserRepository
import com.zyp.dagger.kotlin.scope.MyCustomScope
import dagger.Component

// @Component makes Dagger create a graph of dependencies
//@Singleton
@MyCustomScope
@Component
interface ApplicationGraph {
    // The return type  of functions inside the component interface is
    // what can be provided from the container
    fun repository(): UserRepository
}