/*  Created by IntelliJ IDEA.
 *  User: Ashish Agarwal (Ashish-Agarwal-A)
 *  Date: 30/08/20
 *  Time: 3:50 PM
 *  File Name : Library.java
 * */
package definitions;

public class Library {
    private String[] Book;

    public Library(String[] Book) {
        this.Book = new String[5];
    }

    public Library() {
        this.Book = new String[5];
        for (int i = 0; i < Book.length; i++) {
            Book[i] = new String("Book " + ( i + 1));
        }
    }




}
