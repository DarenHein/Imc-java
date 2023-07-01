import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*; 
public class ventana extends JFrame{

    JButton boton , boton2 , boton3; 
    JPanel panel; 
    JLabel etiqueta,etiqueta2,etiqueta3,etiqueta4; 
    JLabel etiqueta5 , etiqueta6, etiqueta7, etiqueta8, etiqueta9 ; // ! apartado de registro 
    JTextField campo,campo2,campo3; 
    JTextField campo4 , campo5 ,campo6 ,campo7 ,campo8; 
    JButton boton4, boton5, boton6 ; 
    //!Iniciar 
    JLabel etiqueta10 , etiqueta11, etiqueta12; 
    JTextField campo9 , campo10 ; 
    JButton boton7 , boton8 ,boton9 ; 
    String nombre ; 
    String contraseña ; 
    String edad ; 
    String apellido; 
    String correo; 
    String administrador = "admin";
    String contraseña_admin = "58825613";  

    public ventana(){
        this.setSize(400, 400);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setTitle("IMC");
        paneles(); 
        etiquetas(); 
        botones(); 
        camposdetexto(); 
        iniciar(); 
    }
    public void paneles(){
        panel = new JPanel(); 
        panel.setLayout(null);
        this.getContentPane().add(panel); 
    }
    public void etiquetas(){

        etiqueta = new JLabel("Presiona para iniciar ");
        etiqueta.setBounds(80,200,220,20);  
        etiqueta.setVisible(true); 
        panel.add(etiqueta); 

        etiqueta2 = new JLabel("Ingresa");//? titulo 
        etiqueta3 = new JLabel("Iniciar Registro"); 
        etiqueta3.setBounds(150, 20, 120, 20);// ! cambiar tamaño de este titulo 
        etiqueta3.setVisible(false);
        panel.add(etiqueta3);

        etiqueta4 = new JLabel("Nombre"); 
        etiqueta4.setBounds(50,100,120,20); 
        etiqueta4.setVisible(false); 
        panel.add(etiqueta4); 

        etiqueta5 = new JLabel("Apellido"); 
        etiqueta5.setBounds(50,130,120,20); 
        etiqueta5.setVisible(false); 
        panel.add(etiqueta5); 

        etiqueta6 = new JLabel("Correo"); 
        etiqueta6.setBounds(50,160,120,20); 
        etiqueta6.setVisible(false); 
        panel.add(etiqueta6); 

        etiqueta7 = new JLabel("Contraseña"); 
        etiqueta7.setBounds(50,190,120,20); 
        etiqueta7.setVisible(false); 
        panel.add(etiqueta7); 

    }
    public void camposdetexto(){

        campo = new JTextField(); 
        campo.setBounds(150, 100, 180, 20);
        campo.setVisible(false);
        panel.add(campo); 

        campo2 = new JTextField(); 
        campo2.setBounds(150, 130, 180, 20);
        campo2.setVisible(false);
        panel.add(campo2); 

        campo3 = new JTextField(); 
        campo3.setBounds(150, 160, 180, 20);
        campo3.setVisible(false);
        panel.add(campo3); 

        campo4 = new JTextField(); 
        campo4.setBounds(150, 190, 180, 20);
        campo4.setVisible(false);
        panel.add(campo4); 

    }
    public void botones(){
        boton3 = new JButton("Registrarse"); 
        boton3.setBounds(20,300 , 120, 20);
        boton3.setVisible(false);
        boton3.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                 boton2.setVisible(false); 
                 boton3.setVisible(false); 
                 setSize(400,400); 
                 etiqueta3.setVisible(true); 
                 etiqueta4.setVisible(true); 
                 etiqueta5.setVisible(true); 
                 etiqueta6.setVisible(true); 
                 etiqueta7.setVisible(true); 
                 campo.setVisible(true);
                 campo2.setVisible(true);
                 campo3.setVisible(true);
                 campo4.setVisible(true);
                 boton4.setVisible(true);
            }
            
        });
        panel.add(boton3); 
        
        boton = new JButton("Iniciar"); 
        boton.setBounds(150, 250, 120, 20);
        boton.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                etiqueta.setVisible(false);
                setSize(300,500); 
                boton.setVisible(false);
                boton2.setVisible(true);
                boton3.setVisible(true); 
            }});
        panel.add(boton); 

        boton4 = new JButton("Registrar"); 
        boton4.setBounds(150, 250, 120, 20);
        boton4.setVisible(false);
        boton4.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                nombre = campo.getText(); 
                apellido = campo2.getText(); 
                correo = campo3.getText(); 
                contraseña = campo4.getText();
                if (nombre.isEmpty() || apellido.isEmpty() || correo.isEmpty() || contraseña.isEmpty()){
                    JOptionPane.showMessageDialog(null, "Campos vacios ");
                } else {
                    JOptionPane.showMessageDialog(null, "Registro exitoso");

                    campo.setText(" ");
                    campo2.setText(" ");
                    campo3.setText(" ");
                    campo4.setText(" ");

                    boton2.setVisible(true); 
                    boton3.setVisible(true); 
                    setSize(300,500); 
                    etiqueta3.setVisible(false); 
                    etiqueta4.setVisible(false); 
                    etiqueta5.setVisible(false); 
                    etiqueta6.setVisible(false); 
                    etiqueta7.setVisible(false); 
                    campo.setVisible(false);
                    campo2.setVisible(false);
                    campo3.setVisible(false);
                    campo4.setVisible(false);
                    boton4.setVisible(false);
                }
            
        }});
        panel.add(boton4);
        
    }
    public void iniciar(){

        etiqueta10 = new JLabel("Inicia sesion"); 
        etiqueta10.setBounds(150, 20, 120, 20);
        etiqueta10.setVisible(false);
        panel.add(etiqueta10); 

        etiqueta11 = new JLabel("Nombre : "); 
        etiqueta11.setBounds(50, 150, 120, 20);
        etiqueta11.setVisible(false);
        panel.add(etiqueta11); 

        etiqueta12 = new JLabel("Contraseña");
        etiqueta12.setBounds(50, 200, 120, 20);
        etiqueta12.setVisible(false);
        panel.add(etiqueta12); 

        campo9 = new JTextField(); 
        campo9.setBounds(150, 150, 120, 20);
        campo9.setVisible(false);
        panel.add(campo9); 

        campo10 = new JTextField(); 
        campo10.setBounds(150, 200, 120, 20);
        campo10.setVisible(false);
        panel.add(campo10); 

        boton2 = new JButton("Iniciar sesion"); 
        boton2.setBounds(170, 300, 120, 20);
        boton2.setVisible(false);
        boton2.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {

                setSize(400, 400);
                etiqueta10.setVisible(true);
                boton2.setVisible(false);
                boton3.setVisible(false);
                etiqueta11.setVisible(true);
                etiqueta12.setVisible(true);
                campo9.setVisible(true); 
                campo10.setVisible(true); 
                boton7.setVisible(true);
               

            }});
        panel.add(boton2); 

        boton7 = new JButton("Salir"); 
        boton7.setBounds(40, 300, 120, 20);
        boton7.setVisible(false); 
        boton7.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
               System.exit(0); 
            }

        }); 
        panel.add(boton7);
        boton8 = new JButton("Iniciar sesion"); 
        
    }


}

