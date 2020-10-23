package fi.utu.tech;

public abstract class kissaJoukko {

        private static int id = 1;

        private int kissaid;

        public kissaJoukko(){
            kissaid = id++;
        }

        @Override
        public String toString(){
            return "kissajoukko " + kissaid;
        }
    }
