/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package sp4_console_inchaud_peaucelle;

import java.util.Random;

/**
 *
 * @author Incha
 */
public class fenetreDeJeu extends javax.swing.JFrame {

    Joueur[] ListeJoueur = new Joueur[2];
    Joueur joueurCourant;
    Grille grilleJeu = new Grille();

    /**
     * Creates new form fenetreDeJeu
     */
    public fenetreDeJeu() {
        initComponents();
        panneau_info_joueur.setVisible(false);
        panneau_info_jeu.setVisible(false);

        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 7; j++) {
                CelluleGraphique cellGraph = new CelluleGraphique(grilleJeu.Cellulejeu[i][j]);
                cellGraph.addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        Cellule c = cellGraph.celluleAssociee;
                        if (c.jetonCourant == null) {
                            return;
                        }
                        if (c.jetonCourant.Couleur == joueurCourant.couleur) {
                            textemessage.setText("le joueur " + joueurCourant.nom + " récupère un de ses jetons");
                            Jeton jrecup = c.recupererJeton();
                            joueurCourant.ajouterJeton(jrecup);
                            c.supprimerJeton();
                            panneau_grille.repaint();
                            joueurSuivant();
                        } else {
                            if (joueurCourant.nombreDesintegrateurs > 0) {
                                textemessage.setText("le joueur " + joueurCourant.nom + " veut désintégrer un jeton");
                                c.supprimerJeton();
                                panneau_grille.repaint();
                                joueurCourant.nombreDesintegrateurs--;

                                joueurSuivant();
                            } else {
                                return;
                            }
                        }
                        grilleJeu.tasserGrille();
                        for (int a = 0; a < 7; a++) {
                            if (grilleJeu.colonneRemplie(a) == false) {
                                btn_col_0.setEnabled(true);
                                switch (a) {
                                    case 0:
                                        btn_col_0.setEnabled(true);
                                        break;
                                    case 1:
                                        btn_col_1.setEnabled(true);
                                        break;
                                    case 2:
                                        btn_col_2.setEnabled(true);
                                        break;
                                    case 3:
                                        btn_col_3.setEnabled(true);
                                        break;
                                    case 4:
                                        btn_col_4.setEnabled(true);
                                        break;
                                    case 5:
                                        btn_col_5.setEnabled(true);
                                        break;
                                    case 6:
                                        btn_col_6.setEnabled(true);
                                        break;
                                }
                            }
                        }
                        lbl_j1_desint.setText("" + ListeJoueur[0].nombreDesintegrateurs);
                        lbl_j2_desint.setText("" + ListeJoueur[1].nombreDesintegrateurs);
                        boolean vict_j1 = grilleJeu.etreGagnantePourJoueur(ListeJoueur[0]);
                        boolean vict_j2 = grilleJeu.etreGagnantePourJoueur(ListeJoueur[1]);
                        if (vict_j1 && !vict_j2) {
                            textemessage.setText("victoire de" + ListeJoueur[0].nom);
                        }
                        if (vict_j2 && !vict_j1) {
                            textemessage.setText("victoire de" + ListeJoueur[1].nom);
                        }
                        if (vict_j2 && vict_j1) {
                            if (joueurCourant == ListeJoueur[0]) {
                                textemessage.setText("victoire de" + ListeJoueur[1].nom);
                            } else {
                                textemessage.setText("victoire de" + ListeJoueur[0].nom + "faute de jeu du joueur 2");
                            }
                        }
                    }
                });
                panneau_grille.add(cellGraph);
            }
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panneau_grille = new javax.swing.JPanel();
        panneau_creation_outil = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Nom_joueur_1 = new javax.swing.JTextField();
        Nom_joueur_2 = new javax.swing.JTextField();
        btn_start = new javax.swing.JButton();
        panneau_info_joueur = new javax.swing.JPanel();
        lbl_j1_nom = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lbl_j1_desint = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        lbl_j1_couleur = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        lbl_j2_nom = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        lbl_j2_desint = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        lbl_j2_couleur = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        panneau_info_jeu = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        lbl_Jcourant = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        textemessage = new javax.swing.JTextArea();
        btn_col_0 = new javax.swing.JButton();
        btn_col_1 = new javax.swing.JButton();
        btn_col_2 = new javax.swing.JButton();
        btn_col_3 = new javax.swing.JButton();
        btn_col_4 = new javax.swing.JButton();
        btn_col_5 = new javax.swing.JButton();
        btn_col_6 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panneau_grille.setBackground(new java.awt.Color(255, 255, 255));
        panneau_grille.setLayout(new java.awt.GridLayout(6, 7));
        getContentPane().add(panneau_grille, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 672, 576));

        panneau_creation_outil.setBackground(new java.awt.Color(0, 255, 153));
        panneau_creation_outil.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("NOM JOUEUR 1");
        panneau_creation_outil.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jLabel2.setText("NOM JOUEUR 2");
        panneau_creation_outil.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 80, -1));

        Nom_joueur_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Nom_joueur_1ActionPerformed(evt);
            }
        });
        panneau_creation_outil.add(Nom_joueur_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 20, 110, 30));

        Nom_joueur_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Nom_joueur_2ActionPerformed(evt);
            }
        });
        panneau_creation_outil.add(Nom_joueur_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 60, 110, -1));

        btn_start.setText("DEMARER PARTIE");
        btn_start.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_startActionPerformed(evt);
            }
        });
        panneau_creation_outil.add(btn_start, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 100, -1, 30));

        getContentPane().add(panneau_creation_outil, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 70, 300, 150));

        panneau_info_joueur.setBackground(new java.awt.Color(0, 255, 153));
        panneau_info_joueur.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_j1_nom.setText("nomJoueurs 1");
        panneau_info_joueur.add(lbl_j1_nom, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 50, -1, -1));

        jLabel5.setText("Couleur");
        panneau_info_joueur.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 74, -1, 10));

        jLabel6.setText("Joueurs1");
        panneau_info_joueur.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, -1, -1));

        lbl_j1_desint.setText("nbdesintjoueur1");
        panneau_info_joueur.add(lbl_j1_desint, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 90, -1, -1));

        jLabel8.setText("Désintégrateurs");
        panneau_info_joueur.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, -1));

        lbl_j1_couleur.setText("couleurjoueur1");
        panneau_info_joueur.add(lbl_j1_couleur, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 70, -1, -1));
        panneau_info_joueur.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 112, 200, -1));

        lbl_j2_nom.setText("nomJoueurs 2");
        panneau_info_joueur.add(lbl_j2_nom, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 120, -1, -1));

        jLabel7.setText("Couleur");
        panneau_info_joueur.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, -1, 10));

        jLabel9.setText("Joueurs1");
        panneau_info_joueur.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, -1, -1));

        lbl_j2_desint.setText("nbdesintjoueur2");
        panneau_info_joueur.add(lbl_j2_desint, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 160, -1, -1));

        jLabel10.setText("Désintégrateurs");
        panneau_info_joueur.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, -1, -1));

        lbl_j2_couleur.setText("couleurjoueur2");
        panneau_info_joueur.add(lbl_j2_couleur, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 140, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Infos Joueurs");
        panneau_info_joueur.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 130, 20));

        getContentPane().add(panneau_info_joueur, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 240, 290, 200));

        panneau_info_jeu.setBackground(new java.awt.Color(0, 255, 153));
        panneau_info_jeu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Infos Jeu");
        panneau_info_jeu.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 130, 20));

        jLabel11.setText("Joueur Courant");
        panneau_info_jeu.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, -1, -1));

        lbl_Jcourant.setText("NomJoueur");
        panneau_info_jeu.add(lbl_Jcourant, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 60, -1, -1));

        textemessage.setColumns(20);
        textemessage.setRows(5);
        jScrollPane1.setViewportView(textemessage);

        panneau_info_jeu.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 280, -1));

        getContentPane().add(panneau_info_jeu, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 450, 290, 200));

        btn_col_0.setText("1");
        btn_col_0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_col_0ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_col_0, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, -1, -1));

        btn_col_1.setText("2");
        btn_col_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_col_1ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_col_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(146, 30, -1, -1));

        btn_col_2.setText("3");
        btn_col_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_col_2ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_col_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(242, 30, -1, -1));

        btn_col_3.setText("4");
        btn_col_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_col_3ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_col_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(338, 30, -1, -1));

        btn_col_4.setText("5");
        btn_col_4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_col_4ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_col_4, new org.netbeans.lib.awtextra.AbsoluteConstraints(434, 30, -1, -1));

        btn_col_5.setText("6");
        btn_col_5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_col_5ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_col_5, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 30, -1, -1));

        btn_col_6.setText("7");
        btn_col_6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_col_6ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_col_6, new org.netbeans.lib.awtextra.AbsoluteConstraints(626, 30, -1, -1));

        setSize(new java.awt.Dimension(1044, 704));
    }// </editor-fold>//GEN-END:initComponents

    private void Nom_joueur_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Nom_joueur_1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Nom_joueur_1ActionPerformed

    private void Nom_joueur_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Nom_joueur_2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Nom_joueur_2ActionPerformed

    private void btn_col_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_col_1ActionPerformed
        // TODO add your handling code here:
        joueurDansColonne(1);
        if (grilleJeu.colonneRemplie(1) == true) {
            btn_col_1.setEnabled(false);
        }
        joueurSuivant();
    }//GEN-LAST:event_btn_col_1ActionPerformed

    private void btn_col_0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_col_0ActionPerformed
        // TODO add your handling code here:
        joueurDansColonne(0);
        if (grilleJeu.colonneRemplie(0) == true) {
            btn_col_0.setEnabled(false);
        }
        joueurSuivant();
    }//GEN-LAST:event_btn_col_0ActionPerformed

    private void btn_col_6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_col_6ActionPerformed
        // TODO add your handling code here:
        joueurDansColonne(6);
        if (grilleJeu.colonneRemplie(6) == true) {
            btn_col_6.setEnabled(false);
        }
        joueurSuivant();
    }//GEN-LAST:event_btn_col_6ActionPerformed

    private void btn_startActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_startActionPerformed
        // TODO add your handling code here:
        panneau_info_joueur.setVisible(true);
        panneau_info_jeu.setVisible(true);
        initialiserPartie();
        panneau_grille.repaint();
        btn_start.setEnabled(false);

    }//GEN-LAST:event_btn_startActionPerformed

    private void btn_col_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_col_2ActionPerformed
        // TODO add your handling code here:
        joueurDansColonne(2);
        if (grilleJeu.colonneRemplie(2) == true) {
            btn_col_2.setEnabled(false);
        }
        joueurSuivant();
    }//GEN-LAST:event_btn_col_2ActionPerformed

    private void btn_col_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_col_3ActionPerformed
        // TODO add your handling code here:
        joueurDansColonne(3);
        if (grilleJeu.colonneRemplie(3) == true) {
            btn_col_3.setEnabled(false);
        }
        joueurSuivant();
    }//GEN-LAST:event_btn_col_3ActionPerformed

    private void btn_col_4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_col_4ActionPerformed
        // TODO add your handling code here:
        joueurDansColonne(4);
        if (grilleJeu.colonneRemplie(4) == true) {
            btn_col_4.setEnabled(false);
        }
        joueurSuivant();
    }//GEN-LAST:event_btn_col_4ActionPerformed

    private void btn_col_5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_col_5ActionPerformed
        // TODO add your handling code here:
        joueurDansColonne(5);
        if (grilleJeu.colonneRemplie(5) == true) {
            btn_col_5.setEnabled(false);
        }
        joueurSuivant();
    }//GEN-LAST:event_btn_col_5ActionPerformed

    public boolean joueurDansColonne(int indice_colone) {
        boolean resultatAction;
        boolean vict_j1;
        boolean vict_j2;
        if (joueurCourant == ListeJoueur[0]) {
            int i = 0;
            resultatAction = grilleJeu.ajouterJetonDansColonne(joueurCourant.ListeJetons[i], indice_colone);
            int ligne;
            for (ligne = 0; ligne < 6; ligne++) {
                if (grilleJeu.celluleOccupe(ligne, indice_colone) == true) {
                    grilleJeu.Cellulejeu[ligne][indice_colone].activerTrounoir();
                    if (grilleJeu.Cellulejeu[ligne][indice_colone].recupererDesintegrateur() == true) {
                        joueurCourant.nombreDesintegrateurs += 1;
                        lbl_j1_desint.setText("" + joueurCourant.nombreDesintegrateurs);
                    }
                    break;
                }
            }
            panneau_grille.repaint();
            vict_j1 = grilleJeu.etreGagnantePourJoueur(ListeJoueur[0]);
            vict_j2 = grilleJeu.etreGagnantePourJoueur(ListeJoueur[1]);
            if (vict_j1 && !vict_j2) {
                textemessage.setText("victoire de" + ListeJoueur[0].nom);
            }
            if (vict_j2 && !vict_j1) {
                textemessage.setText("victoire de" + ListeJoueur[1].nom);
            }
            if (vict_j2 && vict_j1) {
                if (joueurCourant == ListeJoueur[0]) {
                    textemessage.setText("victoire de" + ListeJoueur[1].nom);
                } else {
                    textemessage.setText("victoire de" + ListeJoueur[0].nom + "faute de jeu du joueur 2");
                }
            }
            i++;
            if (resultatAction == true) {
                return true;
            } else {
                return false;
            }
        } else {
            int a = 0;
            resultatAction = grilleJeu.ajouterJetonDansColonne(joueurCourant.ListeJetons[a], indice_colone);
            int lignee;
            for (lignee = 0; lignee < 6; lignee++) {
                if (grilleJeu.celluleOccupe(lignee, indice_colone) == true) {
                    grilleJeu.Cellulejeu[lignee][indice_colone].activerTrounoir();
                    if (grilleJeu.Cellulejeu[lignee][indice_colone].recupererDesintegrateur() == true) {
                        joueurCourant.nombreDesintegrateurs += 1;
                        lbl_j2_desint.setText("" + joueurCourant.nombreDesintegrateurs);
                    }
                    break;
                }
            }
            panneau_grille.repaint();
            vict_j1 = grilleJeu.etreGagnantePourJoueur(ListeJoueur[0]);
            vict_j2 = grilleJeu.etreGagnantePourJoueur(ListeJoueur[1]);
            if (vict_j1 && !vict_j2) {
                textemessage.setText("victoire de" + ListeJoueur[0].nom);
            }
            if (vict_j2 && !vict_j1) {
                textemessage.setText("victoire de" + ListeJoueur[1].nom);
            }
            if (vict_j2 && vict_j1) {
                if (joueurCourant == ListeJoueur[0]) {
                    textemessage.setText("victoire de" + ListeJoueur[1].nom);
                } else {
                    textemessage.setText("victoire de" + ListeJoueur[0].nom + "faute de jeu du joueur 2");
                }
            }
            a++;
            if (resultatAction == true) {
                return true;
            } else {
                return false;
            }
        }

    }

    public void joueurSuivant() {
        if (joueurCourant == ListeJoueur[0]) {
            joueurCourant = ListeJoueur[1];
        } else {
            joueurCourant = ListeJoueur[0];
        }
        lbl_Jcourant.setText(joueurCourant.nom);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(fenetreDeJeu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(fenetreDeJeu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(fenetreDeJeu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(fenetreDeJeu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new fenetreDeJeu().setVisible(true);
            }
        });
    }
    Random generateurAleat = new Random();

    void initialiserPartie() {
        //grilleJeu = new Grille();
        String nomjoueur1 = Nom_joueur_1.getText();
        Joueur J1 = new Joueur(nomjoueur1);

        String nomjoueur2 = Nom_joueur_2.getText();
        Joueur J2 = new Joueur(nomjoueur2);

        ListeJoueur[0] = J1;
        ListeJoueur[1] = J2;

        attribuerCouleursAuxJoueurs();

        System.out.println(J1.nom + " est de couleur " + J1.couleur);
        System.out.println(J2.nom + " est de couleur " + J2.couleur);

        lbl_j1_nom.setText(nomjoueur1);
        lbl_j2_nom.setText(nomjoueur2);
        lbl_j1_couleur.setText(J1.couleur);
        lbl_j2_couleur.setText(J2.couleur);
        lbl_j1_desint.setText(J1.nombreDesintegrateurs + "");
        lbl_j2_desint.setText(J2.nombreDesintegrateurs + "");

        Random r = new Random();
        boolean le_premier = r.nextBoolean();
        if (le_premier) {
            joueurCourant = ListeJoueur[0];
        } else {
            joueurCourant = ListeJoueur[1];
        }
        lbl_Jcourant.setText(joueurCourant.nom);

        Jeton jrouge = new Jeton("rouge");
        Jeton jjaune = new Jeton("jaune");
        if (ListeJoueur[0].couleur == "rouge") {
            for (int i = 0; i < 21; i++) {
                ListeJoueur[0].ajouterJeton(jrouge);
            }
            for (int i = 0; i < 21; i++) {
                ListeJoueur[1].ajouterJeton(jjaune);
            }
        } else {
            for (int i = 0; i < 21; i++) {
                ListeJoueur[0].ajouterJeton(jjaune);
            }
            for (int i = 0; i < 21; i++) {
                ListeJoueur[1].ajouterJeton(jrouge);
            }
        }// donne les jeton aux joueurs selon leur couleur
        for (int i = 0; i < 5; i++) {
            int x = generateurAleat.nextInt(6);
            int y = generateurAleat.nextInt(7);
            int w = generateurAleat.nextInt(6);
            int z = generateurAleat.nextInt(7);
            boolean reussite = grilleJeu.placerTrouNoir(x, y);
            System.out.println(grilleJeu.Cellulejeu[x][y].presenceTrouNoir());
            if (reussite == false) {
                i--;
                continue;
            }
            if (i > 2) {
                grilleJeu.placerDesintegrateur(x, y);
            } else {
                grilleJeu.placerDesintegrateur(w, z);
                if (x == w && y == z) {
                    while (x != w && y != z) {
                        w = generateurAleat.nextInt(6);
                        z = generateurAleat.nextInt(7);
                        grilleJeu.placerDesintegrateur(w, z);
                    }
                }
            }
        }

    }

    void attribuerCouleursAuxJoueurs() {
        int hasard = generateurAleat.nextInt(1);
        if (hasard == 0) {
            ListeJoueur[0].affecterCouleur("jaune");
            ListeJoueur[1].affecterCouleur("rouge");
        } else {
            ListeJoueur[0].affecterCouleur("rouge");
            ListeJoueur[1].affecterCouleur("jaune");
        }
// distribue les couleurs aléatoirement aux joueurs
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Nom_joueur_1;
    private javax.swing.JTextField Nom_joueur_2;
    private javax.swing.JButton btn_col_0;
    private javax.swing.JButton btn_col_1;
    private javax.swing.JButton btn_col_2;
    private javax.swing.JButton btn_col_3;
    private javax.swing.JButton btn_col_4;
    private javax.swing.JButton btn_col_5;
    private javax.swing.JButton btn_col_6;
    private javax.swing.JButton btn_start;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lbl_Jcourant;
    private javax.swing.JLabel lbl_j1_couleur;
    private javax.swing.JLabel lbl_j1_desint;
    private javax.swing.JLabel lbl_j1_nom;
    private javax.swing.JLabel lbl_j2_couleur;
    private javax.swing.JLabel lbl_j2_desint;
    private javax.swing.JLabel lbl_j2_nom;
    private javax.swing.JPanel panneau_creation_outil;
    private javax.swing.JPanel panneau_grille;
    private javax.swing.JPanel panneau_info_jeu;
    private javax.swing.JPanel panneau_info_joueur;
    private javax.swing.JTextArea textemessage;
    // End of variables declaration//GEN-END:variables
}
