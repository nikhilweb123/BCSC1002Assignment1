/*  Created by IntelliJ IDEA.
 *  User:  nikhil kumar (191500499)
 *  Date: 30/08/20
 *  Time: 3:50 PM
 *  File Name : Library.java
 * */
package definitions;

import java.util.Arrays;

public class Library {
    private Book[] booksThatAreCurrentlyAvailable;

    public Library(Book[] booksThatAreCurrentlyAvailable) {
        this.booksThatAreCurrentlyAvailable = booksThatAreCurrentlyAvailable;
    }

    public Book[] getBooksThatAreCurrentlyAvailable() {
        return booksThatAreCurrentlyAvailable;
    }

    public void setBooksThatAreCurrentlyAvailable(Book[] booksThatAreCurrentlyAvailable) {
        this.booksThatAreCurrentlyAvailable = booksThatAreCurrentlyAvailable;
    }

    @Override
    public String toString() {
        return Arrays.toString(booksThatAreCurrentlyAvailable);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Library library = (Library) o;
        return Arrays.equals(getBooksThatAreCurrentlyAvailable(), library.getBooksThatAreCurrentlyAvailable());
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(getBooksThatAreCurrentlyAvailable());
    }

    public void setBooksInLibrary() {
        booksThatAreCurrentlyAvailable[0].setNameOfTheBook("Engineering Mathematics");
        booksThatAreCurrentlyAvailable[0].setNameOfTheAuthorOfTheBook("baali");
        booksThatAreCurrentlyAvailable[0].setThirteenDigitISBNNumberOfTheBook("9352836537000");
    }
    public void showAvailableBooks() {
        System.out.printf("|%-36s %-21s %-21s|\n", "Book Name", "Author Name", "13-Digit ISBN Number");
        }
    }
