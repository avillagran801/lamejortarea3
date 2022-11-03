package lamejortarea3;

import java.util.ArrayList;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;
import java.awt.Font;

public class DepositoVuelto extends JPanel{
    private ArrayList<Moneda> vuelto;
    
    public DepositoVuelto(){
        vuelto = new ArrayList<Moneda>();
    }
    
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        
        g.setColor(Color.DARK_GRAY);
        g.fillRect(810, 360, 50, 70);
        g.setColor(Color.white);
        g.setFont(new Font("TimesRoman", 1, 20));
        g.drawString("Hola, Pancho!", 100, 100);
        g.drawString("Esto es una prueba", 100,120);
        
         if(!vuelto.isEmpty()){
            Graphics g_aux = g.create();
            
            for(int i=0; i<vuelto.size(); ++i){

                if(i == 4 || i == 8){
                    g_aux.translate(15, 45);
                    vuelto.get(i).paintComponent(g_aux);
                }
                else{
                    if(i == 12){
                        break;
                    }
                    g_aux.translate(0,-15);
                    vuelto.get(i).paintComponent(g_aux);
                }    
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
