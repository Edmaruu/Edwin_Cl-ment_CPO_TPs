/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package light_out_inchaud_peaucelle;

import javax.swing.ImageIcon;
import java.awt.Graphics;
import javax.swing.JButton;

/**
 *
 * @author Incha
 */
public class casegraphique extends JButton {

    Case casegraph;
    ImageIcon img_on = new javax.swing.ImageIcon(getClass().getResource("/image_light_out/persona5logo.png"));
    ImageIcon img_off = new javax.swing.ImageIcon(getClass().getResource("/image_light_out/Persona5takeyourtime.png"));

    public casegraphique(Case unecase) {
        casegraph = unecase;
    }

    @Override
    public void paintComponent(Graphics G) {
        super.paintComponent(G);
        if (casegraph.etatcase == false) {
            setIcon(img_off);
        } else {
            setIcon(img_on);
        }
    }
}
