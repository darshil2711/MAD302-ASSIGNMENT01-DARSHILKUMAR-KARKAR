/**
 * Course Code: MAD302
 * Lab Number: Assignment 1
 * Name: Darshilkumar Karkar
 * Student ID: A00203357
 * Date: 29 March 2026
 * Description: Adapter for the RecyclerView to display course items.
 */
package com.example.courselist

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class CourseAdapter(
    private val context: Context,
    private val courseList: List<Course>
) : RecyclerView.Adapter<CourseAdapter.CourseViewHolder>() {

    class CourseViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val courseCode: TextView = itemView.findViewById(R.id.courseCode)
        val courseName: TextView = itemView.findViewById(R.id.courseName)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CourseViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.list_item, parent, false)
        return CourseViewHolder(view)
    }

    override fun onBindViewHolder(holder: CourseViewHolder, position: Int) {
        val course = courseList[position]

        holder.courseCode.text = course.code
        holder.courseName.text = course.name

        // Implementation of Requirement: Pass data using Intent extras
        holder.itemView.setOnClickListener {
            val intent = Intent(context, DetailActivity::class.java)
            
            // Adding course data to the intent
            intent.putExtra("code", course.code)
            intent.putExtra("name", course.name)
            intent.putExtra("description", course.description)
            
            context.startActivity(intent)
        }
    }

    override fun getItemCount(): Int = courseList.size
}
