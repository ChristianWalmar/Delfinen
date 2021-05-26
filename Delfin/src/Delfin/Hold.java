package Delfin;

import java.util.ArrayList;
import java.util.Scanner;

public class Hold {
  private ArrayList<KonkurrenceSvømmer> juniorKonkurrencesvømmere = new ArrayList<>();
  private ArrayList<KonkurrenceSvømmer> seniorKonkurrencesvømmere = new ArrayList<>();

  public ArrayList<KonkurrenceSvømmer> getKonkurrenceDeltagelse() {
    return konkurrenceDeltagelse;
  }

  public void setKonkurrenceDeltagelse(ArrayList<KonkurrenceSvømmer> konkurrenceDeltagelse) {
    this.konkurrenceDeltagelse = konkurrenceDeltagelse;
  }

  private ArrayList<KonkurrenceSvømmer> konkurrenceDeltagelse = new ArrayList();


  public void tilføjJuniorKonkurrencesvømmere(KonkurrenceSvømmer konkurrenceSvømmer) {
    juniorKonkurrencesvømmere.add(konkurrenceSvømmer);
  }

  public void tilføjSeniorKonkurrencesvømmere(KonkurrenceSvømmer konkurrencesvømmere) {
    seniorKonkurrencesvømmere.add(konkurrencesvømmere);
  }

  public ArrayList<KonkurrenceSvømmer> getSeniorKonkurrencesvømmere() {
    return seniorKonkurrencesvømmere;
  }
  public ArrayList<KonkurrenceSvømmer> getJuniorKonkurrencesvømmere() {
    return juniorKonkurrencesvømmere;
  }


  public void tildelTræningsresultater(){
    Scanner scan = new Scanner(System.in);
    System.out.print("Svømmerens navn: ");
    String navn = scan.nextLine();
    for (int i = 0; i < juniorKonkurrencesvømmere.size(); i ++ ){
      if (navn.equals(juniorKonkurrencesvømmere.get(i).getFuldeNavn())){

      }
    }
  }
}
