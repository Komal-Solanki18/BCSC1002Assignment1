/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 21/08/20
 *  Time: 3:50 PM
 *  File Name : Library.java
 * */
package definitions;

import java.util.Arrays;

public class Library {
    private Book[] allCurrentlyAvailableBooks;

    public Library(Book[] allCurrentlyAvailableBooks) {
        this.allCurrentlyAvailableBooks = allCurrentlyAvailableBooks;
    }

    public Book[] getAllCurrentlyAvailableBooks() {
        return allCurrentlyAvailableBooks.clone();
    }

    public void setAllCurrentlyAvailableBooks(Book[] allCurrentlyAvailableBooks) {
        this.allCurrentlyAvailableBooks = allCurrentlyAvailableBooks;
    }

    public String toString() {
        return Arrays.toString(allCurrentlyAvailableBooks);
    }

}
