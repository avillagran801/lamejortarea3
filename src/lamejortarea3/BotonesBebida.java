package lamejortarea3;

import java.awt.Color;
import javax.swing.JButton;

class Botones{
    private PanelPrincipal pp;
     
    public Botones(PanelPrincipal pp_aux){
        pp = pp_aux;
        
        JButton b_coca = new JButton();
        JButton b_sprite = new JButton();
        JButton b_fanta = new JButton();
        JButton b_depositos = new JButton();
        JButton b_compra = new JButton();
        
        b_coca.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                comprarCoca(evt);
            }
        });
        b_coca.setBounds(820, 200, 30, 30);
        b_coca.setBackground(Color.red);
        pp.add(b_coca);
        
        b_sprite.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                comprarSprite(evt);
            }
        });
        b_sprite.setBounds(820, 240, 30, 30);
        b_sprite.setBackground(Color.green);
        pp.add(b_sprite);
        
        b_fanta.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                comprarFanta(evt);
            }
        });
        b_fanta.setBounds(820, 280, 30, 30);
        b_fanta.setBackground(Color.orange);
        pp.add(b_fanta);
        
        b_depositos.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                refill(evt);
            }
        });
        b_depositos.setBounds(570, 170, 200, 330);
        b_depositos.setOpaque(false);
        b_depositos.setContentAreaFilled(false);
        //b_depositos.setBorderPainted(false);
        pp.add(b_depositos);
        
        b_compra.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                getBebida(evt);
            }
        });
        b_compra.setBounds(800, 470, 70, 100);
        b_compra.setOpaque(false);
        b_compra.setContentAreaFilled(false);
        //b_compra.setBorderPainted(false);
        pp.add(b_compra);
    }
        
    private void comprarCoca(java.awt.event.MouseEvent evt){
        System.out.println("Comprar Coca");
        pp.getComprador().comprarBebida(0, new Moneda1500(), pp.getExpendedor()); // ESTO ES DE PRUEBA
        pp.repaint();
    }
    
    private void comprarSprite(java.awt.event.MouseEvent evt){
        System.out.println("Comprar Sprite");
        pp.getComprador().comprarBebida(1, new Moneda1500(), pp.getExpendedor());
        pp.repaint();
    }
    
    private void comprarFanta(java.awt.event.MouseEvent evt){
        System.out.println("Comprar Fanta");
        pp.getComprador().comprarBebida(2, new Moneda1500(), pp.getExpendedor());
        pp.repaint();
    }
    
    private void refill(java.awt.event.MouseEvent evt){
        System.out.println("Rellenando depositos...");
        pp.getExpendedor().rellenarDepositos();
        pp.repaint();
    }
    
    private void getBebida(java.awt.event.MouseEvent evt){
        if(pp.getExpendedor().getCompra().depositoVacio()){
            System.out.println("No hay bebida que retirar.");
        } else {
            System.out.println("Bebida retirada.");
            pp.getExpendedor().getCompra().getBebida();
            pp.repaint();
        }
    }
}
