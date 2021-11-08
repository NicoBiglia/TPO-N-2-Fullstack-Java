
package logica;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Client implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int clientID;
    @Basic
    private String dogName, dogRace, dogColor, clientName, clientPhone, observations;
    private boolean isAlergic, needSpecialTreatment;

    public Client() {
    }

    public Client(int clientID, String dogName, String dogRace, String dogColor, String clientName, String clientPhone, String observations, boolean isAlergic, boolean needSpecialTreatment) {
        this.clientID = clientID;
        this.dogName = dogName;
        this.dogRace = dogRace;
        this.dogColor = dogColor;
        this.clientName = clientName;
        this.clientPhone = clientPhone;
        this.observations = observations;
        this.isAlergic = isAlergic;
        this.needSpecialTreatment = needSpecialTreatment;
    }

    public int getClientID() {
        return clientID;
    }

    public void setClientID(int clientID) {
        this.clientID = clientID;
    }

    public String getDogName() {
        return dogName;
    }

    public void setDogName(String dogName) {
        this.dogName = dogName;
    }

    public String getDogRace() {
        return dogRace;
    }

    public void setDogRace(String dogRace) {
        this.dogRace = dogRace;
    }

    public String getDogColor() {
        return dogColor;
    }

    public void setDogColor(String dogColor) {
        this.dogColor = dogColor;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public String getClientPhone() {
        return clientPhone;
    }

    public void setClientPhone(String clientPhone) {
        this.clientPhone = clientPhone;
    }

    public String getObservations() {
        return observations;
    }

    public void setObservations(String observations) {
        this.observations = observations;
    }

    public boolean isIsAlergic() {
        return isAlergic;
    }

    public void setIsAlergic(boolean isAlergic) {
        this.isAlergic = isAlergic;
    }

    public boolean isNeedSpecialTreatment() {
        return needSpecialTreatment;
    }

    public void setNeedSpecialTreatment(boolean needSpecialTreatment) {
        this.needSpecialTreatment = needSpecialTreatment;
    }
    
    
}
