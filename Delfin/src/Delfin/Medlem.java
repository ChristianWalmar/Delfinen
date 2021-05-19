package Delfin;

import java.util.Scanner;

public class Medlem {
  private String fuldeNavn;
  private int alder;
  private boolean aktivitetsForm;
  private boolean juniorSvømmer;
  private boolean seniorSvømmer;
  private boolean betalt;
  private double kontingent;

  //Lav fejlhåndtering på nedenstående metode
  /*public void betaltRestance() {    //Medlem betaler sin restance og bliver rykket til medlemmer-listen i FormandController-klassen.
    Scanner scanner = new Scanner(System.in);
    KassererController kassererController = new KassererController();

    String navn = scanner.nextLine();
    for (int i = 0; i < kassererController.getListeOverRestanceMedlemmer().size(); i++) {
      if (navn == kassererController.getListeOverRestanceMedlemmer().get(i).getFuldeNavn()) {
        kassererController.getListeOverRestanceMedlemmer().remove(i);   //Fjerner medlemmet fra restance-listen.
        kassererController.kontingentBetaling(kassererController.getListeOverRestanceMedlemmer().get(i));    //Kalder kontingentBetaling-metoden.
      }
    }
  }*/

  public void setFuldeNavn(String fuldeNavn) {
    this.fuldeNavn = fuldeNavn;
  }

  public String getFuldeNavn() {
    return fuldeNavn;
  }

  public void setAlder(int alder) {
    this.alder = alder;
  }

  public int getAlder() {
    return alder;
  }

  public void setAktivitetsForm(boolean aktivitetsForm) {
    this.aktivitetsForm = aktivitetsForm;
  }

  public boolean isAktivitetsForm() {
    return aktivitetsForm;
  }

  public void setJuniorSvømmer(boolean juniorSvømmer) {
    this.juniorSvømmer = juniorSvømmer;
  }

  public boolean isJuniorSvømmer() {
    return juniorSvømmer;
  }

  public void setSeniorSvømmer(boolean seniorSvømmer) {
    this.seniorSvømmer = seniorSvømmer;
  }

  public boolean isSeniorSvømmer() {
    return seniorSvømmer;
  }

  public void setBetalt(boolean betalt) {
    this.betalt = betalt;
  }

  public boolean isBetalt() {
    return betalt;
  }

  public void setKontingent(double kontingent){
    this.kontingent = kontingent;
  }

  public double getKontingent(){
    return kontingent;
  }

  @Override
  public String toString() {
    return "Medlem{" +
            "fuldeNavn='" + fuldeNavn + '\'' +
            ", alder=" + alder +
            ", aktivitetsForm=" + aktivitetsForm +
            ", juniorSvømmer=" + juniorSvømmer +
            ", seniorSvømmer=" + seniorSvømmer +
            ", betalt=" + betalt +
            ", kontingent=" + kontingent +
            '}';
  }
}
