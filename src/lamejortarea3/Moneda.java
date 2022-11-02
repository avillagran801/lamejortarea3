package lamejortarea3;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

abstract class Moneda extends JPanel {        
    
    public abstract String getSerie();
    public abstract int getValor();
        
    @Override
    public void paintComponent(Graphics g){};
}

class Moneda1500 extends Moneda {
    public Moneda1500(){
        super();
    }
    
    public String getSerie(){
        return "Moneda de 1500.\nNúmero de serie: " + this.toString();
    }
    
    public int getValor(){
        return 1500;
    }
    
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        
        g.setColor(Color.yellow);
        g.fillRect(0, 0, 10, 10);
    }
}

class Moneda1000 extends Moneda {
    public Moneda1000(){
        super();
    }
    
    public String getSerie(){
        return "Moneda de 1000.\nNúmero de serie: " + this.toString();
    }
    
    public int getValor(){
        return 1000;
    }
    
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        
        g.setColor(Color.green);
        g.fillRect(0, 0, 10, 10);
    }
}

class Moneda500 extends Moneda {
    public Moneda500(){
        super();
    }
    
    public String getSerie(){
        return "Moneda de 500.\nNúmero de serie: " + this.toString();
    }
    
    public int getValor(){
        return 500;
    }
    
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        
        g.setColor(Color.pink);
        g.fillRect(0, 0, 10, 10);
    }
}

class Moneda100 extends Moneda {
    public Moneda100(){
        super();
    }
    
    public String getSerie(){
        return "Moneda de 100.\nNúmero de serie: " + this.toString();
    }
    
    public int getValor(){
        return 100;
    }
    
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        
        g.setColor(Color.blue);
        g.fillRect(0, 0, 10, 10);
    }
}