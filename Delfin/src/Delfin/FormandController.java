package Delfin;

import java.util.ArrayList;
import java.util.Scanner;

public class FormandController {
  private ArrayList<Medlem> medlemmer = new ArrayList<>();
  //private KassererController kassererController = new KassererController();
  private FilHåndtering filHåndtering = new FilHåndtering();


  public void opretMedlem(KassererController kassererController, Hold hold) { //kaldes i switch case.
    Scanner scan = new Scanner(System.in);
    Motionist motionist;
    KonkurrenceSvømmer konkurrenceSvømmer;

    System.out.println("Opret det nye medlem herunder: ");
    System.out.print("Skal det nye medlem registreres som konkurrencesvømmer, 'ja' eller 'nej': ");
    String svømmeType = scan.nextLine();

    System.out.print("Fulde navn: ");
    String navn = scan.nextLine();
    System.out.print("Alder: ");
    int alder = scan.nextInt();
    System.out.print("Har medlemmet en aktiv aktivitetsform? (true eller false): ");
    boolean aktivitetsform = scan.nextBoolean();
    System.out.print("Har medlemmet betalt? (true eller false): ");
    boolean betalt = scan.nextBoolean();

    if (svømmeType.equals("nej")) { // motionist.
      motionist = new Motionist(navn, alder, aktivitetsform, betalt);
      if (motionist.getAlder() < 18) {
        System.out.println("Medlemmet er motionist og i kategorien juniormedlem.");
      } else if (motionist.getAlder() >= 18) {
        System.out.println("Medlemmet er motionist og i kategorien seniormedlem.");
      }
      System.out.println();
      System.out.print(motionist.toString());
      medlemmer.add(motionist);
      kassererController.kontingentBetaling(motionist);
      filHåndtering.filSkrivning(motionist);

    } else if (svømmeType.equals("ja")) { //konkurrencesvømmer
      konkurrenceSvømmer = new KonkurrenceSvømmer(navn, alder, aktivitetsform, betalt);
      if (konkurrenceSvømmer.getAlder() < 18) {
        hold.tilføjJuniorKonkurrencesvømmere(konkurrenceSvømmer);
        System.out.println("Medlemmet er konkurrencesvømmer i kategorien juniormedlem, og dermed tildelt ungdomsholdet.");
      } else if (konkurrenceSvømmer.getAlder() >= 18) {
        hold.tilføjSeniorKonkurrencesvømmere(konkurrenceSvømmer);
        System.out.println("Medlemmet er konkurrencesvømmer i kategorien seniormedlem, og dermed tildelt seniorholdet.");
      }
      konkurrenceSvømmer.svømmeDisciplin(konkurrenceSvømmer);

      System.out.println();
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
      if (sletNavn.equals(medlemmer.get(i).getFuldeNavn()));
      medlemmer.remove(i);
    }
    System.out.println(sletNavn + " er blevet slettet fra medlemmerlisten.");
  }

  public void visMedlemmerFraArrayListe() {
    for (int i = 0; i < medlemmer.size(); i++) {
      System.out.println(medlemmer.get(i));
    }
  }

  public ArrayList<Medlem> getMedlemmer() {
    return medlemmer;
  }

  public void setMedlemmer(Medlem medlem) {
    medlemmer.add(medlem);
  }
}
