package Delfin;

import java.io.FileNotFoundException;

public class HovedMenuController {
  private Menu menu = new Menu();

  public void kør() throws FileNotFoundException {
    menu.switchCaseMenu();
  }
}
