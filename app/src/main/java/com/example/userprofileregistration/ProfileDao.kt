package com.example.userprofileregistration

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update


@Dao
interface ProfileDao {
    @Insert
    suspend fun insert(argentinaProfile: Profile)

    @Update
    suspend fun update(argentinaProfile: Profile)

    @Delete
    suspend fun delete(argentinaProfile: Profile)

    @Query("SELECT * FROM profile")
    fun getAllUserProfiles(): LiveData<List<Profile>>
}