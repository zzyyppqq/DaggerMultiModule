package com.zyp.dagger.kotlin.scope

import javax.inject.Scope

// Creates MyCustomScope
@Scope
@MustBeDocumented
@Retention(value = AnnotationRetention.RUNTIME)
annotation class MyCustomScope