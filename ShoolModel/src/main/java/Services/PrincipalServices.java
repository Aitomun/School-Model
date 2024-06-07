package Services;

import Models.Applicants;
import Models.Principal;
import Models.Students;

public interface PrincipalServices {
    void display(Principal principal);

    void expelStudent( Principal principal, Students student);

    void expelStudent(Students student, Principal principal);

    void admitStudent(Applicants applicant, Principal principal);

}
