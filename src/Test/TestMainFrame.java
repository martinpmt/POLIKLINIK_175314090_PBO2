/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

import view.MainFrame;
import javax.swing.JFrame;

/**
 *
 * @author Martin Paramarta
 */
public class TestMainFrame {
    public static void main(String[] args) {
        MainFrame MF=new MainFrame();
        MF.setTitle("KLINIK");
        MF.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        MF.setSize(550, 300);
        MF.setVisible(true);
    }
}

