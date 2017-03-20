package state;

/**
 * Created by choiseonho on 2017. 3. 19..
 */
public class PrintState implements State {
  private Machine machine;

  PrintState(Machine machine) {
    this.machine = machine;
  }

  @Override
  public void logIn(String account) {
    System.out.println("로그인 상태입니다.");
  }

  @Override
  public void logOut() {
    System.out.println("로그아웃 불가, 도서 출력 중..");
  }

  @Override
  public void rentalBook() {
    System.out.println("대여 불가, 출력 중..");
  }

  @Override
  public void returnBook() {
    System.out.println("반납 불가, 출력 중..");
  }

  @Override
  public void registerBook() {
    System.out.println("등록 불가, 출력 중");
  }

  @Override
  public void print() {
    System.out.println("===================== 도서 목록 =====================");
    machine.library.printAll();
    System.out.println("===================================================");
    if(machine.account.equals("Admin")){
      machine.setState(machine.getAdminState());
    }else if(machine.account.equals("User")){
      machine.setState(machine.getUserState());
    }
  }
}
