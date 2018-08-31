/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

import model.Dokter;
import model.Pasien;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Martin Paramarta
 */
public class TestPasienTry {

    public static void main(String[] args) {
        Pasien pasien1 = new Pasien("Martin");
        Dokter dokter1 = new Dokter("Dr. Jono");

        try {
            pasien1.setAlamat("Klaten");
            pasien1.setTempatLahir("Klaten");
            pasien1.setTanggalLahir(3);
            pasien1.setBulanLahir(11);
            pasien1.setTahunLahir(1999);
            pasien1.setNoRekamMedis(pasien1.buatNomorRekamMedis());
            dokter1.setNoPegawai("696969");
            dokter1.setAlamat("Sleman");
            dokter1.setTempatLahir("Sorong");
            dokter1.setTanggalLahir(16);
            dokter1.setBulanLahir(10);
            dokter1.setTahunLahir(1980);

        } catch (Exception ex) {
            ex.printStackTrace();
        }
        
        System.out.println("===========================================");
        System.out.println("PASIEN");
        System.out.println("===========================================");
        System.out.println("Nama            : " + pasien1.getNama());
        System.out.println("Alamat          : " + pasien1.getAlamat());
        System.out.println("Tempat Lahir    : " + pasien1.getTempatLahir());
        System.out.println("Tanggal Lahir   : " + pasien1.getTanggalLahir() + "/" + pasien1.getBulanLahir() + "/" + pasien1.getTahunLahir());
        System.out.println("No Rekam Medis  : " + pasien1.getNoRekamMedis().toUpperCase());
        System.out.println("");

        System.out.println("===========================================");
        System.out.println("DOKTER");
        System.out.println("===========================================");
        System.out.println("Nama            : " + dokter1.getNama());

        System.out.println("Alamat          : " + dokter1.getAlamat());
        System.out.println("Tempat Lahir    : " + dokter1.getTempatLahir());
        System.out.println("Tanggal Lahir   : " + dokter1.getTanggalLahir() + "/" + dokter1.getBulanLahir() + "/" + dokter1.getTahunLahir());
        System.out.println("No Pegawai      : " + dokter1.getNoPegawai());
    }
}
