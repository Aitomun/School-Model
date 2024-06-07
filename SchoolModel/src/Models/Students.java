package Models;

import Enums.Gender;

public class Students extends Persons {
    private int studentId;
    private String email;
    private String guardianEmail;
    private String guardianEmail2;
    private String gradeLevel;
    private String isDeleted;
    private String isArchived;
    public Students(int age, String firstName, String lastName, Gender gender, int studentId, String email, String guardianEmail, String guardianEmail2) {
        super(age, firstName, lastName, gender);
        this.studentId = studentId;
        this.email = email;
        this.guardianEmail = guardianEmail;
        this.guardianEmail2 = guardianEmail2;
    }


    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setGuardianEmail(String guardianEmail) {
        this.guardianEmail = guardianEmail;
    }

    public void setGuardianEmail2(String guardianEmail2) {
        this.guardianEmail2 = guardianEmail2;
    }


    public Students() {
        super();
    }

    public int getStudentId() {
        return studentId;
    }

    public String getEmail() {
        return email;
    }

    public String getGuardianEmail() {
        return guardianEmail;
    }

    public String getGuardianEmail2() {
        return guardianEmail2;
    }




    public Students(int age, String firstName, String lastName, Gender gender) {
        super(age, firstName, lastName, gender);
    }

    public void setIsDeleted(String isDeleted) {
        this.isDeleted = isDeleted;
    }

    public void setIsArchived(String isArchived) {
        this.isArchived = isArchived;
    }

    public Students(int studentId) {
        this.studentId = studentId;
    }

    public String getIsDeleted() {
        return isDeleted;
    }

    public String getIsArchived() {
        return isArchived;
    }

    public Students(String gradeLevel) {
        this.gradeLevel = gradeLevel;
    }

    public String getGradeLevel() {
        return gradeLevel;
    }

    public void setGradeLevel(String gradeLevel) {
        this.gradeLevel = gradeLevel;
    }

    @Override
    public String toString() {
        return "Students{" +
                "studentId=" + studentId +
                ", email='" + email + '\'' +
                ", guardianEmail='" + guardianEmail + '\'' +
                ", guardianEmail2='" + guardianEmail2 + '\'' +
                ", gradeLevel='" + gradeLevel + '\'' +
                ", isDeleted='" + isDeleted + '\'' +
                ", isArchived='" + isArchived + '\'' +
                '}';
    }
}
