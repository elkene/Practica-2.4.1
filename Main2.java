class CuerpoHumano {
    private Corazon corazon;
    private Pulmon pulmon;
    private Higado higado;
    private Apendice apendice;
    
    public CuerpoHumano(Corazon corazon, Pulmon pulmon, Higado higado, Apendice apendice) {
        this.corazon = corazon;
        this.pulmon = pulmon;
        this.higado = higado;
        this.apendice = apendice;
    }
    
    // Getters y setters
    public Corazon getCorazon() {
        return corazon;
    }

    public void setCorazon(Corazon corazon) {
        this.corazon = corazon;
    }

    public Pulmon getPulmon() {
        return pulmon;
    }

    public void setPulmon(Pulmon pulmon) {
        this.pulmon = pulmon;
    }

    public Higado getHigado() {
        return higado;
    }

    public void setHigado(Higado higado) {
        this.higado = higado;
    }

    public Apendice getApendice() {
        return apendice;
    }

    public void setApendice(Apendice apendice) {
        this.apendice = apendice;
    }
}

class Corazon {
    private int ritmoCardiaco;
    private String tipo;

    public Corazon(int ritmoCardiaco, String tipo) {
        this.ritmoCardiaco = ritmoCardiaco;
        this.tipo = tipo;
    }

    // Getters y setters
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

class Pulmon {
    private int capacidad;
    private String tipo;

    public Pulmon(int capacidad, String tipo) {
        this.capacidad = capacidad;
        this.tipo = tipo;
    }

    // Getters y setters
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

class Higado {
    private String tipo;
    private double peso;

    public Higado(String tipo, double peso) {
        this.tipo = tipo;
        this.peso = peso;
    }

    // Getters y setters
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

class Apendice {
    private boolean sano;
    private double longitud;

    public Apendice(boolean sano, double longitud) {
        this.sano = sano;
        this.longitud = longitud;
    }

    // Getters y setters
    public boolean isSano() {
        return sano;
    }

    public void setSano(boolean sano) {
        this.sano = sano;
    }

    public double getLongitud() {
        return longitud;
    }

    public void setLongitud(double longitud) {
        this.longitud = longitud;
    }
}
public class Main2 {
    public static void main(String[] args) {
        // Crear las partes del cuerpo humano
        Corazon corazon = new Corazon(70, "normal");
        Pulmon pulmon = new Pulmon(5000, "normal");
        Higado higado = new Higado("normal", 1.5);
        Apendice apendice = new Apendice(true, 6.5);

        // Crear el cuerpo humano con sus partes
        CuerpoHumano cuerpoHumano = new CuerpoHumano(corazon, pulmon, higado, apendice);

        // Imprimir algunos atributos de las partes y del cuerpo humano
        System.out.println("Atributos del Corazon:");
        System.out.println("Ritmo cardiaco: " + cuerpoHumano.getCorazon().getRitmoCardiaco());
        System.out.println("Tipo: " + cuerpoHumano.getCorazon().getTipo());

        System.out.println("\nAtributos del Pulmon:");
        System.out.println("Capacidad: " + cuerpoHumano.getPulmon().getCapacidad() + " ml");
        System.out.println("Tipo: " + cuerpoHumano.getPulmon().getTipo());

        System.out.println("\nAtributos del Higado:");
        System.out.println("Tipo: " + cuerpoHumano.getHigado().getTipo());
        System.out.println("Peso: " + cuerpoHumano.getHigado().getPeso() + " kg");

        System.out.println("\nAtributos del Apendice:");
        System.out.println("Sano: " + cuerpoHumano.getApendice().isSano());
        System.out.println("Longitud: " + cuerpoHumano.getApendice().getLongitud() + " cm");
    }
}