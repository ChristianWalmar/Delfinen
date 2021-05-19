package Delfin;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class Menu {
  public void switchCaseMenu() throws FileNotFoundException {
    Scanner scanner = new Scanner(System.in);
    FormandController formandController = new FormandController();
    KassererController kassererController = new KassererController();
    Medlem medlem = new Medlem();
    FilHåndtering filHåndtering = new FilHåndtering();

    while (true) {
      System.out.println("1. Tilføj nyt medlem til svømmeklubben");
      System.out.println("2. Slet medlem fra svømmeklubben");
      System.out.println("3. Vis alle medlemmer af svømmeklubben");
      System.out.println("4. Vis medlemmer i restance");
      System.out.println("5. Fjern medlem fra restance-listen");
      System.out.print("Dit valg: ");
      int valg = scanner.nextInt();
      switch (valg) {
        case 1:
          formandController.opretMedlem();
          break;
        case 2:
          formandController.sletMedlem();
          break;
        case 3:
          filHåndtering.visMedlemmer();
          break;
        case 4:
          // filHåndtering.visRestanceMedlemmer();
          break;
        case 5:
          //medlem.betaltRestance();
          break;
      }
    }
  }
}
