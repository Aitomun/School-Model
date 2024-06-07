package Services.Impl;

import Models.Applicants;
import Services.ApplicantServices;

public class ApplicantServiceImpl implements ApplicantServices {

    @Override
    public void display(Applicants applicant) {
        System.out.println("FullName : " + applicant.getFirstName() + " " + applicant.getLastName() + "\n"
                + "Age : " + applicant.getAge() + "\n"
                + "Gender : " + applicant.getGender());

    }

    public void admitStudent(Applicants applicant) {
        if (applicant.getAge() >= 18) {
            System.out.println("You have been admitted");
        } else {
            System.out.println("You have been rejected");
        }
    }
}

