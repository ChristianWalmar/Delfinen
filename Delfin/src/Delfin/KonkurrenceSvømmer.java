package Delfin;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class KonkurrenceSvømmer extends Medlem{

  private double træningsResultat;
  private LocalDateTime dato;
  private String stævne;
  private int placering;
  private double tid;
  private Træner træner;
  private SvømmeDiscipliner svømmeDiscipliner;

  public KonkurrenceSvømmer(String navn, int alder, boolean aktivitetsform, boolean betalt) {
    super(navn, alder, aktivitetsform, betalt);
  }

  public void svømmeDisciplin(KonkurrenceSvømmer konkurrenceSvømmer){
    System.out.print("Svømmerens disciplin: ");
    Scanner scanner = new Scanner(System.in);
    String valg = scanner.nextLine();
    if (valg.equals("butterfly")){
      konkurrenceSvømmer.setSvømmeDiscipliner(svømmeDiscipliner.BUTTERFLY);
    } else if(valg.equals("crawl")){
      konkurrenceSvømmer.setSvømmeDiscipliner(SvømmeDiscipliner.CRAWL);
    } else if(valg.equals("rygcrawl")){
      konkurrenceSvømmer.setSvømmeDiscipliner(SvømmeDiscipliner.RYGCRAWL);
    } else if(valg.equals("brystsvømning")){
      konkurrenceSvømmer.setSvømmeDiscipliner(SvømmeDiscipliner.BRYSTSVØMNING);
    }
    System.out.println("Valgte svømmedisciplin: " + konkurrenceSvømmer.getSvømmeDiscipliner());

  }

  public void konkurrenceResultat() {

  }

  public double getTræningsResultat() {
    return træningsResultat;
  }

  public void setTræningsResultat(double træningsResultat) {
    this.træningsResultat = træningsResultat;
  }

  public String getStævne() {
    return stævne;
  }

  public void setStævne(String stævne) {
    this.stævne = stævne;
  }

  public int getPlacering() {
    return placering;
  }

  public void setPlacering(int placering) {
    this.placering = placering;
  }

  public double getTid() {
    return tid;
  }

  public void setTid(double tid) {
    this.tid = tid;
  }

  public Træner getTræner() {
    return træner;
  }

  public void setTræner(Træner træner) {
    this.træner = træner;
  }

  public SvømmeDiscipliner getSvømmeDiscipliner() {
    return svømmeDiscipliner;
  }

  public void setSvømmeDiscipliner(SvømmeDiscipliner svømmeDiscipliner) {
    this.svømmeDiscipliner = svømmeDiscipliner;
  }

  public String toString() {
    String medlemsType = "";

    if (getAlder() < 18) {
      medlemsType = "juniormedlem";
    } else if (getAlder() >= 18)
      medlemsType = "seniormedlem";

    return "---- Medlemsoplysninger ----\n" +
        "Fulde navn: " + getFuldeNavn() +
        "\nAlder: " + getAlder() +
        "\nMedlemstype: " + medlemsType +
        "\nAktivitetsform: " + isAktivitetsForm() +
        "\nHar medlemmet betalt? " + isBetalt() +
        "\nTræningstid: " + træningsResultat;
  }

}


