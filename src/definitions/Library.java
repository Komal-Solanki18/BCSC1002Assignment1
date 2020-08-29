/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 21/08/20
 *  Time: 3:50 PM
 *  File Name : Library.java
 * */
package definitions;

public class Library {
    private Book[] allCurrentlyAvailableBooks;

    public Book[] getAllCurrentlyAvailableBooks() {
        return allCurrentlyAvailableBooks.clone();
    }

    public void setAllCurrentlyAvailableBooks(Book[] allCurrentlyAvailableBooks) {
        this.allCurrentlyAvailableBooks = allCurrentlyAvailableBooks;
    }

}
