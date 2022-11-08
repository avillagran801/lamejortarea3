package lamejortarea3;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JLabel;

public class Etiquetas{
    
    public Etiquetas(PanelPrincipal pp){
        JLabel emptyDeposit = new JLabel();
        emptyDeposit.setText("<html><body>Haga click en el vidrio<br>"
                + "para rellenar el depósito cuando esté vacío.</body></html>");
        emptyDeposit.setFont(new Font("Arial", Font.PLAIN, 12));
        emptyDeposit.setForeground(Color.WHITE);
        emptyDeposit.setBounds(500, 50, 400, 50);
        pp.add(emptyDeposit);
        
        JLabel takeDrink = new JLabel ();
        takeDrink.setText("<html><body>Recuerda<br>sacar la<br>bebida "
                + "antes<br>de comprar<br>otra.</body></html>");
        takeDrink.setFont(new Font("Arial", Font.PLAIN, 12));
        takeDrink.setForeground(Color.WHITE);
        takeDrink.setBounds(905, 470, 400, 100);
        pp.add(takeDrink);
        
        JLabel takeCoin = new JLabel ();
        takeCoin.setText("<html><body>Recuerda<br>sacar el<br>vuelto."
                + "</body></html>");
        takeCoin.setFont(new Font("Arial", Font.PLAIN, 12));
        takeCoin.setForeground(Color.WHITE);
        takeCoin.setBounds(905, 330, 400, 100);
        pp.add(takeCoin);
        
        JLabel price = new JLabel();
        price.setText("<html><body>Cada bebida<br>cuesta $1000.</body></html>");
        price.setFont(new Font("Arial", Font.PLAIN, 11));
        price.setForeground(Color.WHITE);
        price.setBounds(905, 200, 400, 100);
        pp.add(price);
        
        JLabel chooseCoin = new JLabel();
        chooseCoin.setText("<html><body>Elige una moneda antes de comprar.</body></html>");
        chooseCoin.setFont(new Font("Arial", Font.PLAIN, 14));
        chooseCoin.setForeground(Color.WHITE);
        chooseCoin.setBounds(100, 600, 400, 100);
        pp.add(chooseCoin);
        
        JLabel cleanPockets = new JLabel();
        cleanPockets.setText("<html><body>Puedes botar una moneda o una bebida<br>"
                + "haciendo click en el depósito correspondiente.</body></html>");
        cleanPockets.setFont(new Font("Arial", Font.PLAIN, 12));
        cleanPockets.setForeground(Color.WHITE);
        cleanPockets.setBounds(100, 30, 300, 100);
        pp.add(cleanPockets);
    }
    
}
