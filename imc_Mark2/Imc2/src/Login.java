import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Login extends JFrame {
    JButton boton; 
    JLabel etiqueta; 
    JLabel etiqueta2; 
    JLabel etiqueta3; 
    JLabel etiqueta4; 
    JLabel etiqueta5; 
    JLabel etiqueta6;  
    JTextField campo; 
    JPasswordField campo2;  
    JPanel panel;
    String usuario = "Luis"; 
    String contra = "1234"; 
    String admin = "Lupillo"; 
    String contra2 = "12345";   
    ImageIcon icono = new ImageIcon("C:/Users/Daren/Downloads/Imc-java/imc_Mark2/Imc2/src/imc.png");
    public Login(){

        this.setSize(650, 500);
        this.setIconImage(icono.getImage());
        this.setTitle("Hola");
        this.setLocationRelativeTo(null); 
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setResizable(false);
        paneles(); 
        login(); 

    }
    public void paneles(){
      panel = new JPanel(); 
      panel.setLayout(null);
      this.getContentPane().add(panel); 
    }
    public void login(){
        etiqueta = new JLabel("Inicio de Sesion");
        etiqueta.setBounds(20, 80, 180, 40);
        etiqueta.setForeground(Color.black);
        etiqueta.setFont(new Font("Arial",Font.BOLD,18)); 
        panel.add(etiqueta);  

        etiqueta2 = new JLabel("Nombre de usuario");
        etiqueta2.setBounds(20, 140, 170, 20);
        etiqueta2.setForeground(Color.gray);
        etiqueta2.setFont(new Font("arial",Font.BOLD,15)); 
        panel.add(etiqueta2); 

        etiqueta3 = new JLabel("Nombre"); 
        etiqueta3.setBounds(20, 180, 150, 20);
        etiqueta3.setFont(new Font("arial",Font.BOLD,14)); 
        etiqueta3.setForeground(Color.gray);
        panel.add(etiqueta3); 

        campo = new JTextField(); 
        campo.setBounds(20, 210, 190, 25);
        campo.setForeground(Color.red);
        panel.add(campo); 

        etiqueta4 = new JLabel("Contraseña"); 
        etiqueta4.setBounds(20,260,150,20); 
        etiqueta4.setForeground(Color.gray);
        etiqueta4.setFont(new Font("arial", Font.BOLD, 14)); 
        panel.add(etiqueta4); 

        campo2 = new JPasswordField(); 
        campo2.setBounds(20,300,190,25); 
        panel.add(campo2); 

        boton = new JButton("Iniciar"); 
        boton.setBounds(25,370,100,30); 
        boton.setBackground(Color.blue);
        boton.setForeground(Color.white);
        boton.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
               String campoU = campo.getText(); 
               String campoP = campo2.getText(); 
                try {
                     if (campoU.isEmpty() || campoP.isEmpty() ){

                        JOptionPane.showMessageDialog(null,"Campo de usuario y contraseña vacios ");
                
                    }
                    else if (campoU.equals(usuario) && campoP.equals(contra)){
                        // todo Peude Pasar 
                        System.out.println("Puede pasar el doctor");
                        Menu obj = new Menu(); 
                        obj.setDato(campoU);
                        obj.setVisible(true); 
                        setVisible(false); 
                    }
                    else if (campoU.equals(admin) && campoP.equals(contra2)){
                        // todo puede pasar 
                        System.out.println("Puede pasar el admin");
                        Menu obj2 = new Menu(); 
                        obj2.setDato(campoU);
                        obj2.setVisible(true); 
                        setVisible(false); 
                    }
                    else{
                        JOptionPane.showMessageDialog(null,"Campos Incorrectos");
                    }
                } catch (Exception e2) {
                    JOptionPane.showMessageDialog(null, "Por algun motivo no se pudo iniciar intente otra vez mas tarde ");
                }
            }
            
        });
        panel.add(boton); 

        etiqueta6 = new JLabel("Logo"); 
        etiqueta6.setBounds(400, 100, 200, 100);
        etiqueta6.setOpaque(true);
        etiqueta6.setBackground(new Color(0,0,0,0));
        etiqueta6.setFont(new Font("arial",Font.BOLD,26)); 
        etiqueta6.setForeground(Color.WHITE);
        panel.add(etiqueta6); 

        etiqueta5 = new JLabel(); 
        etiqueta5.setBounds(230, 0, 530, 600);
        etiqueta5.setOpaque(true);
        //etiqueta5.setVisible(false); 
        etiqueta5.setBackground(Color.BLUE);
        panel.add(etiqueta5); 

    }
}