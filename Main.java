// Clase Rueda
class Rueda {
    private int diametro;
    private String material;
    private String tipo;

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

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}

// Clase Cuadro
class Cuadro {
    private String material;
    private String tipo;
    private String color;

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

// Clase Bicicleta
class Bicicleta {
    private Rueda ruedaDelantera;
    private Rueda ruedaTrasera;
    private Cuadro cuadro;

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
        Bicicleta miBicicleta = new Bicicleta();

        // Crear una nueva rueda delantera
        Rueda ruedaDelantera = new Rueda();
        ruedaDelantera.setDiametro(26);
        ruedaDelantera.setMaterial("Aluminio");
        ruedaDelantera.setTipo("MTB");

        // Crear una nueva rueda trasera
        Rueda ruedaTrasera = new Rueda();
        ruedaTrasera.setDiametro(26);
        ruedaTrasera.setMaterial("Aluminio");
        ruedaTrasera.setTipo("MTB");

        // Crear un nuevo cuadro
        Cuadro cuadro = new Cuadro();
        cuadro.setMaterial("Acero");
        cuadro.setTipo("MTB");
        cuadro.setColor("Negro");

        // Establecer las partes en la bicicleta
        miBicicleta.setRuedaDelantera(ruedaDelantera);
        miBicicleta.setRuedaTrasera(ruedaTrasera);
        miBicicleta.setCuadro(cuadro);

        // Imprimir algunos atributos de las partes y de la bicicleta
        System.out.println("Atributos de la rueda delantera:");
        System.out.println("Diametro: " + miBicicleta.getRuedaDelantera().getDiametro());
        System.out.println("Material: " + miBicicleta.getRuedaDelantera().getMaterial());
        System.out.println("Tipo: " + miBicicleta.getRuedaDelantera().getTipo());

        System.out.println("\nAtributos del cuadro:");
        System.out.println("Material: " + miBicicleta.getCuadro().getMaterial());
        System.out.println("Tipo: " + miBicicleta.getCuadro().getTipo());
        System.out.println("Color: " + miBicicleta.getCuadro().getColor());

        // Imprimir algunos atributos de la bicicleta
        System.out.println("\nAtributos de la bicicleta:");
        System.out.println("Diametro de la rueda delantera: " + miBicicleta.getRuedaDelantera().getDiametro());
        System.out.println("Diametro de la rueda trasera: " + miBicicleta.getRuedaTrasera().getDiametro());
        System.out.println("Color del cuadro: " + miBicicleta.getCuadro().getColor());
    }
}
