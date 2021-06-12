package com.zyp.dagger.kotlin

import com.zyp.dagger.kotlin.di.DaggerApplicationGraph


fun main() {
    val applicationGraph = DaggerApplicationGraph.create()
    val userRepository = applicationGraph.repository()
    val userRepository2 = applicationGraph.repository()
    println("userRepository != userRepository2 is ${userRepository != userRepository2}")

}