package com.example.gitshoplaba.database

import androidx.room.Entity
import androidx.room.PrimaryKey
import androidx.room.ColumnInfo

@Entity(tableName = "Register_users_table")
data class RegisterEntity(

    @PrimaryKey(autoGenerate = true)
    var userId: Int = 0,

    @ColumnInfo(name = "first_name")
    var firstName: String,

    @ColumnInfo(name = "last_name")
    var lastName: String,

    @ColumnInfo(name = "user_name")
    var userName: String,

    @ColumnInfo(name = "password_text")
    var password: String,

    @ColumnInfo(name = "wallet_int")
    var wallet: Int = 0,

    @ColumnInfo(name = "bonus_int")
    var bonus: Int = 0


) {

}