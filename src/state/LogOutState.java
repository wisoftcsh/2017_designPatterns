package state;

/**
 * Created by choiseonho on 2017. 3. 19..
 */
public class LogOutState implements State {
  private Machine machine;

  LogOutState(Machine machine) {
    this.machine = machine;
    machine.account = null;
  }

  @Override
  public void logIn(String account) {
    System.out.println("로그인 해주세요");
    if (account.equals("Admin")) {
      System.out.println("도서관 담당자 로그인합니다..");
      machine.setState(machine.getAdminState());
    } else if (account.equals("User")) {
      System.out.println("도서관 사용자 로그인합니다..");
      machine.setState(machine.getUserState());
    }
  }

  @Override
  public void logOut() {
    System.out.println("로그아웃 상태입니다.");
  }

  @Override
  public void rentalBook() {
    System.out.println("대여 불가, 로그인 해주세요.");
  }

  @Override
  public void returnBook() {
    System.out.println("반납 불가, 로그인 해주세요.");
  }

  @Override
  public void registerBook() {
    System.out.println("등록 불가, 로그인 해주세요.");
  }

  @Override
  public void print() {
    System.out.println("출력 불가, 로그인 해주세요.");
  }
}
