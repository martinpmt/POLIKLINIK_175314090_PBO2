/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author Martin Paramarta
 */
public class AntrianPasien {

    private int tanggalAntrian, bulanAntrian, tahunAntrian;
    private Klinik klinik;
    private ArrayList<Pasien> daftarPasien = new ArrayList<Pasien>();
    public static ArrayList<AntrianPasien> antrianPasien = new ArrayList<AntrianPasien>();

    public int getTanggalAntrian() {
        return tanggalAntrian;
    }

    public void setTanggalAntrian(int tanggalAntrian) {
        this.tanggalAntrian = tanggalAntrian;
    }

    public int getBulanAntrian() {
        return bulanAntrian;
    }

    public void setBulanAntrian(int bulanAntrian) {
        this.bulanAntrian = bulanAntrian;
    }

    public int getTahunAntrian() {
        return tahunAntrian;
    }

    public void setTahunAntrian(int tahunAntrian) {
        this.tahunAntrian = tahunAntrian;
    }

    /**
     * Konstruktor untuk mendeklarasikan objek AntrianPasien
     */
    public AntrianPasien() {

    }

    /**
     * method getKlinik digunakan untuk mengambil nilai dari variabel klinik
     * dengan pengembalian tipe Klinik
     *
     * @return
     */
    public Klinik getKlinik() {
        return klinik;
    }

    /**
     * method setKlinik digunakan untuk mengatur/set nilai dari variabel klinik
     * yang bertipe String
     *
     * @param klinik
     */
    public void setKlinik(Klinik klinik) {
        // variabel klinik sama dengan variabel lokal klinik
        this.klinik = klinik;
    }

    /**
     * method untuk mengambil nilai dari variabel daftarPasien
     *
     * @return
     */
    public ArrayList<Pasien> getDaftarPasien() {
        return daftarPasien;
    }

    /**
     * method setDaftarPasien digunakan untuk mengatur/set nilai dari variabel
     * daftarPasien
     *
     * @param daftarPasien
     */
    public void Mendaftar(Pasien pasien) {
        // mengisi data variabel daftarPasien dengan variabel lokal daftarPasien 
        daftarPasien.add(pasien);
    }

    public void setDaftarPasien(ArrayList<Pasien> daftarPasien) {
        // variabel daftarPasien sama dengan variabel lokal daftarPasien
        this.daftarPasien = daftarPasien;
    }

    /**
     * Method untuk menampilkan tanggal dan waktu antrian
     */
    public static void daftarPasien(Pasien pasien, int tanggal, int bulan, int tahun, Klinik klinik) throws Exception {
        if (cariAntrian(tanggal, bulan, tahun, klinik) == -1) {
            AntrianPasien.antrianPasien.get(cariAntrian(tanggal, bulan, tahun, klinik)).Mendaftar(pasien);
        } else {
            buatAntrian(tanggal, bulan, tahun, klinik);
        }
    }

    public static AntrianPasien cariPasien(String noRM) {
        for (int i = 0; i < antrianPasien.size(); i++) {
            if (antrianPasien.get(i).daftarPasien.equals(noRM)) {
                return antrianPasien.get(i);
            }
        }
        return null;
    }

    public static int cariAntrian(int tanggal, int bulan, int tahun, Klinik klinik) {
        for (int i = 0; i < antrianPasien.size(); i++) {
            if (antrianPasien.get(i).getTanggalAntrian() == tanggal) {
                if (antrianPasien.get(i).getBulanAntrian() == bulan) {
                    if (antrianPasien.get(i).getTahunAntrian() == tahun) {
                        if (antrianPasien.get(i).getKlinik().getIdKlinik().equalsIgnoreCase(klinik.getIdKlinik())) {
                            return i;
                        }
                    }
                }
            }
        }
        return -1;
    }

    public static void buatAntrian(int tanggal, int bulan, int tahun, Klinik klinik) throws Exception {
        AntrianPasien antrian = new AntrianPasien();
        antrian.setTanggalAntrian(tanggal);
        antrian.setBulanAntrian(bulan);
        antrian.setTahunAntrian(tahun);
        antrian.setKlinik(klinik);
        if (cariAntrian(tanggal, bulan, tahun, klinik) == -1) {
            antrianPasien.add(antrian);
        } else {
            throw new Exception("Data sudah terdaftar");
        }
    }

    public void printInfo() {
        System.out.println("");
        System.out.printf("%-20s", "");
        System.out.println("Daftar Antrian Pasien" + "\n");
        for (int i = 0; i < daftarPasien.size(); i++) {
            daftarPasien.get(i).printInfo(); //mengeprint data pasien setiap index
        }
    }

}
