package Entity;

import java.util.Date;

public class Muzakky07123_PengeluaranEntity extends Muzakky07123_AdditionalAbstractEntity{
    public String bulan2;
    private int ibadah, kitab, tpa, kaddrah, kebersihan, listrik, air, sarana, konsumsi, iventaris, lainlain, jumlah2;

    public Muzakky07123_PengeluaranEntity(String bulan2, int ibadah, int kitab, int tpa, int kaddrah, int kebersihan, 
                                            int listrik, int air, int sarana, int konsumsi, int iventaris, int lainlain, 
                                            int jumlah2, Date tglData, String personData) {
        super(tglData, personData);
        this.bulan2 = bulan2;
        this.ibadah = ibadah;
        this.kitab = kitab;
        this.tpa = tpa;
        this.kaddrah = kaddrah;
        this.kebersihan = kebersihan;
        this.listrik = listrik;
        this.air = air;
        this.sarana = sarana;
        this.konsumsi = konsumsi;
        this.iventaris = iventaris;
        this.lainlain = lainlain;
        this.jumlah2 = jumlah2;
    }

    public String getBulan2() {
        return bulan2;
    }
    
    public int getIbadah() {
        return ibadah;
    }

    public int getKitab() {
        return kitab;
    }

    public int getTpa() {
        return tpa;
    }

    public int getKaddrah() {
        return kaddrah;
    }

    public int getKebersihan() {
        return kebersihan;
    }

    public int getListrik() {
        return listrik;
    }

    public int getAir() {
        return air;
    }

    public int getSarana() {
        return sarana;
    }

    public int getKonsumsi() {
        return konsumsi;
    }

    public int getIventaris() {
        return iventaris;
    }

    public int getLainlain() {
        return lainlain;
    }

    public int getJumlah2() {
        return jumlah2;
    }
    
    @Override
    public Date getTglData() {
        return tglData;
    }

    @Override
    public String getPersonData() {
        return personData;
    }
    
    
    
    public void setIbadah(int ibadah) {
        this.ibadah = ibadah;
    }

    public void setKitab(int kitab) {
        this.kitab = kitab;
    }

    public void setTpa(int tpa) {
        this.tpa = tpa;
    }

    public void setKaddrah(int kaddrah) {
        this.kaddrah = kaddrah;
    }

    public void setKebersihan(int kebersihan) {
        this.kebersihan = kebersihan;
    }

    public void setListrik(int listrik) {
        this.listrik = listrik;
    }

    public void setAir(int air) {
        this.air = air;
    }

    public void setSarana(int sarana) {
        this.sarana = sarana;
    }

    public void setKonsumsi(int konsumsi) {
        this.konsumsi = konsumsi;
    }

    public void setIventaris(int iventaris) {
        this.iventaris = iventaris;
    }

    public void setLainlain(int lainlain) {
        this.lainlain = lainlain;
    }

    public void setJumlah2(int jumlah2) {
        this.jumlah2 = jumlah2;
    }    
    
}