package com.zyp.dagger.demo.di

import com.zyp.dagger.demo.http.api.LoginRetrofitService
import com.zyp.dagger.demo.http.api.LoginService
import dagger.Module
import dagger.Provides
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import javax.inject.Singleton

// @Module informs Dagger that this class is a Dagger Module
@Module
class NetworkModule {

    // @Provides tell Dagger how to create instances of the type that this function
    // returns (i.e. LoginRetrofitService).
    // Function parameters are the dependencies of this type.
    @Singleton
    @Provides
    fun provideOkHttpClient(): OkHttpClient {
        // Whenever Dagger needs to provide an instance of type LoginRetrofitService,
        // this code (the one inside the @Provides method) is run.
        return OkHttpClient.Builder().build()
    }

    @Singleton
    @Provides
    fun provideLoginRetrofitService(okHttpClient: OkHttpClient): LoginRetrofitService {
        return Retrofit.Builder()
            .client(okHttpClient)
            .baseUrl("https://example.com")
            .build()
            .create(LoginService::class.java)
    }

}