/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import model.*;

/**
 *
 * @author jarkom
 */
public class TambahAntrianDialog extends JDialog implements ActionListener {

    private JLabel judullabel;
    private JLabel noRM;
    private JLabel nama;
    private JLabel alamat;
    private JLabel tanggalLahir;
    private JLabel klinik;
    private JTextField namaText;
    private JTextField noRMText;
    private JTextField alamatText;
    private JComboBox tanggalButton;
    private JComboBox bulanButton;
    private JComboBox tahunButton;
    private JComboBox klinikButton;
    private JButton daftarButton;

    /**
     * konstruktor untuk membuat objek
     */
    public TambahAntrianDialog() {
        //memanggil method init()
        init();
    }

    /**
     * konstruktor untuk membuat objek dengan parameter title yang bertipe
     * String
     *
     * @param title
     */
    public TambahAntrianDialog(String title) {
        //mengset nilai title sama dengan parameter title
        this.setTitle(title);
        //memanggil method init()
        init();
    }

    public void init() {

        //mengset layout dengan null
        this.setLayout(null);

        //membuat objek judul label yang bertipe JLable dengan text
        judullabel = new JLabel("TAMBAH ANTRIAN");
        //mengset posisi dan ukuran objek
        judullabel.setBounds(230, 15, 150, 10);
        //menambahkan judul label ke DaftarAntrianDialog
        this.add(judullabel);

        //membuat objek nomor rekam medis yang bertipe JLable dengan text
        noRM = new JLabel("No Rekam Medis");
        //mengset posisi dan ukuran objek
        noRM.setBounds(20, 50, 100, 15);
        //menambahkan noRM ke DaftarAntrianDialog
        this.add(noRM);

        // membuat object noRMtext yang bertipe JTextField
        noRMText = new JTextField();
        // mengatur posisi dan ukuran object
        noRMText.setBounds(150, 50, 350, 20);
        //menambah noRMtext ke DaftarAntrianDialog
        this.add(noRMText);
        //noRMText memanggil method addActionListener
        noRMText.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == noRMText) {
                    Pasien test = Pasien.cariPasien(noRMText.getText());
                    if (test == null) {
                        JOptionPane.showMessageDialog(null, "Data Pasien " + noRMText.getText() + " Pasien Tidak Terdaftar");
                    } else {
                        try {
                            Pasien pasien = new Pasien();
                            Klinik klinik = new Klinik();
                            namaText.setText(test.getNama());
                            alamatText.setText(test.getAlamat());
                            tanggalButton.setSelectedIndex((int) test.getTanggalLahir());
                            int tanggal = Integer.valueOf(tanggalButton.getSelectedItem().toString());
                            int bulan = Integer.parseInt(bulanButton.getSelectedItem().toString());
                            int tahun = Integer.valueOf(tahunButton.getSelectedItem().toString());
                            pasien.setTanggalLahir(tanggal);
                            pasien.setBulanLahir(bulan);
                            pasien.setTahunLahir(tahun);
                            String namaKlinik = String.valueOf(klinikButton.getSelectedItem().toString());
                            klinik.setNama(namaKlinik);
                        } catch (Exception ex) {
                            JOptionPane.showMessageDialog(null, ex);
                        }
                    }
                }
            }
        });

        // membuat object nama yang bertipe JLabel dengan text
        nama = new JLabel("Nama");
        // mengatur posisi dan ukuran object
        nama.setBounds(20, 80, 50, 15);
        //menambah namalabel ke DaftarAntrianDialog
        this.add(nama);

        // membuat object namatext yang bertipe JTextField
        namaText = new JTextField(100);
        // mengatur posisi dan ukuran object
        namaText.setBounds(150, 80, 350, 20);
        //menambah namatext ke TambahAntrianDialog
        this.add(namaText);
        //namatext memanggil method addActionListener
        namaText.addActionListener(this);

        // membuat object alamat yang bertipe JLabel dengan text
        alamat = new JLabel("Alamat");
        // mengatur posisi dan ukuran object
        alamat.setBounds(20, 110, 100, 15);
        //menambah alamat ke DaftarAntrianDialog
        this.add(alamat);

        alamatText = new JTextField(100);
        alamatText.setBounds(150, 110, 350, 20);
        this.add(alamatText);

        alamatText.addActionListener(this);

        //tanggal lahir
        this.setLayout(null);
        tanggalLahir = new JLabel("Tanggal Lahir");
        tanggalLahir.setBounds(20, 140, 350, 15);
        this.add(tanggalLahir);

        //Tombol Tanggal Lahir
        String[] tanggal = {"Tanggal", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10",
            "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24",
            "25", "26", "27", "28", "29", "30", "31"};
        tanggalButton = new JComboBox(tanggal);
        tanggalButton.setBounds(150, 140, 100, 20);
        this.add(tanggalButton);
        tanggalButton.addActionListener(this);

        //Tombol Bulan Lahir
        String[] bulan = {"Bulan", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12"};
        bulanButton = new JComboBox(bulan);
        bulanButton.setBounds(275, 140, 100, 20);
        this.add(bulanButton);
        bulanButton.addActionListener(this);

        //Tombol Tahun Lahir
        String[] tahun = {"Tahun", "1900", "1901", "1902", "1903", "1904", "1905", "1906", "1907", "1908",
            "1909", "1910", "1911", "1912", "1913", "1914", "1915", "1916", "1917", "1918",
            "1919", "1920", "1921", "1922", "1923", "1924", "1925", "1926", "1927", "1928",
            "1929", "1930", "1931", "1932", "1933", "1934", "1935", "1936", "1937", "1938",
            "1939", "1940", "1941", "1942", "1943", "1944", "1945", "1946", "1947", "1948",
            "1949", "1950", "1951", "1952", "1953", "1954", "1955", "1956", "1957", "1958",
            "1959", "1960", "1961", "1962", "1963", "1964", "1965", "1966", "1967", "1968",
            "1969", "1970", "1971", "1972", "1973", "1974", "1975", "1976", "1977", "1978",
            "1979", "1980", "1981", "1982", "1983", "1984", "1985", "1986", "1987", "1988",
            "1989", "1990", "1991", "1992", "1993", "1994", "1995", "1996", "1997", "1998",
            "1999", "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009",
            "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018"};
        tahunButton = new JComboBox(tahun);
        tahunButton.setBounds(400, 140, 100, 20);
        this.add(tahunButton);
        tahunButton.addActionListener(this);

        //klinik
        this.setLayout(null);
        klinik = new JLabel("Klinik");
        klinik.setBounds(20, 170, 50, 15);
        this.add(klinik);

        String[] klinik = {"Pilih", "Penyakit Dalam", "Radiologi", "Mata", "Kulit", "Bedah", "THT", "Gigi"};
        klinikButton = new JComboBox(klinik);
        klinikButton.setBounds(150, 170, 150, 20);
        this.add(klinikButton);
        klinikButton.addActionListener(this);

        //Tombol
        daftarButton = new JButton("DAFTAR");
        daftarButton.setBounds(240, 210, 80, 30);
        this.add(daftarButton);
        daftarButton.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Pasien test = Pasien.cariPasien(noRMText.getText());
        for (int i = 0; i < Pasien.daftarPasienKlinik().size(); i++) {
            if (test == Pasien.daftarPasienKlinik.get(i)) {
                try {
                    Pasien pasien = new Pasien();
                    Klinik klinik = new Klinik();
                    AntrianPasien antrian = new AntrianPasien();
                    pasien.setNama(namaText.getText());
                    pasien.setAlamat(alamatText.getText());
                    pasien.setNoRM(noRMText.getText());
                    int tanggal = Integer.valueOf(tanggalButton.getSelectedItem().toString());
                    int bulan = Integer.valueOf(bulanButton.getSelectedItem().toString());
                    int tahun = Integer.valueOf(tahunButton.getSelectedItem().toString());
                    pasien.setTanggalLahir(tanggal);
                    pasien.setBulanLahir(bulan);
                    pasien.setTahunLahir(tahun);
                    String namaKlinik = String.valueOf(klinikButton.getSelectedItem().toString());
                    klinik.setNama(namaKlinik);
                    antrian.Mendaftar(pasien);
                    JOptionPane.showMessageDialog(null, "Nomor Antrian Anda : " + (i + 1));
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, ex);
                }
            }
        }
    }
}
