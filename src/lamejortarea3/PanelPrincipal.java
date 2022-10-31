package lamejortarea3;
import java.awt.*;
import javax.swing.*;

public class PanelPrincipal extends JPanel{
    private Comprador con;
    private Expendedor exp;
    private Moneda1000 m1000;
    
    public PanelPrincipal(){
        exp = new Expendedor (6, 1000);
        con = new Comprador ();
        
        this.setLayout(null);
        this.setBackground(Color.blue);
    }
    
    public Comprador getComprador(){
        return con;
    }
    
    public Expendedor getExpendedor(){
        return exp;
    }
    
    @Override
    public void paintComponent (Graphics g){
        super.paintComponent(g);
        con.paintComponent(g);
        exp.paintComponent(g);
    }
    
}
