package com.example.utsnative_menumakananfavorit

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class makanan(
    val imgMakanan: Int,
    val nameMakanan: String,
    val descMakanan: String
) : Parcelable
