package muzakky07123_perbendaharaanmasjid;

import Controller.*;
import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.util.Date;

public class Muzakky07123_PerbendaharaanMasjid {
    
    private static Scanner input = new Scanner(System.in);
    private static Muzakky07123_PemasukanController pemasukanController = new Muzakky07123_PemasukanController();
    private static Muzakky07123_PengeluaranController pengeluaranController = new Muzakky07123_PengeluaranController();
    
    public static void main(String[] args) {
        System.out.println("Sistem Perbendaharaan Masjid ROCHMAN ARIEF");
        System.out.println("Perekaman Pemasukan-Pengeluaran Keuangan Masjid");
    
        int pilih;
        do {
            System.out.println();
            System.out.println("1. REKAM PEMASUKAN");
            System.out.println("2. REKAM PENGELUARAN");
            System.out.println("3. LIHAT PEMASUKAN");
            System.out.println("4. LIHAT PENGELUARAN");
            System.out.println("5. SALDO");
            System.out.println("6. UPDATE");
            System.out.println("7. Delete");
            System.out.println("8. EXIT");
            System.out.print("Masukan Pilihan : ");
            pilih = input.nextInt();
            System.out.println();
            switch(pilih) {
                case 1:
                    createPemasukan();
                    break;
                case 2:
                    createPengeluaran();
                    break;
                case 3:
                    System.out.print("Bulan = ");
                    String bulan1 = input.next();
                    viewPemasukan(bulan1);
                    break;
                case 4:
                    System.out.print("Bulan = ");
                    String bulan2 = input.next();
                    viewPengeluaran(bulan2);
                    break;
                case 5:
                    System.out.print("Bulan Pemasukan = ");
                    String bulan3 = input.next();
                    System.out.print("Bulan Pengeluaran = ");
                    String bulan4 = input.next();
                    saldo(bulan3,bulan4);
                    break;
                case 6:
                    System.out.print("Bulan = ");
                    String bulan5 = input.next();
                    update(bulan5);
                    break;
                case 7:
                    System.out.print("Bulan = ");
                    String bulan6 = input.next();
                    delete(bulan6);
                    break;
            }   
        } while(pilih<=7);
    }
    
    static void createPemasukan() {
    try {
            System.out.println("<==Rekam Data Pemasukan==>");
        System.out.print("Bulan = ");
        String bulan1 = input.next();
        System.out.print("Infaq Kotak Jumat I : ");
        int jumat1 = input.nextInt();
        System.out.print("Infaq Kotak Jumat II : ");
        int jumat2 = input.nextInt();
        System.out.print("Infaq Kotak Jumat III : ");
        int jumat3 = input.nextInt();
        System.out.print("Infaq Kotak Jumat IV : ");
        int jumat4 = input.nextInt();
        System.out.print("Infaq Kotak Jumat V : ");
        int jumat5 = input.nextInt();
        System.out.print("Infaq Kotak Hijau : ");
        int hijau = input.nextInt();
        System.out.print("Infaq TPA : ");
        int tpa = input.nextInt();
        System.out.print("Lain-Lain : ");
        int lainlain = input.nextInt();
        int jumlah1 = jumat1 + jumat2 + jumat3 + jumat4 + jumat5 + hijau + tpa + lainlain;
        System.out.print(">Tanggal Perhitungan Pemasukan \n format (mm/dd/yyyy) : ");
        Date tglData = new Date(input.next());
        System.out.print(">PenanggungJawab Pemasukan : ");
        String personData = input.next();
        pemasukanController.insertPemasukan(bulan1,jumat1,jumat2,jumat3,jumat4,jumat5,hijau,tpa,lainlain,jumlah1,
                                            tglData,personData);
    }
    catch (Exception e1) {
        System.out.println("\n# Format yang Anda Masukkan Salah !"
                           + "\n# Mohon Masukkan Kembali Data Pemasukan dengan Benar ! \n");
        String improv1 = input.next();
        createPemasukan();
    }
    }
    
    static void createPengeluaran() {
    try {
            System.out.println("<==Rekam Data Pengeluaran==>");
        System.out.print("Bulan = ");
        String bulan2 = input.next();
        System.out.print("Kegiatan Ibadah : ");
        int ibadah = input.nextInt();
        System.out.print("Kegiatan Pengajian Kitab : ");
        int kitab = input.nextInt();
        System.out.print("Kegiatan TPA : ");
        int tpa = input.nextInt();
        System.out.print("Kegiatan Kaderisasi/Hadrah : ");
        int kaddrah = input.nextInt();
        System.out.print("Kebersihan : ");
        int kebersihan = input.nextInt();
        System.out.print("Listrik PLN : ");
        int listrik = input.nextInt();
        System.out.print("Air PDAM : ");
        int air = input.nextInt();
        System.out.print("Pemeliharaan Sarana : ");
        int sarana = input.nextInt();
        System.out.print("Konsumsi : ");
        int konsumsi = input.nextInt();
        System.out.print("Iventaris : ");
        int iventaris = input.nextInt();
        System.out.print("Lain-Lain : ");
        int lainlain = input.nextInt();
        int jumlah2 = ibadah + kitab + tpa + kaddrah + kebersihan + listrik + air + sarana + konsumsi + iventaris + lainlain;
        System.out.print(">Tanggal Perhitungan Pengeluaran \n format (mm/dd/yyyy) : ");
        Date tglData = new Date(input.next());
        System.out.print(">PenanggungJawab Pengeluaran : ");
        String personData = input.next();
        pengeluaranController.insertPengeluaran(bulan2,ibadah,kitab,tpa,kaddrah,kebersihan,listrik,air,
                                                                sarana,konsumsi,iventaris,lainlain,jumlah2,tglData,personData);
    }
    catch (Exception e2) {
        System.out.println("\n# Format yang Anda Masukkan Salah !"
                           + "\n# Mohon Masukkan Kembali Data Pengeluaran dengan Benar ! \n");
        String improv2 = input.next();
        createPengeluaran();
    }
    }
    
    static void viewPemasukan(String bulan1) {
        
            System.out.println("<==Hasil Data Pemasukan==>");
        for(int a=0; a<pemasukanController.getPemasukan().size(); a++) {
            if(bulan1.equals(pemasukanController.getPemasukan().get(a).getBulan1())) {
                System.out.println("1. Infaq Kotak Jumat I :" + pemasukanController.getPemasukan().get(a).getJumat1());
                System.out.println("2. Infaq Kotak Jumat II :" + pemasukanController.getPemasukan().get(a).getJumat2());
                System.out.println("3. Infaq Kotak Jumat III :" + pemasukanController.getPemasukan().get(a).getJumat3());
                System.out.println("4. Infaq Kotak Jumat IV :" + pemasukanController.getPemasukan().get(a).getJumat4());
                System.out.println("5. Infaq Kotak Jumat V :" + pemasukanController.getPemasukan().get(a).getJumat5());
                System.out.println("6. Infaq Kotak Hijau :" + pemasukanController.getPemasukan().get(a).getHijau());
                System.out.println("7. Infaq TPA :" + pemasukanController.getPemasukan().get(a).getTpa());
                System.out.println("8. Lain-Lain :" + pemasukanController.getPemasukan().get(a).getLainlain());
                System.out.println("Total = " + pemasukanController.getPemasukan().get(a).getJumlah1());
                System.out.println("Tanggal Perhitungan Pemasukan = " + new SimpleDateFormat("dd-MM-yyyy").format(pemasukanController.getPemasukan().get(a).getTglData()));
                System.out.println("PenanggungJawab Pemasukan = " + pemasukanController.getPemasukan().get(a).getPersonData());
            }    
        } 
    }
    
    static void viewPengeluaran(String bulan2) {
            System.out.println("<==Hasil Data Pengeluaran==>");
        for(int b=0; b<pengeluaranController.getPengeluaran().size(); b++) {
            if(bulan2.equals(pengeluaranController.getPengeluaran().get(b).getBulan2())) {
                System.out.println("1. Kegiatan Ibadah : " + pengeluaranController.getPengeluaran().get(b).getIbadah());
                System.out.println("2. Kegiatan Pengajian Kitab : " + pengeluaranController.getPengeluaran().get(b).getKitab());
                System.out.println("3. Kegiatan TPA : " + pengeluaranController.getPengeluaran().get(b).getTpa());
                System.out.println("4. Kegiatan Kaderisasi/Hadrah : " + pengeluaranController.getPengeluaran().get(b).getKaddrah());
                System.out.println("5. Kegiatan Kebersihan : " + pengeluaranController.getPengeluaran().get(b).getKebersihan());
                System.out.println("6. Listrik PLN : " + pengeluaranController.getPengeluaran().get(b).getListrik());
                System.out.println("7. Air PDAM : " + pengeluaranController.getPengeluaran().get(b).getAir());
                System.out.println("8. Pemeliharaan Sarana : " + pengeluaranController.getPengeluaran().get(b).getSarana());
                System.out.println("9. Konsumsi : " + pengeluaranController.getPengeluaran().get(b).getKonsumsi());
                System.out.println("10. Iventaris : " + pengeluaranController.getPengeluaran().get(b).getIventaris());
                System.out.println("11. Lain-Lain : " + pengeluaranController.getPengeluaran().get(b).getLainlain());
                System.out.println("Total = " + pengeluaranController.getPengeluaran().get(b).getJumlah2());
                System.out.println("Tanggal Perhitungan Pengeluaran = " + new SimpleDateFormat("dd-MM-yyyy").format(pengeluaranController.getPengeluaran().get(b).getTglData()));
                System.out.println("PenanggungJawab Pemasukan = " + pengeluaranController.getPengeluaran().get(b).getPersonData());
            }
        }
    }
    
    static void saldo (String bulan3, String bulan4) {
        if (pengeluaranController.getPengeluaran().size() == 0)  {
            for(int a=0; a<pemasukanController.getPemasukan().size(); a++) {
                if(bulan3.equals(pemasukanController.getPemasukan().get(a).getBulan1())) {
            System.out.println("Hasil Saldo = " + pemasukanController.getPemasukan().get(a).getJumlah1());
            }
            }
            }
        
        else {
            for(int a=0; a<pemasukanController.getPemasukan().size(); a++) {
            for(int b=0; b<pengeluaranController.getPengeluaran().size(); b++) {
                    if(bulan3.equals(pemasukanController.getPemasukan().get(a).getBulan1()) && bulan4.equals(pengeluaranController.getPengeluaran().get(b).getBulan2())) {
                        int hasil = pemasukanController.getPemasukan().get(a).getJumlah1() - pengeluaranController.getPengeluaran().get(b).getJumlah2();
                        System.out.println("Hasil Saldo = " + hasil);
                    }
                }
            }
        }
    }
    
    static void update(String bulan5) {
        System.out.println("1. Perbarui Data Pemasukan");
        System.out.println("2. Perbarui Data Pengeluaran");
        System.out.print("Pilih : ");
        int plhup = input.nextInt();
        
        switch (plhup) {        
            case 1:
                System.out.println("<--Memperbarui Data Rekam Pemasukan-->");
        for(int c=0; c<pemasukanController.getPemasukan().size(); c++) {
            if(bulan5.equals(pemasukanController.getPemasukan().get(c).getBulan1())) {
        System.out.print("Infaq Kotak Jumat I : ");
        int jumat10 = input.nextInt();
        pemasukanController.getPemasukan().get(c).setJumat1(jumat10);
        System.out.print("Infaq Kotak Jumat II : ");
        int jumat20 = input.nextInt();
        pemasukanController.getPemasukan().get(c).setJumat2(jumat20);
        System.out.print("Infaq Kotak Jumat III : ");
        int jumat30 = input.nextInt();
        pemasukanController.getPemasukan().get(c).setJumat3(jumat30);
        System.out.print("Infaq Kotak Jumat IV : ");
        int jumat40 = input.nextInt();
        pemasukanController.getPemasukan().get(c).setJumat4(jumat40);
        System.out.print("Infaq Kotak Jumat V : ");
        int jumat50 = input.nextInt();
        pemasukanController.getPemasukan().get(c).setJumat5(jumat50);
        System.out.print("Infaq Kotak Hijau : ");
        int hijau0 = input.nextInt();
        pemasukanController.getPemasukan().get(c).setHijau(hijau0);
        System.out.print("Infaq TPA : ");
        int tpa0 = input.nextInt();
        pemasukanController.getPemasukan().get(c).setTpa(tpa0);
        System.out.print("Lain-Lain : ");
        int lainlain0 = input.nextInt();
        pemasukanController.getPemasukan().get(c).setLainlain(lainlain0);
        int jumlah10 = jumat10 + jumat20 + jumat30 + jumat40 + jumat50 + hijau0 + tpa0 + lainlain0;
        pemasukanController.getPemasukan().get(c).setJumlah1(jumlah10);
        System.out.print(">Tanggal Perhitungan Pemasukan \n format (mm/dd/yyyy) : ");
        Date tglData0 = new Date(input.next());
        pemasukanController.getPemasukan().get(c).setTglData(tglData0);
        System.out.print(">PenanggungJawab Pemasukan : ");
        String personData0 = input.next();
        pemasukanController.getPemasukan().get(c).setPersonData(personData0);
        
                System.out.println("# Semua Data Pemasukan Bulan " + bulan5 + " Telah Diperbarui");
            }
            }
                break;
            case 2:
                System.out.println("<--Memperbarui Data Rekam Pengeluaran-->");
        for(int d=0; d<pengeluaranController.getPengeluaran().size(); d++) {
            if(bulan5.equals(pengeluaranController.getPengeluaran().get(d).getBulan2())) {
        System.out.print("Kegiatan Ibadah : ");
        int ibadah0 = input.nextInt();
        pengeluaranController.getPengeluaran().get(d).setIbadah(ibadah0);
        System.out.print("Kegiatan Pengajian Kitab : ");
        int kitab0 = input.nextInt();
        pengeluaranController.getPengeluaran().get(d).setKitab(ibadah0);
        System.out.print("Kegiatan TPA : ");
        int tpa0 = input.nextInt();
        pengeluaranController.getPengeluaran().get(d).setTpa(tpa0);
        System.out.print("Kegiatan Kaderisasi/Hadrah : ");
        int kaddrah0 = input.nextInt();
        pengeluaranController.getPengeluaran().get(d).setKaddrah(kaddrah0);
        System.out.print("Kebersihan : ");
        int kebersihan0 = input.nextInt();
        pengeluaranController.getPengeluaran().get(d).setKebersihan(ibadah0);
        System.out.print("Listrik PLN : ");
        int listrik0 = input.nextInt();
        pengeluaranController.getPengeluaran().get(d).setListrik(listrik0);
        System.out.print("Air PDAM : ");
        int air0 = input.nextInt();
        pengeluaranController.getPengeluaran().get(d).setAir(air0);
        System.out.print("Pemeliharaan Sarana : ");
        int sarana0 = input.nextInt();
        pengeluaranController.getPengeluaran().get(d).setSarana(sarana0);
        System.out.print("Konsumsi : ");
        int konsumsi0 = input.nextInt();
        pengeluaranController.getPengeluaran().get(d).setKonsumsi(konsumsi0);
        System.out.print("Iventaris : ");
        int iventaris0 = input.nextInt();
        pengeluaranController.getPengeluaran().get(d).setIventaris(iventaris0);
        System.out.print("Lain-Lain : ");
        int lainlain0 = input.nextInt();
        pengeluaranController.getPengeluaran().get(d).setLainlain(lainlain0);
        int jumlah20 = ibadah0 + kitab0 + tpa0 + kaddrah0 + kebersihan0 + listrik0 + air0 + sarana0 + konsumsi0 +
                        iventaris0 + lainlain0;
        pengeluaranController.getPengeluaran().get(d).setJumlah2(jumlah20);
        System.out.print(">Tanggal Perhitungan Pengeluaran \n format (mm/dd/yyyy) : ");
        Date tglData0 = new Date(input.next());
        pengeluaranController.getPengeluaran().get(d).setTglData(tglData0);
        System.out.print(">PenanggungJawab Pemasukan : ");
        String personData0 = input.next();
        pengeluaranController.getPengeluaran().get(d).setPersonData(personData0);
        
                System.out.println("# Semua Data Pemasukan Bulan " + bulan5 + " Telah Diperbarui");
            }
        }
                break;
            }
        }
        

    
    
    static void delete(String bulan6) {
        System.out.println("1. Hapus Data Pemasukan");
        System.out.println("2. Hapus Data Pengeluaran");
        System.out.print("Pilih : ");
        int plhdel = input.nextInt();
        switch (plhdel) {
            case 1:
                for(int e=0; e<pemasukanController.getPemasukan().size(); e++) {
                    if(bulan6.equals(pemasukanController.getPemasukan().get(e).getBulan1())) {
                        pemasukanController.getPemasukan().remove(pemasukanController.getPemasukan().get(e));
            System.out.println("# Semua Data Pemasukan Bulan " + bulan6 + " Telah Terhapus");
                    }
                }
                break;
            case 2:
                for(int f=0; f<pengeluaranController.getPengeluaran().size(); f++) {
                    if(bulan6.equals(pengeluaranController.getPengeluaran().get(f).getBulan2())) {
                        pengeluaranController.getPengeluaran().remove(pengeluaranController.getPengeluaran().get(f));
            System.out.println("# Semua Data Pengeluaran Bulan " + bulan6 + " Telah Terhapus");
                    }
                }
        }
    }
    
}