package lamejortarea3;
import java.awt.*;
import javax.swing.*;

abstract class Bebida extends JPanel {
    protected Polygon p;
    
    public abstract String beber();
}

class Sprite extends Bebida{
    public Sprite(){
        super();
        p = new Polygon(new int[] {0, 20, 20, 0}, new int[] {0, 0, 20, 20}, 4);
    }
    public String beber(){
        System.out.println("Gluglu");
        return "sprite";
    }
}

class CocaCola extends Bebida{
    public CocaCola(){
        super();
        p = new Polygon(new int[] {0, 20, 20, 0}, new int[] {0, 0, 20, 20}, 4);
    }
    public String beber(){
        System.out.println("Gluglu");
        return "cocacola";
    }
}

class Fanta extends Bebida{
    public Fanta(){
        super();
        p = new Polygon(new int[] {0, 20, 20, 0}, new int[] {0, 0, 20, 20}, 4);
    }
    public String beber(){
        System.out.println("Gluglu");
        return "fanta";
    }
}