import Enums.CourseOffer;
import Enums.Gender;
import Models.*;
import Services.Impl.ApplicantServiceImpl;
import Services.Impl.PrincipalServiceImpl;
import Services.Impl.StudentServiceImpl;
import Services.Impl.TeachableServiceImpl;

import java.io.IOException;

public class SchoolSystem {
    public static void main(String[] args) throws IOException {
        TeachableServiceImpl Teacher = new TeachableServiceImpl();
        Teachers teacher1 = new Teachers();
        teacher1.setTeacherId("29393");
        teacher1.setLastName("doyi");
        teacher1.setFirstName("victor");
        teacher1.setEmail("doyin@gmail.com");
        teacher1.setGender(Gender.FEMALE);
        teacher1.setAge(25);

        Teachers teacher2 = new Teachers();

        Courses course1 = new Courses( CourseOffer.JAVA);
        Courses course2 = new Courses(CourseOffer.PYHTON);
        Courses course3 = new Courses(CourseOffer.NODE);

        Principal principal = new Principal(20, "Dexter", "Danny", Gender.MALE);
        PrincipalServiceImpl principalData= new PrincipalServiceImpl();
        PrincipalServiceImpl expelStudent = new PrincipalServiceImpl();
        PrincipalServiceImpl admitStudent = new PrincipalServiceImpl();

        Students student3 = new Students(23, "mary", "Ogun", Gender.MALE,3,"Gasco@gmail.com", "daron@gmail.com","pauli@yahoo.com");

        Applicants applicant1 = new Applicants(18, "sele", "sonny",Gender.MALE);
        Applicants applicant2 = new Applicants(15, "yomi", "crony", Gender.FEMALE);
        ApplicantServiceImpl applicantData = new ApplicantServiceImpl();

        TeachableServiceImpl teachableServiceImpl1 = new TeachableServiceImpl();

        System.out.println("Teacher data");
        teachableServiceImpl1.teachCourse(teacher1, course1);
        System.out.println("****************");

        System.out.println("Teacher data");
        teachableServiceImpl1.teachCourse(teacher2, course2);
        System.out.println("***********");

        StudentServiceImpl studentService = new StudentServiceImpl();
        Students student1 = new Students(20, "dad", "max", Gender.MALE,1, "david@gmail.com","farady@yahoo.com","Gameske@gmail.com");
        Students student2 = new Students(20, "dan", "mad", Gender.MALE,2, "ddanid@gmail.com","fady@yahoo.com","Gikke@gmail.com");

        Students[] students = {student1, student2};
        System.out.println("Student data");
        studentService.studentTakeCourse(student3, course1);
        System.out.println("**********");
        System.out.println("Student data");
        studentService.studentTakeCourse(student2, course3);
        System.out.println("*********");

        System.out.println("Principal data");
        principalData.display(principal);
        System.out.println("********");

        System.out.println("Student Expelled Data");
        expelStudent.expelStudent(student2, principal);
        System.out.println("*************");

        System.out.println("Applicant Data");
        applicantData.display(applicant1);
        applicantData.display(applicant2);
        System.out.println("*************");

        System.out.println("Successful Admission");
        principalData.admitStudent(applicant1,principal);
        System.out.println("*************");

        System.out.println("Admission Denied");
        principalData.admitStudent(applicant1,principal);

        StudentServiceImpl studentService1 = new StudentServiceImpl();
        studentService1.readFile();
        studentService1.fileWriter();
        TeachableServiceImpl teachMe = new TeachableServiceImpl();
        teachMe.readFile();
        teachMe.fileWrite();



    }
}
