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

/**
 *
 * @author Martin Paramarta
 */
public class MainFrame extends JFrame {

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
    }

}
