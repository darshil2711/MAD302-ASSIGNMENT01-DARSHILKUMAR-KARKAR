/**
 * Course Code: MAD302
 * Lab Number: Assignment 1
 * Name: Darshilkumar Karkar
 * Student ID: A00203357
 * Date: 29 March 2026
 * Description: Activity that displays details of a selected course.
 */
package com.example.courselist

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class DetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        // Retrieve data passed from MainActivity via Intent
        val code = intent.getStringExtra("code")
        val name = intent.getStringExtra("name")
        val description = intent.getStringExtra("description")

        // Find views in the layout
        val codeTextView: TextView = findViewById(R.id.detailCourseCode)
        val nameTextView: TextView = findViewById(R.id.detailCourseName)
        val descriptionTextView: TextView = findViewById(R.id.detailCourseDescription)

        // Display the data
        codeTextView.text = code
        nameTextView.text = name
        descriptionTextView.text = description
        
        // Set the title of the action bar to the course name
        supportActionBar?.title = "Course Details"
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }

    // Handle back button in action bar
    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}
