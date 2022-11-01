package lamejortarea3;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class DepositoCompra extends JPanel {
    private Bebida bebida;
        
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        
        g.setColor(Color.DARK_GRAY);
        g.fillRect(800, 470, 70, 100);
        
        if(bebida != null){
            Graphics g_aux = g.create();
            g_aux.translate(825, 515);
            bebida.paintComponent(g_aux);
        }
    }
    
    public void agregarBebida(Bebida bebida_aux){
        bebida = bebida_aux;
    }
    
    public Bebida getBebida(){
        Bebida aux_bebida = bebida;
        bebida = null;
        return aux_bebida;
    }
    
    public Boolean depositoVacio(){
        if(bebida == null){
            return true;
        }
        else{
            return false;
        }
    }
}
