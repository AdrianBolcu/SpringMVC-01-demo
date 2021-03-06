package com.springapp.mvc;

import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.Date;

/**
 * Created by Mindit on 12/28/2017.
 */
public class Student {
    private String studentName;

    @Size(min=2, max=30)
    private String studentHobby;

    private Long studentMobile;
    private Date studentDOB;
    private ArrayList<String> studentSkills;
    private Address studentAddress;

    public void setStudentAddress(Address studentdAdress) {
        this.studentAddress = studentdAdress;
    }

    public Address getStudentAddress() {

        return studentAddress;
    }

    public void setStudentMobile(Long studentMobile) {
        this.studentMobile = studentMobile;
    }

    public void setStudentDOB(Date studentDOB) {
        this.studentDOB = studentDOB;
    }

    public void setStudentSkills(ArrayList<String> studentSkills) {
        this.studentSkills = studentSkills;
    }

    public Long getStudentMobile() {

        return studentMobile;
    }

    public Date getStudentDOB() {
        return studentDOB;
    }

    public ArrayList<String> getStudentSkills() {
        return studentSkills;
    }

    public String getStudentName() {
        return studentName;
    }

    public String getStudentHobby() {
        return studentHobby;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public void setStudentHobby(String studentHobby) { this.studentHobby = studentHobby;
    }
}
