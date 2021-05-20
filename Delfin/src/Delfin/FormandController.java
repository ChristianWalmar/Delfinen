package Delfin;

import java.util.ArrayList;
import java.util.Scanner;

public class FormandController {
  private ArrayList<Medlem> medlemmer = new ArrayList<>();
  private KassererController kassererController = new KassererController();
  private FilHåndtering filHåndtering = new FilHåndtering();

  public void opretMedlem() { //kaldes i switch case.
    Scanner scan = new Scanner(System.in);
    Motionist motionist = new Motionist();
    KonkurrenceSvømmer konkurrenceSvømmer = new KonkurrenceSvømmer();

    System.out.println("Opret nyt medlem");
    System.out.println("Er medlemmet konkurrencesvømmer 'ja' eller 'nej'");

    String svømmeType = scan.nextLine();
    //fælles variable til input i constructor.

    if (svømmeType.equals("nej")) { // motionist.
      //Lave en constructer til at lave objecterne med de fælles variable.
      System.out.print("Fulde navn: ");
      motionist.setFuldeNavn(scan.nextLine());
      System.out.print("Alder: ");
      motionist.setAlder(scan.nextInt());
      if (motionist.getAlder() < 18) {
        System.out.println("Du er juniormedlem.");

      } else if (motionist.getAlder() >= 18) {
        System.out.println("Du er seniormedlem.");
      }
      System.out.print("Aktivitetsform (true eller false): ");
      motionist.setAktivitetsForm(scan.nextBoolean());
      System.out.print("Betalt (true eller false): ");
      motionist.setBetalt(scan.nextBoolean());
      System.out.print(motionist.toString());

      medlemmer.add(motionist);
      kassererController.kontingentBetaling(motionist);
      filHåndtering.filSkrivning(motionist);

    } else if (svømmeType.equals("ja")) { //konkurrencesvømmer

      System.out.print("Fulde navn: ");
      konkurrenceSvømmer.setFuldeNavn(scan.nextLine());
      System.out.print("Alder: ");
      konkurrenceSvømmer.setAlder(scan.nextInt());
      if (konkurrenceSvømmer.getAlder() < 18) {
        System.out.println("Du er juniormedlem og dermed tildelt ungdomsholdet.");
      } else if (konkurrenceSvømmer.getAlder() >= 18) {
        System.out.println("Du er seniormedlem og dermed tildelt seniorholdet.");
      }

      System.out.print("Aktivitetsform (true eller false): ");
      konkurrenceSvømmer.setAktivitetsForm(scan.nextBoolean());
      System.out.print("Betalt (true eller false): ");
      konkurrenceSvømmer.setBetalt(scan.nextBoolean());
      System.out.print(konkurrenceSvømmer.toString());

      medlemmer.add(konkurrenceSvømmer);
      kassererController.kontingentBetaling(konkurrenceSvømmer);
      filHåndtering.filSkrivning(konkurrenceSvømmer);
    }
  }

  public void sletMedlem() { //kaldes i switch case.
    System.out.print("Skriv det fulde navn på den bruger, som skal slettes: ");
    Scanner scan = new Scanner(System.in);
    String sletNavn = scan.nextLine();

    for (int i = 0; i < medlemmer.size(); i++) {
      if (sletNavn == medlemmer.get(i).getFuldeNavn()) ;
      medlemmer.remove(i);
    }
    System.out.println(sletNavn + " er blevet slettet fra listen.");
  }

  public ArrayList<Medlem> getMedlemmer() {
    return medlemmer;
  }

  public void setMedlemmer(Medlem medlem) {
    medlemmer.add(medlem);
  }
}
