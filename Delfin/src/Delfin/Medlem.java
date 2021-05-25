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



  public Medlem(String fuldeNavn, int alder, boolean aktivitetsForm, boolean betalt) {
    this.fuldeNavn = fuldeNavn;
    this.alder = alder;
    this.aktivitetsForm = aktivitetsForm;
    this.betalt = betalt;
  }

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
    String medlemsType ="";

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
