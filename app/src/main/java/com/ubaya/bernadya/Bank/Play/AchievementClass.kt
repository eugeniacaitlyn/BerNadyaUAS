package com.ubaya.bernadya.Bank.Play

import android.os.Parcel
import android.os.Parcelable

data class AchievementClass(val namaAchievement: String,
                            val tahun: Int) : Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readString() ?: "", parcel.readInt()
    )

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(namaAchievement)
        parcel.writeInt(tahun)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<AchievementClass> {
        override fun createFromParcel(parcel: Parcel): AchievementClass {
            return AchievementClass(parcel)
        }

        override fun newArray(size: Int): Array<AchievementClass?> {
            return arrayOfNulls(size)
        }
    }
}
