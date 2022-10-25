package lamejortarea3;
import java.awt.*;
import javax.swing.*;

public class Ventana extends JFrame {
    //PanelPrincipal pp;
    public Ventana(){
        super();
        this.setLayout(new BorderLayout());
        this.setTitle("Tarea 3");
        
        /*this.add(new JButton("sur"),BorderLayout.SOUTH);
        this.add(new JButton("centro"),BorderLayout.CENTER);
        this.add(new JButton("norte"),BorderLayout.NORTH);
        this.add(new JButton("este"),BorderLayout.EAST);
        this.add(new JButton("oeste"),BorderLayout.WEST);*/
        
        //pp = new PanelPrincipal();
        
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(1000,800);
        this.setLocationRelativeTo(null);
        this.setVisible(true); 

    }
    
}
