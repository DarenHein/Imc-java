import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.*;

public class DataBase extends JFrame {

    JPanel panel ; 
    JLabel barra; 
    JLabel etiqueta_titulo; 
    JLabel etiqueta_hora; 
    String horaFormateada; 

    public DataBase(){
        this.setSize(500,500); 
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setTitle("DataBase"); 
        this.setResizable(false);
        paneles(); 
        componentes(); 
    } 
    public void paneles(){
        panel = new JPanel(); 
        panel.setLayout(null);
        this.getContentPane().add(panel); 
    }
    public void componentes(){

        etiqueta_titulo = new JLabel("Base de Datos"); 
        etiqueta_titulo.setBounds(80, 25, 320, 30);
        etiqueta_titulo.setFont(new Font("arial",Font.BOLD,22)); 
        etiqueta_titulo.setForeground(Color.gray); 
        panel.add(etiqueta_titulo); 

        etiqueta_hora = new JLabel(); 
        etiqueta_hora.setBounds(400,25,120,20); 
        etiqueta_hora.setForeground(Color.gray);
        etiqueta_hora.setFont(new Font("arial",Font.BOLD,18)); 
        panel.add(etiqueta_hora); 
        Timer timer = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mostrarHoraActual();
            }
        });
        timer.start();

        barra = new JLabel(); 
        barra.setBounds(0,0,60,500); 
        barra.setOpaque(true);
        barra.setBackground(Color.blue);
        panel.add(barra); 
    }
    private void mostrarHoraActual() {
        Date ahora = new Date();
        SimpleDateFormat formateador = new SimpleDateFormat("HH:mm:ss");
         horaFormateada = formateador.format(ahora);
        etiqueta_hora.setText(horaFormateada);
        
    }

}
