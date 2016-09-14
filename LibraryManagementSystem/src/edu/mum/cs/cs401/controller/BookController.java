package edu.mum.cs.cs401.controller;

import edu.mum.cs.cs401.dataaccess.DataAccess;
import edu.mum.cs.cs401.dataaccess.DataAccessImpl;
import edu.mum.cs.cs401.dataaccess.DataBase;
import edu.mum.cs.cs401.model.entity.Book;

/**
 * Created by 985333 on 9/13/2016.
 */
public class BookController {

    private static BookController instance = new BookController();

    public BookController() {

    }

    public static BookController getInstance(){
        return instance;
    }

    public  Book addBook(Book book){
        return DataBase.bookTable.add(book.getISBN() ,book);
    }


    public  Book deleteBook(String ISBN){
        return DataBase.bookTable.delete(ISBN);
    }

}
