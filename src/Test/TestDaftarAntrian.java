/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

import view.TambahAntrianDialog;
import javax.swing.JFrame;

/**
 *
 * @author Martin Paramarta
 */
public class TestDaftarAntrian {

    public static void main(String[] args) {
        TambahAntrianDialog test = new TambahAntrianDialog("Tambah Antrian");
        test.setTitle("Daftar Antrian Pasien");
        test.setSize(550, 300);
        test.setVisible(true);

    }
}
