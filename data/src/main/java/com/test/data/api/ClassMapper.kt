package com.test.data.api

import com.google.gson.Gson

fun <T> Any.convertTo(clazz: Class<T>): T {
    val json = Gson().toJson(this)
    return Gson().fromJson(json, clazz)
}