package fi.utu.tech;
import com.sun.jdi.ArrayReference;

import java.util.*;

public abstract class JärjestettyEläinjoukko {

    public static ArrayList<String> aakkostus (ArrayList<Eläin> joukko) {
        ArrayList<String> aakkoseläin = new ArrayList<>();
        for (int i = 0 ; i < joukko.size(); i++) {
            String eläin = joukko.get(i).toString();
            aakkoseläin.add(eläin);
        }
        Collections.sort(aakkoseläin);
        return aakkoseläin;
    }

    public static ArrayList<String> aakkostusKissa (ArrayList<Kissa> joukko) {
        ArrayList<String> aakkoskissa = new ArrayList<>();
        for (int i = 0 ; i < joukko.size(); i++) {
            String eläin = joukko.get(i).toString();
            aakkoskissa.add(eläin);
        }
        Collections.sort(aakkoskissa);
        return aakkoskissa;
    }

    public static ArrayList<String> aakkostusKoira (ArrayList<Koira> joukko) {
        ArrayList<String> aakkoskoira = new ArrayList<>();
        for (int i = 0 ; i < joukko.size(); i++) {
            String eläin = joukko.get(i).toString();
            aakkoskoira.add(eläin);
        }
        Collections.sort(aakkoskoira);
        return aakkoskoira;
    }

}
