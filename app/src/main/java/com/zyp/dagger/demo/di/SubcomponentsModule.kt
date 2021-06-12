package com.zyp.dagger.demo.di

import dagger.Module

// The "subcomponents" attribute in the @Module annotation tells Dagger what
// Subcomponents are children of the Component this module is included in.
/**
 * 需告知 Dagger LoginComponent 是 ApplicationComponent 的子组件
 * 1、创建新的 Dagger 模块（例如 SubcomponentsModule），并将子组件的类传递给注释的 subcomponents 属性
 * 2、将新模块（即 SubcomponentsModule）添加到 ApplicationComponent
 */
@Module(subcomponents = [LoginComponent::class])
class SubcomponentsModule {

}