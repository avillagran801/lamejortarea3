package lamejortarea3;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class DepositoCompra extends JPanel {
    private Bebida bebida;
        
    // @Override
    public void paintComponent(Graphics g, Expendedor exp){
        super.paintComponent(g);
                
        this.setBounds(exp.getX()+300, exp.getY()+370, 70, 100);
        this.setOpaque(false);
        
        
        g.setColor(Color.DARK_GRAY);
        g.fillRect(this.getX(), this.getY(), this.getWidth(), this.getHeight());
        
        if(bebida != null){
            bebida.setBounds(this.getX()+20, this.getY()+30, 30, 60);
            bebida.paintComponent(g);
        }
    }
    
    public void agregarBebida(Bebida bebida_aux){
        bebida = bebida_aux;
    }
    
    public Bebida getBebida(){
        Bebida aux_bebida = bebida;
        bebida = null;
        System.out.println("Número de serie:" + aux_bebida.getSerie());
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
