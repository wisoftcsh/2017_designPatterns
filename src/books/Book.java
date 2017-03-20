package books;

/**
 * Created by choiseonho on 2017. 3. 13..
 */
public interface Book {
  void registerBook(String language, String name, String bookCode);

  void rentalBook();

  void returnBook();

  String getLanguage();

  String getName();

  String getBookCode();

  boolean getRental();
}
