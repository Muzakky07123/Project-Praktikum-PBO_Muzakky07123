package Model;

import Entity.*;
import java.util.ArrayList;

public class Muzakky07123_PemasukanModel {
    private ArrayList<Muzakky07123_PemasukanEntity> arrlistPemasukan;
    
    public Muzakky07123_PemasukanModel() {
        this.arrlistPemasukan = new ArrayList<>();
    }
    
    public void insertPemasukan(Muzakky07123_PemasukanEntity pemasukanEntity) {
        arrlistPemasukan.add(pemasukanEntity);
    }

    public ArrayList<Muzakky07123_PemasukanEntity> getArrlistPemasukan() {
        return arrlistPemasukan;
    }    
    
}
