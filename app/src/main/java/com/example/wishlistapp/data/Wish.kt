package com.example.wishlistapp.data

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "wish-table")
data class Wish(
    @PrimaryKey(autoGenerate = true)
    val id: Long = 0L,
    @ColumnInfo(name = "wish-table")
    val title: String = "",
    @ColumnInfo(name = "wish-description")
    val description: String = ""
)

object DummyWish{
    val wishList = listOf(
        Wish(title = "Get a Job",
            description = "Software Developer Intern"),
        Wish(title = "Get a Laptop",
            description = "With High End Specs"),
        Wish(title = "Get a Setup",
            description = "Setup with Gaming Chair"),
        Wish(title = "Get a Job in Japan",
            description = "As a Android Developer"),
    )
}
