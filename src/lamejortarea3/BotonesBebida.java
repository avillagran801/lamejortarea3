package lamejortarea3;

import java.awt.Color;
import javax.swing.JButton;

public class BotonesBebida {
    private PanelPrincipal pp;
    
    public BotonesBebida(PanelPrincipal pp_aux){
        pp = pp_aux;
        
        JButton b_coca = new JButton();
        JButton b_sprite = new JButton();
        JButton b_fanta = new JButton();
        
        b_coca.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                comprarCoca(evt);
            }
        });
        b_coca.setBounds(815, 180, 30, 30);
        b_coca.setBackground(Color.red);
        pp.add(b_coca);
    
        b_sprite.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                comprarSprite(evt);
            }
        });
        b_sprite.setBounds(815, 220, 30, 30);
        b_sprite.setBackground(Color.green);
        pp.add(b_sprite);
        
        b_fanta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                comprarFanta(evt);
            }
        });
        b_fanta.setBounds(815, 260, 30, 30);
        b_fanta.setBackground(Color.orange);
        pp.add(b_fanta);
    }
        
    private void comprarCoca(java.awt.event.MouseEvent evt){
        System.out.println("Comprar Coca");
        pp.con.ComprarBebida(0, new Moneda1000(), pp.exp); // ESTO ES DE PRUEBA
    }
    
    private void comprarSprite(java.awt.event.MouseEvent evt){
        System.out.println("Comprar Sprite");
        pp.con.ComprarBebida(1, new Moneda1000(), pp.exp);
        
    }
    
    private void comprarFanta(java.awt.event.MouseEvent evt){
        System.out.println("Comprar Fanta");
        pp.con.ComprarBebida(2, new Moneda1000(), pp.exp);
        
    }
}
