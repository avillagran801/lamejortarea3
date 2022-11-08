package lamejortarea3;
import java.util.ArrayList;
import java.awt.*;
import javax.swing.*;

public class Expendedor extends JPanel{
    private int precio;
    private int cantidad;
    private Deposito coca;
    private Deposito sprite;
    private Deposito fanta;
    private DepositoCompra compra;
    private DepositoVuelto vuelto;
    private ArrayList<Moneda> monedas;
    private JLabel emptyDeposit;
    
    public Expendedor(int cant, int precio_aux){
        precio = precio_aux;
        coca = new Deposito();
        sprite = new Deposito();
        fanta = new Deposito();
        compra = new DepositoCompra();
        vuelto = new DepositoVuelto();
        monedas = new ArrayList<Moneda>();
        cantidad = cant;
        
        this.setBounds(500, 100, 400, 500);
        this.setOpaque(false);
        
        for(int i=0; i < cantidad; i++){
           Bebida aux_coca = new CocaCola(coca.getContador());
           Bebida aux_sprite = new Sprite(sprite.getContador());
           Bebida aux_fanta = new Fanta(fanta.getContador());

           coca.addBebida(aux_coca);
           sprite.addBebida(aux_sprite);
           fanta.addBebida(aux_fanta);
        }
    }
    
    public Boolean sinBebida(){
        return coca.isEmpty()||sprite.isEmpty()||fanta.isEmpty();
    }
    
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        // Máquina
        g.setColor(Color.lightGray);
        g.fillRect(this.getX(), this.getY(), 400, 500);
        g.setColor(Color.BLACK);
        g.fillRect(this.getX()+55, this.getY()+500, 30, 15);
        g.fillRect(this.getX()+325, this.getY()+500, 30, 15);
        
        // Vidrio
        g.setColor(Color.CYAN);
        g.fillRect(this.getX()+30, this.getY()+20, 240, 460);
        
        // Depositos
        g.setColor(Color.BLACK);
        g.fillRect(this.getX()+30, this.getY()+20, 8, 460);
        g.fillRect(this.getX()+102, this.getY()+20, 8, 460);
        g.fillRect(this.getX()+182, this.getY()+20, 8, 460);
        g.fillRect(this.getX()+262, this.getY()+20, 8, 460);
        coca.paintComponent(g, this);
        sprite.paintComponent(g, this);
        fanta.paintComponent(g, this);
        
        // Deposito bebida comprada
        compra.paintComponent(g, this);
                
        // Deposito vuelto
        vuelto.paintComponent(g, this);
            
    }
    
    public void comprarBebida(int idBebida, Moneda m){
        // Decidimos aplicar el método try-catch dentro del bloque de código en
        // vez de afuera por temas de simplicidad.
        try {
            if(m == null){
                throw new PagoIncorrectoException("No se acepta Null como pago.");
            }
            if(m.getValor() >= precio){
                // 0 siendo coca; 1 siendo sprite; 2 siendo fanta.
                switch (idBebida){
                    case 0: {
                        if(coca.isEmpty()){
                            throw new NoHayBebidaException("No queda Coca-cola.");
                        }

                        if(compra.depositoVacio()){
                            System.out.println("Bebida guardada en el depósito");
                            compra.agregarBebida(coca.getBebida());
                            monedas.add(m);
                            // Expendedor.this.crearVuelto(m)
                            vuelto.crearVuelto(m, precio);
                        }
                        else{
                            throw new BebidaSinRetirarException("Ya hay una "
                                    + "bebida en el depósito");
                        }
                        break;
                    }

                    case 1: {
                        if(sprite.isEmpty()){
                            throw new NoHayBebidaException("No queda Sprite.");
                        }
                        if(compra.depositoVacio()){
                            System.out.println("Bebida guardada en el depósito");
                            compra.agregarBebida(sprite.getBebida());
                            monedas.add(m);
                            // Expendedor.this.crearVuelto(m);
                            vuelto.crearVuelto(m, precio);
                        }
                        else{
                            throw new BebidaSinRetirarException("Ya hay una "
                                    + "bebida en el depósito");
                        }
                        break;
                    }

                    case 2: {
                        if(fanta.isEmpty()){
                            throw new NoHayBebidaException("No queda Fanta.");
                        }
                        if(compra.depositoVacio()){
                            System.out.println("Bebida guardada en el depósito");
                            compra.agregarBebida(fanta.getBebida());
                            monedas.add(m);
                            // Expendedor.this.crearVuelto(m);
                            vuelto.crearVuelto(m, precio);
                        }
                        else{
                            throw new BebidaSinRetirarException("Ya hay una "
                                    + "bebida en el depósito");
                        }
                        break;
                    }
                }
            } else {
                throw new PagoInsuficienteException("Dinero insuficiente.");
            }
        }
        catch (PagoIncorrectoException ex){
            System.out.println("Exception in thread \"main\" "
                    + "PagoIncorrectoException.");
            System.out.println(ex.getMessage());
        }
        catch (NoHayBebidaException ex){
            System.out.println("Exception in thread \"main\" "
                    + "NoHayBebidaException.");
            System.out.println(ex.getMessage() + "\nSu moneda ha sido devuelta.");
            // vuelto.add(m);
            vuelto.addMoneda(m);
        }
        catch (PagoInsuficienteException ex){
            System.out.println("Exception in thread \"main\" "
                    + "PagoInsuficienteException.");
            System.out.println(ex.getMessage() + "\nSu moneda ha sido devuelta.");
            //vuelto.add(m);
            vuelto.addMoneda(m);
        }
        catch (BebidaSinRetirarException ex){
            System.out.println("Exception in thread \"main\" "
                    + "BebidaSinRetirarException.");
            System.out.println(ex.getMessage() + "\nSu moneda ha sido devuelta.");
            // vuelto.add(m);
            vuelto.addMoneda(m);
        }
    }
    
    public void rellenarDepositos(){
        if(coca.isEmpty()){
            for (int i = 0; i < cantidad; i++){
                Bebida aux_coca = new CocaCola(coca.getContador());
                coca.addBebida(aux_coca);
            }
        } else {
            System.out.println("Aun queda Coca-cola.");
        }
        if(sprite.isEmpty()){
            for (int i = 0; i < cantidad; i++){
                Bebida aux_sprite = new Sprite(sprite.getContador());
                sprite.addBebida(aux_sprite);
            }
        } else {
            System.out.println("Aun queda Sprite.");
        }
        if(fanta.isEmpty()){
            for (int i = 0; i < cantidad; i++){
                Bebida aux_fanta = new Fanta(fanta.getContador());
                fanta.addBebida(aux_fanta);
            }
        } else {
            System.out.println("Aun queda Fanta.");
        }
    }
    
    public Moneda getVuelto(){
        return vuelto.getMoneda();
    }
    
    public int getPrecio(){
        return precio;
    }
    
    public DepositoCompra getCompra(){
        return compra;
    }
    
    public Boolean depositoLleno(){
        if(compra != null){
            return true;
        }
        else{
            return false;
        }
    }
}