import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Inicio extends JFrame {
    private JPanel panel;
    private JButton boton; 
    private JButton boton2; 
    private JButton boton3 ; // todo este boton que sea secreto y que sirva para el ingreso del menu del adminitrador  
    private JLabel etiqueta; 
    private JLabel etiqueta2; 
    private JLabel etiqueta3; 
    private JTextField campo; 
    private JTextField campo2; 
    
    public Inicio(){
        this.setSize(300,300);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE); 
        this.setTitle("Inicio");
        paneles(); 
        ventana_inicio();
    }
    public void paneles(){
        panel = new JPanel(); 
        panel.setLayout(null);
        this.getContentPane().add(panel); 
    }
    public void ventana_inicio(){

        etiqueta = new JLabel("Inicio"); 
        etiqueta.setBounds(130, 30, 120, 20);
        panel.add(etiqueta); 

        etiqueta2 = new JLabel("Nombre:"); 
        etiqueta2.setBounds(20,90,120,20);
        panel.add(etiqueta2);

        etiqueta3 = new JLabel("Contraseña:"); 
        etiqueta3.setBounds(20,130,120,20);
        panel.add(etiqueta3);

        campo = new JTextField(); 
        campo.setBounds(120, 90, 170, 20);
        panel.add(campo); 

        campo2 = new JTextField(); 
        campo2.setBounds(120, 130, 170, 20);
        panel.add(campo2); 

        boton = new JButton("Regresar"); 
        boton.setBounds(30, 220, 100, 20);
        boton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                ventana obj = new ventana(); 
                obj.setVisible(true);
                setVisible(false);
            }
            
        });
        panel.add(boton);

        boton = new JButton("Ingresar"); 
        boton.setBounds(150, 220, 100, 20);
        boton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
               //Todo aun no se agregan las implementaciones de incio de secion por el momento solo va a ver el usuario que se registra y el administrador entrando esos dos ya se acaba todo lo de esta pagina 
               Menu obj2 = new Menu(); 
               obj2.setVisible(true);
               setVisible(false);
            }
            
        });
        panel.add(boton);

        

    }
    
}
