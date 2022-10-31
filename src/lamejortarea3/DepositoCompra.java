package lamejortarea3;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

class DepositoCompra extends JPanel {
    private Bebida bebida;
    
    public void agregarBebida(Bebida bebida_aux){
        if(bebida == null){
            System.out.println("Bebida guardada en el depósito");
            bebida = bebida_aux;
        }
        else{
            System.out.println("Ya hay una bebida en el depósito");
        }
    }
    
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
}
