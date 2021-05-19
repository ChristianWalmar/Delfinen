package Delfin;

import java.util.ArrayList;
import java.util.Scanner;

public class FormandController {
    private ArrayList<Medlem> medlemmer = new ArrayList<>();
    private KassererController kassererController = new KassererController();
    private FilHåndtering filHåndtering = new FilHåndtering();

    public void opretMedlem() { //kaldes i switch case.
        Scanner scan = new Scanner(System.in);
        Medlem medlem = new Medlem();

        System.out.println("Opret nyt medlem");
        System.out.print("Fulde navn: ");
        medlem.setFuldeNavn(scan.nextLine());
        System.out.print("Alder: ");
        medlem.setAlder(scan.nextInt());
        if (medlem.getAlder() < 18) {
            System.out.println("Du er juniormedlem.");

        } else if (medlem.getAlder() >= 18) {
            System.out.println("Du er seniormedlem.");
        }
        System.out.print("Aktivitetsform (true eller false): ");
        medlem.setAktivitetsForm(scan.nextBoolean());
        System.out.print("Betalt (true eller false): ");
        medlem.setBetalt(scan.nextBoolean());
        System.out.print(medlem.toString());
        medlemmer.add(medlem);

        kassererController.kontingentBetaling(medlem);
        filHåndtering.filSkrivning(medlem);

    }

    public void sletMedlem() { //kaldes i switch case.
        System.out.print("Skriv det fulde navn på den bruger, som skal slettes: ");
        Scanner scan = new Scanner(System.in);
        String sletNavn = scan.nextLine();

        for (int i = 0; i < medlemmer.size(); i++) {
            if (sletNavn == medlemmer.get(i).getFuldeNavn()) ;
            medlemmer.remove(i);
        }
        System.out.println(sletNavn + " er blevet slettet fra listen.");
    }

    public ArrayList<Medlem> getMedlemmer() {
        return medlemmer;
    }

    public void setMedlemmer(Medlem medlem) {
        medlemmer.add(medlem);
    }
}
