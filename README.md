# W2026 MAD302-01 Android Development - ASSIGNMENT 1

**Name:** Darshilkumar Karkar  
**Student ID:** A00203357  
**Submission Date:** 29 March 2026

## Project Description
This is an Android application developed as part of Assignment 1 for the MAD302 course. The app features two screens:
1. **Main Screen:** Displays a list of at least 6 courses using a `RecyclerView`.
2. **Detail Screen:** Opens when a course is tapped, showing detailed information (code, name, and description) of the selected course.

## Requirements Implemented
- **Data Model:** Created a Kotlin `data class` named `Course`.
- **RecyclerView:** Implemented an `Adapter` and `ViewHolder` to display the course list.
- **Interaction:** Handled click events for each course item to open a second screen.
- **Data Passing:** Used `Intent` extras to pass data between activities.
- **Modern UI:** Enhanced layout using Material Design components, `CardView`, and a polished color palette.

## Layouts
- `activity_main.xml`: Main screen containing the `RecyclerView`.
- `activity_detail.xml`: Detail screen showing specific course information.
- `list_item.xml`: Custom layout for each course row in the list.

## Documentation
The project follows best practices for documentation:
- **File Headers:** Included in every `.kt` file with course details, name, ID, and description.
- **Javadoc Comments:** Used `/** ... **/` for all classes and methods.
- **Inline Comments:** Provided to explain important logic throughout the code.

## Submission Details
- **GitHub Repository:** [MAD302-ASSIGNMENT01-DARSHILKUMAR-KARKAR](https://github.com/darshil2711/MAD302-ASSIGNMENT01-DARSHILKUMAR-KARKAR)
- **Git Workflow:** Includes at least 5 meaningful commits and 3 merged Pull Requests.
