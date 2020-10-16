package fi.utu.tech;

public class Keppi extends Esine {
    private static int id = 1;

    @Override
    public String toString() {
        return "keppi-" + (id++);
    }
}