package state;

/**
 * Created by choiseonho on 2017. 3. 19..
 */
public class AdminState implements State {
  private Machine machine;

  AdminState(Machine machine) {
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
    System.out.println("대여 불가, 사용자만 가능합니다.");
  }

  @Override
  public void returnBook() {
    System.out.println("반납 불가, 사용자만 가능합니다.");
  }

  @Override
  public void registerBook() {
    System.out.println("도서 등록 진행중..");
    machine.setState(machine.getRegisterState());
  }

  @Override
  public void print() {
    machine.account = "Admin";
    machine.setState(machine.getPrintState());
  }
}
