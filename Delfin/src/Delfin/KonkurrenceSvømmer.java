package Delfin;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Scanner;

public class KonkurrenceSvømmer extends Medlem{
  private double træningsResultat;
  private LocalDateTime datoOgTid;
  private String stævne;
  private int placering;
  private double tid;
  private Træner træner;
  private ArrayList<Medlem> medlemmer1 = new ArrayList<>();

  public KonkurrenceSvømmer(String navn, int alder, boolean aktivitetsform, boolean betalt) {
    super(navn, alder, aktivitetsform, betalt);
  }

  public void svømmeDisciplin(Medlem medlem){
    Scanner scanner = new Scanner(System.in);
    String valg = scanner.nextLine();
    SvømmeDiscipliner s = null;
    if (valg.equals("butterfly")){
      s = SvømmeDiscipliner.BUTTERFLY;
    } else if(valg.equals("crawl")){
      s = SvømmeDiscipliner.CRAWL;
    } else if(valg.equals("rygcrawl")){
      s = SvømmeDiscipliner.RYGCRAWL;
    } else if(valg.equals("brystsvømning")){
      s = SvømmeDiscipliner.BRYSTSVØMNING;
    }

    switch (s){
      case BUTTERFLY -> medlemmer1.add(medlem);
      //case CRAWL -> medlemmer1.add()
    }
  }

  public void konkurrenceResultat() {

  }
}


