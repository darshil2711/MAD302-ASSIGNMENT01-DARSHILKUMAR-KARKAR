/**
 * Course Code: MAD302
 * Lab Number: Assignment 1
 * Name: Darshilkumar Karkar
 * Student ID: A00203357
 * Date: 29 March 2026
 * Description: Main Activity that displays a list of courses in a RecyclerView.
 */
package com.example.courselist

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Initialize RecyclerView
        val recyclerView: RecyclerView = findViewById(R.id.recyclerView)
        
        // Set Layout Manager
        recyclerView.layoutManager = LinearLayoutManager(this)

        // Get course data from Repository
        val courses = CourseRepository.getCourses()

        // Initialize and set Adapter
        val adapter = CourseAdapter(this, courses)
        recyclerView.adapter = adapter
    }
}
