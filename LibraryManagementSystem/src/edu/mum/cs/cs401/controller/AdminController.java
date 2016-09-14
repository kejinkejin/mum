package edu.mum.cs.cs401.controller;

import edu.mum.cs.cs401.model.entity.Book;
import edu.mum.cs.cs401.model.entity.Member;

/**
 * Created by 985333 on 9/13/2016.
 */
public class AdminController {

    private static AdminController instance = new AdminController();

    public  static AdminController getInstance(){
        return  instance;
    }

    public void addNewBook(Book book){
        BookController.getInstance().addBook(book);

    }

    public void removewBook(String ISBN){
        BookController.getInstance().deleteBook(ISBN);
    }

}
