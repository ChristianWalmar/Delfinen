package Delfin;

import java.io.*;
import java.util.Scanner;

public class FilHåndtering {
  final File fileAlleMedlemmer = new File("medlemmer.txt");

  public void filSkrivning(Medlem medlem) {
    try {
      PrintStream output = new PrintStream(new FileOutputStream(fileAlleMedlemmer, true));
      output.append("\n");
      output.append(medlem.toString());
      output.append("\n");
      output.close();
      System.out.println("\nDet nye medlem er nu gemt i en medlemmer-fil og kan altid tilgås der.\n");

    } catch (IOException e) {
      System.out.println("error");
      e.printStackTrace();
    }
  }

  public void visMedlemmerFraFil() throws FileNotFoundException {
    Scanner fileReader = new Scanner(fileAlleMedlemmer);
    while (fileReader.hasNext())
      System.out.println(fileReader.nextLine());
  }
}