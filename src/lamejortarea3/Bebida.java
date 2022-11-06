package lamejortarea3;
import java.awt.*;
import javax.swing.*;

abstract class Bebida extends JPanel {
    private String serie;
        
    public void setSerie(String aux){
        serie = aux;
    }
    
    public String getSerie(){
        return serie;
    }
    
    public abstract String beber();
    
    public abstract String getSabor();
    
    @Override
    public void paintComponent(Graphics g){};
}

class Sprite extends Bebida{
    public Sprite(int num){
        super();
        super.setSerie("S" + num);
        
        this.setBounds(0, 0, 30, 60);
        this.setOpaque(false);
    }
    public String beber(){
        System.out.println("Gluglu");
        return "sprite";
    }
    public String getSabor(){
        return "sprite";
    }
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.setColor(Color.white);
        g.fillRect(this.getX(), this.getY(), 30, 60);
        g.setColor(Color.green);
        g.fillRect(this.getX(), this.getY()+15, 30, 25);
        
        g.setColor(Color.black);
        g.setFont(new Font("SansSerif.", 1, 8));
        g.drawString(super.getSerie(), this.getX()+3, this.getY()+this.getHeight()-5);
    }
}

class CocaCola extends Bebida{
    public CocaCola(int num){
        super();
        super.setSerie("C" + num);
        
        this.setBounds(0, 0, 30, 60);
        this.setOpaque(false);
    }
    public String beber(){
        System.out.println("Gluglu");
        return "cocacola";
    }
    public String getSabor(){
        return "cocacola";
    }
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.setColor(Color.black);
        g.fillRect(this.getX(), this.getY(), 30, 60);
        g.setColor(Color.red);
        g.fillRect(this.getX(), this.getY()+15, 30, 15);
        
        g.setColor(Color.white);
        g.setFont(new Font("SansSerif.", 1, 8));
        g.drawString(super.getSerie(), this.getX()+3, this.getY()+this.getHeight()-5);
    }
}

class Fanta extends Bebida{
    public Fanta(int num){
        super();
        super.setSerie("F" + num);
        
        this.setBounds(0, 0, 30, 60);
        this.setOpaque(false);
    }
    public String beber(){
        System.out.println("Gluglu");
        return "fanta";
    }
    public String getSabor(){
        return "fanta";
    }
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.setColor(Color.orange);
        g.fillRect(this.getX(), this.getY(), this.getWidth(), this.getHeight());
        
        g.setColor(Color.black);
        g.setFont(new Font("SansSerif.", 1, 8));
        g.drawString(super.getSerie(), this.getX()+3, this.getY()+this.getHeight()-5);
    }
}