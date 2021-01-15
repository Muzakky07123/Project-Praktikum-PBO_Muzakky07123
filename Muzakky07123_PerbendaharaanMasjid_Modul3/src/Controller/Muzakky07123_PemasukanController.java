package Controller;

import Entity.*;
import java.util.ArrayList;
import java.util.Date;

public class Muzakky07123_PemasukanController {
    
    public Muzakky07123_PemasukanController() {
    }
    
    public void insertPemasukan(String bulan1, int jumat1, int jumat2, int jumat3, int jumat4, int jumat5, int hijau,
                                int tpa, int lainlain, int jumlah1, Date tglData, String personData) {
        Muzakky07123_Object2ModelinController.pemasukanModel.insertPemasukan(new Muzakky07123_PemasukanEntity(bulan1,
                                                                            jumat1,jumat2,jumat3,jumat4,jumat5,hijau,
                                                                            tpa,lainlain,jumlah1,tglData,personData));
    }
    
    public ArrayList<Muzakky07123_PemasukanEntity> getPemasukan() {
        return Muzakky07123_Object2ModelinController.pemasukanModel.getArrlistPemasukan();
    }
    
}
