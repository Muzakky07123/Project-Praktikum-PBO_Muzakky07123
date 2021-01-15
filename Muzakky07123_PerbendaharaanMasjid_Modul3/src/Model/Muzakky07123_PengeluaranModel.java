package Model;

import Entity.*;
import java.util.ArrayList;

public class Muzakky07123_PengeluaranModel {
    private ArrayList<Muzakky07123_PengeluaranEntity> arrlistPengeluaran;
    
    public Muzakky07123_PengeluaranModel() {
        this.arrlistPengeluaran = new ArrayList<>();
    }
    
    public void insertPengeluaran(Muzakky07123_PengeluaranEntity pengeluaranEntity) {
        arrlistPengeluaran.add(pengeluaranEntity);
    }

    public ArrayList<Muzakky07123_PengeluaranEntity> getArrlistPengeluaran() {
        return arrlistPengeluaran;
    }
}
