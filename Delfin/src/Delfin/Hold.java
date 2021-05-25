package Delfin;

import java.util.ArrayList;

public class Hold {
  public ArrayList<KonkurrenceSvømmer> getSeniorKonkurrencesvømmere() {
    return seniorKonkurrencesvømmere;
  }

  public ArrayList<KonkurrenceSvømmer> getJuniorKonkurrencesvømmere() {
    return juniorKonkurrencesvømmere;
  }

  private ArrayList<KonkurrenceSvømmer> juniorKonkurrencesvømmere = new ArrayList<>();
  private ArrayList<KonkurrenceSvømmer> seniorKonkurrencesvømmere = new ArrayList<>();


  public void tilføjJuniorKonkurrencesvømmere(KonkurrenceSvømmer konkurrenceSvømmer) {
    juniorKonkurrencesvømmere.add(konkurrenceSvømmer);
  }



  public void tilføjSeniorKonkurrencesvømmere(KonkurrenceSvømmer konkurrencesvømmere) {
    seniorKonkurrencesvømmere.add(konkurrencesvømmere);
  }
}
