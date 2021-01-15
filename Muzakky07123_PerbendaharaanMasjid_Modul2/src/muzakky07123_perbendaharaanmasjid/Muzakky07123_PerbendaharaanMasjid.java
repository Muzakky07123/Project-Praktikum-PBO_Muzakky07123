package muzakky07123_perbendaharaanmasjid;

import Entity.Muzakky07123_PemasukanEntity;
import Entity.Muzakky07123_PengeluaranEntity;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Date;

public class Muzakky07123_PerbendaharaanMasjid {
    
    static Scanner input = new Scanner(System.in);
    static ArrayList <Muzakky07123_PemasukanEntity> datapemasukan = new ArrayList();
    static ArrayList <Muzakky07123_PengeluaranEntity> datapengeluaran = new ArrayList();
   
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
        datapemasukan.add(new Muzakky07123_PemasukanEntity(bulan1,jumat1,jumat2,jumat3,jumat4,jumat5,hijau,tpa,lainlain,
                                                            jumlah1,tglData,personData));
    }
    
    static void createPengeluaran() {
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
        datapengeluaran.add(new Muzakky07123_PengeluaranEntity(bulan2,ibadah,kitab,tpa,kaddrah,kebersihan,listrik,air,
                                                                sarana,konsumsi,iventaris,lainlain,jumlah2,tglData,personData));
    }
    
    static void viewPemasukan(String bulan1) {
            System.out.println("<==Hasil Data Pemasukan==>");
        for(int a=0; a<datapemasukan.size(); a++) {
            if(bulan1.equals(datapemasukan.get(a).getBulan1())) {
                System.out.println("1. Infaq Kotak Jumat I :" + datapemasukan.get(a).getJumat1());
                System.out.println("2. Infaq Kotak Jumat II :" + datapemasukan.get(a).getJumat2());
                System.out.println("3. Infaq Kotak Jumat III :" + datapemasukan.get(a).getJumat3());
                System.out.println("4. Infaq Kotak Jumat IV :" + datapemasukan.get(a).getJumat4());
                System.out.println("5. Infaq Kotak Jumat V :" + datapemasukan.get(a).getJumat5());
                System.out.println("6. Infaq Kotak Hijau :" + datapemasukan.get(a).getHijau());
                System.out.println("7. Infaq TPA :" + datapemasukan.get(a).getTpa());
                System.out.println("8. Lain-Lain :" + datapemasukan.get(a).getLainlain());
                System.out.println("Total = " + datapemasukan.get(a).getJumlah1());
                System.out.println("Tanggal Perhitungan Pemasukan = " + new SimpleDateFormat("dd-MM-yyyy").format(datapemasukan.get(a).getTglData()));
                System.out.println("PenanggungJawab Pemasukan = " + datapemasukan.get(a).getPersonData());
            }
        }
    }
    
    static void viewPengeluaran(String bulan2) {
            System.out.println("<==Hasil Data Pengeluaran==>");
        for(int b=0; b<datapengeluaran.size(); b++) {
            if(bulan2.equals(datapengeluaran.get(b).getBulan2())) {
                System.out.println("1. Kegiatan Ibadah : " + datapengeluaran.get(b).getIbadah());
                System.out.println("2. Kegiatan Pengajian Kitab : " + datapengeluaran.get(b).getKitab());
                System.out.println("3. Kegiatan TPA : " + datapengeluaran.get(b).getTpa());
                System.out.println("4. Kegiatan Kaderisasi/Hadrah : " + datapengeluaran.get(b).getKaddrah());
                System.out.println("5. Kegiatan Kebersihan : " + datapengeluaran.get(b).getKebersihan());
                System.out.println("6. Listrik PLN : " + datapengeluaran.get(b).getListrik());
                System.out.println("7. Air PDAM : " + datapengeluaran.get(b).getAir());
                System.out.println("8. Pemeliharaan Sarana : " + datapengeluaran.get(b).getSarana());
                System.out.println("9. Konsumsi : " + datapengeluaran.get(b).getKonsumsi());
                System.out.println("10. Iventaris : " + datapengeluaran.get(b).getIventaris());
                System.out.println("11. Lain-Lain : " + datapengeluaran.get(b).getLainlain());
                System.out.println("Total = " + datapengeluaran.get(b).getJumlah2());
                System.out.println("Tanggal Perhitungan Pengeluaran = " + new SimpleDateFormat("dd-MM-yyyy").format(datapengeluaran.get(b).getTglData()));
                System.out.println("PenanggungJawab Pemasukan = " + datapengeluaran.get(b).getPersonData());
            }
        }
    }
    
    static void saldo (String bulan3, String bulan4) {
        if (datapengeluaran.size() == 0)  {
            for(int a=0; a<datapemasukan.size(); a++) {
                if(bulan3.equals(datapemasukan.get(a).getBulan1())) {
            System.out.println("Hasil Saldo = " + datapemasukan.get(a).getJumlah1());
            }
            }
            }
        
        else {
            for(int a=0; a<datapemasukan.size(); a++) {
            for(int b=0; b<datapengeluaran.size(); b++) {
                    if(bulan3.equals(datapemasukan.get(a).getBulan1()) && bulan4.equals(datapengeluaran.get(b).getBulan2())) {
                        int hasil = datapemasukan.get(a).getJumlah1() - datapengeluaran.get(b).getJumlah2();
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
        for(int c=0; c<datapemasukan.size(); c++) {
            if(bulan5.equals(datapemasukan.get(c).getBulan1())) {
        System.out.print("Infaq Kotak Jumat I : ");
        int jumat10 = input.nextInt();
        datapemasukan.get(c).setJumat1(jumat10);
        System.out.print("Infaq Kotak Jumat II : ");
        int jumat20 = input.nextInt();
        datapemasukan.get(c).setJumat2(jumat20);
        System.out.print("Infaq Kotak Jumat III : ");
        int jumat30 = input.nextInt();
        datapemasukan.get(c).setJumat3(jumat30);
        System.out.print("Infaq Kotak Jumat IV : ");
        int jumat40 = input.nextInt();
        datapemasukan.get(c).setJumat4(jumat40);
        System.out.print("Infaq Kotak Jumat V : ");
        int jumat50 = input.nextInt();
        datapemasukan.get(c).setJumat5(jumat50);
        System.out.print("Infaq Kotak Hijau : ");
        int hijau0 = input.nextInt();
        datapemasukan.get(c).setHijau(hijau0);
        System.out.print("Infaq TPA : ");
        int tpa0 = input.nextInt();
        datapemasukan.get(c).setTpa(tpa0);
        System.out.print("Lain-Lain : ");
        int lainlain0 = input.nextInt();
        datapemasukan.get(c).setLainlain(lainlain0);
        int jumlah10 = jumat10 + jumat20 + jumat30 + jumat40 + jumat50 + hijau0 + tpa0 + lainlain0;
        datapemasukan.get(c).setJumlah1(jumlah10);
        System.out.print(">Tanggal Perhitungan Pemasukan \n format (mm/dd/yyyy) : ");
        Date tglData0 = new Date(input.next());
        datapemasukan.get(c).setTglData(tglData0);
        System.out.print(">PenanggungJawab Pemasukan : ");
        String personData0 = input.next();
        datapemasukan.get(c).setPersonData(personData0);
        
                System.out.println("# Semua Data Pemasukan Bulan " + bulan5 + " Telah Diperbarui");
            }
            }
                break;
            case 2:
                System.out.println("<--Memperbarui Data Rekam Pengeluaran-->");
        for(int d=0; d<datapengeluaran.size(); d++) {
            if(bulan5.equals(datapengeluaran.get(d).getBulan2())) {
        System.out.print("Kegiatan Ibadah : ");
        int ibadah0 = input.nextInt();
        datapengeluaran.get(d).setIbadah(ibadah0);
        System.out.print("Kegiatan Pengajian Kitab : ");
        int kitab0 = input.nextInt();
        datapengeluaran.get(d).setKitab(ibadah0);
        System.out.print("Kegiatan TPA : ");
        int tpa0 = input.nextInt();
        datapengeluaran.get(d).setTpa(tpa0);
        System.out.print("Kegiatan Kaderisasi/Hadrah : ");
        int kaddrah0 = input.nextInt();
        datapengeluaran.get(d).setKaddrah(kaddrah0);
        System.out.print("Kebersihan : ");
        int kebersihan0 = input.nextInt();
        datapengeluaran.get(d).setKebersihan(ibadah0);
        System.out.print("Listrik PLN : ");
        int listrik0 = input.nextInt();
        datapengeluaran.get(d).setListrik(listrik0);
        System.out.print("Air PDAM : ");
        int air0 = input.nextInt();
        datapengeluaran.get(d).setAir(air0);
        System.out.print("Pemeliharaan Sarana : ");
        int sarana0 = input.nextInt();
        datapengeluaran.get(d).setSarana(sarana0);
        System.out.print("Konsumsi : ");
        int konsumsi0 = input.nextInt();
        datapengeluaran.get(d).setKonsumsi(konsumsi0);
        System.out.print("Iventaris : ");
        int iventaris0 = input.nextInt();
        datapengeluaran.get(d).setIventaris(iventaris0);
        System.out.print("Lain-Lain : ");
        int lainlain0 = input.nextInt();
        datapengeluaran.get(d).setLainlain(lainlain0);
        int jumlah20 = ibadah0 + kitab0 + tpa0 + kaddrah0 + kebersihan0 + listrik0 + air0 + sarana0 + konsumsi0 +
                        iventaris0 + lainlain0;
        datapengeluaran.get(d).setJumlah2(jumlah20);
        System.out.print(">Tanggal Perhitungan Pengeluaran \n format (mm/dd/yyyy) : ");
        Date tglData0 = new Date(input.next());
        datapengeluaran.get(d).setTglData(tglData0);
        System.out.print(">PenanggungJawab Pemasukan : ");
        String personData0 = input.next();
        datapengeluaran.get(d).setPersonData(personData0);
        
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
                for(int e=0; e<datapemasukan.size(); e++) {
                    if(bulan6.equals(datapemasukan.get(e).getBulan1())) {
                        datapemasukan.remove(datapemasukan.get(e));
            System.out.println("# Semua Data Pemasukan Bulan " + bulan6 + " Telah Terhapus");
                    }
                }
                break;
            case 2:
                for(int f=0; f<datapengeluaran.size(); f++) {
                    if(bulan6.equals(datapengeluaran.get(f).getBulan2())) {
                        datapengeluaran.remove(datapengeluaran.get(f));
            System.out.println("# Semua Data Pengeluaran Bulan " + bulan6 + " Telah Terhapus");
                    }
                }
        }
    }
    
}