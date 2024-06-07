package Services;

import Models.Courses;
import Models.Students;
import Models.Teachers;

public interface CourseServices {
    void teachCourse(Teachers teacher, Courses course);
    void studentTakeCourse(Students student, Courses course);

}
