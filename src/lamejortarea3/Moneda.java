package lamejortarea3;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import javax.swing.JPanel;

abstract class Moneda extends JPanel {
    private String serie;
    
    public void setSerie(String aux){
        serie = aux;
    }
    
    public String getSerie(){
        return serie;
    }
    
    public abstract int getValor();
        
    @Override
    public void paintComponent(Graphics g){};
}

class Moneda1500 extends Moneda {
    public Moneda1500(String aux){
        super();
        super.setSerie(aux);
        this.setBounds(805,430,20,20);
    }
    
    public int getValor(){
        return 1500;
    }
    
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        
        g.setColor(Color.red);
        g.fillOval(this.getX(), this.getY(), this.getWidth(), this.getHeight());
        g.setColor(Color.black);
        g.drawOval(this.getX(), this.getY(), this.getWidth(), this.getHeight());
        
        g.setColor(Color.white);
        g.setFont(new Font("SansSerif.", 1, 8));
        g.drawString(super.getSerie(), this.getX() + 3, this.getY() + this.getHeight() - 5);
    }
}

class Moneda1000 extends Moneda {
    public Moneda1000(String aux){
        super();
        super.setSerie(aux);
        this.setBounds(805,430,20,20);
    }
    
    public int getValor(){
        return 1000;
    }
    
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        
        g.setColor(Color.green);
        g.fillOval(this.getX(), this.getY(), this.getWidth(), this.getHeight());
        g.setColor(Color.black);
        g.drawOval(this.getX(), this.getY(), this.getWidth(), this.getHeight());
        
        g.setColor(Color.black);
        g.setFont(new Font("SansSerif.", 1, 8));
        g.drawString(super.getSerie(), this.getX() + 3, this.getY() + this.getHeight() - 5);
    }
}

class Moneda500 extends Moneda {
    public Moneda500(String aux){
        super();
        super.setSerie(aux);
        this.setBounds(805,430,20,20);        
    }
    
    public int getValor(){
        return 500;
    }
    
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        
        g.setColor(Color.pink);
        g.fillOval(this.getX(), this.getY(), this.getWidth(), this.getHeight());
        g.setColor(Color.black);
        g.drawOval(this.getX(), this.getY(), this.getWidth(), this.getHeight());
        
        g.setColor(Color.black);
        g.setFont(new Font("SansSerif.", 1, 8));
        g.drawString(super.getSerie(), this.getX() + 3, this.getY() + this.getHeight() - 5);
    }
}

class Moneda100 extends Moneda {
    public Moneda100(String aux){
        super();
        super.setSerie(aux);
        this.setBounds(805,430,20,20);        
    }
 
    public int getValor(){
        return 100;
    }
    
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        
        g.setColor(Color.blue);
        g.fillOval(this.getX(), this.getY(), this.getWidth(), this.getHeight());
        g.setColor(Color.black);
        g.drawOval(this.getX(), this.getY(), this.getWidth(), this.getHeight());
        
        g.setColor(Color.white);
        g.setFont(new Font("SansSerif.", 1, 8));
        g.drawString(super.getSerie(), this.getX() + 3, this.getY() + this.getHeight() - 5);
    }
}