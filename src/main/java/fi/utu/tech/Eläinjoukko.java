package fi.utu.tech;

import java.util.HashSet;
import java.util.Set;

public abstract class Eläinjoukko {



    private static int idd = 1;

    private int joukkoid;

    public Eläinjoukko(){
        joukkoid = idd++;
    }

    @Override
    public String toString(){
        return "eläinjoukko " + joukkoid;
    }
}
