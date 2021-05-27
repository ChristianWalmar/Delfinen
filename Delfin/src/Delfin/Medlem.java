package Delfin;

import java.util.Scanner;

public class Medlem {
  private String fuldeNavn;
  private int alder;
  private boolean aktivitetsForm;
  private boolean betalt;
  private double kontingent;

  public Medlem(String fuldeNavn, int alder, boolean aktivitetsForm, boolean betalt) {
    this.fuldeNavn = fuldeNavn;
    this.alder = alder;
    this.aktivitetsForm = aktivitetsForm;
    this.betalt = betalt;
  }

  public String getFuldeNavn() {
    return fuldeNavn;
  }

  public int getAlder() {
    return alder;
  }

  public boolean isAktivitetsForm() {
    return aktivitetsForm;
  }

  public boolean isBetalt() {
    return betalt;
  }

  public void setKontingent(double kontingent){
    this.kontingent = kontingent;
  }

  @Override
  public String toString() {
    String medlemsType = "";

    if (alder < 18) {
      medlemsType = "juniormedlem";
    } else if (alder >= 18)
      medlemsType = "seniormedlem";

    return "---- Medlemsoplysninger ----\n" +
            "Fulde navn: " + fuldeNavn +
            "\nAlder: " + alder +
            "\nMedlemstype: " + medlemsType +
            "\nAktivitetsform: " + aktivitetsForm +
            "\nHar medlemmet betalt? " + betalt + "\n";
  }
}
