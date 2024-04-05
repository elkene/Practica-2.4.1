import javax.swing.JFrame;

public class VentanaEjemplo {

    public static void main(String[] args) {
        // Crear un objeto JFrame
        JFrame ventana = new JFrame("Mi Ventana");

        // Configurar el tamaño de la ventana
        ventana.setSize(400, 300);

        // Hacer que la ventana se cierre correctamente al hacer clic en el botón de cierre
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Hacer visible la ventana
        ventana.setVisible(true);
    }
}
