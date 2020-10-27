package fi.utu.tech;

import java.util.HashSet;
import java.util.Set;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        var a = new Kissa("Misse", 5);
        var b = new Kissa("Mirri", 10);
        var c = new Koira("Musti", 1);
        var d = new Koira("Pepe", 5);
        var e = new Kissa("Mouku", 2);

        //*luodaan setit eri joukoille eläimiä
        Set<Eläin> eläinjoukko = new HashSet<>();
        Set<Kissa> Kissajoukko = new HashSet<>();
        Set<Koira> Koirajoukko = new HashSet<>();

        a.tervehdi();
        b.miu();
        c.tervehdi();
        d.hau();
        e.miu();
        c.nouda(new Keppi());


        //* lisätään eläinjoukkoon eläimet
        eläinjoukko.add(a);
        eläinjoukko.add(b);
        eläinjoukko.add(c);
        eläinjoukko.add(d);
        eläinjoukko.add(e);
        //lisätään uudelleen c, huomataan että ei tule duplikaatteja
        eläinjoukko.add(c);

        System.out.println("Eläinjoukossa olivat seuraavat eläimet:");
        System.out.println(eläinjoukko);

        //* lisätään kissajoukkoon kissat
        Kissajoukko.add(a);
        Kissajoukko.add(b);
        Kissajoukko.add(e);

        System.out.println("Kissajoukossa olivat seuraavat kissat:");
        System.out.println(Kissajoukko);
        //* kissat maukuvat
        for (var k : Kissajoukko) k.miu();


        //* lisätään koirajoukkoon koirat
        Koirajoukko.add(c);
        Koirajoukko.add(d);

        System.out.println("Koirajoukossa olivat seuraavat koirat:");
        System.out.println(Koirajoukko);
        //* koirat haukkuvat
        for (var k : Koirajoukko) k.hau();

        ArrayList<Eläin> eläinlista = new ArrayList<>(eläinjoukko);
        ArrayList<Kissa> kissalista = new ArrayList<>(Kissajoukko);
        ArrayList<Koira> koiralista = new ArrayList<>(Koirajoukko);


        System.out.println("Eläinjoukko aakkosjärjestyksessä on ");
        System.out.println(JärjestettyEläinjoukko.aakkostus(eläinlista));
        System.out.println("Kissajoukko aakkosjärjestyksessä on ");
        System.out.println(JärjestettyEläinjoukko.aakkostusKissa(kissalista));
        System.out.println("Eläinjoukko aakkosjärjestyksessä on ");
        System.out.println(JärjestettyEläinjoukko.aakkostusKoira(koiralista));

        kissaTervehdi(kissalista);
        koiraTervehdi(koiralista);
        nouto(koiralista);
        tervehdi(eläinlista);

    }

    public static void kissaTervehdi(ArrayList<Kissa> k) {
        System.out.println("Kissat tervehtivät:");
        for (var e : k) e.tervehdi();
    }

    public static void koiraTervehdi(ArrayList<Koira> ko) {
        System.out.println("Koirat tervehtivät:");
        for (var e : ko) e.tervehdi();
    }

    public static void nouto(ArrayList<Koira> koirat) {
            System.out.println("Koirat noutavat kepin:");
            Keppi keppi = new Keppi();
            for (var k : koirat) k.nouda(keppi);
    }

    public static<E extends Eläin> void tervehdi(ArrayList<E> eläimet) {
        System.out.println("Eläimet tervehtivät:");
        for (var t : eläimet) t.tervehdi();
    }

}