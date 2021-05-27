package Delfin;

import javax.swing.plaf.nimbus.NimbusLookAndFeel;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {

  public void switchCaseMenu() throws FileNotFoundException {
    Scanner scanner = new Scanner(System.in);
    FormandController formandController = new FormandController();
    KassererController kassererController = new KassererController();
    TrænerController trænerController = new TrænerController();
    Hold hold = new Hold();
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
      System.out.println("6. Vis årlige kontingent i alt for alle medlemmer");
      System.out.println("7. Tildel træningsresultat til juniorkonkurrencesvømmer");
      System.out.println("8. Tildel træningsresultat til seniorkonkurrencesvømmer");
      System.out.println("9. Afslut program");
      System.out.println("----------------------------------------------------------");
      System.out.print("Dit valg: ");
      int valg = scanner.nextInt();
      switch (valg) {
        case 1:
          formandController.opretMedlem(kassererController, hold);
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
          kassererController.visRestanceMedlemmer(formandController);
          break;
        case 6:
          System.out.println("Kasseren kan forvente at få indbetalt " + kassererController.getKontingentSum() + "kr. kontingent i alt");
          break;
        case 7:
          trænerController.tildelTræningsresultaterJunior(hold);
          break;
        case 8:
          trænerController.tildelTræningsresultaterSenior(hold);
          break;
        /* VIRKER IKKE
          case 9:
          //trænerController.udtagSvømmereTilKonkurrence(hold);
          //trænerController.udskrivUdvalgteKonkurrencedeltagere(hold);
          break;
         */
        case 9:
          System.exit(0);
          break;
      }
    }
  }
}
