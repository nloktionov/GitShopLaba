package com.example.gitshoplaba.database

import androidx.lifecycle.LiveData
import androidx.room.Insert
import androidx.room.Query

interface RegisterDatabaseDao {
    @Insert
    suspend fun insert(register: RegisterEntity)

    @Query("SELECT * FROM Register_users_table ORDER BY userId DESC")
    fun getAllUsers(): LiveData<List<RegisterEntity>>

    @Query("SELECT * FROM Register_users_table WHERE user_name LIKE :userName")
    suspend fun getUsername(userName: String): RegisterEntity?
}