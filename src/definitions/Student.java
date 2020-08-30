/*  Created by IntelliJ IDEA.
 *  User: Ashish Agarwal (Ashish-Agarwal-A)
 *  Date: 30/08/20
 *  Time: 3:49 PM
 *  File Name : Student.java
 * */
package definitions;

import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class Student {
    private String firstName;
    private String middleName;
    private String lastName;
    private long universityRollNumber;
    private int bookIssuedByStudent;
    private String[] book;

    public Student(String firstName, String middleName, String lastName, long universityRollNUmber, int bookIssuedByStudent) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.universityRollNumber = universityRollNumber;
        this.bookIssuedByStudent = bookIssuedByStudent;
        this.book = new String[5];
    }

    public String getFirstName(){
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName ) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public long getUniversityRollNumber() {
        return universityRollNumber;
    }

    public void setUniversityRollNumber(long universityRollNumber) {
        this.universityRollNumber = universityRollNumber;
    }

    public int getBookIssuedByStudent() {
        return bookIssuedByStudent;
    }

    public void setBookIssuedByStudent(int bookIssuedByStudent) {
        this.bookIssuedByStudent = bookIssuedByStudent;
    }











}
