/*package Jardin;*/
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */



import java.awt.Color;
import java.awt.event.MouseAdapter;
import javax.swing.JPanel;


public class CaseGraphique extends JPanel implements Runnable{

    public CaseGraphique() {
        super();
        
        setBackground(Color.white);
        
        addMouseListener(new MouseAdapter() {
        
            /*@Override
            public void mouseEntered(MouseEvent arg0) {
                super.mouseClicked(arg0);
                setBackground(Color.BLACK);
            }

            @Override
            public void mouseExited(MouseEvent arg0) {
                super.mouseExited(arg0);
                setBackground(Color.red);
            }*/
            
            
            
        });
        
    }

    @Override
    public void run() {
        
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'run'");
    }
    
}