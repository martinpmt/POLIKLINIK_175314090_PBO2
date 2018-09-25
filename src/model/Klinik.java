/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author jarkom
 */
public class Klinik {

    private String idKlinik, nama;

    /**
     * konstruktor untuk mendeklarasikan objek pasien dengan parameter lokal
     * @param idKlinik
     * @param nama
     */
    public Klinik(String idKlinik, String nama) {
        // pernyataan bahwa variabel idKlinik sama dengan variabel lokal idKlinik
        this.idKlinik = idKlinik;
        // pernyataan bahwa variabel nama sama dengan variabel lokal nama
        this.nama = nama;
    }

    /**
     * method getIdKlinik digunakan untuk mengambil nilai dari variabel idKlinik dengan pengembalian tipe String
     * @return
     */
    public String getIdKlinik() {
        return idKlinik;
    }

    /**
     * method setIdKlinik digunakan untuk mengatur/set nilai dari variabel idKlinik yang bertipe String
     * @param idKlinik
     */
    public void setIdKlinik(String idKlinik) {
        this.idKlinik = idKlinik;
    }

    /**
     * method getNama digunakan untuk mengambil nilai dari variabel nama dengan pengembalian tipe String
     * @return
     */
    public String getNama() {
        return nama;
    }

    /**
     * method setNama digunakan untuk mengatur/set nilai dari variabel nama yang bertipe String
     * @param nama
     */
    public void setNama(String nama) {
        this.nama = nama;
    }

    /**
     * Konstruktor untuk mendeklarasikan objek pasien 
     */
    public Klinik() {
    }
        public void printInfo() {
        System.out.println("");
        System.out.printf("%-20s", "");
        System.out.println("KLINIK " + getNama().toUpperCase() + "\n");
        System.out.printf("%-25s", "Nomor ID Klinik");
        System.out.print(": ");
        System.out.println(getIdKlinik());

    }
}
