package lamejortarea3;
import java.awt.*;
import javax.swing.*;

class Comprador extends JPanel{
    private String sabor;
    private int vuelto;
    
    public Comprador(){
    }
    
    @Override
    public void paint(Graphics g){
        super.paint(g);
        // Cabeza
        g.setColor(Color.green);
        g.fillOval(200, 200, 100, 100);
        
        // Cuerpo
        g.fillRect(240, 290, 20, 210);
        g.fillRect(180, 350, 140, 20);
        int[] x_aux = {180, 200, 260, 240};
        int[] y_aux = {600, 600, 500, 500};
        g.fillPolygon(x_aux, y_aux, 4);
        int[] k_aux = {320, 300, 240, 260};
        int[] j_aux = {600, 600, 500, 500};
        g.fillPolygon(k_aux, j_aux, 4);
    }
    
    public void ComprarBebida(int idBebida, Moneda moneda, Expendedor expendedor){
        vuelto = 0;
        
        Bebida aux_bebida = expendedor.comprarBebida(idBebida, moneda);
        if (aux_bebida != null){
            sabor = aux_bebida.beber();
            System.out.println(sabor);
        }
        
        Boolean vuelto_fin = false;
                
        // Esto hace que el vuelto termine de entregarse ya sea cuando 
        // se entregue la misma moneda o cuando terminen las monedas de
        // $100 para la diferencia
        
        while(!vuelto_fin){
            Moneda vuelto_aux = expendedor.getVuelto();
            if(vuelto_aux != null){
                vuelto = vuelto + vuelto_aux.getValor();
            } else {
                vuelto_fin = true;
            }
        }

        if (moneda != null){
            System.out.println("Precio bebida: $" + expendedor.getPrecio() + 
                    "\nMonto abonado: $" + moneda.getValor() + "\nVuelto: $" + 
                    vuelto);
        }
    }
}
