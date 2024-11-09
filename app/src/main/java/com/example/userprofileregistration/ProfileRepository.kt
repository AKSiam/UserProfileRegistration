package com.example.userprofileregistration

import androidx.lifecycle.LiveData

class ProfileRepository (private val userProfileDao: ProfileDao) {
    fun getUserProfiles(): LiveData<List<Profile>> {
        return userProfileDao.getAllUserProfiles()
    }

    suspend fun insert(userProfile: Profile) {
        userProfileDao.insert(userProfile)
    }

    suspend fun update(userProfile: Profile) {
        userProfileDao.update(userProfile)
    }

    suspend fun delete(userProfile: Profile) {
        userProfileDao.delete(userProfile)
    }
}