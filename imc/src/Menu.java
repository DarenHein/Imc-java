import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Menu extends JFrame {

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
    private JLabel etiqueta19;
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
        panel.add(etiqueta);

        etiqueta2 = new JLabel("Bienvenido, Doctor Luis Carbajal");
        etiqueta2.setBounds(160, 120, 300, 20);
        etiqueta2.setFont(new Font("Arial", Font.BOLD, 18));
        etiqueta2.setForeground(new Color(0, 128, 0));
        panel.add(etiqueta2);

        etiqueta3 = new JLabel("'Calculadora de IMC'");
        etiqueta3.setBounds(230, 160, 200, 20);
        panel.add(etiqueta3);

        etiqueta4 = new JLabel("Creada por team .....");
        etiqueta4.setBounds(160, 190, 300, 20);
        etiqueta4.setForeground(new Color(0, 128, 0));
        panel.add(etiqueta4);

        boton = new JButton("Registro");
        boton.setBounds(0, 50, 100, 100);
        boton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                registro();
            }

        });
        panel.add(boton);

        boton2 = new JButton("Tabla Imc ");
        boton2.setBounds(0, 140, 100, 100);
        boton2.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

            }

        });
        panel.add(boton2);

        boton3 = new JButton("Calculadora");
        boton3.setBounds(0, 230, 100, 100);
        boton3.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

            }

        });
        panel.add(boton3);

        boton4 = new JButton("Cerrar");
        boton4.setBounds(430, 330, 120, 20);
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
    }
}