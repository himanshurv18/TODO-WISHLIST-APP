package com.example.wishlistapp.Data

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "wish-table")
data class Wish(
    @PrimaryKey(autoGenerate = true)
    val id: Long = 0L,
    @ColumnInfo(name = "wish-title")
    val title: String = "",
    @ColumnInfo(name = "wish-desc")
    val description: String = ""
)


object DummyWish{
    val wishList = listOf(
        Wish(title = "Google watch",
            description = "An android watch."),
        Wish(title = "oculus Quest 2",
            description = "A vr headset for playing games.")

    )

}
