package fi.utu.tech;

public abstract class EläinPari extends Eläin{

    protected EläinPari(String nimi, String laji, int ikä) {
        super(nimi, laji, ikä);
    }

    public void eläinPari(Eläin eläin1, Eläin eläin2){
        System.out.println("Eläinpari oli: " + eläin1 + " ja " + eläin2);
    }
}
