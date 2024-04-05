class CuerpoHumano2 {

    private Corazon corazon = new Corazon(0, null);
    private Pulmon pulmon = new Pulmon(0, null);
    private Higado higado = new Higado(null, 0);
    private Apendice apendice = new Apendice(null, 0);

    public static class Corazon {
        private int ritmoCardiaco;
        private String estado;

        public Corazon(int ritmoCardiaco, String estado) {
            this.ritmoCardiaco = ritmoCardiaco;
            this.estado = estado;
        }

        public int getRitmoCardiaco() {
            return ritmoCardiaco;
        }

        public void setRitmoCardiaco(int ritmoCardiaco) {
            this.ritmoCardiaco = ritmoCardiaco;
        }

        public String getEstado() {
            return estado;
        }

        public void setEstado(String estado) {
            this.estado = estado;
        }
    }

    public static class Pulmon {
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

    public static class Higado {
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

    public static class Apendice {
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
        CuerpoHumano2 cuerpoHumano = new CuerpoHumano2();

        cuerpoHumano.corazon.setRitmoCardiaco(10);
        cuerpoHumano.corazon.setEstado("Sano");

        cuerpoHumano.pulmon.setCapacidad(5000);
        cuerpoHumano.pulmon.setTipo("Malo");

        cuerpoHumano.higado.setTipo("Sano");
        cuerpoHumano.higado.setPeso(1.5);

        cuerpoHumano.apendice.setTipo("Sano");
        cuerpoHumano.apendice.setLongitud(6.5);

        System.err.println("------------------------------");
        System.err.println("Corazon:");
        System.err.println("Ritmo cardiaco: " + cuerpoHumano.corazon.getRitmoCardiaco());
        System.err.println("Estado: " + cuerpoHumano.corazon.getEstado());
        System.err.println("------------------------------");
        System.err.println("Pulmon:");
        System.err.println("Capacidad: " + cuerpoHumano.pulmon.getCapacidad() + " ml");
        System.err.println("Estado: " + cuerpoHumano.pulmon.getTipo());
        System.err.println("------------------------------");
        System.err.println("Higado:");
        System.err.println("Estado: " + cuerpoHumano.higado.getTipo());
        System.err.println("Peso: " + cuerpoHumano.higado.getPeso() + " kg");
        System.err.println("------------------------------");
        System.err.println("Apendice:");
        System.err.println("Estado: " + cuerpoHumano.apendice.getTipo());
        System.err.println("Longitud: " + cuerpoHumano.apendice.getLongitud() + " cm");
        System.err.println("------------------------------");
    }
}
