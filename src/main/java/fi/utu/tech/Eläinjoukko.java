package fi.utu.tech;

import java.util.HashSet;
import java.util.Set;

public abstract class Eläinjoukko {



    private static int id = 1;

    private int joukkoid;

    public Eläinjoukko(){
        joukkoid = id++;
    }

    @Override
    public String toString(){
        return "eläinjoukko " + joukkoid;
    }
}
