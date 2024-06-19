package com.plcoding.jetpackcomposepokedex.data.remote.responses


import com.google.gson.annotations.SerializedName

data class Cries(
    val latest: String,
    val legacy: String
)