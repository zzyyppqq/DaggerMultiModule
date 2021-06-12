/*
 * Copyright (C) 2019 NaLong. All Rights Reserved.
 * NaLong group reserve all right of the client.
 * Without authorization, no individual or organization may copy, extract or modify it.
 * If you find any infringement, please contact us.
 */
package com.zyp.dagger.kotlin.repository

import com.zyp.dagger.kotlin.repository.data.UserLocalDataSource
import com.zyp.dagger.kotlin.repository.data.UserRemoteDataSource
import com.zyp.dagger.kotlin.scope.MyCustomScope
import javax.inject.Inject

/**
 * 描述：UserRepository
 * 作者：@author alex
 * 创建时间：2021/6/11 3:28 下午
 *
 * 向 UserRepository 构造函数添加 @Inject 注释，以便告知 Dagger 如何创建 UserRepository
 */
@MyCustomScope
class UserRepository @Inject constructor(private val localDataSource: UserLocalDataSource,
                                         private val remoteDataSource: UserRemoteDataSource
) {

}