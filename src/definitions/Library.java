/*  Created by IntelliJ IDEA.
 *  User:  nikhil kumar (191500499)
 *  Date: 30/08/20
 *  Time: 3:50 PM
 *  File Name : Library.java
 * */
package definitions;

import java.util.Arrays;

public class Library {
    private Book[] booksCurrentlyAvailable;

    public Library() {
        this.booksCurrentlyAvailable = new Book[20];
        for (int index = 0; index < booksCurrentlyAvailable.length; index++) {
            booksCurrentlyAvailable[index] = new Book();
        }
    }

    public Book[] getBooksCurrentlyAvailable() {
        return booksCurrentlyAvailable.clone();
    }

    public void setBooksCurrentlyAvailable(Book[] booksCurrentlyAvailable) {
        this.booksCurrentlyAvailable = booksCurrentlyAvailable;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Library library = (Library) o;
        return Arrays.equals(getBooksCurrentlyAvailable(), library.getBooksCurrentlyAvailable());
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(getBooksCurrentlyAvailable());
    }

    /**
     * This method will show the list of books currently available in the library.
     */
    public void showListOfBooks() {
        for (Book book : booksCurrentlyAvailable) {
            System.out.println("List of books:");
            System.out.println(book);
        }
    }
}