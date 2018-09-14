/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.HeadlessException;
import java.awt.MenuBar;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Martin Paramarta
 */
public class MainFrame extends JFrame implements ActionListener {

    private JMenuBar menuBar;
    private JMenu fileMenu;
    private JMenuItem tambahPasien;
    private JMenuItem tambahAntrian;
    private JMenuItem exitMenuItem;

    public MainFrame() throws HeadlessException {
        init();
    }

    public void init() {
        // buat menu bar
        menuBar = new JMenuBar();
        // set judul
        this.setTitle("Main Frame");
        // buat menu
        fileMenu = new JMenu("File");
        tambahPasien = new JMenuItem("Tambah Pasien");
        tambahAntrian = new JMenuItem("Tambah Antrian");
        exitMenuItem = new JMenuItem("Keluar");
        fileMenu.add(tambahPasien);
        fileMenu.add(tambahAntrian);
        fileMenu.add(exitMenuItem);
        menuBar.add(fileMenu);

        this.setJMenuBar(menuBar);

        tambahPasien.addActionListener(this);
        tambahAntrian.addActionListener(this);
        exitMenuItem.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == exitMenuItem) {
            System.exit(0);
        }
        if (e.getSource() == tambahPasien) {
            TambahPasienBaruDialog test = new TambahPasienBaruDialog("Form Tambah Pasien");
            test.setSize(300, 400);
            test.setVisible(true);
        }
        if (e.getSource() == tambahAntrian) {
            TambahAntrianDialog test = new TambahAntrianDialog("Form Tambah Antrian");
            test.setSize(300, 400);
            test.setVisible(true);
        }

    }
}
