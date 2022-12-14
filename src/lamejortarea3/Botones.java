package lamejortarea3;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;

public class Botones{
    private PanelPrincipal pp;
    private JButton b_m100;
    private JButton b_m500;
    private JButton b_m1000;
    private JButton b_m1500;
     
    public Botones(PanelPrincipal pp_aux){
        pp = pp_aux;
        
        JButton b_coca = new JButton();
        JButton b_sprite = new JButton();
        JButton b_fanta = new JButton();
        JButton b_depositos = new JButton();
        JButton b_compra = new JButton();
        JButton b_monedas = new JButton();
        JButton b_clearSencillo = new JButton();
        JButton b_clearBebidas = new JButton();
        b_m100 = new JButton("$100");
        b_m100.setFont(new Font("Arial", Font.PLAIN, 10));
        b_m100.setForeground(Color.WHITE);
        b_m500 = new JButton("$500");
        b_m500.setFont(new Font("Arial", Font.PLAIN, 10));
        b_m1000 = new JButton("$1000");
        b_m1000.setFont(new Font("Arial", Font.PLAIN, 8));
        b_m1500 = new JButton("$1500");
        b_m1500.setFont(new Font("Arial", Font.PLAIN, 8));
        b_m1500.setForeground(Color.WHITE);
        
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
        b_depositos.setBounds(pp.getExpendedor().getX()+30, pp.getExpendedor().getY()+20,
                240, 460);
        b_depositos.setOpaque(false);
        b_depositos.setContentAreaFilled(false);
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
        pp.add(b_compra);
        
        b_monedas.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                getVuelto(evt);
            }
        });
        b_monedas.setBounds(800, 340, 70, 100);
        b_monedas.setOpaque(false);
        b_monedas.setContentAreaFilled(false);
        pp.add(b_monedas);
        
        b_clearSencillo.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clearCoins(evt);
            }
        });
        b_clearSencillo.setBounds(100, 100, 300, 60);
        b_clearSencillo.setOpaque(false);
        b_clearSencillo.setContentAreaFilled(false);
        pp.add(b_clearSencillo);
        
        b_clearBebidas.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clearBebidas(evt);
            }
        });
        b_clearBebidas.setBounds(100, 165, 300, 60);
        b_clearBebidas.setOpaque(false);
        b_clearBebidas.setContentAreaFilled(false);
        pp.add(b_clearBebidas);
        
        b_m100.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                selectM100(evt);
            }
        });
        b_m100.setBounds(100, 680, 60, 40);
        b_m100.setBackground(Color.blue);
        pp.add(b_m100);
        
        b_m500.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                selectM500(evt);
            }
        });
        b_m500.setBounds(175, 680, 60, 40);
        b_m500.setBackground(Color.pink);
        pp.add(b_m500);
        
        b_m1000.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                selectM1000(evt);
            }
        });
        b_m1000.setBounds(255, 680, 60, 40);
        b_m1000.setBackground(Color.green);
        pp.add(b_m1000);
        
        b_m1500.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                selectM1500(evt);
            }
        });
        b_m1500.setBounds(330, 680, 60, 40);
        b_m1500.setBackground(Color.red);
        pp.add(b_m1500);
    }
        
    private void comprarCoca(java.awt.event.MouseEvent evt){
        System.out.println("\n*** Comprar Coca ***");
        pp.getComprador().comprarBebida(0, pp.getExpendedor()); // ESTO ES DE PRUEBA
        pp.repaint();
    }
    
    private void comprarSprite(java.awt.event.MouseEvent evt){
        System.out.println("\n*** Comprar Sprite ***");
        pp.getComprador().comprarBebida(1, pp.getExpendedor());
        pp.repaint();
    }
    
    private void comprarFanta(java.awt.event.MouseEvent evt){
        System.out.println("\n*** Comprar Fanta ***");
        pp.getComprador().comprarBebida(2, pp.getExpendedor());
        pp.repaint();
    }
    
    private void refill(java.awt.event.MouseEvent evt){
        System.out.println("\nRellenando depositos...");
        pp.getExpendedor().rellenarDepositos();
        pp.repaint();
    }
    
    private void getBebida(java.awt.event.MouseEvent evt){
        if(pp.getExpendedor().getCompra().depositoVacio()){
            System.out.println("\nNo hay bebida que retirar.");
        } else {
            System.out.println("\nBebida retirada.");
            pp.getComprador().addBebida(pp.getExpendedor().getCompra().getBebida());
            pp.repaint();
        }
    }
    
    private void getVuelto(java.awt.event.MouseEvent evt){
        pp.getComprador().retirarVuelto(pp.getExpendedor());
        pp.repaint();
    }
    
    private void clearCoins(java.awt.event.MouseEvent evt){
        if(pp.getComprador().getSencillo().isEmpty()){
            return;
        } else {
            pp.getComprador().getSencillo().remove(0);
        }
        pp.repaint();
    }
    
    private void clearBebidas(java.awt.event.MouseEvent evt){
        if(pp.getComprador().getBebidas().isEmpty()){
            return;
        } else {
            pp.getComprador().getBebidas().remove(0);
        }
        pp.repaint();
    }
    
    private void selectM100(java.awt.event.MouseEvent evt) {
        System.out.println("MONEDA 100!");
        pp.getComprador().seleccionarMoneda(1);
        this.b_m100.setEnabled(false);
        this.b_m500.setEnabled(true);
        this.b_m1000.setEnabled(true);
        this.b_m1500.setEnabled(true);
        pp.repaint();
    }
    
    private void selectM500(java.awt.event.MouseEvent evt) {
        System.out.println("MONEDA 500!");
        pp.getComprador().seleccionarMoneda(2);
        this.b_m100.setEnabled(true);
        this.b_m500.setEnabled(false);
        this.b_m1000.setEnabled(true);
        this.b_m1500.setEnabled(true);
        pp.repaint();
    }
    
    private void selectM1000(java.awt.event.MouseEvent evt) {
        System.out.println("MONEDA 1000!");
        pp.getComprador().seleccionarMoneda(3);
        this.b_m100.setEnabled(true);
        this.b_m500.setEnabled(true);
        this.b_m1000.setEnabled(false);
        this.b_m1500.setEnabled(true);
        pp.repaint();
    }
    
    private void selectM1500(java.awt.event.MouseEvent evt) {
        System.out.println("MONEDA 1500!");
        pp.getComprador().seleccionarMoneda(4);
        this.b_m100.setEnabled(true);
        this.b_m500.setEnabled(true);
        this.b_m1000.setEnabled(true);
        this.b_m1500.setEnabled(false);
        pp.repaint();
    }
}