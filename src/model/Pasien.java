/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import test17oktober.TestStreaming1;

/**
 *
 * @author Martin Paramarta
 */
public class Pasien {

    private String noRM;
    private String NIK;
    private String nama;
    private String alamat;
    private String tempatLahir;
    private int tanggalLahir;
    private int bulanLahir;
    private int tahunLahir;

    public Pasien(String nama, String alamat, String tempatLahir, int tanggalLahir, int bulanLahir, int tahunLahir, String nik) {
        this.nama = nama;
        this.alamat = alamat;
        this.tempatLahir = tempatLahir;
        this.tanggalLahir = tanggalLahir;
        this.bulanLahir = bulanLahir;
        this.tahunLahir = tahunLahir;
        this.noRM = nik;
    }

    /**
     * konstruktor untuk mendeklarasikan objek pasien
     */
    public Pasien() {

    }

    /**
     * konstruktor untuk mendeklarasikan objek pasien dengan parameter nama yang
     * bertipe String
     *
     * @param nama
     */
    public Pasien(String nama) {
        // pernyataan bahwa variabel nama sama dengan variabel lokal nama
        this.nama = nama;
    }

    /**
     * method getNoRekamMedis digunakan untuk mengambil nilai dari variabel
     * noRekamMedis dengan pengembalian tipe String
     *
     * @return
     */
    public String getNoRM() {
        return noRM;
    }

    /**
     * method setNoRekamMedis digunakan untuk mengatur/set nilai dari variabel
     * noRekamMedis yang bertipe String
     *
     * @param noRekamMedis
     */
    public void setNoRM(String noRM) {
        this.noRM = noRM;
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
     * method setTanggalLahir digunakan untuk mengatur/set nilai dari variabel
     * tanggalLahir yang bertipe int
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

    /**
     * method buatNomorRekamMedis digunakan untuk membuat nomor rekam medis yang
     * terdiri dari tanggal pasien masuk ditambah 3 huruf pertama dari nama
     * pasien
     *
     * @return
     */
    public void getTanggalKelahiran() {
        Date tanggalKelahiran = new Date(getTahunLahir() - 1900, getBulanLahir() - 1, getTanggalLahir());
        SimpleDateFormat ft = new SimpleDateFormat("dd - MM - yyyy");
        System.out.println(ft.format(tanggalKelahiran));
    }

    public static ArrayList<Pasien> daftarPasienKlinik = new ArrayList<Pasien>();

    public static ArrayList<Pasien> daftarPasienKlinik() {
        return daftarPasienKlinik;
    }

    public static void tambahPasienBaru(Pasien pasien) {
        daftarPasienKlinik.add(pasien);
    }

    public static ArrayList<Pasien> getDaftarPasien() {
        return daftarPasienKlinik;
    }

    public String getNIK() {
        return NIK;
    }

    public void setNIK(String NIK) throws Exception {
        if (NIK.length() == 16) {
            String nik = NIK;
            this.setNoRM(nik);
            this.NIK = NIK;
        } else {
            throw new Exception("Nomor Induk Kependudukan terdiri dari 16 karakter");
        }
    }

    public static Pasien cariPasien(String noRekamMedis) {
        for (int i = 0; i < daftarPasienKlinik.size(); i++) {
            if (daftarPasienKlinik.get(i).getNIK().equals(noRekamMedis)) {
                return daftarPasienKlinik.get(i);
            }
        }
        return null;
    }

    public void printInfo() {
        System.out.printf("%-25s", "Nomor Rekam Medis Pasien");
        System.out.println(": " + getNoRM());
        System.out.printf("%-25s", "Nama Pasien");
        System.out.println(": " + getNama());
        System.out.printf("%-25s", "Tempat, Tanggal Lahir");
        System.out.print(": " + getTempatLahir() + " , ");
        getTanggalKelahiran();
        System.out.printf("%-25s", "Alamat");
        System.out.println(": " + getAlamat());
        System.out.println("");
    }

    public static void simpanDaftarPasien(File file) {
        try {
            FileOutputStream fos = new FileOutputStream(file);
            for (int i = 0; i < daftarPasienKlinik.size(); i++) {
                String data = daftarPasienKlinik.get(i).toString();
                fos.write(data.getBytes());
            }
            fos.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Pasien.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Pasien.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void bacaDaftarPasien(File file) {

        boolean nama = false;
        boolean alamat = false;
        boolean noRM = false;
        try {
            FileInputStream fis = null;
            String hasilBaca = "";
            fis = new FileInputStream(file);
            int dataInt;
            Pasien temp = new Pasien();
            while ((dataInt = fis.read()) != -1) {
                if ((char) dataInt != '\t') {
                    if ((char) dataInt != '\t') {
                        if ((char) dataInt != '\n') {
                            hasilBaca = hasilBaca + (char) dataInt;
                        } else if (nama = false) {
                            nama = true;
                            temp.setNama(hasilBaca);
                            hasilBaca = "";
                        }
                    } else if (alamat = false) {
                        alamat = true;
                        temp.setAlamat(hasilBaca);
                        hasilBaca = "";

                    }
                } else if (noRM = false) {
                    noRM = true;
                    temp.setNoRM(hasilBaca);
                    hasilBaca = "";
                }

            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Pasien.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Pasien.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @Override
    public String toString() {
        return noRM + "\t" + nama + "\t" + alamat + "\n";
    }
}
