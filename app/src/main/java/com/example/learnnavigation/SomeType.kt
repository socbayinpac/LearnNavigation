package com.example.learnnavigation

import android.os.Parcel
import android.os.Parcelable

class SomeType(var name: String?): Parcelable {
     var age: Int = 0

    constructor(parcel: Parcel) : this(parcel.readString()) {
        age = parcel.readInt()
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(name)
        parcel.writeInt(age)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<SomeType> {
        override fun createFromParcel(parcel: Parcel): SomeType {
            return SomeType(parcel)
        }

        override fun newArray(size: Int): Array<SomeType?> {
            return arrayOfNulls(size)
        }
    }

}