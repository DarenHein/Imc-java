import javax.swing.*;
import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Prueba_dia extends JFrame {
    private JLabel fechaLabel;

    public Prueba_dia() {
        setTitle("Fecha actual en JLabel");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        fechaLabel = new JLabel();
        fechaLabel.setFont(new Font("Arial", Font.BOLD, 18));
        fechaLabel.setHorizontalAlignment(SwingConstants.CENTER);

        add(fechaLabel);

        setSize(300, 200);
        setVisible(true);

        actualizarFecha();
    }

    private void actualizarFecha() {
        Thread thread = new Thread(() -> {
            while (true) {
                Date fechaActual = new Date();
                SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy ");
                String fechaFormateada = formatoFecha.format(fechaActual);
                fechaLabel.setText(fechaFormateada);

                try {
                    Thread.sleep(1000); // Actualizar cada segundo
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        thread.start();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(Prueba_dia::new);
    }
}
