package com.example.core2.model

import android.os.Parcel
import android.os.Parcelable

@Parcelize
data class Game(
    var image: Int?,
    var name: String?,
    var date: String?,
    var type: String?,
    var rating: Float = 0f)
    : Parcelable {

    constructor(parcel: Parcel) : this(
        parcel.readInt(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readFloat()) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        image?.let { parcel.writeInt(it) }
        parcel.writeString(name)
        parcel.writeString(date)
        parcel.writeString(type)
        parcel.writeFloat(rating)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<Game> {
        override fun createFromParcel(parcel: Parcel): Game {
            return Game(parcel)
        }

        override fun newArray(size: Int): Array<Game?> {
            return arrayOfNulls(size)
        }
    }
}

annotation class Parcelize


