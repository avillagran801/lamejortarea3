package lamejortarea3;
import java.awt.*;
import javax.swing.*;

abstract class Bebida extends JPanel {
    
    public abstract String beber();
    
    public abstract String getSabor();
    
    @Override
    public void paintComponent(Graphics g){};
}

class Sprite extends Bebida{
    public Sprite(){
        super();
        this.setBounds(0, 0, 20, 40);
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
        g.fillRect(this.getX(), this.getY(), 20, 40);
        g.setColor(Color.green);
        g.fillRect(this.getX(), this.getY()+10, 20, 15);
    }
}

class CocaCola extends Bebida{
    public CocaCola(){
        super();
        this.setBounds(0, 0, 20, 40);
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
        g.fillRect(this.getX(), this.getY(), 20, 40);
        g.setColor(Color.red);
        g.fillRect(this.getX(), this.getY()+10, 20, 15);
    }
}

class Fanta extends Bebida{
    public Fanta(){
        super();
        this.setBounds(0, 0, 20, 40);
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
        g.fillRect(this.getX(), this.getY(), 20, 40);
    }
}