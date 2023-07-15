import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Calculadora extends JFrame {
    JPanel panel; 
    JLabel etiqueta_titulo; 
    JLabel etiqueta_subtitulo; 
    JLabel etiqueta_peso; 
    JLabel etiqueta_altura; 
    JLabel etiqueta_nombre; 
    JLabel barra; 
    JLabel etiqueta_imc; 
    JTextField campo_altura; 
    JTextField campo_nombre; 
    JTextField campo_peso; 
    JTextField campo_imc; 
    JButton boton_regresar; 
    JButton boton_calcular; 
    JButton boton_registro; 
    String nombre_string; 
    String peso_string; 
    String altura_string; 
    String imc_string; 
    float altura; 
    float peso; 
    float imc; 
    JLabel etiqueta_resultado;
    JLabel etiqueta_imagen; 
    JLabel titulo_imc; 
    String imc2; 

    public Calculadora(){
        this.setSize(400,400); // 700 width
        this.setLocationRelativeTo(null); 
        this.setDefaultCloseOperation(EXIT_ON_CLOSE); 
        this.setTitle("Calculadora"); 
        this.setResizable(false);
        paneles(); 
        calcu(); 
    }    
    public void paneles(){
        panel = new JPanel(); 
        panel.setLayout(null); 
        this.getContentPane().add(panel); 
    }
    public void calcu(){
        etiqueta_titulo = new JLabel("Calculadora IMC"); 
        etiqueta_titulo.setBounds(140, 30, 220, 20);
        etiqueta_titulo.setFont(new Font("arial",Font.BOLD,19)); 
        etiqueta_titulo.setForeground(Color.black);
        panel.add(etiqueta_titulo);

        etiqueta_subtitulo = new JLabel("Rellena loc campos");
        etiqueta_subtitulo.setBounds(80,60,150,20); 
        etiqueta_subtitulo.setForeground(Color.gray);
        etiqueta_subtitulo.setFont(new Font("arial",Font.BOLD,15)); 
        panel.add(etiqueta_subtitulo); 

        etiqueta_nombre = new JLabel("Nombre");
        etiqueta_nombre.setBounds(80,100,120,20); 
        etiqueta_nombre.setFont(new Font("arial",Font.BOLD,16)); 
        etiqueta_nombre.setForeground(Color.gray);
        panel.add(etiqueta_nombre); 

        campo_nombre = new JTextField(); 
        campo_nombre.setBounds(80,130,200,20); 
        panel.add(campo_nombre);

        etiqueta_altura = new JLabel("Altura"); 
        etiqueta_altura.setBounds(80, 160, 120, 20);
        etiqueta_altura.setFont(new Font("arial",Font.BOLD,16)); 
        etiqueta_altura.setForeground(Color.gray);
        panel.add(etiqueta_altura); 

        campo_altura = new JTextField(); 
        campo_altura.setBounds(80, 190, 200, 20);
        panel.add(campo_altura); 

        etiqueta_peso = new JLabel("Peso");
        etiqueta_peso.setBounds(80,220,120,20);  
        etiqueta_peso.setForeground(Color.gray); 
        etiqueta_peso.setFont(new Font("arial",Font.BOLD,16)); 
        panel.add(etiqueta_peso); 

        campo_peso = new JTextField(); 
        campo_peso.setBounds(80, 250, 200, 20);
        panel.add(campo_peso);

        etiqueta_resultado = new JLabel(); 
        etiqueta_resultado.setBounds(480,80,120,20); 
        etiqueta_resultado.setForeground(Color.black);
        etiqueta_resultado.setFont(new Font("arial",Font.BOLD,22));
        panel.add(etiqueta_resultado); 

        titulo_imc = new JLabel("El IMC es :");
        titulo_imc.setBounds(480, 40, 120, 20);
        titulo_imc.setFont(new Font("arial",Font.BOLD,22)); 
        titulo_imc.setForeground(Color.black);
        titulo_imc.setVisible(false);
        panel.add(titulo_imc); 

        boton_regresar = new JButton("Regresar"); 
        boton_regresar.setBounds(100,310,100,30); 
        boton_regresar.setBackground(Color.red);
        boton_regresar.setForeground(Color.white);
        boton_regresar.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                Menu obj = new Menu(); 
                obj.setVisible(true); 
                setVisible(false); 
            }
            
        });
        panel.add(boton_regresar); 

        boton_registro = new JButton("Registrar"); 
        boton_registro.setBounds(400, 310, 100, 30);
        boton_registro.setBackground(Color.orange);
        boton_registro.setForeground(Color.white);
        boton_registro.setVisible(false);
        boton_registro.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
               // mandara ala ventana de registro con constructor 
               Registro obj3 = new Registro();
               obj3.setVisible(true); 
               setVisible(false); 
               obj3.setRegistro(nombre_string,altura_string,peso_string,imc2);

            }

        });
        panel.add(boton_registro); 

        boton_calcular = new JButton("Calcular");
        boton_calcular.setBounds(250,310,100,30); 
        boton_calcular.setBackground(Color.blue);
        boton_calcular.setForeground(Color.white);
        boton_calcular.setVisible(true); 
        boton_calcular.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                setLocationRelativeTo(null);
                boton_registro.setVisible(true);
                nombre_string = campo_nombre.getText(); 
               try {
                nombre_string = campo_nombre.getText(); 
                altura_string = campo_altura.getText(); 
                peso_string = campo_peso.getText(); 
                altura = Float.parseFloat(altura_string); 
                peso = Float.parseFloat(peso_string); 
                if (nombre_string.isEmpty() || altura_string.isEmpty() || peso_string.isEmpty()){
                     boton_calcular.setVisible(false); 
                    JOptionPane.showMessageDialog(null,"Campos vacios");
                }
                else if (altura < 1 || altura > 2  ||altura == 0){
                    JOptionPane.showMessageDialog(null,"Altura Incorracta ");
                }
                else if (peso > 200 || peso == 0  ){
                    JOptionPane.showMessageDialog(null,"Peso Incorracta ");
                }
                else {
                    altura = Float.parseFloat(altura_string); 
                    peso = Float.parseFloat(peso_string); 
                    //float centimetros = altura * 100;
                    titulo_imc.setVisible(true);
                    imc = peso / (altura*altura);
                    setLocationRelativeTo(null); 
                    setSize(700,400); 
                    imc2 = String.valueOf(imc); 
                    etiqueta_resultado.setText(imc2);
                    if (imc <= 18.5){
                        setLocationRelativeTo(null);
                        campo_altura.setEditable(false);
                        campo_peso.setEditable(false);
                        campo_nombre.setEditable(false);
                        etiqueta_resultado.setForeground(Color.blue);
                        titulo_imc.setForeground(Color.blue);
                        barra.setBackground(Color.blue);
                        JOptionPane.showMessageDialog(null,"Bajo Peso:\tDieta Hipercalrica \n Come con m\u00E1s frecuencia. Empieza poco a poco a hacer de 5 a 6 comidas m\u00E1s peque\u00F1as durante el d\u00EDa. \nAgrega aderezos. Agrega extras a tus platos para obtener mas calorias, como queso en los guisos o mantequilla \n Prueba licuados y batidos de frutas. Evita las bebidas con pocos nutrientes o calorias, como los refrescos dieteticos. ");
                               
                        
                    }
                    else if(imc > 18.5 && imc <= 24.9 ){
                        setLocationRelativeTo(null);
                        campo_altura.setEditable(false);
                        campo_peso.setEditable(false);
                        campo_nombre.setEditable(false);
                        etiqueta_resultado.setForeground(Color.BLUE);
                        titulo_imc.setForeground(Color.BLUE);
                        barra.setBackground(Color.BLUE);
                        JOptionPane.showMessageDialog(null,"Peso Normal: Dieta Normocalojica \n Importancia de las frutas. las verduras, los cereales integrales, la leche y los productos l\u00E1cteos sin grasa o bajos en grasa \n Incluye alimentos con prote\u00EDnas. como mariscos, carnes magras, huevos, legumbres (frijoles y guisantes), productos de soya, nueces y semillas \n Consume pocas grasas saturadas. grasas trans, colesterol, sal (sodio) y az\u00FAcares agregados"); 
                    }
                    else if (imc >= 25 && imc <= 29.9 ){
                        setLocationRelativeTo(null);
                        campo_altura.setEditable(false);
                        campo_peso.setEditable(false);
                        campo_nombre.setEditable(false);
                        etiqueta_resultado.setForeground(Color.green);
                        titulo_imc.setForeground(Color.green);
                        barra.setBackground(Color.green);
                        JOptionPane.showMessageDialog(null, "Sobre Peso: Dieta Hipocalorica \n Variedad de verduras y frutas. y granos integrales, como arroz integral, avena y pan integral.\r\n productos lacteos. sin grasa o con bajo contenido de grasa, como leche, yogur y queso, y productos similares, como las bebidas de soya \n Ejercicio. Regula la actividad física al menos 5 días a la semana para perder grasa.");
                    }
                    else if (imc >= 30 && imc <= 34.9 ){
                        setLocationRelativeTo(null);
                        campo_altura.setEditable(false);
                        campo_peso.setEditable(false);
                        campo_nombre.setEditable(false);
                        etiqueta_resultado.setForeground(Color.yellow);
                        titulo_imc.setForeground(Color.yellow);
                        barra.setBackground(Color.yellow);
                        JOptionPane.showMessageDialog(null,"Obesidad: Dieta Hipocalrica \n Menos porciones. consumir menos alimentos y bebidas que contienen carbohidratos refinados, azucares añadidos y sal (sodio)\r\n Tambien. controlar el tamaño de las porciones por unas m\u00E1s peque\u00F1as durante el d\u00EDa.\r\n Limite. limitar los alimentos con grasas saturadas y grasas trans, como las que se encuentran en los postres y las comidas fritas");
                    }
                    else if (imc >= 35 && imc <= 39.9){
                        setLocationRelativeTo(null);
                        campo_altura.setEditable(false);
                        campo_peso.setEditable(false);
                        campo_nombre.setEditable(false);
                        etiqueta_resultado.setForeground(Color.ORANGE);
                        titulo_imc.setForeground(Color.ORANGE);
                        barra.setBackground(Color.ORANGE);
                        JOptionPane.showMessageDialog(null,"Obesidad Extrema: Dieta Hipocalorica\r\nComidas no saludables. Evitar ingerir alimentos pocos saludable que incluya muchas calorias (tanto saturadas como solidas , como los refrescos).\r\n Limite. limitar los alimentos con grasas saturadas y grasas trans, como las que se encuentran en los postres y las comidas fritas\r\n Inactividad. El quemar las calorias que ingieres, el resultado es siempre Mantener un buen peso. \r\n");
                    }
                    else if (imc >= 40 && imc <100){
                        setLocationRelativeTo(null);
                        campo_altura.setEditable(false);
                        campo_peso.setEditable(false);
                        campo_nombre.setEditable(false);
                        etiqueta_resultado.setForeground(Color.red);
                        titulo_imc.setForeground(Color.red);
                        barra.setBackground(Color.red);
                        JOptionPane.showMessageDialog(null,"Obesidad Extrema: Dieta Hipocalorica\r\nComidas no saludables. Evitar ingerir alimentos pocos saludable que incluya muchas calorias (tanto saturadas como solidas , como los refrescos).\r\n Limite. limitar los alimentos con grasas saturadas y grasas trans, como las que se encuentran en los postres y las comidas fritas\r\n Inactividad. El quemar las calorias que ingieres, el resultado es siempre Mantener un buen peso. \r\n");
                    }


                }
                
                
               } catch (Exception e2) {

                JOptionPane.showMessageDialog(null,"Caracteres no validos ");
                
               }
            }
            
        });
        panel.add(boton_calcular);  

        


        barra = new JLabel(); 
        barra.setBounds(0, 0, 60, 400);
        barra.setBackground(Color.blue);
        barra.setOpaque(true);
        panel.add(barra); 



    }
}
