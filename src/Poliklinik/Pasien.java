/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Poliklinik;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Martin Paramarta
 */
public class Pasien {
    private String noRekamMedis;
    private String nama;
    private String alamat;
    private String tempatLahir;
    private int tanggalLahir;
    private int bulanLahir;
    private int tahunLahir;

    public Pasien() {

    }

    public Pasien(String nama) {
        this.nama = nama;
    }

    public String getNoRekamMedis() {
        return noRekamMedis;
    }

    public void setNoRekamMedis(String noRekamMedis) throws Exception {
        if (noRekamMedis.length() >= 6 && noRekamMedis.length() <= 20) {
            this.noRekamMedis = noRekamMedis;
        } else {
            throw new Exception("No Rekam Medis Salah");
        }
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getTempatLahir() {
        return tempatLahir;
    }

    public void setTempatLahir(String tempatLahir) {
        this.tempatLahir = tempatLahir;
    }

    public int getTanggalLahir() {
        return tanggalLahir;
    }

    public void setTanggalLahir(int tanggalLahir) throws Exception {
        if (tanggalLahir > 0) {
            if (tanggalLahir < 32) {
                this.tanggalLahir = tanggalLahir;
            } else {
                throw new Exception("Tanggal Salah ===> Lebih dari 31");
            }
        } else {
            throw new Exception("Tanggal Salah ===> Kurang dari atau sama dengan 0");
        }
    }

    public int getBulanLahir() {
        return bulanLahir;
    }

    public void setBulanLahir(int bulanLahir) throws Exception {
        if (bulanLahir > 0) {
            if (bulanLahir < 13) {
                this.bulanLahir = bulanLahir;
            } else {
                throw new Exception("Bulan Salah ===> Lebih dari 12");
            }
        } else {
            throw new Exception("Bulan Salah ===> Kurang dari atau sama dengan 0");
        }

    }

    public int getTahunLahir() {
        return tahunLahir;
    }

    public void setTahunLahir(int tahunLahir) throws Exception {
        if (tahunLahir > 0) {
            this.tahunLahir = tahunLahir;
        } else {
            throw new Exception("Tahun Salah");
        }
    }

    public String buatNomorRekamMedis() {
        String nomorRekamMedis;
        Date date = new Date();
        SimpleDateFormat ft = new SimpleDateFormat("yyyMMdd");
        nomorRekamMedis = ft.format(date) + nama.substring(0, 3);
        return nomorRekamMedis;
    }
}
