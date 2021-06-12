/*
 * Copyright (C) 2019 NaLong. All Rights Reserved.
 * NaLong group reserve all right of the client.
 * Without authorization, no individual or organization may copy, extract or modify it.
 * If you find any infringement, please contact us.
 */
package com.zyp.dagger.demo.ui.viewmodel

import com.zyp.dagger.demo.di.scope.ActivityScope
import com.zyp.dagger.kotlin.repository.UserRepository
import javax.inject.Inject

/**
 * 描述：MainViewModel
 * 作者：@author alex
 * 创建时间：2021/6/11 3:27 下午
 */
@ActivityScope
class LoginViewModel @Inject constructor(private val userRepository: UserRepository){

}