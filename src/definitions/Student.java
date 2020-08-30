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

    public String[] getBook() {
        return book;
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName = '" +firstName + '\'' +
                ", middleName = '" + middleName + '\'' +
                ", lastName = '" + lastName + '\'' +
                ", universityRollNumber = '" + universityRollNumber +
                ", bookIssuedByStudent = " + bookIssuedByStudent +
                ", book = " + Arrays.toString(book) +
                '}' ;
     }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()){
            return false;
        }
        Student student = (Student) o;
        return getUniversityRollNumber() == student.getUniversityRollNumber() &&
                getBookIssuedByStudent() == student.getBookIssuedByStudent() &&
                Objects.equals(getFirstName(), student.getFirstName()) &&
                Objects.equals(getMiddleName(), student.getMiddleName()) &&
                Objects.equals(getLastName(), student.getLastName()) &&
                Arrays.equals(getBook(), student.getBook());
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(getFirstName(), getMiddleName(), getLastName(), getUniversityRollNumber(), getBookIssuedByStudent());
        result = 31 * result + Arrays.hashCode(getBook());
        return result;
    }

    public void bookIssuedByStudent() {
        for(String book : this.book)
            if(book != null){
                System.out.println(book);
            }
    }

    public void returnPreviouslyIssuedBook() {
        for (String book : this.book){
            if (book != null) {
                System.out.println(book);
            }
        }
    }

}
