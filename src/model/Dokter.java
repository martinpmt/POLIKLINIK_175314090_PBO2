/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Martin Paramarta
 */
public class Dokter {

    private String noPegawai;
    private String nama;
    private String alamat;
    private String tempatLahir;
    private int tanggalLahir;
    private int bulanLahir;
    private int tahunLahir;

    /**
     * Konstruktor untuk mendeklarasikan objek Dokter
     */
    public Dokter() {

    }

    /**
     * konstruktor untuk mendeklarasikan objek Dokter dengan parameter nama yang
     * bertipe String
     *
     * @param nama
     */
    public Dokter(String nama) {
        // pernyataan bahwa variabel nama sama dengan variabel lokal nama
        this.nama = nama;
    }

    /**
     * method getNoPegawai digunakan untuk mengambil nilai dari variabel
     * noPegawai dengan pengembalian tipe String
     *
     * @return
     */
    public String getNomorPegawai() {
        String noPegawai = (this.noPegawai + nama.substring(0, 3));
        return noPegawai;
    }

    /**
     * method setNoPegawai digunakan untuk mengatur/set nilai dari variabel
     * noPegawai yang bertipe String
     *
     * @param noPegawai
     * @throws Exception
     */
    public void setNoPegawai(String noPegawai) throws Exception {
        // pengecekan panjang karakter variabel noPegawai harus 6-20 karakter
        if (noPegawai.length() >= 6 && noPegawai.length() <= 20) {
            // pernyataan bahwa variabel noPegawai sama dengan variabel lokal noPegawai
            this.noPegawai = noPegawai;
        } else {
            // pernyataan apabila isi dari variabel noPegawai salah
            throw new Exception("No Pegawai Salah");
        }
    }

    /**
     * method getNama digunakan untuk mengambil nilai dari variabel nama dengan
     * pengembalian tipe String
     *
     * @return
     */
    public String getNama() {
        return nama;
    }

    /**
     * method setNama digunakan untuk mengatur/set nilai dari variabel nama yang
     * bertipe String
     *
     * @param nama
     */
    public void setNama(String nama) {
        this.nama = nama;
    }

    /**
     * method getAlamat digunakan untuk mengambil nilai dari variabel alamat
     * dengan pengembalian tipe String
     *
     * @return
     */
    public String getAlamat() {
        return alamat;
    }

    /**
     * method setAlamat digunakan untuk mengatur/set nilai dari variabel alamat
     * yang bertipe String
     *
     * @param alamat
     */
    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    /**
     * method getTempatLahir digunakan untuk mengambil nilai dari variabel
     * tempatLahir dengan pengembalian tipe String
     *
     * @return
     */
    public String getTempatLahir() {
        return tempatLahir;
    }

    /**
     * method setTempatLahir digunakan untuk mengatur/set nilai dari variabel
     * tempatLahir yang bertipe String
     *
     * @param tempatLahir
     */
    public void setTempatLahir(String tempatLahir) {
        this.tempatLahir = tempatLahir;
    }

    /**
     * method getTanggalLahir digunakan untuk mengambil nilai dari variabel
     * tanggalLahir dengan pengembalian tipe String
     *
     * @return
     */
    public int getTanggalLahir() {
        return tanggalLahir;
    }

    /**
     *
     * @param tanggalLahir
     * @throws Exception
     */
    public void setTanggalLahir(int tanggalLahir) throws Exception {
        // pengecekan isi dari variabel tanggalLahir harus lebih dari 0
        if (tanggalLahir > 0) {
            // pengecekan isi dari variabel tanggalLahir harus kurang dari 32
            if (tanggalLahir < 32) {
                this.tanggalLahir = tanggalLahir;
            } else {
                // pernyataan apabila isi dari variabel tanggalLahir lebih dari 31
                throw new Exception("Tanggal Salah ===> Lebih dari 31");
            }
        } else {
            // pernyataan apabila isi dari variabel tanggalLahir kurang dari atau sama dengan 0
            throw new Exception("Tanggal Salah ===> Kurang dari atau sama dengan 0");
        }
    }

    /**
     * method getBulanLahir digunakan untuk mengambil nilai dari variabel
     * bulanLahir dengan pengembalian tipe int
     *
     * @return
     */
    public int getBulanLahir() {
        return bulanLahir;
    }

    /**
     * method setBulanLahir digunakan untuk mengatur/set nilai dari variabel
     * bulanLahir yang bertipe int
     *
     * @param bulanLahir
     * @throws Exception
     */
    public void setBulanLahir(int bulanLahir) throws Exception {
        // pengecekan isi dari variabel bulanLahir harus lebih dari 0
        if (bulanLahir > 0) {
            // pengecekan isi dari variabel bulanLahir harus kurang dari 13
            if (bulanLahir < 13) {
                this.bulanLahir = bulanLahir;
            } else {
                // pernyataan apabila isi dari variabel bulanLahir lebih dari 12
                throw new Exception("Bulan Salah ===> Lebih dari 12");
            }
        } else {
            // pernyataan apabila isi dari variabel bulanLahir kurang dari atau sama dengan 0
            throw new Exception("Bulan Salah ===> Kurang dari atau sama dengan 0");
        }

    }

    /**
     * method getTanggalLahir digunakan untuk mengambil nilai dari variabel
     * tanggalLahir dengan pengembalian tipe int
     *
     * @return
     */
    public int getTahunLahir() {
        return tahunLahir;
    }

    /**
     * method setTahunLahir digunakan untuk mengatur/set nilai dari variabel
     * tahunLahir yang bertipe int
     *
     * @param tahunLahir
     * @throws Exception
     */
    public void setTahunLahir(int tahunLahir) throws Exception {
        // pengecekan isi dari variabel tahunLahir harus lebih dari 0
        if (tahunLahir > 0) {
            this.tahunLahir = tahunLahir;
        } else {
            // pernyataan apabila isi dari variabel tahunLahir kurang dari atau sama dengan 0
            throw new Exception("Tahun Salah");
        }
    }

    public void getTanggalKelahiranDokter() {
        Date tanggalKelahiran = new Date(getTahunLahir() - 1900, getBulanLahir() - 1, getTanggalLahir());
        SimpleDateFormat ft = new SimpleDateFormat("dd - MM - yyyy");
        System.out.println(ft.format(tanggalKelahiran));

    }

    public void printInfo() {
        System.out.println();
        System.out.printf("%-20s", "");
        System.out.println("Biodata Dokter" + "\n");
        System.out.printf("%-25s", "Nomor Pegawai");
        System.out.println(": " + getNomorPegawai());
        System.out.printf("%-25s", "Nama");
        System.out.println(": " + getNama());
        System.out.printf("%-25s", "Alamat");
        System.out.println(": " + getAlamat());
        System.out.printf("%-25s", "Tempat, Tanggal Lahir");
        System.out.print(": " + getTempatLahir() + ", ");
        getTanggalKelahiranDokter();
    }

}
