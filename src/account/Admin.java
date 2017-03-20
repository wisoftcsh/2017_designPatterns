package account;

/**
 * Created by choiseonho on 2017. 3. 13..
 */
public class Admin {
  private static Admin uniqueAdmin;
  private String name;

  private Admin(String name) {
    this.name = name;
  }

  public static synchronized Admin getInstance() {
    if (uniqueAdmin == null) {
      uniqueAdmin = new Admin("Admin");
    }
    return uniqueAdmin;
  }

  public String getName() {
    return name;
  }
}
