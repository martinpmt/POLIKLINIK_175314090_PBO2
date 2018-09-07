/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author jarkom
 */
public class DaftarAntrianDialog extends JDialog {

    private JLabel judulLabel;
    private JLabel noRMLabel;
    private JLabel namaLabel;
    private JLabel alamatLabel;
    private JTextField noRMText;
    private JTextField namaText;
    private JTextField alamatText;
    private JButton simpanButton;


    public DaftarAntrianDialog(String title) {
        this.setTitle(title);
        init();
    }

    public void init() {
        this.setLayout(null);

        judulLabel = new JLabel("Form Daftar Antrian");
        judulLabel.setBounds(85, 25, 200, 20);
        this.add(judulLabel);

        noRMLabel = new JLabel("no RM");
        noRMLabel.setBounds(30, 100, 150, 25);
        this.add(noRMLabel);

        noRMText = new JTextField();
        noRMText.setBounds(125, 100, 150, 25);
        this.add(noRMText);

        namaLabel = new JLabel("Nama");
        namaLabel.setBounds(30, 150, 150, 25);
        this.add(namaLabel);

        namaText = new JTextField();
        namaText.setBounds(125, 150, 150, 25);
        this.add(namaText);

        alamatLabel = new JLabel("Alamat");
        alamatLabel.setBounds(30, 200, 150, 25);
        this.add(alamatLabel);
        
        alamatText = new JTextField();
        alamatText.setBounds(125, 200, 150, 25);
        this.add(alamatText);
        
        simpanButton = new JButton("Simpan");
        simpanButton.setBounds(125, 300, 100, 30);
        this.add(simpanButton);

    }
}
