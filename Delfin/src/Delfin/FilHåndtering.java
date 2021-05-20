package Delfin;

import java.io.*;
import java.util.Scanner;


public class FilHåndtering {
  final File fileAlleMedlemmer = new File("medlemmer.txt");
  final File fileRestanceMedlemmer = new File("restanceMedlemmer.txt");
  final File fileKonkurrenceMedlemmer = new File("konkurrenceMedlemmer.txt");
  final File fileMotionistMedlemmer = new File("motionistMedlemmer.txt");
  private Medlem medlem = new Medlem();

  public void filSkrivning(Medlem medlem) {
    try {
      PrintStream output = new PrintStream(new FileOutputStream(fileAlleMedlemmer, true));
      output.append("\n");
      output.append(medlem.toString());
      output.append("\n");
      output.close();
      System.out.println("Medlemmerne er nu gemt i alle medlemmer filen.");

      if (medlem instanceof KonkurrenceSvømmer){
        PrintStream output1 = new PrintStream(new FileOutputStream(fileKonkurrenceMedlemmer, true));
        output1.append("\n");
        output1.append(medlem.toString());
        output1.append("\n");
        output1.close();
        System.out.println("Konkurrence svømmerne er nu gemt i konkurrence filen.");
      }else if(medlem instanceof Motionist){
        PrintStream output2 = new PrintStream(new FileOutputStream(fileMotionistMedlemmer, true));
        output2.append("\n");
        output2.append(medlem.toString());
        output2.append("\n");
        output2.close();
        System.out.println("Motionist medlemmerne er nu gemt i motionist filen.");
      }
      else if (medlem.isBetalt() == false){
        PrintStream output3 = new PrintStream(new FileOutputStream(fileRestanceMedlemmer, true));
        output3.append("\n");
        output3.append(medlem.toString());
        output3.append("\n");
        output3.close();
        System.out.println("Restance medlemmerne er nu gemt i restance filen.");
      }
    } catch (IOException e) {
      System.out.println("error");
      e.printStackTrace();
    }
  }



  public void visMedlemmer() throws FileNotFoundException {
    Scanner fileReader = new Scanner(fileAlleMedlemmer);
    while (fileReader.hasNext())
      System.out.println(fileReader.nextLine());
  }

    /*public void visRestanceMedlemmer() throws FileNotFoundException {
        Scanner fileReader = new Scanner(file);
        while (fileReader.hasNext())
         if(medlem.isBetalt() == false)
         System.out.println(fileReader.nextLine());
    }          */
}


