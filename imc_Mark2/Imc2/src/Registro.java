import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.*;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Registro extends JFrame {
    JButton boton_regreso; 
    JButton boton_registro; 
    JPanel panel; 
    JLabel barra; 
    JLabel etiqueta_titulo; 
    JLabel etiqueta_nombre; 
    JLabel etiqueta_apellido;
    JLabel etiqueta_edad; 
    JLabel etiqueta_sexo; 
    JLabel etiqueta_altura;
    JLabel etiqueta_peso; 
    JLabel etiqueta_imc; 
    JLabel etiqueta_seguro; 
    JLabel etiqueta_correo; 
    JLabel etiqueta_numeroE; 
    JLabel etiqueta_sangre; 
    JLabel etiqueta_hora; 
    JLabel etiqueta_datos; 
    JTextArea campo_datos; 
    JTextField campo_hora; 
    JTextField campo_nombre ;
    JTextField campo_apellido; 
    JTextField campo_edad; 
    JTextField campo_sexo;
    JTextField campo_altura; 
    JTextField campo_peso;
    JTextField campo_imc;
    JTextField campo_seguro;
    JTextField campo_correo; 
    JTextField campo_numeroE;
    JTextField campo_sangre;
    String nombre; 
    String altura; 
    String peso; 
    String imc; 
    String hora; 
    String apellido; 
    String edad; 
    String seguro; 
    String correo ; 
    String numeroE; 
    String datosA; 
    String sexo; 
    JLabel etiqueta_hora2; 
    String horaFormateada; 
    public void setHora(String hora ){
        this.hora = hora; 
        campo_hora.setText(hora);
        campo_hora.setEditable(false);
        campo_hora.setBackground(Color.orange);
    }
     
    public void setRegistro(String nombre,String altura, String peso,String imc){
        this.nombre = nombre ; 
        this.altura = altura; 
        this.peso = peso; 
        this.imc = imc ; 
        campo_imc.setText(imc);
        campo_imc.setEditable(false);
        campo_imc.setBackground(Color.orange);
        campo_peso.setText(peso);
        campo_peso.setEditable(false);
        campo_peso.setBackground(Color.orange);
        campo_altura.setText(altura);
        campo_altura.setEditable(false);
        campo_altura.setBackground(Color.orange);
        campo_nombre.setText(nombre);
        campo_nombre.setEditable(false);
        campo_nombre.setBackground(Color.orange);

    }

    public Registro(){
        this.setSize(700,500); 
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setTitle("Registro"); 
        this.setDefaultCloseOperation(EXIT_ON_CLOSE); 
        paneles(); 
        etiquetas_botones(); 
        mostrarHoraActual();
    }
    public void paneles(){
        panel = new JPanel(); 
        panel.setLayout(null); 
        this.getContentPane().add(panel); 
    }
    public void etiquetas_botones(){

        etiqueta_titulo = new JLabel("Registro"); 
        etiqueta_titulo.setBounds(80,20,120,30);
        etiqueta_titulo.setForeground(Color.gray);
        etiqueta_titulo.setFont(new Font("arial",Font.BOLD,22)); 
        panel.add(etiqueta_titulo); 

        etiqueta_nombre = new JLabel("Nombre");
        etiqueta_nombre.setBounds(80, 70, 120, 20);
        etiqueta_nombre.setForeground(Color.gray);
        panel.add(etiqueta_nombre); 
        
        campo_nombre = new JTextField(); 
        campo_nombre.setBounds(150, 70, 120, 20);
        panel.add(campo_nombre); 

        etiqueta_apellido = new JLabel("Apellido"); 
        etiqueta_apellido.setBounds(80,100,120,20); 
        etiqueta_apellido.setForeground(Color.gray);
        panel.add(etiqueta_apellido); 

        campo_apellido = new JTextField(); 
        campo_apellido.setBounds(150,100,120,20);
        panel.add(campo_apellido); 

        etiqueta_edad = new JLabel("Edad"); 
        etiqueta_edad.setBounds(80,130,120,20); 
        etiqueta_edad.setForeground(Color.GRAY); 
        panel.add(etiqueta_edad);

        campo_edad = new JTextField(); 
        campo_edad.setBounds(150,130,120,20);
        panel.add(campo_edad); 

        etiqueta_sexo = new JLabel("Sexo"); 
        etiqueta_sexo.setBounds(80,160,120,20);
        etiqueta_sexo.setForeground(Color.gray);
        panel.add(etiqueta_sexo); 

        campo_sexo = new JTextField(); 
        campo_sexo.setBounds(150, 160, 120, 20);
        panel.add(campo_sexo); 

        etiqueta_altura = new JLabel("Altura"); 
        etiqueta_altura.setBounds(80,190,120,20); 
        etiqueta_altura.setForeground(Color.gray);
        panel.add(etiqueta_altura); 

        campo_altura = new JTextField(); 
        campo_altura.setBounds(150, 190, 120, 20);
        panel.add(campo_altura); 

        etiqueta_peso = new JLabel("Peso"); 
        etiqueta_peso.setBounds(80,220,120,20); 
        etiqueta_peso.setForeground(Color.gray);
        panel.add(etiqueta_peso); 

        campo_peso = new JTextField(); 
        campo_peso.setBounds(150,220,120,20); 
        panel.add(campo_peso); 

        etiqueta_imc = new JLabel("Imc");
        etiqueta_imc.setBounds(80, 250, 120 ,20);
        etiqueta_imc.setForeground(Color.gray); 
        panel.add(etiqueta_imc); 

        campo_imc = new JTextField(); 
        campo_imc.setBounds(150, 250, 120, 20);
        panel.add(campo_imc); 

        etiqueta_seguro = new JLabel("Seguro");
        etiqueta_seguro.setBounds(80, 280,120, 20);
        etiqueta_seguro.setForeground(Color.gray); 
        panel.add(etiqueta_seguro);

        campo_seguro = new JTextField(); 
        campo_seguro.setBounds(150, 280, 120, 20);
        panel.add(campo_seguro); 

        etiqueta_correo = new JLabel("Correo");
        etiqueta_correo.setBounds(80,310,120,20); 
        etiqueta_correo.setForeground(Color.gray);
        panel.add(etiqueta_correo); 

        campo_correo = new JTextField(); 
        campo_correo.setBounds(150,310,120,20); 
        panel.add(campo_correo); 

        etiqueta_hora = new JLabel("Hora"); 
        etiqueta_hora.setBounds(80,340,120,20); 
        etiqueta_hora.setForeground(Color.gray);
        panel.add(etiqueta_hora); 

        campo_hora = new JTextField(); 
        campo_hora.setBounds(150,340,120,20); 
        panel.add(campo_hora); 

        etiqueta_numeroE = new JLabel("Numero Em"); 
        etiqueta_numeroE.setBounds(80, 370 , 120, 20);
        etiqueta_numeroE.setForeground(Color.gray); 
        panel.add(etiqueta_numeroE); 

        campo_numeroE = new JTextField(); 
        campo_numeroE.setBounds(150,370,120,20); 
        panel.add(campo_numeroE); 

        etiqueta_datos = new JLabel("Datos Adicionales ");
        etiqueta_datos.setBounds(350, 70, 120, 20);
        etiqueta_datos.setForeground(Color.gray);  
        panel.add(etiqueta_datos); 

        campo_datos = new JTextArea(); 
        campo_datos.setBounds(350,100,220,220); 
        panel.add(campo_datos); 

        boton_regreso = new JButton("Regresar"); 
        boton_regreso.setBounds(350,400,120,30); 
        boton_regreso.setBackground(Color.red);
        boton_regreso.setForeground(Color.white);
        boton_regreso.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                Menu obj = new Menu(); 
                obj.setVisible(true); 
                setVisible(false);
            }
            
        });
        panel.add(boton_regreso); 

        boton_registro = new JButton("Registrar"); 
        boton_registro.setBounds(550, 400, 120, 30);
        boton_registro.setForeground(Color.white);
        boton_registro.setBackground(Color.blue);
        boton_registro.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
               nombre = campo_nombre.getText(); 
               apellido = campo_apellido.getText(); 
               sexo = campo_sexo.getText(); 
               altura = campo_altura.getText(); 
               peso = campo_peso.getText(); 
               imc = campo_imc.getText(); 
               correo = campo_correo.getText(); 
               datosA = campo_datos.getText(); 
               seguro = campo_seguro.getText(); 
               hora = campo_hora.getText(); 
        String nombreCarpeta = seguro;
        String nombreArchivo = nombre+".txt";
        String contenidoArchivo = "Nombre : " + nombre + "\nApellido : "+ apellido + "\nSexo : " + sexo + "\nAltura : " + altura + "\nPeso :" + peso + "\nCorreo : " + correo + "\nSeguro : "  + seguro + "\nImc :" + imc + "\nHora :" + hora +"\nDatos : " + datosA; 

        
        File carpeta = new File(nombreCarpeta);
        boolean carpetaCreada = carpeta.mkdir();

        if (carpetaCreada) {
            System.out.println("La carpeta se ha creado exitosamente.");

            
            File archivo = new File(carpeta, nombreArchivo);
            try {
                FileWriter escritor = new FileWriter(archivo);
                escritor.write(contenidoArchivo);
                escritor.close();
                System.out.println("El archivo de nota se ha creado exitosamente.");
            } catch (IOException e34) {
                System.out.println("No se pudo crear el archivo de nota: " + e34.getMessage());
            }
        } else {
            System.out.println("No se pudo crear la carpeta.");
        }
            }
            
        });
        panel.add(boton_registro); 

        barra = new JLabel(); 
        barra.setBounds(0, 0, 60, 700);
        barra.setOpaque(true);
        barra.setBackground(Color.BLUE);
        panel.add(barra); 

        etiqueta_hora2 = new JLabel(); 
        etiqueta_hora2.setBounds(570,20,170,20); 
        etiqueta_hora2.setForeground(Color.gray);
        etiqueta_hora2.setFont(new Font("Arial",Font.BOLD,22)); 
        panel.add(etiqueta_hora2); 
        Timer timer = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mostrarHoraActual();
            }
        });
        timer.start();

    }

    private void mostrarHoraActual() {
        Date ahora = new Date();
        SimpleDateFormat formateador = new SimpleDateFormat("HH:mm:ss");
         horaFormateada = formateador.format(ahora);
        etiqueta_hora2.setText(horaFormateada);
        campo_hora.setText(horaFormateada);
        campo_hora.setEditable(false);
        
    }
    
}
