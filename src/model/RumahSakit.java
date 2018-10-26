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
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import static model.Pasien.daftarPasienKlinik;

/**
 *
 * @author admin
 */
public class RumahSakit implements Serializable {

    private String nama;
    private String alamat;
    private ArrayList<Pasien> daftarPasien = new ArrayList<Pasien>();
    private ArrayList<Klinik> daftarKlinik = new ArrayList<Klinik>();
    private ArrayList<Klinik> daftarAntrianKlinik = new ArrayList<Klinik>();

    public RumahSakit() {

    }

    public RumahSakit(String nama, String alamat) {
        this.nama = nama;
        this.alamat = alamat;
    }

    public void tambahPasien(Pasien pasien) {
        daftarPasien.add(pasien);
    }

    public Pasien cariPasien(String nama) {
        for (int i = 0; i < daftarPasien.size(); i++) {
            if (daftarPasien.get(i).getNama().equals(nama)) {
                return daftarPasien.get(i);
            }
        }
        return null;
    }

    public void tambahPasienBaru(Pasien pasien) {
        Pasien cari = this.cariPasien(pasien.getNama());
        if (cari == null) {
            daftarPasien.add(pasien);
        }
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
        int dataInt;
        boolean noRM = false;
        boolean nama = false;
        boolean alamat = false;
        FileInputStream fis = null;
        String hasilBaca = "";
        Pasien temp = new Pasien();
        try {
            fis = new FileInputStream(file);
            while ((dataInt = fis.read()) != -1) {
                if ((char) dataInt != '\n') {
                    if ((char) dataInt != '\t') {
                        hasilBaca = hasilBaca + (char) dataInt;
                    } else {
                        if (noRM == false) {
                            temp.setNoRM(hasilBaca);
                            noRM = true;
                            hasilBaca = "";
                        } else if (nama == false) {
                            temp.setNama(hasilBaca);
                            nama = true;
                            hasilBaca = "";
                        }
                    }
                } else {
                    temp.setAlamat(hasilBaca);
                    alamat = true;
                    hasilBaca = "";
                    Pasien.tambahPasienBaru(temp);
                    noRM = false;
                    nama = false;
                    alamat = false;
                    temp = new Pasien();
                }
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Pasien.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Pasien.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void simpanObjekRumahSakit(File file) {
        FileOutputStream fos = null;
        ObjectOutputStream os = null;
        try {
            fos = new FileOutputStream(file);
            os = new ObjectOutputStream(fos);
            os.writeObject(this);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(RumahSakit.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(RumahSakit.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void bacaObjekRumahSakit(File file) {
        FileInputStream fis = null;
        ObjectInputStream ois = null;
        try {
            fis = new FileInputStream(file);
            ois = new ObjectInputStream(fis);
            RumahSakit rs = (RumahSakit) ois.readObject();
            this.setNama(rs.getNama());
            this.setAlamat(rs.getAlamat());
            this.setDaftarPasien(rs.getDaftarPasien());

        } catch (FileNotFoundException ex) {
            Logger.getLogger(RumahSakit.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(RumahSakit.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(RumahSakit.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    

    public ArrayList<Pasien> getDaftarPasien() {
        return daftarPasien;
    }

    public void setDaftarPasien(ArrayList<Pasien> daftarPasien) {
        this.daftarPasien = daftarPasien;
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

    public void tambahKlinik(Klinik klinik) {
        daftarKlinik.add(klinik);
    }

    public Klinik cariKlinik(String namaKlinik) {
        for (int i = 0; i < daftarKlinik.size(); i++) {
            if (daftarKlinik.get(i).getNama().equals(namaKlinik)) {
                return daftarKlinik.get(i);
            }
        }
        return null;
    }

    public void buatAntrian(int tanggal, int bulan, int tahun, Klinik klinik) {

    }

    public int cariAntrian(int tanggal, int bulan, int tahun, Klinik klinik) {
        return 0;
    }

    public void daftarPasien(Pasien pasien, int tanggal, int bulan, int tahun, Klinik klinik) {

    }

    public ArrayList<AntrianPasien> getDaftarAntrianKlinik() {
        return null;
    }

    public void setDaftarAntrianKlinik(ArrayList<AntrianPasien> daftarAntrianKlinik) {

    }

    public ArrayList<Klinik> getDaftarKlinik() {
        return null;
    }

    public void setDaftarKlinik(ArrayList<Klinik> daftarKlinik) {

    }
}
