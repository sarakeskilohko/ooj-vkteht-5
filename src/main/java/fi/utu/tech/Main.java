package fi.utu.tech;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        var a = new Kissa("Misse", 5);
        var b = new Kissa("Mirri", 10);
        var c = new Koira("Musti", 1);
        Set<Eläin> Eläinjoukko1 = new HashSet<>();

        a.tervehdi();
        b.miu();
        c.tervehdi();
        c.nouda(new Keppi());

        Eläinjoukko1.add(a);
        Eläinjoukko1.add(b);
        Eläinjoukko1.add(c);
        //lisätään sama eläin toisen kerran, ei ilmesty duplikaattina eläinjoukkoon
        Eläinjoukko1.add(c);

        System.out.println("Eläinjoukossa olivat seuraavat eläimet:" );
        System.out.println(Eläinjoukko1);
    }

    static void tervehdi(){

    }
}