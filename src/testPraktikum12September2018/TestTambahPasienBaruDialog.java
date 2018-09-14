/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testPraktikum12September2018;

import view.TambahPasienBaruDialog;

/**
 *
 * @author admin
 */
public class TestTambahPasienBaruDialog {
    public static void main(String[] args) {
        TambahPasienBaruDialog test = new TambahPasienBaruDialog("FORM TAMBAH PASIEN BARU");
        test.setSize(500, 400);
        test.setVisible(true);
    }
}
