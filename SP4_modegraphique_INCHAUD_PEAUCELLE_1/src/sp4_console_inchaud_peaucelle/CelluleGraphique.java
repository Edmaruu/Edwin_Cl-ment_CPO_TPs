/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sp4_console_inchaud_peaucelle;

import javax.swing.JButton;

/**
 *
 * @author Incha
 */
public class CelluleGraphique extends JButton {
    Cellule celluleAssociee;
    
    public CelluleGraphique (Cellule uneCellule) {
        celluleAssociee = uneCellule;
    }
    
    
}
