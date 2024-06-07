package Models;

import Enums.CourseOffer;

public class Courses {
    private CourseOffer courseOffer;

    public CourseOffer getCourseOffer() {
        return courseOffer;
    }

    @Override
    public String toString() {
        return "Courses{" +
                "courseOffer=" + courseOffer +
                '}';
    }

    public Courses(CourseOffer courseOffer) {
        this.courseOffer = courseOffer;
    }
}
