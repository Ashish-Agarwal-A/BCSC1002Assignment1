/*  Created by IntelliJ IDEA.
 *  User: Ashish Agarwal (Ashish-Agarwal-A)
 *  Date: 30/08/20
 *  Time: 3:50 PM
 *  File Name : FrontDesk.java
 * */
package execution;

import definitions.Library;
import definitions.Student;

import java.util.Scanner;

public class FrontDesk {
    public static final int Issue_a_new_book_for_me = 1;
    public static final int Return_a_previously_issued_book_for_me = 2;
    public static final int Show_me_all_my_issued_book = 3;
    public static final int Exit = 4;

    public static void main(String[] args) {
        Student studentObject = new Student();
        Library libraryObject = new Library();
        Scanner scannerObject = new Scanner(System.in);
        Student info = new Student();
        info.studentInfo();

}
