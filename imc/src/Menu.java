import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Menu extends JFrame{

    private JPanel panel;
    private JPanel panel2;
    public Menu(){
        this.setSize(600, 400);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setTitle("Menu");
        this.setResizable(false);
        menu(); 
    }
    public void paneles(){
        panel = new JPanel(); 
        panel.setLayout(null);
        this.getContentPane().add(panel); 

        panel2 = new JPanel(); 
        panel2.setBounds(0, 30, 100, 400);
        panel2.setBackground(Color.BLUE);
        panel.add(panel2); 
    }
    public void menu(){

    }
    
}
