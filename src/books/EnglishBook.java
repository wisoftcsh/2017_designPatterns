package books;

/**
 * Created by choiseonho on 2017. 3. 13..
 */
public class EnglishBook implements Book {

  private String language;
  private String name;
  private String bookCode;
  private boolean rental = true;

  public EnglishBook(String language, String name, String bookCode) {
    registerBook(language, name, bookCode);
  }

  @Override
  public String getLanguage() {
    return language;
  }

  @Override
  public String getName() {
    return name;
  }

  @Override
  public String getBookCode() {
    return bookCode;
  }

  @Override
  public boolean getRental() {
    return rental;
  }

  @Override
  public void registerBook(String language, String name, String bookCode) {
    this.language = language;
    this.name = name;
    this.bookCode = bookCode;
  }

  @Override
  public void rentalBook() {
    this.rental = false;
  }

  @Override
  public void returnBook() {
    this.rental = true;
  }

  public String toString() {
    System.out.println("-----------------------------------------------------------------------");
    System.out.println("도서 코드 : " + bookCode + " | 언어 : " + language + " | 제목 : " + name + " | 대여 가능 여부 : " + rental);
    return "-----------------------------------------------------------------------";
  }
}
