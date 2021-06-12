/*
 * Copyright (C) 2019 NaLong. All Rights Reserved.
 * NaLong group reserve all right of the client.
 * Without authorization, no individual or organization may copy, extract or modify it.
 * If you find any infringement, please contact us.
 */
package com.zyp.dagger.demo

import android.app.Application
import com.zyp.dagger.demo.di.ApplicationComponent
import com.zyp.dagger.demo.di.DaggerApplicationComponent

/**
 * 描述：
 * 作者：@author alex
 * 创建时间：2021/6/11 3:51 下午
 */
class AppApplication: Application() {
    lateinit var appComponent: ApplicationComponent
    override fun onCreate() {
        super.onCreate()

        appComponent = DaggerApplicationComponent.create()
    }
}