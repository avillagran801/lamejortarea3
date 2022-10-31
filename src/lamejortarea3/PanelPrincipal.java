package lamejortarea3;
import java.awt.*;
import javax.swing.*;

public class PanelPrincipal extends JPanel{
    public Comprador con;
    public Expendedor exp;
    private Moneda1000 m1000;
    
    public PanelPrincipal(){
        exp = new Expendedor (10, 1000);
        con = new Comprador ();
        
        this.setLayout(null);
        this.setBackground(Color.blue);
        /*this.setLayout(new BorderLayout());
        this.setSize(800,600);
        this.setVisible(true);*/
    }
    
    @Override
    public void paint (Graphics g){
        super.paint(g);
        con.paint(g);
        exp.paint(g);
    }
    
}
