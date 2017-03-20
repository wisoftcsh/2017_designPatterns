package account;

/**
 * Created by choiseonho on 2017. 3. 13..
 */
public class User {
  private String name;

  private User(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }
}
