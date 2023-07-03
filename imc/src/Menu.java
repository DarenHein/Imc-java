import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Menu extends JFrame{

    private JPanel panel;
    private JButton boton; 
    private JButton boton2; 
    private JButton boton3; 
    private JButton boton4; 
    private JLabel etiqueta; 
    private JLabel etiqueta2; 
    private JLabel etiqueta3; 
    private JLabel etiqueta4; 
    public Menu(){
        this.setSize(600, 400);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setTitle("Menu");
        this.setResizable(false);
        paneles(); 
        menu(); 
    }
    public void paneles(){
        panel = new JPanel(); 
        panel.setLayout(null);
        this.getContentPane().add(panel); 
    }
    public void menu(){

        etiqueta = new JLabel("Menu"); 
        etiqueta.setBounds(280,20,120,20); 
        etiqueta.setFont(new Font("Arial", Font.BOLD, 24));
        panel.add(etiqueta); 

        etiqueta2 = new JLabel("Bienvenido"); 
        etiqueta2.setBounds(260,120,120,20); 
        etiqueta2.setFont(new Font("arial",Font.BOLD,20));
        etiqueta2.setForeground(Color.red);
        panel.add(etiqueta2); 

        etiqueta3 = new JLabel("Calculadora de IMC"); 
        etiqueta3.setBounds(140,160,200,20); 
        panel.add(etiqueta3); 

        etiqueta4 = new JLabel("Creada por team ....."); 
        etiqueta4.setBounds(140,190,200,20); 
        etiqueta3.setForeground(Color.red);
        panel.add(etiqueta4); 

        // todo.................................................

        boton= new JButton("Introduccion"); 
        boton.setBounds(0,50,100,100); 
        boton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                
            }
            
        }); 
        panel.add(boton);

        boton2= new JButton("Tabla Imc "); 
        boton2.setBounds(0,140,100,100); 
        boton2.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                
            }
            
        });
        panel.add(boton2);

        boton3= new JButton("Calculadora"); 
        boton3.setBounds(0,230,100,100); 
        boton3.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                
            }
            
        });
        panel.add(boton3);

        boton4= new JButton("Cerrar"); 
        boton4.setBounds(430,330,120,20); 
        boton4.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                
            }
            
        });
        panel.add(boton4);


    }
    
}
