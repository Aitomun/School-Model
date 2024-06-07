package Services.Impl;

import Models.Courses;
import Models.Students;
import Models.Teachers;
import Services.CourseServices;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class TeachableServiceImpl implements CourseServices {
    List<Teachers> messages = new ArrayList<>();

    public void readFile() {
        String filePath = "TeacherData.csv";
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] fields = line.split(",", -1);

                Teachers teacher = new Teachers();
                teacher.setTeacherId(fields[0]);
                teacher.setEmail(fields[1]);
                teacher.setFirstName(fields[2]);
                teacher.setLastName(fields[3]);

                messages.add(teacher);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Successfully read the teacher data");
        // Print each teacher's information
        for (Teachers teacher : messages) {
            System.out.println(teacher);
        }
    }

    @Override
    public void teachCourse(Teachers teacher, Courses course) {
        System.out.println("FullName : " + teacher.getFirstName() + " " + teacher.getLastName()
                + "\n" + "Gender : "
                + teacher.getGender()
                + "\n" + "Age :"
                + teacher.getAge() + "\n" + "Course taught : "
                + course.getCourseOffer() + " " + teacher.getEmail() + " " + teacher.getTeacherId());
    }

    @Override
    public void studentTakeCourse(Students student, Courses course) {
        // This method is not implemented yet
    }

    public void fileWrite() {
        String filePath = "TeacherDataNew.csv";
        try (FileWriter fw = new FileWriter(filePath)) {
            fw.write("TeacherId, Email, FirstName, LastName\n");
            for (Teachers teacher : messages) {
                fw.write(teacher.getTeacherId() + ",");
                fw.write(teacher.getEmail() + ",");
                fw.write(teacher.getFirstName() + ",");
                fw.write(teacher.getLastName() + "\n");
            }
            System.out.println("Successfully written to teachers file");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
