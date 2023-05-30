import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class InfoPannel extends JLabel{

    public InfoPannel(){
        this("Debug", "-1","-1","-1");
        
    }

    public InfoPannel(String nomPlante, String infoEau, String infoSoleil, String infoTemperature){
        this.setLayout(new GridLayout(1, 4));
        System.out.println("actuellement dans le jpannel");
        this.add(new JLabel(nomPlante));
        this.add(new JLabel(infoEau)); 
        this.add(new JLabel(infoSoleil)); 
        this.add(new JLabel(infoTemperature));
        this.setSize(50, 50); 
        
        this.setBounds(0,0,200,200); 
        this.setBackground(Color.black);
        this.setVisible(true);
    }

    public static void main(String[] args) {
                
        JFrame frame = new JFrame();
        frame.setSize(600, 600);
        
        InfoPannel ip= new InfoPannel(); 
        ip.setBounds(20, 20, 200, 600);
        frame.add(ip);
        frame.setVisible(true);
    }
}