import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Menu extends JFrame {

    private String altura; 
    private String peso; 
    private float altura2; 
    private float peso2; 
    private float resultado; 
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
    private JLabel etiqueta17;
    private JLabel etiqueta18;
    // todo etiquetas de calculadroa 
    private JLabel etiqueta19;
    private JLabel etiqueta20;
    private JLabel etiqueta21;  
    // todo botones de calculadora 
    private JButton boton5 ; // boton de regresar del registro 
    private JButton boton6; 
    private JButton boton7; 
    // todo campos de texto 
    private JTextField campo15; 
    private JTextField campo16; 
    private JTextField campo;
    private JTextField campo2;
    private JTextField campo3;
    private JTextField campo4;
    private JTextField campo5;
    private JTextField campo6;
    private JTextField campo7;
    private JTextField campo8;
    private JTextField campo9;
    private JTextField campo10;
    private JTextField campo11;
    private JTextField campo12;
    private JTextField campo13;
    private JTextField campo14;
    private JTextArea area;

    public Menu() {
        this.setSize(600, 400);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setTitle("Menu");
        this.setResizable(false);
        paneles();
        menu();
    }

    public void paneles() {
        panel = new JPanel();
        panel.setLayout(null);
        this.getContentPane().add(panel);
    }

    public void menu() {

        etiqueta = new JLabel("Menu");
        etiqueta.setBounds(270, 20, 200, 40);
        etiqueta.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 32));
        etiqueta.setVisible(true);
        panel.add(etiqueta);

        etiqueta2 = new JLabel("Bienvenido, Doctor Luis Carbajal");
        etiqueta2.setBounds(160, 120, 300, 20);
        etiqueta2.setFont(new Font("Arial", Font.BOLD, 18));
        etiqueta2.setForeground(new Color(0, 128, 0));
        etiqueta2.setVisible(true);
        panel.add(etiqueta2);

        etiqueta3 = new JLabel("'Calculadora de IMC'");
        etiqueta3.setBounds(230, 160, 200, 20);
        etiqueta.setVisible(true);
        panel.add(etiqueta3);

        etiqueta4 = new JLabel("Creada por team .....");
        etiqueta4.setBounds(160, 190, 300, 20);
        etiqueta4.setForeground(new Color(0, 128, 0));
        etiqueta.setVisible(true);
        panel.add(etiqueta4);

        boton = new JButton("Registro");
        boton.setBounds(0, 50, 100, 100);
        boton.setVisible(true); 
        boton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                registro();
            }

        });
        panel.add(boton);

        boton2 = new JButton("Tabla Imc ");
        boton2.setBounds(0, 140, 100, 100);
        boton2.setVisible(true);
        boton2.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

            }

        });
        panel.add(boton2);

        boton3 = new JButton("Calculadora");
        boton3.setBounds(0, 230, 100, 100);
        boton3.setVisible(true);
        boton3.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                calculadora(); 
                Grafica obj2 = new Grafica(); 
                obj2.setVisible(true); 
            }

        });
        panel.add(boton3);

        boton4 = new JButton("Cerrar");
        boton4.setBounds(430, 330, 120, 20);
        boton4.setVisible(true);
        boton4.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

            }

        });
        panel.add(boton4);
    }

    public void registro() {
        this.setSize(650, 650);
        this.setLocationRelativeTo(null);

        boton.setVisible(false);
        boton2.setVisible(false);
        boton3.setVisible(false);
        boton4.setVisible(false);
        etiqueta.setVisible(false);
        etiqueta2.setVisible(false);
        etiqueta3.setVisible(false);
        etiqueta4.setVisible(false);

        etiqueta5 = new JLabel("Nombre:");
        etiqueta5.setBounds(20, 30, 120, 20);
        panel.add(etiqueta5);

        etiqueta6 = new JLabel("Apellidos:");
        etiqueta6.setBounds(20, 70, 120, 20);
        panel.add(etiqueta6);

        etiqueta7 = new JLabel("Telefono:");
        etiqueta7.setBounds(20, 110, 120, 20);
        panel.add(etiqueta7);

        etiqueta8 = new JLabel("No.Emergencia:");
        etiqueta8.setBounds(20, 150, 120, 20);
        panel.add(etiqueta8);

        etiqueta9 = new JLabel("No.Seguro:");
        etiqueta9.setBounds(20, 190, 120, 20);
        panel.add(etiqueta9);

        etiqueta10 = new JLabel("Correo:");
        etiqueta10.setBounds(20, 230, 120, 20);
        panel.add(etiqueta10);

        etiqueta11 = new JLabel("Alergias:");
        etiqueta11.setBounds(20, 270, 120, 20);
        panel.add(etiqueta11);

        etiqueta12 = new JLabel("Edad:");
        etiqueta12.setBounds(20, 310, 120, 20);
        panel.add(etiqueta12);

        etiqueta13 = new JLabel("Sexo:");
        etiqueta13.setBounds(20, 350, 120, 20);
        panel.add(etiqueta13);

        etiqueta14 = new JLabel("T.Sangre:");
        etiqueta14.setBounds(20, 390, 120, 20);
        panel.add(etiqueta14);

        etiqueta15 = new JLabel("Altura:");
        etiqueta15.setBounds(20, 430, 120, 20);
        panel.add(etiqueta15);

        etiqueta16 = new JLabel("Presion Sistolica:");
        etiqueta16.setBounds(20, 470, 120, 20);
        panel.add(etiqueta16);

        etiqueta17 = new JLabel("Presion Diastolica:");
        etiqueta17.setBounds(20, 510, 120, 20);
        panel.add(etiqueta17);

        etiqueta18 = new JLabel("Frecuencia Cardiaca:");
        etiqueta18.setBounds(20, 550, 120, 20);
        panel.add(etiqueta18);

        campo = new JTextField();
        campo.setBounds(145, 30, 200, 20);
        panel.add(campo);

        campo2 = new JTextField();
        campo2.setBounds(145, 70, 200, 20);
        panel.add(campo2);

        campo3 = new JTextField();
        campo3.setBounds(145, 110, 200, 20);
        panel.add(campo3);

        campo4 = new JTextField();
        campo4.setBounds(145, 150, 200, 20);
        panel.add(campo4);

        campo5 = new JTextField();
        campo5.setBounds(145, 190, 200, 20);
        panel.add(campo5);

        campo6 = new JTextField();
        campo6.setBounds(145, 230, 200, 20);
        panel.add(campo6);

        campo7 = new JTextField();
        campo7.setBounds(145, 270, 200, 20);
        panel.add(campo7);

        campo8 = new JTextField();
        campo8.setBounds(145, 310, 200, 20);
        panel.add(campo8);

        campo9 = new JTextField();
        campo9.setBounds(145, 350, 200, 20);
        panel.add(campo9);

        campo10 = new JTextField();
        campo10.setBounds(145, 390, 200, 20);
        panel.add(campo10);

        campo11 = new JTextField();
        campo11.setBounds(145, 430, 200, 20);
        panel.add(campo11);

        campo12 = new JTextField();
        campo12.setBounds(145, 470, 200, 20);
        panel.add(campo12);

        campo13 = new JTextField();
        campo13.setBounds(145, 510, 200, 20);
        panel.add(campo13);

        campo14 = new JTextField();
        campo14.setBounds(145, 550, 200, 20);
        panel.add(campo14);

        boton5= new JButton("Regresar"); 
        boton5.setBounds(450, 550, 120, 20);
        boton5.setVisible(true);
        boton5.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
               setLocationRelativeTo(null);
               System.out.println("Prueba de boton 5 ");
               setSize(600, 400);
               etiqueta5.setVisible(false);
               etiqueta6.setVisible(false);
               etiqueta7.setVisible(false);
               etiqueta8.setVisible(false);
               etiqueta9.setVisible(false);
               etiqueta10.setVisible(false);
               etiqueta11.setVisible(false);
               etiqueta12.setVisible(false);
               etiqueta13.setVisible(false);
               etiqueta14.setVisible(false);
               etiqueta15.setVisible(false);
               etiqueta16.setVisible(false);
               etiqueta17.setVisible(false);
               etiqueta18.setVisible(false);
               campo.setVisible(false);
               campo2.setVisible(false);
               campo3.setVisible(false);
               campo4.setVisible(false);
               campo5.setVisible(false);
               campo6.setVisible(false);
               campo7.setVisible(false);
               campo8.setVisible(false);
               campo9.setVisible(false);
               campo10.setVisible(false);
               campo11.setVisible(false);
               campo12.setVisible(false);
               campo13.setVisible(false);
               campo14.setVisible(false);
               // todo mostrar 
               boton.setVisible(true);
               boton2.setVisible(true);
               boton3.setVisible(true);
               boton4.setVisible(true);
               etiqueta.setVisible(true);
               etiqueta2.setVisible(true);
               etiqueta3.setVisible(true);
               etiqueta4.setVisible(true);
            }
            
        });
        panel.add(boton5); 

        
    }
    public void calculadora(){
        setSize(400, 400);
        setLocationRelativeTo(null);
        setTitle("Calculadora");
        boton.setVisible(false);
        boton2.setVisible(false);
        boton3.setVisible(false);
        boton4.setVisible(false);
        etiqueta.setVisible(false);
        etiqueta2.setVisible(false);
        etiqueta3.setVisible(false);
        etiqueta4.setVisible(false);

        etiqueta19 = new JLabel("Calculadora"); 
        etiqueta19.setBounds(150,40,120,20);
        etiqueta19.setVisible(true);
        panel.add(etiqueta19); 

        etiqueta20 = new JLabel("Peso : Kilogramos"); 
        etiqueta20.setBounds(40,100 , 160, 20);
        etiqueta20.setVisible(true); 
        panel.add(etiqueta20); 

        etiqueta21 = new JLabel("Altura : Metros "); 
        etiqueta21.setBounds(40, 150, 160, 20);
        etiqueta21.setVisible(true);
        panel.add(etiqueta21);  

        campo15 = new JTextField(); 
        campo15.setBounds(200,100,120,20); 
        campo15.setVisible(true); 
        panel.add(campo15); 

        campo16 = new JTextField(); 
        campo16.setBounds(200, 150, 120, 20);
        campo16.setVisible(true); 
        panel.add(campo16); 

        boton6 = new JButton("Calcular "); 
        boton6.setBounds(60, 230, 120, 20);
        boton6.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Prueba de boton 6");
                altura = campo16.getText(); 
                peso = campo15.getText(); 
                if (altura.isEmpty() || peso.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Ingresa valores en ambos campos de peso y altura");
                return;
                }
                if (!altura.matches("\\d*") || !peso.matches("\\d*")) {
                    JOptionPane.showMessageDialog(null, "Ingresa caracteres numéricos válidos en los campos de peso y altura");
                    return;
                }
                altura2 = Float.parseFloat(altura); 
                peso2 = Float.parseFloat(peso); 
                if (altura2 > 2.0 || peso2 > 180.0){
                    JOptionPane.showMessageDialog(null, "No puede haber edad ni peso con los parametros indicados ");
                }
                else if (altura2 < 0 || peso2 < 0){
                    JOptionPane.showMessageDialog(null, "No puede haber edad ni peso con los parametros indicados ");
                }
                else if (altura2 == 0 || peso2 == 0 ){
                    JOptionPane.showMessageDialog(null, "No puede haber edad ni peso con los parametros indicados ");
                }
                else{
                    try {
                        resultado = peso2 / (altura2 * altura2);
                        JOptionPane.showMessageDialog(null, "Tu imc es de :" + resultado);
                        
                    
                    } catch (Exception e3) {
                        JOptionPane.showMessageDialog(null,"Ingresa carcteres validos ");

                    }  
                }
            }});

        panel.add(boton6); 

        boton7 = new JButton("Regresar ");
        boton7.setBounds(210, 230, 129, 20);
        boton7.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

                System.out.println("Prueba de boton 17 ");
                setSize(600, 400);
                etiqueta19.setVisible(false);
                etiqueta20.setVisible(false);
                etiqueta21.setVisible(false);
                campo15.setVisible(false);
                campo16.setVisible(false);
                boton6.setVisible(false);
                boton7.setVisible(false);
                etiqueta.setVisible(true);
                etiqueta2.setVisible(true);
                etiqueta3.setVisible(true);
                etiqueta4.setVisible(true);
                boton.setVisible(true);
                boton2.setVisible(true);
                boton4.setVisible(true);
                boton3.setVisible(true);
                Grafica obj4 = new Grafica(); 
                obj4.setVisible(false);
            
            }
            
        }); 
        panel.add(boton7); 


        

    }
}