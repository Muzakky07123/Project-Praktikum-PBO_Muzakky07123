package Entity;

import java.util.Date;

public abstract class Muzakky07123_AdditionalAbstractEntity {
    protected Date tglData;
    protected String personData;

    public Muzakky07123_AdditionalAbstractEntity(Date tglData, String personData) {
        this.tglData = tglData;
        this.personData = personData;
    }
    
    public Muzakky07123_AdditionalAbstractEntity() {
    }
    
    public abstract Date getTglData();

    public void setTglData(Date tglData) {
        this.tglData = tglData;
    }

    public abstract String getPersonData();

    public void setPersonData(String personData) {
        this.personData = personData;
    }    
    
}