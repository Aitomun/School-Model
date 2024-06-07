package Services.Impl;

import Models.Courses;
import Models.Students;
import Services.StudentServices;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class StudentServiceImpl implements StudentServices {
    List<Students> messages = new ArrayList<>();


    public void readFile()  {


        String filePath = "StudentData.csv";
        try {
            BufferedReader br = new BufferedReader(new FileReader(filePath));
            String line;
            while (( line = br.readLine()) !=null) {
                String[] fields = line.split(",", -1);

                Students student = new Students();

                student.setStudentId(Integer.parseInt(fields[0]));
                student.setFirstName(fields[1]);
                student.setLastName(fields[2]);
                student.setGradeLevel(fields[3]);
                student.setEmail(fields[4]);
                student.setGuardianEmail(fields[5]);
                student.setGuardianEmail2(fields[6]);
                student.setIsArchived(fields[7]);
                student.setIsDeleted(fields[8]);

                messages.add(student);


            }
        } catch (IOException e) {
            throw new RuntimeException(e);

        }
        System.out.println("Successfully Read the Student data file");
        for (Students student : messages) {
            System.out.println(student);

        }
        }

    @Override
    public void studentTakeCourse(Students student, Courses course) {
        System.out.print("FullName : " + student.getFirstName() + " " + student.getLastName() +
                "\n" + student.getGender() + "\n" + "Age : "
                + student.getAge() + "\n" + "course taken: "
                + course.getCourseOffer() + " " + student.getStudentId() + " " + student.getEmail() +
                " " + student.getGuardianEmail() + " " + student.getGuardianEmail2());


    }

    public void fileWriter() {
//        Students students = new Students();
        String filePath = "StudentDataNew.csv";
        try {
            FileWriter fw = new FileWriter( filePath);

            fw.write("GuardianEmail, FirstName, LastName, Email, Age, StudentId, GuardianEmail2, Gender\n");
            for (Students student : messages ) {
                fw.write(student.getGuardianEmail() + ",");
                fw.write(student.getFirstName() + ",");
                fw.write(student.getLastName() + ",");
                fw.write(student.getEmail() + ",");
                fw.write(student.getAge() + ",");
                fw.write(student.getStudentId() + ",");
                fw.write(student.getGuardianEmail2() + ",");
                fw.write(student.getGender() + "\n");
            }
            fw.close();
            System.out.println("Successfully  written into the Student Data file ");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}