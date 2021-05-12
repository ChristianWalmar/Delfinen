package Delfin;

public class Medlem {
  private String fuldeNavn;
  private int alder;
  private boolean aktivitetsForm;
  private boolean juniorSvømmer;
  private boolean seniorSvømmer;
  private boolean betalt;

  public void betaling() {

  }
  /*public Medlem(String fuldeNavn, int alder, boolean aktivitetsForm, boolean juniorSvømmer, boolean seniorSvømmer, boolean betalt){
    this.fuldeNavn = fuldeNavn;
    this.alder = alder;
    this.aktivitetsForm = aktivitetsForm;
    this.juniorSvømmer = juniorSvømmer;
    this.seniorSvømmer = seniorSvømmer;
    this.betalt = betalt; */

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

  @Override
  public String toString() {
    return "Medlem{" +
            "fuldeNavn='" + fuldeNavn + '\'' +
            ", alder=" + alder +
            ", aktivitetsForm=" + aktivitetsForm +
            ", juniorSvømmer=" + juniorSvømmer +
            ", seniorSvømmer=" + seniorSvømmer +
            ", betalt=" + betalt +
            '}';
  }
}
