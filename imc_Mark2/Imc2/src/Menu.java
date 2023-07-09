import javax.swing.JFrame;
import javax.swing.*;

public class Menu extends JFrame{
    JPanel panel; 
    JLabel etiqueta; 
    
    public Menu(){
        this.setSize(600,600); 
        this.setLocationRelativeTo(null); 
        this.setResizable(false);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE); 
        paneles(); 
        
         
    }
    public void paneles(){
        panel = new JPanel(); 
        panel.setLayout(null); 
        this.getContentPane().add(panel); 
    }
    
    
}
