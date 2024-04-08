class CuerpoHumanoAnidadas {

    static class Corazon {
        private int ritmoCardiaco;
        private String tipo;

        public Corazon(int ritmoCardiaco, String tipo) {
            this.ritmoCardiaco = ritmoCardiaco;
            this.tipo = tipo;
        }

        public int getRitmoCardiaco() {
            return ritmoCardiaco;
        }

        public void setRitmoCardiaco(int ritmoCardiaco) {
            this.ritmoCardiaco = ritmoCardiaco;
        }

        public String getTipo() {
            return tipo;
        }

        public void setTipo(String tipo) {
            this.tipo = tipo;
        }
    }

    static class Pulmon {
        private int capacidad;
        private String tipo;

        public Pulmon(int capacidad, String tipo) {
            this.capacidad = capacidad;
            this.tipo = tipo;
        }

        public int getCapacidad() {
            return capacidad;
        }

        public void setCapacidad(int capacidad) {
            this.capacidad = capacidad;
        }

        public String getTipo() {
            return tipo;
        }

        public void setTipo(String tipo) {
            this.tipo = tipo;
        }
    }

    static class Higado {
        private String tipo;
        private double peso;

        public Higado(String tipo, double peso) {
            this.tipo = tipo;
            this.peso = peso;
        }

        public String getTipo() {
            return tipo;
        }

        public void setTipo(String tipo) {
            this.tipo = tipo;
        }

        public double getPeso() {
            return peso;
        }

        public void setPeso(double peso) {
            this.peso = peso;
        }
    }

    static class Apendice {
        private String tipo;
        private double longitud;

        public Apendice(String tipo, double longitud) {
            this.tipo = tipo;
            this.longitud = longitud;
        }

        public String getTipo() {
            return tipo;
        }

        public void setTipo(String tipo) {
            this.tipo = tipo;
        }

        public double getLongitud() {
            return longitud;
        }

        public void setLongitud(double longitud) {
            this.longitud = longitud;
        }
    }

    public static void main(String args[]) {
        Corazon cor = new Corazon(0, null);
        Pulmon pul = new Pulmon(0, null);
        Higado hig = new Higado(null, 0);
        Apendice ape = new Apendice(null, 0);

        cor.setRitmoCardiaco(10);
        cor.setTipo("Sano");

        pul.setCapacidad(5000);
        pul.setTipo("Malo");

        hig.setTipo("Sano");
        hig.setPeso(1.5);

        ape.setTipo("Sano");
        ape.setLongitud(6.5);

        System.err.println("------------------------------");
        System.out.println("Corazon:");
        System.out.println("Ritmo cardiaco: " + cor.getRitmoCardiaco());
        System.out.println("Estado: " + cor.getTipo());
        System.err.println("------------------------------");
        System.out.println("Pulmon:");
        System.out.println("Capacidad: " + pul.getCapacidad() + " ml");
        System.out.println("Estado: " + pul.getTipo());
        System.err.println("------------------------------");
        System.out.println("Higado:");
        System.out.println("Estado: " + hig.getTipo());
        System.out.println("Peso: " + hig.getPeso() + " kg");
        System.err.println("------------------------------");
        System.out.println("Apendice:");
        System.out.println("Estado: " + ape.getTipo());
        System.out.println("Longitud: " + ape.getLongitud() + " cm");
        System.err.println("------------------------------");
    }
}
