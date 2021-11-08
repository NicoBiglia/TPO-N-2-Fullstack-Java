
package persistencia;

import java.util.List;
import logica.Client;

public class PersistenceController {
    
    ClientJpaController cliJPA = new ClientJpaController();
    
    //Create
    public void createClient(Client cli){
       try{ 
        cliJPA.create(cli);
       }
       catch (Exception e) {
           System.out.println("The client cannot be created");
       }
    };
    /*
    //Read
    public List<Client> getClients(){
        return cliJPA.findClientEntities();
    };
            
    //Update
    public void updateClient(Client cli) {
      try{
          cliJPA.edit(cli);
      }  catch(Exception e){
          System.out.println("The client cannot be modified");
      }
    };
    
    
    //Delete
    public void deleteClient(Client cli){
        try {
            cliJPA.destroy(cli.getClientID());
        } catch (Exception e) {
            System.out.println("The client cannot be deleted");
        }
    };
    
    public void deleteClient(int id){
        try {
            cliJPA.destroy(id);
        } catch (Exception e) {
            System.out.println("The client cannot be deleted");
        }
    };
    
    //Search
    public void searchClient(Client cli){
      try {
            cliJPA.findClient(cli.getClientID());
        } catch (Exception e) {
            System.out.println("The client cannot be found");
        }
    };
    public void searchClient(int id){
      try {
            cliJPA.findClient(id);
        } catch (Exception e) {
            System.out.println("The client cannot be found");
        }
    };
    */
}
