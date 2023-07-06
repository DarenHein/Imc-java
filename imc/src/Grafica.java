import javax.swing.JFrame;
import javax.swing.JPanel;

public class Grafica extends JFrame {
    JPanel panel ;  

    public Grafica(){
        this.setSize(300, 300);
        this.setLocation(184,200);
        this.setTitle("Grafica imc ");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        paneles(); 
        imagen(); 
    }
    public void paneles(){

        panel = new JPanel(); 
        panel.setLayout(null);
        this.getContentPane().add(panel); 

    }
    public void imagen(){

        // todo aqui solamente vamos a poner una imagen de la grafica del imc sacada de la pagina del imss 

    }

    
}
