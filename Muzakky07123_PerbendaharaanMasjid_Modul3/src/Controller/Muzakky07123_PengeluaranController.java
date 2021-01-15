package Controller;

import Entity.*;
import java.util.ArrayList;
import java.util.Date;

public class Muzakky07123_PengeluaranController {
    
    public Muzakky07123_PengeluaranController() {
    }
    
    public void insertPengeluaran(String bulan2, int ibadah, int kitab, int tpa, int kaddrah, int kebersihan, int listrik,
                                  int air, int sarana, int konsumsi, int iventaris, int lainlain, int jumlah2, Date tglData,
                                  String personData) {
        Muzakky07123_Object2ModelinController.pengeluaranModel.insertPengeluaran(new Muzakky07123_PengeluaranEntity
                                                                                (bulan2,ibadah,kitab,tpa,kaddrah,
                                                                                kebersihan,listrik,air,sarana,konsumsi,
                                                                                iventaris,lainlain,jumlah2,tglData,
                                                                                personData));
    }
    
    public ArrayList<Muzakky07123_PengeluaranEntity> getPengeluaran() {
        return Muzakky07123_Object2ModelinController.pengeluaranModel.getArrlistPengeluaran();
    }
    
}
