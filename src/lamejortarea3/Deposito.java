package lamejortarea3;
import java.util.ArrayList;
import java.awt.*;
import javax.swing.*;

public class Deposito extends JPanel{
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
            return d.remove(0);
        }
    }
    
    public Boolean isEmpty(){
        return d.isEmpty();
    }
    
    public int arraySize(){
        return d.size();
    }
    
    public void paintComponent(Graphics g, Expendedor exp){
        super.paintComponent(g);
        if(d.isEmpty()){
            return;
        } else {
            Bebida aux = d.get(0);
            if(aux.getSabor() == "cocacola"){
                for (int i = 0; i < d.size() && i < 6; i++){
                    aux= d.get(i);
                    aux.setBounds(exp.getX()+56, exp.getY() + 350 - (52*(i+1)), 20, 40);
                    aux.paintComponent(g);
                }
            }
            if(aux.getSabor() == "sprite"){
                for (int i = 0; i < d.size() && i < 6; i++){
                    aux= d.get(i);
                    aux.setBounds(exp.getX()+120, exp.getY() + 350 - (52*(i+1)), 20, 40);
                    aux.paintComponent(g);
                }
            }
            if(aux.getSabor() == "fanta"){
                for (int i = 0; i < d.size() && i < 6; i++){
                    aux= d.get(i);
                    aux.setBounds(exp.getX()+184, exp.getY() + 350 - (52*(i+1)), 20, 40);
                    aux.paintComponent(g);
                }
            }
        }
    }
}