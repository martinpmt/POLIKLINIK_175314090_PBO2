/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import model.Pasien;

/**
 *
 * @author jarkom
 */
public class TambahPasienBaruDialog extends JDialog implements ActionListener {

    private JLabel judulLabel;
    private JLabel namaLabel;
    private JLabel kelaminLabel;
    private JLabel alamatLabel;
    private JLabel nikLabel;
    private JTextField namaText;
    private JTextField alamatText;
    private JTextField nikText;
     private JRadioButton lakiRadio;
    private JRadioButton perempuanRadio;
private JButton saveButton;
    private JButton simpanButton;

    public TambahPasienBaruDialog(String title) {
        this.setTitle(title);
        init();
    }

    public void init() {
        this.setLayout(null);

        judulLabel = new JLabel("Form Tambah Pasien");
        judulLabel.setBounds(75, 25, 200, 20);
        this.add(judulLabel);

        namaLabel = new JLabel("Nama");
        namaLabel.setBounds(30, 100, 150, 25);
        this.add(namaLabel);

        namaText = new JTextField();
        namaText.setBounds(125, 100, 150, 25);
        this.add(namaText);

        kelaminLabel = new JLabel("Jenis Kelamin");
        kelaminLabel.setBounds(30, 150, 150, 25);
        this.add(kelaminLabel);
        
        lakiRadio = new JRadioButton("Laki-laki");
        lakiRadio.setBounds(125, 140, 150, 20);
        this.add(lakiRadio);

        perempuanRadio = new JRadioButton("Perempuan");
        perempuanRadio.setBounds(125, 160, 150, 20);
        this.add(perempuanRadio);

        ButtonGroup KelaminButonGroup = new ButtonGroup();
        KelaminButonGroup.add(lakiRadio);
        KelaminButonGroup.add(perempuanRadio);

        alamatLabel = new JLabel("Alamat");
        alamatLabel.setBounds(30, 200, 150, 25);
        this.add(alamatLabel);

        alamatText = new JTextField();
        alamatText.setBounds(125, 200, 150, 25);
        this.add(alamatText);

        nikLabel = new JLabel("NIK");
        nikLabel.setBounds(30, 250, 150, 25);
        this.add(nikLabel);

        nikText = new JTextField();
        nikText.setBounds(125, 250, 150, 25);
        this.add(nikText);

        simpanButton = new JButton("Simpan");
        simpanButton.setBounds(125, 300, 100, 30);
        this.add(simpanButton);
        simpanButton.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == simpanButton) {
            Pasien baru = new Pasien();
            baru.setNama(namaText.getText());
            baru.setAlamat(alamatText.getText());
            baru.setNik(nikText.getText());
            Pasien.tambahPasienBaru(baru);

            JOptionPane.showMessageDialog(null, "Data Telah Ditambahkan");
            this.dispose();
        }
    }
}
