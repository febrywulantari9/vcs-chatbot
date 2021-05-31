package com.febrina.vcsapp.data

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Message (
        val message: String,
        val id: Int,
        val time: String
):Parcelable