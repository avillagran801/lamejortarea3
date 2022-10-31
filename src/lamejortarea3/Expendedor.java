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
    private ArrayList<Moneda> vuelto;
    private ArrayList<Moneda> monedas;
    
    public Expendedor(int cant, int precio_aux){
        precio = precio_aux;
        coca = new Deposito();
        sprite = new Deposito();
        fanta = new Deposito();
        compra = new DepositoCompra();
        vuelto = new ArrayList<Moneda>();
        monedas = new ArrayList<Moneda>();
        cantidad = cant;
        
        for(int i=0; i < cantidad; i++){
           Bebida aux_coca = new CocaCola();
           Bebida aux_sprite = new Sprite();
           Bebida aux_fanta = new Fanta();

           coca.addBebida(aux_coca);
           sprite.addBebida(aux_sprite);
           fanta.addBebida(aux_fanta);
        }
    }
    
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        // Máquina
        g.setColor(Color.lightGray);
        g.fillRect(550, 150, 350, 450);
        g.setColor(Color.BLACK);
        g.fillRect(570, 600, 30, 15);
        g.fillRect(850, 600, 30,15);
        
        // Vidrio
        g.setColor(Color.CYAN);
        g.fillRect(570, 170, 200, 330);
        
        // Depositos
        g.setColor(Color.BLACK);
        g.fillRect(570, 170, 8, 330);
        g.fillRect(634, 170, 8, 330);
        g.fillRect(698, 170, 8, 330);
        g.fillRect(762, 170, 8, 330);
        coca.paintComponent(g);
        sprite.paintComponent(g);
        fanta.paintComponent(g);
        
        // Deposito bebida comprada
        compra.paintComponent(g);
                
        // Deposito monedas
        g.setColor(Color.DARK_GRAY);
        g.fillRect(810, 380, 50, 50);
            
    }
    
    public void comprarBebida(int idBebida, Moneda m){
        // Decidimos aplicar el método try-catch dentro del bloque de código en
        // vez de afuera por temas de simplicidad.
        try {
            if(m == null){
                throw new PagoIncorrectoException("No se acepta Null como pago.");
            }
            if(m.getValor() >= precio){
                switch (idBebida){
                    // 0 siendo coca; 1 siendo sprite; 2 siendo fanta.
                    case 0:
                        if(coca.isEmpty()){
                            throw new NoHayBebidaException("No queda Coca-cola.");
                        }
                        monedas.add(m);
                        Expendedor.this.crearVuelto(m);
                        compra.agregarBebida(coca.getBebida());
                        break;

                    case 1:
                        if(sprite.isEmpty()){
                            throw new NoHayBebidaException("No queda Sprite.");
                        }
                        monedas.add(m);
                        Expendedor.this.crearVuelto(m);
                        compra.agregarBebida(sprite.getBebida());
                        break;

                    case 2:
                        if(fanta.isEmpty()){
                            throw new NoHayBebidaException("No queda Fanta.");
                        }
                        monedas.add(m);
                        Expendedor.this.crearVuelto(m);
                        compra.agregarBebida(fanta.getBebida());
                        break;
                    
                    default:
                        throw new NoHayBebidaException("ID equivocado.");
                    
                }
            } else {
                throw new PagoInsuficienteException("Dinero insuficiente.");
            }
        }
        catch (PagoIncorrectoException ex){
            System.out.println("Exception in thread \"main\" "
                    + "PagoIncorrectoException.");
            System.out.println(ex.getMessage());
            // return null;
        }
        catch (NoHayBebidaException ex){
            System.out.println("Exception in thread \"main\" "
                    + "NoHayBebidaException.");
            System.out.println(ex.getMessage() + "\nSu moneda ha sido devuelta.");
            vuelto.add(m);
            // return null;
        }
        catch (PagoInsuficienteException ex){
            System.out.println("Exception in thread \"main\" "
                    + "PagoInsuficienteException.");
            System.out.println(ex.getMessage() + "\nSu moneda ha sido devuelta.");
            vuelto.add(m);
            // return null;
        }
    }
    
    private void crearVuelto(Moneda coin_aux){
        // Un método privado, ya que solo el Expendedor puede crear vuelto.
        if (coin_aux.getValor() > precio) {
            for (int i = 0; i < (coin_aux.getValor()-precio)/100; i++){
                Moneda100 m100_aux = new Moneda100();
                vuelto.add(m100_aux);
            }
            System.out.println("Hay vuelto disponible.");
        }
    }
    
    public void rellenarDepositos(){
        if(coca.isEmpty()){
            for (int i = 0; i < cantidad; i++){
                Bebida aux_coca = new CocaCola();
                coca.addBebida(aux_coca);
            }
        }
        if(sprite.isEmpty()){
            for (int i = 0; i < cantidad; i++){
                Bebida aux_sprite = new Sprite();
                sprite.addBebida(aux_sprite);
            }
        }
        if(fanta.isEmpty()){
            for (int i = 0; i < cantidad; i++){
                Bebida aux_fanta = new Fanta();
                fanta.addBebida(aux_fanta);
            }
        }
    }
    
    public Moneda getVuelto(){
        if(vuelto.isEmpty()){
            System.out.println("Ya no queda vuelto que dar.");
            return null;
        } else {
            System.out.println("Quedan " + (vuelto.size() - 1) + 
                    " monedas en el deposito.");
            return vuelto.remove(0);
        }
    }
    
    public int getPrecio(){
        return precio;
    }
    
    public Boolean depositoCompra(){
        if(compra != null){
            return true;
        }
        else{
            return false;
        }
    }
}