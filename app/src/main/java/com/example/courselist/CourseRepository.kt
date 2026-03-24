package com.example.courselist

/**
 * Repository class to provide course data.
 */
object CourseRepository {
    /**
     * Returns a list of at least 6 courses.
     */
    fun getCourses(): List<Course> {
        return listOf(
            Course("MAD302", "Android Development", "Learn to build Android apps using Kotlin and Jetpack Compose."),
            Course("CS101", "Introduction to Java", "Fundamentals of object-oriented programming with Java."),
            Course("WEB201", "Full Stack Development", "Master both front-end and back-end web technologies."),
            Course("DB305", "Database Management", "SQL, NoSQL, and database design principles."),
            Course("UI402", "UX/UI Design", "Design user-friendly interfaces and high-fidelity prototypes."),
            Course("SEC500", "Cybersecurity Basics", "Principles of network security and ethical hacking.")
        )
    }
}
