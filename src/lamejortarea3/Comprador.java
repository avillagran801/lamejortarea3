package lamejortarea3;
import java.awt.*;
import java.util.ArrayList;
import javax.swing.*;

public class Comprador extends JPanel{
    private ArrayList<Bebida> bebidas;
    private int vuelto;
    private ArrayList<Moneda> sencillo;
    
    public Comprador(){
        sencillo = new ArrayList<Moneda>();
        bebidas = new ArrayList<Bebida>();
        this.setBounds(100, 100, 1000, 1000);
        this.setOpaque(false);
    }
    
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        // Cabeza
        g.setColor(Color.green);
        g.fillOval(200, 250, 100, 100);
        
        // Cuerpo
        g.fillRect(240, 340, 20, 160);
        g.fillRect(180, 400, 140, 20);
        int[] x_aux = {180, 200, 260, 240};
        int[] y_aux = {600, 600, 500, 500};
        g.fillPolygon(x_aux, y_aux, 4);
        int[] k_aux = {320, 300, 240, 260};
        int[] j_aux = {600, 600, 500, 500};
        g.fillPolygon(k_aux, j_aux, 4);
        
        // Sencillo
        g.setColor(Color.LIGHT_GRAY);
        g.fillRect(this.getX(), this.getY(), 300, 60);
        
        if(!sencillo.isEmpty()){
            for(int i=0; i<sencillo.size() && i < 45; i++){
                sencillo.get(i).setBounds(this.getX()+(20*(i/3)), 
                        this.getY()+(60*((i/3)+1))-(20*(i+1)), 20, 20);
                sencillo.get(i).paintComponent(g);
            }
        }
        
        // Bebidas
        g.setColor(Color.LIGHT_GRAY);
        g.fillRect(this.getX(), this.getY()+65, 300, 60);
        
        if(!bebidas.isEmpty()){
            for(int i=0; i<bebidas.size() && i < 10; i++){
                bebidas.get(i).setBounds(this.getX()+(35*i), 
                        this.getY()+65, 30, 60);
                bebidas.get(i).paintComponent(g);
            }
        }
    }
    
    public ArrayList<Bebida> getBebidas(){
        return bebidas;
    }
    
    public void addBebida(Bebida b){
        this.bebidas.add(b);
    }
    
    public ArrayList<Moneda> getSencillo(){
        return sencillo;
    }
    
    public void comprarBebida(int idBebida, Moneda moneda, Expendedor expendedor){        
        expendedor.comprarBebida(idBebida, moneda);
    }
    
    public void retirarVuelto(Expendedor expendedor){
        Moneda vuelto_aux = expendedor.getVuelto();
        
        if(vuelto_aux != null){
            vuelto = vuelto + vuelto_aux.getValor();
            this.sencillo.add(vuelto_aux);
        } else {
            System.out.println("No queda vuelto que retirar.");
        }
    }
}
