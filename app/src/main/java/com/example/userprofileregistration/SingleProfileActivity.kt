package com.example.userprofileregistration

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class SingleProfileActivity : AppCompatActivity() {
    private lateinit var argentinaProfile: Profile
    private lateinit var nameTextView: TextView
    private lateinit var emailTextView: TextView
    private lateinit var dobTextView: TextView
    private lateinit var districtTextView: TextView
    private lateinit var mobileTextView: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_single_profile)
        argentinaProfile = intent.getSerializableExtra("USER_PROFILE") as Profile

        nameTextView = findViewById(R.id.nameTextView)
        emailTextView = findViewById(R.id.emailTextView)
        dobTextView = findViewById(R.id.dobTextView)
        districtTextView = findViewById(R.id.districtTextView)
        mobileTextView = findViewById(R.id.mobileTextView)

        populateFields()
    }

    private fun populateFields() {
        nameTextView.text = argentinaProfile.name
        emailTextView.text = argentinaProfile.email
        dobTextView.text = argentinaProfile.dob
        districtTextView.text = argentinaProfile.district
        mobileTextView.text = argentinaProfile.mobile
    }
}