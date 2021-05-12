package Delfin;

import java.util.ArrayList;
import java.util.Scanner;

public class FormandController {

  private ArrayList<Medlem> medlemmer = new ArrayList<>();
  Medlem medlem = new Medlem();

  public void opretMedlem() {

    Scanner scan = new Scanner(System.in);


    System.out.println("Opret nyt medlem.");
    System.out.print("Fuldenavn: ");
    medlem.setFuldeNavn(scan.nextLine());
    System.out.print("Alder: ");
    medlem.setAlder(scan.nextInt());
    System.out.print("Aktivitetsform: ");
    medlem.setAktivitetsForm(scan.nextBoolean());
    System.out.print("Juniorsvømmer: ");
    medlem.setJuniorSvømmer(scan.nextBoolean());
    System.out.print("Seniorsvømmer: ");
    medlem.setSeniorSvømmer(scan.nextBoolean());
    System.out.print("Betalt: ");
    medlem.setBetalt(scan.nextBoolean());
    System.out.print(medlem.toString());
    medlemmer.add(medlem);


  }

  public void sletMedlem(){
    Scanner scan = new Scanner(System.in);
    String sletNavn = scan.nextLine();

       medlemmer.remove();


  }

}
