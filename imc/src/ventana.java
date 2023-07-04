import javax.swing.JFrame;
import javax.swing.event.AncestorListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*; // ettrega 50% 21 julio 
// 7 julio sig cascaron 


public class ventana extends JFrame{

    /*
         * informacion personal que se pedira 
         * 1 nombre 
         * 2 apellido 
         * 3 numero de telefono 
         * 4 contacto de emergencia 
         * 7 correo 
         * 9 numero de seguro 
         * edad 
         * sexo 
         * alergias 
         * tipo sangre 
         * curp 
         * nacionalidad 
         * estado civil 
         * direccion 
         * fecha nacimiento 
         * fecha en cada ventana !!!!
     */

    private JPanel panel ;  
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
    private JTextField campo; 
    private JTextField campo2; 
    private JTextField campo3; 
    private JTextField campo4; 
    private JTextField campo5; 
    private JTextField campo6; 
    private JTextField campo7; 
    private JTextField campo8; 
    private JTextArea area; 
    private JButton boton; 
    private JButton boton2; 
    private JButton boton3; 
    private String nombre; 
    private String apellido; 
    private String telefono; 
    private String sexo; 
    private String peso; 
    private String altura; 
    private String correo; 
    private String contraseña; 
    private String contacto; 
    private String notas; 
    

    public ventana(){
        this.setSize(400,300);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setTitle("Imc");
        paneles();
        login(); 

    }
    public void paneles(){

        panel = new JPanel(); 
        panel.setLayout(null);
        this.getContentPane().add(panel); 

    }
    
    public void login(){

        etiqueta = new JLabel("Bienvenido"); 
        etiqueta.setBounds(180, 40, 120, 20);
        panel.add(etiqueta); 

        boton3 = new JButton("Iniciar Sesion"); 
        boton3.setBounds(50, 140, 120, 20);
        boton3.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
               Inicio obj2 = new Inicio(); 
               obj2.setVisible(true);
               setVisible(false);

            }
            
        });
        panel.add(boton3); 

        boton = new JButton("Registrar"); 
        boton.setBounds(50,180,120,20);
        boton.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                setSize(500, 500);
                setLocationRelativeTo(null);
                boton.setVisible(false);
                boton3.setVisible(false);
                etiqueta.setVisible(false); 
                Datos(); 

            }

        });
        panel.add(boton); 

    } 
    public void Datos(){

        System.out.println("Arranca el registro ");
        etiqueta2 = new JLabel("Registro"); 
        etiqueta2.setBounds(220,30,120,20);
        panel.add(etiqueta2);

        etiqueta3 = new JLabel("Nombre:"); 
        etiqueta3.setBounds(20,90,120,20);
        panel.add(etiqueta3);
        
        etiqueta4 = new JLabel("Apellidos:"); 
        etiqueta4.setBounds(20,120,120,20);
        panel.add(etiqueta4);

        etiqueta5 = new JLabel("Telefono:"); 
        etiqueta5.setBounds(20,150,120,20);
        panel.add(etiqueta5);

        etiqueta6 = new JLabel("Sexo:"); 
        etiqueta6.setBounds(20,180,120,20);
        panel.add(etiqueta6);

        etiqueta7 = new JLabel("contraseña:"); 
        etiqueta7.setBounds(20,210,120,20);
        panel.add(etiqueta7);

        etiqueta8 = new JLabel("Peso(kilos):"); 
        etiqueta8.setBounds(20,240,120,20);
        panel.add(etiqueta8);

        etiqueta9 = new JLabel("Correo:"); 
        etiqueta9.setBounds(20,270,120,20);
        panel.add(etiqueta9);

        etiqueta10 = new JLabel("Altura(Metros):"); 
        etiqueta10.setBounds(20,300,120,20);
        panel.add(etiqueta10);

        etiqueta11= new JLabel("Notas:"); 
        etiqueta11.setBounds(20,330,120,20);
        panel.add(etiqueta11);

        // todo campos de escritura 

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

        area = new JTextArea(); // notas 
        area.setBounds(130, 330, 200, 120);
        panel.add(area); 

        boton2 = new JButton("Registrarse");
        boton2.setBounds(360,330,100,20); 
        boton2.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                nombre = campo.getText(); 
                apellido = campo2.getText(); 
                telefono = campo3.getText(); 
                sexo = campo4.getText(); 
                contraseña= campo5.getText(); 
                peso = campo6.getText(); 
                correo = campo7.getText(); 
                altura = campo8.getText(); 
                notas = area.getText(); 
                if (nombre.isEmpty() || apellido.isEmpty() || telefono.isEmpty() || sexo.isEmpty() || contraseña.isEmpty() || peso.isEmpty() || correo.isEmpty() || altura.isEmpty() || notas.isEmpty()){
                    JOptionPane.showMessageDialog(null,"Faltan campos");
                }else {
                    JOptionPane.showMessageDialog(null,"Registro Exitoso");
                    Menu obj = new Menu();
                    obj.setVisible(true);
                    setVisible(false); 
                }


               
            }
            
        });
        panel.add(boton2);  

    }

}