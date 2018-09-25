/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

import view.TambahPasienBaruDialog;
import javax.swing.JFrame;

/**
 *
 * @author Martin Paramarta
 */
public class TestDaftarPasienBaru {

    public static void main(String[] args) {
       TambahPasienBaruDialog test = new TambahPasienBaruDialog("Tambah Pasien Baru");
        test.setTitle("Daftar Pasien Baru");
        test.setSize(550, 350);
        test.setVisible(true);
    }
}
