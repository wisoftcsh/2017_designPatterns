/**
 * Created by choiseonho on 2017. 3. 13..
 */
public class MachineDrive {
  public static void main(String[] args){
    Facade facade = new Facade();

    facade.adminLogIn();
    facade.register();
    facade.register();
    facade.register();
    facade.printLibrary();
    facade.logOut();

    facade.userLogIn();
    facade.rental();
    facade.rental();
    facade.printLibrary();
    facade.logOut();

    facade.userLogIn();
    facade.BookReturn();
    facade.printLibrary();
    facade.logOut();
  }
}
