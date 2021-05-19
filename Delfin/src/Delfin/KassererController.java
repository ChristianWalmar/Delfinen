package Delfin;

import java.util.ArrayList;

public class KassererController {
    private double kontingentSum;


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
        }
        kontingentSum += kontingent;
        System.out.println("Medlemmets kontigent årligt er på: " + kontingent + ",-");

        medlem.setKontingent(kontingent);
    }

    public void visRestanceMedlemmer() { //kaldes i switch case.
        //for (int i = 0; i < listeOverRestanceMedlemmer.size(); i++) {
          //  System.out.println(listeOverRestanceMedlemmer.get(i));
        }
    }
