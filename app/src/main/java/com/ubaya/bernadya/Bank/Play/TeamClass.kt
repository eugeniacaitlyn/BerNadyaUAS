package com.ubaya.bernadya.Bank.Play

import android.os.Parcel
import android.os.Parcelable

data class TeamClass(val namaTeam: String,
                     val memberList: List<MemberClass>, val imgTeam: String): Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readString() ?: "",
        parcel.createTypedArrayList(MemberClass) ?: listOf(),
        parcel.readString() ?: ""
    )

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(namaTeam)
        parcel.writeTypedList(memberList)
        parcel.writeString(imgTeam)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<TeamClass> {
        override fun createFromParcel(parcel: Parcel): TeamClass {
            return TeamClass(parcel)
        }

        override fun newArray(size: Int): Array<TeamClass?> {
            return arrayOfNulls(size)
        }
    }
}
