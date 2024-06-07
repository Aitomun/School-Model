package Services.Impl;

import Models.Applicants;
import Models.Principal;
import Models.Students;
import Services.PrincipalServices;

public class PrincipalServiceImpl implements PrincipalServices {

    @Override
    public void display(Principal principal) {
        System.out.println("FullName : " + principal.getLastName() +"\n"
                + "Age " + principal.getAge()
                +  "\n" + "Gender " + principal.getGender());
    }

    @Override
    public void expelStudent(Principal principal, Students student) {

    }

    @Override
    public void expelStudent(Students student, Principal principal) {
        System.out.println("Student Full Name : " + student.getFirstName() +" " + student.getLastName() + "\n"
                + "Expulsion Duration : " + "2 week" + "\n" + "Expelled By : "
                + "Principal " + principal.getFirstName() +" " +principal.getLastName());
    }

    @Override
    public void admitStudent(Applicants applicant, Principal principal) {

    }


    }

