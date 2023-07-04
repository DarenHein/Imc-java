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
    private JLabel etiqueta5; 
    private JLabel etiqueta6; 
    private JLabel etiqueta7; 
    private JLabel etiqueta8; 
    private JLabel etiqueta9; 
    private JLabel etiqueta10; 
    private JLabel etiqueta11; 
    private JLabel etiqueta12; 
    private JLabel etiqueta13; 
    private JLabel etiqueta14; 
    private JLabel etiqueta15; 
    private JLabel etiqueta16; 
    private JTextField campo; 
    private JTextField campo2; 
    private JTextField campo3; 
    private JTextField campo4; 
    private JTextField campo5; 
    private JTextField campo6; 
    private JTextField campo7; 
    private JTextField campo8; 
    private JTextArea area; 
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

        boton= new JButton("Registro"); 
        boton.setBounds(0,50,100,100); 
        boton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                registro();
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
    public void registro(){

        this.setSize(600,600);
        this.setLocationRelativeTo(null); 

        boton.setVisible(false);
        boton2.setVisible(false);
        boton3.setVisible(false);
        boton4.setVisible(false);
        etiqueta.setVisible(false);
        etiqueta.setVisible(false);
        etiqueta2.setVisible(false);
        etiqueta3.setVisible(false);
        etiqueta4.setVisible(false);
        //etiqueta5.setVisible(false);

        etiqueta5 = new JLabel("Nombre:"); 
        etiqueta5.setBounds(20,90,120,20);
        etiqueta5.setVisible(true);
        panel.add(etiqueta5);
        
        etiqueta6 = new JLabel("Apellidos:"); 
        etiqueta6.setBounds(20,120,120,20);
        panel.add(etiqueta6);

        etiqueta7 = new JLabel("Telefono:"); 
        etiqueta7.setBounds(20,150,120,20);
        panel.add(etiqueta7);

        etiqueta8 = new JLabel("Sexo:"); 
        etiqueta8.setBounds(20,180,120,20);
        panel.add(etiqueta8);

        etiqueta9 = new JLabel("contraseña:"); 
        etiqueta9.setBounds(20,210,120,20);
        panel.add(etiqueta9);

        etiqueta10 = new JLabel("Correo:"); 
        etiqueta10.setBounds(20,270,120,20);
        panel.add(etiqueta10);

        etiqueta11= new JLabel("Notas:"); 
        etiqueta11.setBounds(20,330,120,20);
        panel.add(etiqueta11);

        campo = new JTextField(); 
        campo.setBounds(130, 90, 200, 20);
        panel.add(campo); 

        campo2 = new JTextField(); 
        campo2.setBounds(130, 120, 200, 20);
        panel.add(campo2); 

        campo3 = new JTextField(); 
        campo3.setBounds(130, 150, 200, 20);
        panel.add(campo3); 

        campo4 = new JTextField(); // sexo 
        campo4.setBounds(130, 180, 200, 20);
        panel.add(campo4); 

        campo5 = new JTextField(); //nomero de emergencias 
        campo5.setBounds(130, 210, 200, 20);
        panel.add(campo5); 

        campo6 = new JTextField(); // peso 
        campo6.setBounds(130, 240, 200, 20);
        panel.add(campo6); 

        campo7 = new JTextField(); //correo 
        campo7.setBounds(130, 270, 200, 20);
        panel.add(campo7); 

        campo8 = new JTextField(); //alruta
        campo8.setBounds(130, 300, 200, 20);
        panel.add(campo8); 


    }
    
}
