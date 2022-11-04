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
            bebida.setBounds(this.getX()+25, this.getY()+45, 20, 40);
            bebida.paintComponent(g);
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
