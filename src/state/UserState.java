package state;

/**
 * Created by choiseonho on 2017. 3. 19..
 */
public class UserState implements State {
  private Machine machine;

  UserState(Machine machine) {
    this.machine = machine;
  }

  @Override
  public void logIn(String account) {
    System.out.println("로그인 상태입니다.");
  }

  @Override
  public void logOut() {
    System.out.println("로그아웃 합니다.");
    machine.setState(machine.getLogOutState());
  }

  @Override
  public void rentalBook() {
    System.out.println("도서 대여 중..");
    machine.setState(machine.getRentalState());
  }

  @Override
  public void returnBook() {
    System.out.println("도서 반납 중..");
    machine.setState(machine.getReturnState());
  }

  @Override
  public void registerBook() {
    System.out.println("등록 불가, 담당자만 가능합니다.");
  }

  @Override
  public void print() {
    machine.setState(machine.getPrintState());
    machine.account = "User";
  }
}
