package state;

import java.util.Scanner;

/**
 * Created by choiseonho on 2017. 3. 19..
 */
public class RegisterState implements State {
  private Machine machine;

  RegisterState(Machine machine) {
    this.machine = machine;
  }

  @Override
  public void logIn(String account) {
    System.out.println("로그인 상태입니다.");
  }

  @Override
  public void logOut() {
    System.out.println("로그아웃 불가, 도서 등록 중..");
  }

  @Override
  public void rentalBook() {
    System.out.println("대여 불가, 사용자만 가능합니다.");
  }

  @Override
  public void returnBook() {
    System.out.println("반납 불가, 사용자만 가능합니다.");
  }

  @Override
  public void registerBook() {
    Scanner scanner = new Scanner(System.in);


    System.out.println("언어(English, Korean) : ");
    String language = scanner.nextLine();
    System.out.println("도서 제목 : ");
    String name = scanner.nextLine();
    System.out.println("도서 코드 : ");
    String bookCode = scanner.nextLine();
    machine.library.registerBook(language, name, bookCode);
    System.out.println("도서 등록 종료..");
    machine.setState(machine.getAdminState());
  }

  @Override
  public void print() {
    machine.setState(machine.getPrintState());
  }
}
