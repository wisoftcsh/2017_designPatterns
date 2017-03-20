import state.Machine;

/**
 * Created by choiseonho on 2017. 3. 20..
 */
public class Facade {
  private Machine machine;

  Facade() {
    machine = new Machine();
    System.out.println(machine);
  }

  void adminLogIn() {
    machine.logIn("Admin"); // 관리자 로그인
  }

  void userLogIn() {
    machine.logIn("User");
  }

  public void logOut() {
    machine.logOut();
  }

  void register() {
    machine.print(); // 도서 목록 출력 대기 상태
    machine.print(); // 출력 후 관리자 상태
    machine.registerBook(); // 등록 대기 상태
    machine.registerBook(); // 등록 시작
  }

  void rental() {
    machine.print(); // 도서 목록 출력 대기 상태
    machine.print(); // 출력 후 User 상태
    machine.rentalBook();
    machine.rentalBook();
  }

  void BookReturn() {
    machine.print(); // 도서 목록 출력 대기 상태
    machine.print(); // 출력 후 User 상태
    machine.returnBook();
    machine.returnBook();
  }

  void printLibrary() {
    machine.print();
    machine.print();
  }
}
