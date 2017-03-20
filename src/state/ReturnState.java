package state;

import java.util.Scanner;

/**
 * Created by choiseonho on 2017. 3. 19..
 */
public class ReturnState implements State {
  private Machine machine;

  ReturnState(Machine machine) {
    this.machine = machine;
  }

  @Override
  public void logIn(String account) {
    System.out.println("로그인 상태입니다.");
  }

  @Override
  public void logOut() {
    System.out.println("로그아웃 불가, 도서 대여 중..");
  }

  @Override
  public void rentalBook() {
    System.out.println("대여 불가, 도서 반납 중..");
  }

  @Override
  public void returnBook() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("도서 코드 : ");
    String bookCode = scanner.next();
    machine.library.returnBook(bookCode);
    System.out.println("도서 반납 종료..");
    machine.setState(machine.getUserState());
  }

  @Override
  public void registerBook() {
    System.out.println("등록 불가, 담당자만 가능합니다.");
  }

  @Override
  public void print() {
    machine.setState(machine.getPrintState());
  }
}
