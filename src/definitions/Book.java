/*  Created by IntelliJ IDEA.
 *  User: nikhil kumar (191500499)
 *  Date: 29/08/20
 *  Time: 3:49 PM
 *  File Name : Book.java
 * */
package definitions;

import java.util.function.ObjLongConsumer;

public class Book {
    private String nameOfTheBook;
    private String authorOfTheBook;
    private String isNumberOfTheBook;

    public Book(String nameOfTheBook, String authorOfTheBook, String isNumberOfTheBook)
    this.nameOfTheBook =nameOfTheBook
    this.authorOfTheBook =authorOfTheBook
    this.isNumberOfTheBook =isNumberOfTheBook
}

    public String getNameOfTheBook() {
        return nameOfTheBook;
    }

    public Void setNameOfTheBook(String nameOfTheBook) {
        this.nameOfTheBook = nameOfTheBook;

    }

    public String getAuthorOfTheBook() {
        return authorOfTheBook;

    }

    public void setAuthorOfTheBook(String authorOfTheBook) {
        this.authorOfTheBook = authorOfTheBook;
    }

    public String getIsNumberOfTheBook() {
        return isNumberOfTheBook;
    }

    public void setIsNumberOfTheBook(String isNumberOfTheBook) {
        this.isNumberOfTheBook = isNumberOfTheBook;
    }

    @Override
    public String toString() {
        return " About the book --- " + "\n" +
                "Name of the book ->'" + nameOfTheBook + '\'' + "\n" +
                "Author of the book -> '" + authorOfTheBook + '\'' + "\n" +
                "Number of the book -> '" + isNumberOfTheBook + '\'';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) ||getClass() != obj.getClass())return false;
        Book book = (Book) obj;
        return Object.equals(getNameOfTheBook(), book.getNameOfTheBook()) &&
                Object.equals(getAuthorOfTheBook(), book.getAuthorOfTheBook())&&
                Object.equals(getIsNumberOfTheBook(), book.getIsNumberOfTheBook());
    }

    @Override
    public int hashCode() {
        return Object.hash(getNameOfTheBook(), getAuthorOfTheBook(), getIsNumberOfTheBook());
    }
    }

