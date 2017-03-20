package state;

import library.Library;
import state.AdminState;
import state.LogOutState;
import state.PrintState;
import state.RegisterState;
import state.RentalState;
import state.ReturnState;
import state.State;
import state.UserState;

/**
 * Created by choiseonho on 2017. 3. 19..
 */
public class Machine {
  Library library = Library.getInstance();
  String account;
  private State logOutState;
  private State adminState;
  private State userState;
  private State printState;
  private State registerState;
  private State rentalState;
  private State returnState;
  private State state;

  public Machine() {
    logOutState = new LogOutState(this);
    adminState = new AdminState(this);
    userState = new UserState(this);
    printState = new PrintState(this);
    registerState = new RegisterState(this);
    rentalState = new RentalState(this);
    returnState = new ReturnState(this);
    state = logOutState;
  }

  public void logIn(String account) {
    state.logIn(account);
  }

  public void logOut() {
    state.logOut();
  }

  public void registerBook() { state.registerBook(); }

  public void rentalBook() {
    state.rentalBook();
  }

  public void returnBook() { state.returnBook(); }

  public void print() { state.print(); }

  void setState(State state) {
    this.state = state;
  }

  public State getState() {
    return state;
  }

  State getLogOutState() {
    return logOutState;
  }

  State getAdminState() {
    return adminState;
  }

  State getUserState() {
    return userState;
  }

  State getPrintState() {
    return printState;
  }

  State getRegisterState() {
    return registerState;
  }

  State getRentalState() {
    return rentalState;
  }

  State getReturnState() {
    return returnState;
  }

  public String toString() {
    return "Welcome To Choi Library\n";
  }
}
