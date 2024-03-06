package id.bobipermanasandii.myrecyclerview

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Hero(
    val name: String,
    val description: String,

    // IMAGE FROM INTEGER
//    val photo: Int

    // IMAGE FROM STRING
    val photo: String
) : Parcelable
