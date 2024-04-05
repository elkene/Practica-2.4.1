class CuerpoHumano {
    class Corazon {
        private int ritmoCardiaco;
        private String tipo;

        public Corazon(int ritmoCardiaco, String tipo) {
            this.ritmoCardiaco = ritmoCardiaco;
            this.tipo = tipo;
        }

        public void mostrarInformacion() {
            System.out.println("Corazon:");
            System.out.println("Ritmo cardiaco: " + ritmoCardiaco);
            System.out.println("Tipo: " + tipo);
        }
    }

    class Pulmon {
        private int capacidad;
        private String tipo;

        public Pulmon(int capacidad, String tipo) {
            this.capacidad = capacidad;
            this.tipo = tipo;
        }

        public void mostrarInformacion() {
            System.out.println("Pulmon:");
            System.out.println("Capacidad: " + capacidad + " ml");
            System.out.println("Tipo: " + tipo);
        }
    }

    class Higado {
        private String tipo;
        private double peso;

        public Higado(String tipo, double peso) {
            this.tipo = tipo;
            this.peso = peso;
        }

        public void mostrarInformacion() {
            System.out.println("Higado:");
            System.out.println("Tipo: " + tipo);
            System.out.println("Peso: " + peso + " kg");
        }
    }

    class Apendice {
        private boolean sano;
        private double longitud;

        public Apendice(boolean sano, double longitud) {
            this.sano = sano;
            this.longitud = longitud;
        }

        public void mostrarInformacion() {
            System.out.println("Apendice:");
            System.out.println("Sano: " + sano);
            System.out.println("Longitud: " + longitud + " cm");
        }
    }

    public static void main(String args[]) {
        CuerpoHumano cuerpoHumano = new CuerpoHumano();

        // Crear las partes del cuerpo humano
        Corazon corazon = cuerpoHumano.new Corazon(70, "normal");
        Pulmon pulmon = cuerpoHumano.new Pulmon(5000, "normal");
        Higado higado = cuerpoHumano.new Higado("normal", 1.5);
        Apendice apendice = cuerpoHumano.new Apendice(true, 6.5);

        // Imprimir algunos atributos de las partes del cuerpo humano
        corazon.mostrarInformacion();
        pulmon.mostrarInformacion();
        higado.mostrarInformacion();
        apendice.mostrarInformacion();
    }
}
