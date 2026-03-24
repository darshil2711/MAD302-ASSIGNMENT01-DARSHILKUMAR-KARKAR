/**
 * Course Code: MAD302
 * Lab Number: Assignment 1
 * Name: Darshilkumar Karkar
 * Student ID: A00203357
 * Date: 29 March 2026
 * Description: Repository class that provides a static list of courses.
 */
package com.example.courselist

/**
 * Repository object to manage and provide course data.
 */
object CourseRepository {
    /**
     * Returns a list of 6 courses as per assignment requirements.
     * @return List of Course objects
     */
    fun getCourses(): List<Course> {
        return listOf(
            Course("MAD302", "Android Development", "Learn to build modern Android apps using Kotlin, RecyclerView, and Material Design."),
            Course("CS101", "Introduction to Java", "Fundamentals of object-oriented programming with Java including classes and inheritance."),
            Course("WEB201", "Full Stack Development", "Master both front-end (HTML/CSS/JS) and back-end (Node.js) web technologies."),
            Course("DB305", "Database Management", "In-depth study of SQL, NoSQL, and efficient database design principles."),
            Course("UI402", "UX/UI Design", "Design user-friendly interfaces and high-fidelity prototypes using modern tools."),
            Course("SEC500", "Cybersecurity Basics", "Principles of network security, encryption, and ethical hacking practices.")
        )
    }
}
