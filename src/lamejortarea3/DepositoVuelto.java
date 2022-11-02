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
            g_aux.translate(0, 10);
            g_aux.setColor(Color.YELLOW);
            for(int i=0; i<vuelto.size(); i++){
                // VER CÓMO HACER VISIBLES LAS MONEDAS
                vuelto.get(i).paintComponent(g_aux);
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
}
