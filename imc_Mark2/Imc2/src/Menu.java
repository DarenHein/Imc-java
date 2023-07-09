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

// todo "El aliado perfecto para una gestión médica sin complicaciones."

public class Menu extends JFrame{
    JPanel panel; 
    JLabel etiqueta; 
    JLabel etiqueta_hora; 
    JLabel etiqueta_nombre; 
    JLabel etiqueta_barra; 
    JButton boton_registro; 
    JButton boton_Consulta; 
    JButton boton_Calculadora;  
    String dato; 
    ImageIcon icono_registro; 
    ImageIcon icono_Consulta; 
    ImageIcon icono_Calculadora; 

    public void setDato(String dato){

        this.dato = dato; 
        etiqueta_nombre.setText(dato);

    }
    
    ImageIcon icono = new ImageIcon("C:/Users/Daren/Downloads/Imc-java/imc_Mark2/Imc2/src/imc.png"); 
    public Menu(){
        this.setSize(800,600); 
        this.setLocationRelativeTo(null); 
        this.setTitle("Menu");
        this.setIconImage(icono.getImage());
        this.setResizable(false);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE); 
        paneles(); 
        menu();  
    }
    public void paneles(){
        panel = new JPanel(); 
        panel.setLayout(null); 
        this.getContentPane().add(panel); 
    }
    public void menu(){

        etiqueta_nombre = new JLabel(); 
        etiqueta_nombre.setBounds(700, 30, 120, 20);
        etiqueta_nombre.setFont(new Font("arial",Font.BOLD,19));
        etiqueta_nombre.setForeground(Color.white);
        panel.add(etiqueta_nombre); 

        etiqueta_hora = new JLabel(); 
        etiqueta_hora.setBounds(700, 60, 120, 20);
        etiqueta_hora.setFont(new Font("arial",Font.BOLD,19)); 
        etiqueta_hora.setForeground(Color.white);
        panel.add(etiqueta_hora); 

        Timer timer = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mostrarHoraActual();
            }
        });
        timer.start();
        icono_registro = new ImageIcon("C:/Users/Daren/Downloads/Imc-java/imc_Mark2/Imc2/src/edit.png");
        boton_registro = new JButton(); 
        boton_registro.setBounds(100, 200, 80, 80);
        boton_registro.setContentAreaFilled(false);
        boton_registro.setBorderPainted(false);
        boton_registro.setIcon(new ImageIcon(icono_registro.getImage().getScaledInstance(boton_registro.getWidth(),boton_registro.getHeight(),Image.SCALE_SMOOTH)));
        panel.add(boton_registro); 

        icono_Consulta = new ImageIcon("C:/Users/Daren/Downloads/Imc-java/imc_Mark2/Imc2/src/database.png");
        boton_Consulta = new JButton(); 
        boton_Consulta.setBounds(350, 200, 80, 80);
        boton_Consulta.setContentAreaFilled(false);
        boton_Consulta.setBorderPainted(false);
        boton_Consulta.setIcon(new ImageIcon(icono_Consulta.getImage().getScaledInstance(boton_Consulta.getWidth(),boton_Consulta.getHeight(),Image.SCALE_SMOOTH)));
        panel.add(boton_Consulta); 

        icono_Calculadora = new ImageIcon("C:/Users/Daren/Downloads/Imc-java/imc_Mark2/Imc2/src/keys.png");
        boton_Calculadora = new JButton(); 
        boton_Calculadora.setBounds(220, 350, 80, 80);
        boton_Calculadora.setContentAreaFilled(false);
        boton_Calculadora.setBorderPainted(false);
        boton_Calculadora.setIcon(new ImageIcon(icono_Calculadora.getImage().getScaledInstance(boton_Calculadora.getWidth(),boton_Calculadora.getHeight(),Image.SCALE_SMOOTH)));
        panel.add(boton_Calculadora); 

        

        etiqueta_barra = new JLabel(); 
        etiqueta_barra.setBounds(550,0,500,600); 
        etiqueta_barra.setBackground(Color.blue);
        etiqueta_barra.setOpaque(true);
        panel.add(etiqueta_barra); 


    }

    private void mostrarHoraActual() {
        Date ahora = new Date();
        SimpleDateFormat formateador = new SimpleDateFormat("HH:mm:ss");
        String horaFormateada = formateador.format(ahora);
        etiqueta_hora.setText(horaFormateada);
    }
   
    
    
}
