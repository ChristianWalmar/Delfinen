package Delfin;

import java.util.Scanner;

public class KonkurrenceSvømmer extends Medlem{
  private double træningsResultat;
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

  public void setTræningsResultat(double træningsResultat) {
    this.træningsResultat = træningsResultat;
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


