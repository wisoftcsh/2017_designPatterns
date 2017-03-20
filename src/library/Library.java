package library;

import books.Book;

import java.util.ArrayList;

/**
 * Created by choiseonho on 2017. 3. 13..
 */

public class Library {
  private static Library uniqueLibrary;
  private ArrayList<ArrayList<Book>> library;
  private ArrayList<Book> koreanBooks;
  private ArrayList<Book> englishBooks;
  private Function function;

  private Library() {
    library = new ArrayList<>();
    koreanBooks = new ArrayList<>();
    englishBooks = new ArrayList<>();
    library.add(koreanBooks);
    library.add(englishBooks);
    function = new Function(library);
  }

  public static synchronized Library getInstance() {
    if (uniqueLibrary == null) {
      uniqueLibrary = new Library();
    }
    return uniqueLibrary;
  }

  public void registerBook(String language, String name, String bookCode) {
    function.registerBook(language, name, bookCode);
  }

  public void rentalBook(String bookCode) {
    function.rentalBook(bookCode);
  }

  public void returnBook(String bookCode) {
    function.returnBook(bookCode);
  }

  public void printAll() {
    function.printAll();
  }

  public void print(String bookCode) {
    function.print(bookCode);
  }
}
