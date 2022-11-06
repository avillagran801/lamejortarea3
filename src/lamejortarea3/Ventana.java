package lamejortarea3;
import java.awt.*;
import javax.swing.*;

public class Ventana extends JFrame {
    PanelPrincipal pp;
    Botones b;
    
    public Ventana(){
        super();
        this.setLayout(new BorderLayout());
        this.setTitle("Tarea 3");
                
        pp = new PanelPrincipal();
        this.getContentPane().add(pp);
        b = new Botones(pp);
        
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(1000,800);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setVisible(true); 

    }
    
        
}
