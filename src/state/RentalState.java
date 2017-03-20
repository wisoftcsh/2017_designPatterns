package state;

import java.util.Scanner;

/**
 * Created by choiseonho on 2017. 3. 19..
 */
public class RentalState implements State {
  private Machine machine;

  RentalState(Machine machine) {
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
    Scanner scanner = new Scanner(System.in);
    System.out.println("도서 코드 : ");
    String bookCode = scanner.nextLine();
    machine.library.rentalBook(bookCode);
    System.out.println("도서 대여 종료..");
    machine.setState(machine.getUserState());
  }

  @Override
  public void returnBook() {
    System.out.println("반납 불가, 도서 대여 중..");
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
