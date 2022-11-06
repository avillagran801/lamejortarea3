package lamejortarea3;
import java.util.ArrayList;
import java.awt.*;
import javax.swing.*;

public class Deposito extends JPanel{
    private ArrayList<Bebida> d;
    private int cont;
    
    public Deposito(){
        d = new ArrayList<Bebida>();
        cont = 0;
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
    
    public int getContador(){
        int cont_aux = cont;
        cont++;
        return cont_aux;
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
                    aux.setBounds(exp.getX()+55, exp.getY() + 480 - (74*(i+1)), 30, 60);
                    aux.paintComponent(g);
                }
            }
            if(aux.getSabor() == "sprite"){
                for (int i = 0; i < d.size() && i < 6; i++){
                    aux= d.get(i);
                    aux.setBounds(exp.getX()+131, exp.getY() + 480 - (74*(i+1)), 30, 60);
                    aux.paintComponent(g);
                }
            }
            if(aux.getSabor() == "fanta"){
                for (int i = 0; i < d.size() && i < 6; i++){
                    aux= d.get(i);
                    aux.setBounds(exp.getX()+211, exp.getY() + 480 - (74*(i+1)), 30, 60);
                    aux.paintComponent(g);
                }
            }
        }
    }
}