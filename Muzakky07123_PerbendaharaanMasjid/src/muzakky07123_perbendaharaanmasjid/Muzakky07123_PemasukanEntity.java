package muzakky07123_perbendaharaanmasjid;

public class Muzakky07123_PemasukanEntity {
    String bulan1;
    int jumat1,jumat2,jumat3, jumat4, jumat5, hijau, tpa, lainlain, jumlah1;

    public Muzakky07123_PemasukanEntity(String bulan1, int jumat1, int jumat2, int jumat3, int jumat4, int jumat5, 
                                        int hijau, int tpa, int lainlain, int jumlah1) {
        this.bulan1 = bulan1;
        this.jumat1 = jumat1;
        this.jumat2 = jumat2;
        this.jumat3 = jumat3;
        this.jumat4 = jumat4;
        this.jumat5 = jumat5;
        this.hijau = hijau;
        this.tpa = tpa;
        this.lainlain = lainlain;
        this.jumlah1 = jumlah1;
    }

    public String getBulan1() {
        return bulan1;
    }
    
    public int getJumat1() {
        return jumat1;
    }

    public int getJumat2() {
        return jumat2;
    }

    public int getJumat3() {
        return jumat3;
    }

    public int getJumat4() {
        return jumat4;
    }

    public int getJumat5() {
        return jumat5;
    }

    public int getHijau() {
        return hijau;
    }

    public int getTpa() {
        return tpa;
    }

    public int getLainlain() {
        return lainlain;
    }

    public int getJumlah1() {
        return jumlah1;
    }

}