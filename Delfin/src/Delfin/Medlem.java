package Delfin;

public class Medlem {
  private String fuldeNavn;
  private int alder;
  private boolean aktivitetsForm;
  private boolean juniorSvømmer;
  private boolean seniorSvømmer;
  private boolean betalt;
  private double kontingent;

  public void betaling() { //spørg Tine om den stadigvæk skal bruges.

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
