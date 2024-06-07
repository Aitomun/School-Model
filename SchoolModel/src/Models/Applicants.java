package Models;

import Enums.Gender;

public class Applicants extends Persons{
    public Applicants(int age, String firstName, String lastName, Gender gender) {
        super(age, firstName, lastName, gender);
    }
}
