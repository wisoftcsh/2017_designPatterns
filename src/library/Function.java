package library;

import books.Book;
import books.EnglishBook;
import books.KoreanBook;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by choiseonho on 2017. 3. 19..
 */

class Function {
  private ArrayList<ArrayList<Book>> library;

  Function(ArrayList<ArrayList<Book>> library) {
    this.library = library;
  }

  void registerBook(String language, String name, String bookCode) {
    if (searchCode(bookCode)) {
      System.out.println("등록 실패, 중복되는 코드입니다.");
      Scanner scanner = new Scanner(System.in);
      System.out.println("도서 코드를 다시 입력해 주세요..");
      System.out.println("도서 코드 : ");
      bookCode = scanner.nextLine();
      registerBook(language, name, bookCode);
    } else {
      switch (language) {
        case "Korean":
          library.get(0).add(new KoreanBook(language, name, bookCode));
          break;
        case "English":
          library.get(1).add(new EnglishBook(language, name, bookCode));
          break;
        default:  //프랑스 책을 추가한다면????
          System.out.println("도서 등록 실패, 양식을 확인해 주세요.");
          break;
      }
    }
  }

  void printAll() {
    for (ArrayList<Book> books : library) {
      for (Book book : books) {
        System.out.println(book.toString());
      }
    }
  }

  void print(String bookCode) {
    for (ArrayList<Book> books : library) {
      for (Book book : books) {
        if (book.getBookCode().equals(bookCode)) {
          System.out.println(book.toString());
        }
      }
    }
  }

  void rentalBook(String bookCode) {
    Book book = searchBook(bookCode);
    if (book != null) {
      if (book.getRental()) {
        book.rentalBook();
      } else {
        System.out.println("대여 불가");
      }
      return;
    }
    System.out.println("해당 도서는 없습니다.");
  }

  void returnBook(String bookCode) {
    Book book = searchBook(bookCode);
    if (book != null) {
      if (book.getRental()) {
        System.out.println("대여 가능한 도서입니다.");
      } else {
        book.returnBook();
      }
      return;
    }
    System.out.println("해당 도서는 없습니다.");
  }

  private Book searchBook(String bookCode) {
    for (ArrayList<Book> books : library) {
      for (Book book : books) {
        if (book.getBookCode().equals(bookCode)) {
          return book;
        }
      }
    }
    return null;
  }

  private Boolean searchCode(String bookCode) {
    for (ArrayList<Book> books : library) {
      for (Book book : books) {
        if (book.getBookCode().equals(bookCode)) {
          return true;
        }
      }
    }
    return false;
  }
}
