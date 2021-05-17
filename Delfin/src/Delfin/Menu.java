package Delfin;

import java.util.Scanner;

public class Menu {
  public void switchCaseMenu(){
    Scanner scanner = new Scanner(System.in);
    FormandController formandController = new FormandController();
    KassererController kassererController = new KassererController();

    while (true){
      System.out.println("1. Tilføj medlem.");
      System.out.println("2. Slet medlem.");
      System.out.println("3. Vis alle medlemmer.");
      System.out.println("4. Vis medlemmer i restance.");
      System.out.print("Dit valg: ");
      int valg = scanner.nextInt();
      switch (valg){
        case 1:
          formandController.opretMedlem();
          break;
        case 2:
          formandController.sletMedlem();
          break;
        case 3:
          formandController.visMedlemmer();
        case 4:
          kassererController.visRestanceMedlemmer();
          break;
      }
    }
  }
}
