package com.ezatpanah.navigationcomponent.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class User(val name:String,
val email:String) :Parcelable
