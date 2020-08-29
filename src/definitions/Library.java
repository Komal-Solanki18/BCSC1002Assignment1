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

    public void issuedBook(String bookName) {
        System.out.println(bookName + "book is issued by you");
    }

    public void returnedBook(String bookName) {
        System.out.println(bookName + "Thank you for returning the book!");
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Library)) return false;
        Library library = (Library) o;
        return Arrays.equals(getAllCurrentlyAvailableBooks(), library.getAllCurrentlyAvailableBooks());
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(getAllCurrentlyAvailableBooks());
    }
}
