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
    private String universityRollNumber;
    private String bookissuedbyStudents;
    private String[] book;

    public Student() {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.universityRollNumber = universityRollNumber;
        this.bookissuedbyStudents = bookissuedbyStudents;
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









}
