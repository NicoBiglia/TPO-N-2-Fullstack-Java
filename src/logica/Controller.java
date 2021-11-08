
package logica;

import java.util.List;
import persistencia.PersistenceController;


public class Controller {
     PersistenceController contPersist = new PersistenceController();
     
     public void createClient(Client cli){
         contPersist.createClient(cli);
     };
     
     public void createClient(int clientID, String dogName, String dogRace, String dogColor, String clientName, String clientPhone, String observations, boolean isAlergic, boolean needSpecialTreatment){
         
         Client cli = new Client();
         
         cli.setDogName(dogName);
         cli.setDogRace(dogRace);
         cli.setDogColor(dogColor);
         cli.setClientName(clientName);
         cli.setClientPhone(clientPhone);
         cli.setIsAlergic(isAlergic);
         cli.setNeedSpecialTreatment(needSpecialTreatment);
         cli.setObservations(observations);
         
         contPersist.createClient(cli);
     }
     
     /*
     
     public void deleteClient(Client cli) {
         contPersist.deleteClient(cli);
     };
     
     public void deleteClient(int id) {
         contPersist.deleteClient(id);
     };
     
     public List <Client> searchClients() {
         return contPersist.getClients();
     };
     
     public void updateClient(Client cli){
         contPersist.updateClient(cli);
     };
     
     public void searchClient(Client cli){
         contPersist.searchClient(cli);
     };
     public void searchClient(int id){
         contPersist.searchClient(id);
     };
     */
}
