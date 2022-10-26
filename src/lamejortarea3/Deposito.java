package lamejortarea3;
import java.util.ArrayList;
import java.awt.*;
import javax.swing.*;

class Deposito{
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
    public int getSize(){
        return d.size();
    }
    public void paint(Graphics g){
        if(d.isEmpty()){
            return;
        } else {
            Bebida aux = d.get(0);
            for (int i = 0; i < d.size() && i <= 5; i++){
                aux.setLocation(580 + (i*5), 0);
                g.fillPolygon(aux.p);
            }
        }
    }
}