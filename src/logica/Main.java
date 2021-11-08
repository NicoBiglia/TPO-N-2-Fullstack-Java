
package logica;

import igu.Screen;
import java.util.List;
import persistencia.PersistenceController;
import logica.Controller;

/**
 * @author Nicolas Biglia
 */
public class Main {
    public static void main(String[] args) {
       
        Controller control = new Controller();
        Screen screen = new Screen(control);
        screen.setVisible(true);
        screen.setLocationRelativeTo(null);
       
       
        
        /*
        List <Client> list = control.searchClients();
        
        for(Client li : list){
            System.out.println(li.getClientID() + " " + li.getClientName() 
                    + " " + li.getDogName() + " " + li.getDogRace());
        }
        
        */
    }
   
}
