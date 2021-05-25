package Delfin;

import java.util.ArrayList;
import java.util.Scanner;

public class KassererController {
    private double kontingentSum;
    private ArrayList<Medlem> restanceMedlemmer = new ArrayList<>();

    public void kontingentBetaling(Medlem medlem) {
        double kontingent = 0;

        if (medlem.isBetalt() == true) {

            if (medlem.isAktivitetsForm() == true) {
                if (medlem.getAlder() < 18) {
                    kontingent = 1000; //Juniormedlem.
                } else if (medlem.getAlder() >= 18) {
                    kontingent = 1600; //seniormedlem.
                    if (medlem.getAlder() > 60) {
                        kontingent = kontingent * 0.75; //aktivt medlem alder over 60.
                    }
                }
            } else {
                kontingent = 500; //passivt medlem.
            }

        }else if(medlem.isBetalt() == false){
            restanceMedlemmer.add(medlem);
        }



        kontingentSum = kontingentSum + kontingent;
        System.out.println("\nMedlemmets årlige kontingent er på: " + kontingent + ",-");
        medlem.setKontingent(kontingent);
    }

    public void betaltRestance() {    //Medlem betaler sin restance og bliver rykket til medlemmer-listen i FormandController-klassen.
        Scanner scanner = new Scanner(System.in);


        //Lav fejlhåndtering på nedenstående metode
        String navn = scanner.nextLine();
        for (int i = 0; i < restanceMedlemmer.size(); i ++){
            if (navn == restanceMedlemmer.get(i).getFuldeNavn()) {
                restanceMedlemmer.get(i).setBetalt(true);
                kontingentBetaling(restanceMedlemmer.get(i)); //Kalder kontingentBetaling-metoden.
                restanceMedlemmer.remove(i);  //Fjerner medlemmet fra restance-listen.
            }
        }
    }

    public void visRestanceMedlemmer(FormandController formandController) { //kaldes i switch case.
        for (int i = 0; i < restanceMedlemmer.size(); i++) {
            System.out.println(restanceMedlemmer.get(i));
        }
    }
    public void setKontingentSum(double kontingentSum){
        this.kontingentSum = kontingentSum;
    }
    public double getKontingentSum(){
        return kontingentSum;
    }
}

