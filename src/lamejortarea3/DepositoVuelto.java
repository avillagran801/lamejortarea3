package lamejortarea3;

import java.util.ArrayList;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;
import java.awt.Font;

public class DepositoVuelto extends JPanel{
    private ArrayList<Moneda> vuelto;
    private int cont;
    
    public DepositoVuelto(){
        vuelto = new ArrayList<Moneda>();
        cont = 0;
    }
    
    // @Override
    public void paintComponent(Graphics g, Expendedor exp){
        super.paintComponent(g);
        
        this.setBounds(exp.getX()+300, exp.getY()+240, 70, 100);
        this.setOpaque(false);
        
        g.setColor(Color.DARK_GRAY);
        g.fillRect(this.getX(), this.getY(), this.getWidth(), this.getHeight());
        
        if(!vuelto.isEmpty()){
            Graphics g_aux = g.create();
            
            for(int i=0; i<vuelto.size(); ++i){

                if(i == 4 || i == 8){
                    g_aux.translate(20, 60);
                    vuelto.get(i).paintComponent(g_aux);
                }
                else{
                    if(i == 12){
                        break;
                    }
                    g_aux.translate(0,-20);
                    vuelto.get(i).paintComponent(g_aux);
                }    
            }
        }
    }
    
    public void crearVuelto(Moneda coin_aux, int precio){
        if (coin_aux.getValor() > precio) {
            for (int i = 0; i < (coin_aux.getValor()-precio)/100; i++){
                Moneda100 m100_aux = new Moneda100("V" + cont);
                vuelto.add(m100_aux);
                cont++;
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
