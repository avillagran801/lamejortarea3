package lamejortarea3;
import java.awt.*;
import javax.swing.*;

public class Ventana extends JFrame {
    PanelPrincipal pp;
    //JLabel tag;
    public Ventana(){
        super();
        this.setLayout(new BorderLayout());
        this.setTitle("Tarea 3");
        
        /*this.add(new JButton("sur"),BorderLayout.SOUTH);
        this.add(new JButton("centro"),BorderLayout.CENTER);
        this.add(new JButton("norte"),BorderLayout.NORTH);
        this.add(new JButton("este"),BorderLayout.EAST);
        this.add(new JButton("oeste"),BorderLayout.WEST);*/
        
        pp = new PanelPrincipal();
        this.getContentPane().add(pp);
        
        
        /*tag = new JLabel("Buenas", SwingConstants.CENTER); // Buenas, escrito
                                                           // en el centro.
        tag.setHorizontalAlignment(SwingConstants.CENTER); // Manualmente.
        tag.setText("Hola Buenas B)"); // Ambas sirven para poner texto.
        pp.setLayout(null); // Para diseñar el tag, hay que anular el layout
                            // default
        tag.setBounds(100, 100, 200, 200);
        tag.setForeground(Color.blue); // Color de la letra
        tag.setOpaque(true); // Nos da permiso para cambiar el fondo
        tag.setBackground(Color.orange);
        pp.add(tag);*/
        
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(1000,800);
        this.setLocationRelativeTo(null); // Aparaece al centro
        this.setVisible(true); 

    }
    
}
