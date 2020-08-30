/*  Created by IntelliJ IDEA.
 *  User: Ashish Agarwal (Ashish-Agarwal-A)
 *  Date: 30/08/20
 *  Time: 3:50 PM
 *  File Name : Library.java
 * */
package definitions;

import java.util.Arrays;

public class Library {
    private String[] Book;


    public Library() {
        this.Book = new String[5];
        for (int i = 0; i < Book.length; i++) {
            Book[i] = new String("Book " + (i + 1));
        }
    }

    public String[] getBook(){
        return Book;
    }

    public void setBook(String[] Book ) {
        this.Book = Book.clone();
    }

    @Override
    public String toString() {
        return Arrays.toString(Book);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Library library = (Library) o ;
        return Arrays.equals(getBook() , library.getBook());
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(getBook());
    }

    public void showIssuedBooks() {
        for (String books : this.Book ){
            if (Book !=  null) {
                System.out.println(books);
            }
        }
    }




}
