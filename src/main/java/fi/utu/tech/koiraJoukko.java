package fi.utu.tech;

public abstract class koiraJoukko {

        private static int id = 1;

        private int koiraid;

        public koiraJoukko(){
            koiraid = id++;
        }

        @Override
        public String toString(){
            return "koirajoukko " + koiraid;
        }
    }