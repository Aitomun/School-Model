package Models;

import Enums.Gender;

public class Teachers extends Persons {
    private String teacherId;
    private String email;
    private String firstName;
    private String lastName;

    public Teachers(String teacherId, String email, String firstName, String lastName) {
        this.teacherId = teacherId;
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Teachers(int age, String firstName, String lastName, Gender gender, String teacherId, String email, String firstName1, String lastName1) {
        super(age, firstName, lastName, gender);
        this.teacherId = teacherId;
        this.email = email;
        this.firstName = firstName1;
        this.lastName = lastName1;
    }

    public String getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(String teacherId) {
        this.teacherId = teacherId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String getFirstName() {
        return firstName;
    }

    @Override
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Override
    public String getLastName() {
        return lastName;
    }

    @Override
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "Teachers{" +
                "teacherId='" + teacherId + '\'' +
                ", email='" + email + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }

    public Teachers() {
    }

    public Teachers(int age, String firstName, String lastName, Gender gender) {
        super(age, firstName, lastName, gender);
    }
}


