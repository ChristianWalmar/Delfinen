package Delfin;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Scanner;

public class KonkurrenceSvømmer extends Medlem{
  private double træningsResultat;
  private LocalDateTime dato;
  private String stævne;
  private int placering;
  private double tid;
  private Træner træner;

  public SvømmeDiscipliner getSvømmeDiscipliner() {
    return svømmeDiscipliner;
  }

  public void setSvømmeDiscipliner(SvømmeDiscipliner svømmeDiscipliner) {
    this.svømmeDiscipliner = svømmeDiscipliner;
  }

  private SvømmeDiscipliner svømmeDiscipliner;
  private ArrayList<Medlem> medlemmer1 = new ArrayList<>();

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
}


