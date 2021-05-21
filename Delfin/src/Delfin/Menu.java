package Delfin;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class Menu {

  public void switchCaseMenu() throws FileNotFoundException {
    Scanner scanner = new Scanner(System.in);
    FormandController formandController = new FormandController();
    KassererController kassererController = new KassererController();
    Medlem medlem;
    FilHåndtering filHåndtering = new FilHåndtering();

    while (true) {
      System.out.println();
      System.out.println("Vælg én af nedenstående funktioner:");
      System.out.println("----------------------------------------------------------");
      System.out.println("1. Opret nyt medlem til svømmeklubben");
      System.out.println("2. Slet medlem fra svømmeklubben");
      System.out.println("3. Vis alle medlemmer af svømmeklubben fra ArrayListe");
      System.out.println("4. Vis alle medlemmer af svømmeklubben fra fil");
      System.out.println("5. Vis medlemmer i restance");
      System.out.println("6. Fjern medlem fra restance-listen");
      System.out.println("----------------------------------------------------------");
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
          formandController.visMedlemmerFraArrayListe();
          break;
        case 4:
          filHåndtering.visMedlemmerFraFil();
          break;
        case 5:
          kassererController.visRestanceMedlemmer();
          break;
        case 6:
          //medlem.betaltRestance();
          break;
      }
    }
  }
}
