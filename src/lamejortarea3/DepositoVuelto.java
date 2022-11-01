package lamejortarea3;

import java.util.ArrayList;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class DepositoVuelto extends JPanel{
    private ArrayList<Moneda> vuelto;
    
    public DepositoVuelto(){
        vuelto = new ArrayList<Moneda>();
    }
    
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        
        g.setColor(Color.DARK_GRAY);
        g.fillRect(810, 380, 50, 50);
        
        if(!vuelto.isEmpty()){
            Graphics g_aux = g.create();
            for(int i=0; i<vuelto.size(); ++i){
                g_aux.translate(0, -52);
                // VER CÓMO HACER VISIBLES LAS MONEDAS
                // vuelto.get(i).paintComponents(g_aux);
            }
        }
    }
    
    public void crearVuelto(Moneda coin_aux, int precio){
        if (coin_aux.getValor() > precio) {
            for (int i = 0; i < (coin_aux.getValor()-precio)/100; i++){
                Moneda100 m100_aux = new Moneda100();
                vuelto.add(m100_aux);
            }
            System.out.println("Hay vuelto disponible.");
            totalMonedasDeposito();
        }
    }
    
    public void addMoneda(Moneda coin_aux){
        vuelto.add(coin_aux);
        System.out.println("Hay vuelto disponible.");
        totalMonedasDeposito();
    }
    
    public void totalMonedasDeposito(){
        if(!vuelto.isEmpty()){
            int total = 0;
            
            for(int i=0; i<vuelto.size(); i++){
                total = total + vuelto.get(i).getValor();
            }
            
            System.out.println("Hay $" + total + " para retirar");
        }
    }
    
    public Moneda getMoneda(){
        if(!vuelto.isEmpty()){
            return vuelto.remove(0);
        }
        else{
            return null;
        }
    }
    
    /*
    public Moneda getVuelto(){
        if(vuelto.isEmpty()){
            System.out.println("Ya no queda vuelto que dar.");
            return null;
        } else {
            System.out.println("Quedan " + (vuelto.size() - 1) + 
                    " monedas en el deposito.");
            return vuelto.remove(0);
        }
    }
    */
}
