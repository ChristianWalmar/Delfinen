package Delfin;
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;


public class FilHåndtering {
    final File file = new File("medlemmer.txt");
    private Medlem medlem = new Medlem();

    public void filSkrivning(Medlem medlem) {

        try {

            PrintStream output = new PrintStream(new FileOutputStream(file, true));
            output.append("\n");
            output.append(medlem.toString());
            output.append("\n");

            output.close();
            System.out.println("Medlemmerne er nu gemt i en fil.");

        } catch (IOException e) {
            System.out.println("error");
            e.printStackTrace();
        }
    }

    public void visMedlemmer() throws FileNotFoundException {
        Scanner fileReader = new Scanner(file);
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


