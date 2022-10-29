package lamejortarea3;
import java.util.ArrayList;
import java.awt.*;
import javax.swing.*;

class Deposito extends JPanel{
    private ArrayList<Bebida> d;
    
    public Deposito(){
        d = new ArrayList<Bebida>();
    }
    public void addBebida(Bebida b){
        d.add(b);
    }
    public Bebida getBebida(){
        if(d.isEmpty()){
            return null;
        }
        else{
            return d.remove(d.size()-1);
        }
    }
    public Boolean isEmpty(){
        return d.isEmpty();
    }
    public void paint(Graphics g){
        if(d.isEmpty()){
            return;
        } else {
            Bebida aux = d.get(0);
            Graphics g_aux = g.create();
            if(aux.getSabor() == "cocacola"){
                g_aux.translate(550, 220);
                for (int i = 0; i < d.size() && i < 6; i++){
                    g_aux.translate(30, 0);
                    aux.paint(g_aux);
                }
            }
            if(aux.getSabor() == "sprite"){
                g_aux.translate(550, 320);
                for (int i = 0; i < d.size() && i < 6; i++){
                    g_aux.translate(30, 0);
                    aux.paint(g_aux);
                }
            }
            if(aux.getSabor() == "fanta"){
                g_aux.translate(550, 420);
                for (int i = 0; i < d.size() && i < 6; i++){
                    g_aux.translate(30, 0);
                    aux.paint(g_aux);
                }
            }
        }
    }
}