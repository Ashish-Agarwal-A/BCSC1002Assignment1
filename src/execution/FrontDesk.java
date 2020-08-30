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
        System.out.println("-=-=--=-=-\"Welcome To The Front Desk\"-=-=--=-=-");
        System.out.println("How may I help you today?");
        System.out.println("1. Issue a new book for me.");
        System.out.println("2. Return a previously issues book for me.");
        System.out.println("3. Show me all my issues books.");
        System.out.println("4. Exit.");
        System.out.println("Enter the option : ");
        Scanner scanner = new Scanner(System.in);
        int studentInput = scanner.nextInt();
        String bookName;
        switch(studentInput) {
            case Issue_a_new_book_for_me:
                System.out.println("Enter the name of the book, you want to issued : ");
                bookName = scannerObject.nextLine();
                libraryObject.doCheckOut(bookName);
                break;
            case Return_a_previously_issued_book_for_me :
                System.out.println("Enter the name of the book, you want to return :");
                scannerObject.nextLine();
                bookName = scannerObject.nextLine();
                libraryObject.doReturn(bookName);
                break;
            case Show_me_all_my_issued_book :
                studentObject.getBookIssuedByStudent();
                break;
            case Exit:
                break;
            default :
                System.out.println("Please enter the valid option. ");
        }

}
