// Clase Rueda
class Rueda {
    private int diametro;
    private String material;
    private String tipoderueda;

    public Rueda(int diametro, String material, String tipoderueda) {
        this.diametro = diametro;
        this.material = material;
        this.tipoderueda = tipoderueda;
    }

    public int getDiametro() {
        return diametro;
    }

    public void setDiametro(int diametro) {
        this.diametro = diametro;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getTipoderueda() {
        return tipoderueda;
    }

    public void setTipoderueda(String tipoderueda) {
        this.tipoderueda = tipoderueda;
    }
}

class Cuadro {
    private String material;
    private String tipo;
    private String color;

    public Cuadro(String material, String tipo, String color) {
        this.material = material;
        this.tipo = tipo;
        this.color = color;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}

class Bicicleta {
    private Rueda ruedaDelantera;
    private Rueda ruedaTrasera;
    private Cuadro cuadro;

    public Bicicleta(Rueda ruedaDelantera, Rueda ruedaTrasera, Cuadro cuadro) {
        this.ruedaDelantera = ruedaDelantera;
        this.ruedaTrasera = ruedaTrasera;
        this.cuadro = cuadro;
    }

    public Rueda getRuedaDelantera() {
        return ruedaDelantera;
    }

    public void setRuedaDelantera(Rueda ruedaDelantera) {
        this.ruedaDelantera = ruedaDelantera;
    }

    public Rueda getRuedaTrasera() {
        return ruedaTrasera;
    }

    public void setRuedaTrasera(Rueda ruedaTrasera) {
        this.ruedaTrasera = ruedaTrasera;
    }

    public Cuadro getCuadro() {
        return cuadro;
    }

    public void setCuadro(Cuadro cuadro) {
        this.cuadro = cuadro;
    }
}

public class Main {
    public static void main(String[] args) {
        // Crear una nueva bicicleta
        Bicicleta miBicicleta = new Bicicleta(
                new Rueda(26, "Aluminio", "Rueda de Montaña"),
                new Rueda(26, "Aluminio", "Rueda de Montaña"),
                new Cuadro("Fibra de carbono", "Marco de Montaña", "Negro")
        );

        // Imprimir algunos atributos de las partes y de la bicicleta
        System.out.println("Atributos de la rueda delantera:");
        System.out.println("Diametro: " + miBicicleta.getRuedaDelantera().getDiametro());
        System.out.println("Material: " + miBicicleta.getRuedaDelantera().getMaterial());
        System.out.println("Tipo: " + miBicicleta.getRuedaDelantera().getTipoderueda());

        System.out.println("\nAtributos de la rueda trasera:");
        System.out.println("Diametro: " + miBicicleta.getRuedaTrasera().getDiametro());
        System.out.println("Material: " + miBicicleta.getRuedaTrasera().getMaterial());
        System.out.println("Tipo: " + miBicicleta.getRuedaTrasera().getTipoderueda());

        System.out.println("\nAtributos del cuadro:");
        System.out.println("Material: " + miBicicleta.getCuadro().getMaterial());
        System.out.println("Tipo: " + miBicicleta.getCuadro().getTipo());
        System.out.println("Color: " + miBicicleta.getCuadro().getColor());
    }
}
