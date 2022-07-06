/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package lelelleel;

import java.util.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class FirmaGUI extends JFrame {

    /**
     * Creates new form FirmaGUI
     */
    public FirmaGUI() {
        initComponents();
        this.setContentPane(mainFrame);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    //sorgt dafür, dass sich dass Programm stoppt, sobald das Fenster schließt                                            //passt das Fenster den Knöpfen an
        this.setVisible(true);                                  //sorgt dafür, dass wir das Fenster überhaupt sehenn
        this.setResizable(false);
        this.pack();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainFrame = new javax.swing.JPanel();
        mitarbeiterHinzufügenButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableMitarbeiter = new javax.swing.JTable();
        mitarbeiterEntfernenButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableBauaufträge = new javax.swing.JTable();
        arbeiterÄndernButton = new javax.swing.JButton();
        mitarbetierZuBauauftrag = new javax.swing.JButton();
        arbeiterVonBauauftragLöschenButton = new javax.swing.JButton();
        bauAufträgeHinzufügenButton = new javax.swing.JButton();
        bauauftragÄndernButton = new javax.swing.JButton();
        bauAuftragEntfernenButton = new javax.swing.JButton();
        zugewieseseneArbeiterAnzeigenButton = new javax.swing.JButton();

        setTitle("A&C - GmbH & Co.KG");
        setLocation(new java.awt.Point(0, 0));
        setName("mainFrame"); // NOI18N

        mainFrame.setName(""); // NOI18N

        mitarbeiterHinzufügenButton.setText("Arbeiter hinzufügen");
        mitarbeiterHinzufügenButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mitarbeiterHinzufügenButtonActionPerformed(evt);
            }
        });

        tableMitarbeiter.setAutoCreateRowSorter(true);
        tableMitarbeiter.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Beruf", "Jahresgehalt", "Einstellungsdatum", "hat Job"
            }
        ));
        jScrollPane1.setViewportView(tableMitarbeiter);

        mitarbeiterEntfernenButton.setText("Arbeiter entfernen");
        mitarbeiterEntfernenButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mitarbeiterEntfernenButtonActionPerformed(evt);
            }
        });

        tableBauaufträge.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Auftraggeber", "Adresse", "Ort", "Tätigkeit", "Anfangsdatum", "Enddatum"
            }
        ));
        jScrollPane2.setViewportView(tableBauaufträge);

        arbeiterÄndernButton.setText("Arbeiter ändern");
        arbeiterÄndernButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                arbeiterÄndernButtonActionPerformed(evt);
            }
        });

        mitarbetierZuBauauftrag.setText(">>");
        mitarbetierZuBauauftrag.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mitarbetierZuBauauftragActionPerformed(evt);
            }
        });

        arbeiterVonBauauftragLöschenButton.setText("<<");
        arbeiterVonBauauftragLöschenButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                arbeiterVonBauauftragLöschenButtonActionPerformed(evt);
            }
        });

        bauAufträgeHinzufügenButton.setText("Bauauftrag erstellen");
        bauAufträgeHinzufügenButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bauAufträgeHinzufügenButtonActionPerformed(evt);
            }
        });

        bauauftragÄndernButton.setText("Bauauftrag ändern");
        bauauftragÄndernButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bauauftragÄndernButtonActionPerformed(evt);
            }
        });

        bauAuftragEntfernenButton.setText("Bauauftrag entfernen");
        bauAuftragEntfernenButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bauAuftragEntfernenButtonActionPerformed(evt);
            }
        });

        zugewieseseneArbeiterAnzeigenButton.setText("zugewiesene Arbeiter anzeigen");
        zugewieseseneArbeiterAnzeigenButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zugewieseseneArbeiterAnzeigenButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout mainFrameLayout = new javax.swing.GroupLayout(mainFrame);
        mainFrame.setLayout(mainFrameLayout);
        mainFrameLayout.setHorizontalGroup(
            mainFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainFrameLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(mainFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainFrameLayout.createSequentialGroup()
                        .addComponent(mitarbeiterHinzufügenButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(arbeiterÄndernButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(mitarbeiterEntfernenButton)
                        .addGap(102, 102, 102)
                        .addGroup(mainFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(mainFrameLayout.createSequentialGroup()
                                .addComponent(zugewieseseneArbeiterAnzeigenButton)
                                .addGap(46, 46, 46)
                                .addComponent(bauAuftragEntfernenButton)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(mainFrameLayout.createSequentialGroup()
                                .addComponent(bauAufträgeHinzufügenButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(bauauftragÄndernButton)
                                .addGap(72, 72, 72))))
                    .addGroup(mainFrameLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 481, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(mainFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(mitarbetierZuBauauftrag)
                            .addComponent(arbeiterVonBauauftragLöschenButton))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 497, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        mainFrameLayout.setVerticalGroup(
            mainFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainFrameLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(mainFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(mitarbeiterHinzufügenButton)
                        .addComponent(mitarbeiterEntfernenButton)
                        .addComponent(arbeiterÄndernButton)
                        .addComponent(bauAufträgeHinzufügenButton))
                    .addComponent(bauauftragÄndernButton, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGroup(mainFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainFrameLayout.createSequentialGroup()
                        .addGap(187, 187, 187)
                        .addComponent(mitarbetierZuBauauftrag)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(arbeiterVonBauauftragLöschenButton)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainFrameLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(mainFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(zugewieseseneArbeiterAnzeigenButton)
                            .addComponent(bauAuftragEntfernenButton))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(mainFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane2)
                            .addComponent(jScrollPane1))))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(mainFrame, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(mainFrame, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void mitarbeiterHinzufügenButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mitarbeiterHinzufügenButtonActionPerformed
        String name = JOptionPane.showInputDialog(null, "Name? (Vorname - Nachname)");
        int mitarbID = Integer.parseInt(JOptionPane.showInputDialog(null, "ID?"));
        String berufsBez = JOptionPane.showInputDialog(null, "Berufsbezeichnung?");
        double jahresGehalt = Double.parseDouble(JOptionPane.showInputDialog(null, "Jahresgehalt?"));
        String einstelDat = JOptionPane.showInputDialog(null, "Einstellungsdatum?");
        boolean istVorhanden = false;

        for (int i = 0; i < Arbeiter.mitArbeiterListe.size(); i++) {
            if (Arbeiter.mitArbeiterListe.get(i).getMitarbeiterId() == mitarbID) {
                JOptionPane.showMessageDialog(null, "Diese MitarbeiterID existiert bereits!!");
                istVorhanden = true;
                return;
            }
        }

        if (istVorhanden == false) {
            Arbeiter.arbeiterErstellen(name, mitarbID, berufsBez,jahresGehalt, einstelDat);
            ArbeiterZurTabelleHinzufügen();
        }
    }//GEN-LAST:event_mitarbeiterHinzufügenButtonActionPerformed

    private void mitarbeiterEntfernenButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mitarbeiterEntfernenButtonActionPerformed
        if (Arbeiter.mitArbeiterListe.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Wir haben keine Mitarbeiter");
        } else {
            ArbeiterVonTabelleEntfernen(tableMitarbeiter);
        }
    }//GEN-LAST:event_mitarbeiterEntfernenButtonActionPerformed

    private void arbeiterÄndernButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_arbeiterÄndernButtonActionPerformed
        if (Arbeiter.mitArbeiterListe.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Wir haben keine Mitarbeiter");
        }
        ArbeiterTabelleAbÄndern(tableMitarbeiter);
    }//GEN-LAST:event_arbeiterÄndernButtonActionPerformed

    private void mitarbetierZuBauauftragActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mitarbetierZuBauauftragActionPerformed
        if (!Bauauftrag.bauAuftragListe.isEmpty()) {
            arbeiterKriegtJob(tableMitarbeiter, tableBauaufträge, Arbeiter.mitArbeiterListe.get(tableMitarbeiter.getSelectedRow()));

        }
        if (Bauauftrag.bauAuftragListe.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Wir haben keine Bauaufträge");
        }
        if (Arbeiter.mitArbeiterListe.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Wir haben keine Arbeiter");
        }


    }//GEN-LAST:event_mitarbetierZuBauauftragActionPerformed

    private void arbeiterVonBauauftragLöschenButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_arbeiterVonBauauftragLöschenButtonActionPerformed
        if (Bauauftrag.bauAuftragListe.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Wir haben keine Bauaufträge");
        }
        if (!Bauauftrag.bauAuftragListe.isEmpty()) {
            arbeiterWirdArbeitslos(tableMitarbeiter, tableBauaufträge,Arbeiter.mitArbeiterListe.get(tableMitarbeiter.getSelectedRow()));
        }
    }//GEN-LAST:event_arbeiterVonBauauftragLöschenButtonActionPerformed

    private void bauAufträgeHinzufügenButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bauAufträgeHinzufügenButtonActionPerformed
        int bauauftragID = Integer.parseInt(JOptionPane.showInputDialog(null, "ID?"));
        String auftragGeber = JOptionPane.showInputDialog(null, "Aufftraggeber?");
        String adresse = JOptionPane.showInputDialog(null, "Adresse ?");
        String ort = JOptionPane.showInputDialog(null, "Ort? ");
        String beschreibungg = JOptionPane.showInputDialog(null, "Was wird dort gemacht? ");
        String startDatum = JOptionPane.showInputDialog(null, "Startdatum");
        String endDatumm = JOptionPane.showInputDialog(null, "Enddatum");
        boolean istVorhanden = false;

        for (int i = 0; i < Bauauftrag.bauAuftragListe.size(); i++) {
            if (Bauauftrag.bauAuftragListe.get(i).getBauauftragsID() == bauauftragID) {
                JOptionPane.showMessageDialog(null, "Dieser BauauftragsID existiert bereits :DD");
                istVorhanden = true;
            }
        }
        if (istVorhanden == false) {
            Bauauftrag.bauauftragErstellen(auftragGeber, ort, bauauftragID, adresse, beschreibungg, startDatum, endDatumm);
            bauauftragZurTabelleHinzufügen();
        }
    }//GEN-LAST:event_bauAufträgeHinzufügenButtonActionPerformed

    private void bauAuftragEntfernenButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bauAuftragEntfernenButtonActionPerformed
        bauauftragVonTabelleEntfernen(tableMitarbeiter,tableBauaufträge);
    }//GEN-LAST:event_bauAuftragEntfernenButtonActionPerformed

    private void bauauftragÄndernButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bauauftragÄndernButtonActionPerformed
        bauAuftragTabelleAbändern(tableBauaufträge);
    }//GEN-LAST:event_bauauftragÄndernButtonActionPerformed

    private void zugewieseseneArbeiterAnzeigenButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zugewieseseneArbeiterAnzeigenButtonActionPerformed
        new zugewieseneMitArbeiter(tableBauaufträge).setVisible(true);
    }//GEN-LAST:event_zugewieseseneArbeiterAnzeigenButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton arbeiterVonBauauftragLöschenButton;
    private javax.swing.JButton arbeiterÄndernButton;
    private javax.swing.JButton bauAuftragEntfernenButton;
    private javax.swing.JButton bauAufträgeHinzufügenButton;
    private javax.swing.JButton bauauftragÄndernButton;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel mainFrame;
    private javax.swing.JButton mitarbeiterEntfernenButton;
    private javax.swing.JButton mitarbeiterHinzufügenButton;
    private javax.swing.JButton mitarbetierZuBauauftrag;
    private javax.swing.JTable tableBauaufträge;
    private javax.swing.JTable tableMitarbeiter;
    private javax.swing.JButton zugewieseseneArbeiterAnzeigenButton;
    // End of variables declaration//GEN-END:variables

    public static void main(String[] args) {
        FirmaGUI gui = new FirmaGUI();
    }

    //Methoden für den Arbeiter
    //----------------------------------------
    Object[] row = new Object[6];
    public void ArbeiterZurTabelleHinzufügen() {

        DefaultTableModel model = (DefaultTableModel) tableMitarbeiter.getModel();

        for (int i = 0; i < Arbeiter.mitArbeiterListe.size(); i++) {
            row[0] = Arbeiter.mitArbeiterListe.get(i).getMitarbeiterId();
            row[1] = Arbeiter.mitArbeiterListe.get(i).getName();
            row[2] = Arbeiter.mitArbeiterListe.get(i).getBerufsBezeichnung();
            row[4] = Arbeiter.mitArbeiterListe.get(i).getEinstellungsDatum();
            row[3] = Arbeiter.mitArbeiterListe.get(i).getJahresGehalt();
            row[5] = Arbeiter.mitArbeiterListe.get(i).getHatAuftrag();
            if(Arbeiter.mitArbeiterListe.get(i).getHatAuftrag() == false){
                row[5]= '✖';
            }
            
        }
        

        model.addRow(row);

    }

    public void ArbeiterVonTabelleEntfernen(JTable table) {

        DefaultTableModel model = (DefaultTableModel) this.tableMitarbeiter.getModel();
        if (table.getSelectedRow() != -1) {                                                   // gucken ob die Zeile überhautpt elemente enthält
            Arbeiter.mitArbeiterListe.remove(table.getSelectedRow());
            model.removeRow(table.getSelectedRow());
        }
    }

    public void ArbeiterTabelleAbÄndern(JTable table) {
        DefaultTableModel model = (DefaultTableModel) this.tableMitarbeiter.getModel();
        if (table.getSelectedRow() != -1) {
            // gucken ob die Zeile überhautpt elemente enthält                    //Entfernt das 
            if (model.getColumnName(table.getSelectedColumn()) == "ID") {
                int aenderungZahl = Integer.parseInt(JOptionPane.showInputDialog(null, "was wollen sie an der ID ändern?"));
                model.setValueAt(aenderungZahl, table.getSelectedRow(), table.getSelectedColumn());
                Arbeiter.mitArbeiterListe.get(table.getSelectedRow()).setMitarbeiterId(aenderungZahl);
            } else if (model.getColumnName(table.getSelectedColumn()) == "Name") {
                String aenderungWort = JOptionPane.showInputDialog(null, "was wollen sie am Namen ändern?");
                model.setValueAt(aenderungWort, table.getSelectedRow(), table.getSelectedColumn());
                Arbeiter.mitArbeiterListe.get(table.getSelectedRow()).setName(aenderungWort);
            } else if (model.getColumnName(table.getSelectedColumn()) == "Beruf") {
                String aenderungWort = JOptionPane.showInputDialog(null, "was wollen sie am Beruf ändern?");
                model.setValueAt(aenderungWort, table.getSelectedRow(), table.getSelectedColumn());
                Arbeiter.mitArbeiterListe.get(table.getSelectedRow()).setBerufsBezeichnung(aenderungWort);
            } else if (model.getColumnName(table.getSelectedColumn()) == "Jahresgehalt") {
                double aenderungZahl = Double.parseDouble(JOptionPane.showInputDialog(null, "was wollen sie am Jahresgehalt ändern?"));
                model.setValueAt(aenderungZahl, table.getSelectedRow(), table.getSelectedColumn());
                Arbeiter.mitArbeiterListe.get(table.getSelectedRow()).setJahresGehalt(aenderungZahl);
            } else if (model.getColumnName(table.getSelectedColumn()) == "EinstellungsDatum") {
                String aenderungWort = JOptionPane.showInputDialog(null, "was wollen sie am Einstellungsdatum ändern?");
                model.setValueAt(aenderungWort, table.getSelectedRow(), table.getSelectedColumn());
                Arbeiter.mitArbeiterListe.get(table.getSelectedRow()).setEinstellungsDatum(aenderungWort);

            }
        }
    }
    //----------------------------------------

    //Methoden für die Bauaufträge
    //----------------------------------------
    public void bauauftragZurTabelleHinzufügen() {
        DefaultTableModel model = (DefaultTableModel) tableBauaufträge.getModel();
        Object[] row = new Object[7];

        for (int i = 0; i < Bauauftrag.bauAuftragListe.size(); i++) {
            row[0] = Bauauftrag.bauAuftragListe.get(i).getBauauftragsID();
            row[1] = Bauauftrag.bauAuftragListe.get(i).getAuftragGeber();
            row[2] = Bauauftrag.bauAuftragListe.get(i).getadresse();
            row[3] = Bauauftrag.bauAuftragListe.get(i).getOrt();
            row[4] = Bauauftrag.bauAuftragListe.get(i).getBeschreibung();
            row[5] = Bauauftrag.bauAuftragListe.get(i).getStartDatum();
            row[6] = Bauauftrag.bauAuftragListe.get(i).getEndDatum();

        }

        model.addRow(row);

    }

    public void bauauftragVonTabelleEntfernen(JTable table1,JTable table2) {
        DefaultTableModel model = (DefaultTableModel) this.tableBauaufträge.getModel();
        if (table2.getSelectedRow() != -1) {       
            for(int i = 0; i < Bauauftrag.bauAuftragListe.get(table2.getSelectedRow()).getBauAuftragMitArbeiter().size();i++){
                Bauauftrag.bauAuftragListe.get(table2.getSelectedRow()).getBauAuftragMitArbeiter().get(i).setHatAuftrag(false);
                table1.setValueAt('✖', i, 5);
            }
            Bauauftrag.bauAuftragListe.remove(table2.getSelectedRow());
            model.removeRow(table2.getSelectedRow());
        }
    }

    public void bauAuftragTabelleAbändern(JTable table) {
        DefaultTableModel model = (DefaultTableModel) this.tableBauaufträge.getModel();
        if (table.getSelectedRow() != -1) {
            // gucken ob die Zeile überhautpt elemente enthält                    //Entfernt das 
            if (model.getColumnName(table.getSelectedColumn()) == "ID") {
                int aenderungZahl = Integer.parseInt(JOptionPane.showInputDialog(null, "Geben Sie die neue ID ein"));
                for (int i = 0; i < Bauauftrag.bauAuftragListe.size(); i++) {
                    if (Bauauftrag.bauAuftragListe.get(i).equals(aenderungZahl)) {
                        JOptionPane.showInputDialog(null, "Dieser Bauauftrag exisitert schon :D");
                        return;
                    }
                }
                model.setValueAt(aenderungZahl, table.getSelectedRow(), table.getSelectedColumn());
                Bauauftrag.bauAuftragListe.get(table.getSelectedRow()).setBauauftragsID(aenderungZahl);
            } else if (model.getColumnName(table.getSelectedColumn()) == "Auftraggeber") {
                String aenderungWort = JOptionPane.showInputDialog(null, "Wie soll der neue Auftraggeber heißen?");
                model.setValueAt(aenderungWort, table.getSelectedRow(), table.getSelectedColumn());
                Bauauftrag.bauAuftragListe.get(table.getSelectedRow()).setAuftragGeber(aenderungWort);

            } else if (model.getColumnName(table.getSelectedColumn()) == "Adresse") {
                String aenderungWort = JOptionPane.showInputDialog(null, "Geben Sie die neue Adresse ein");
                model.setValueAt(aenderungWort, table.getSelectedRow(), table.getSelectedColumn());
                Bauauftrag.bauAuftragListe.get(table.getSelectedRow()).setAdresse(aenderungWort);

            } else if (model.getColumnName(table.getSelectedColumn()) == "Ort") {
                String aenderungWort = JOptionPane.showInputDialog(null, "Geben Sie den neuen Ort ein");
                model.setValueAt(aenderungWort, table.getSelectedRow(), table.getSelectedColumn());
                Bauauftrag.bauAuftragListe.get(table.getSelectedRow()).setOrt(aenderungWort);

            } else if (model.getColumnName(table.getSelectedColumn()) == "Tätigkeit") {
                String aenderungWort = JOptionPane.showInputDialog(null, "Geben Sie die neue Tätigkeit ein");
                model.setValueAt(aenderungWort, table.getSelectedRow(), table.getSelectedColumn());
                Bauauftrag.bauAuftragListe.get(table.getSelectedRow()).setBeschreibung(aenderungWort);

            } else if (model.getColumnName(table.getSelectedColumn()) == "Anfangsdatum") {
                String aenderungWort = JOptionPane.showInputDialog(null, "Geben Sie das neue Anfangsdatum ein");
                model.setValueAt(aenderungWort, table.getSelectedRow(), table.getSelectedColumn());
                Bauauftrag.bauAuftragListe.get(table.getSelectedRow()).setStartDatum(aenderungWort);

            } else if (model.getColumnName(table.getSelectedColumn()) == "Enddatum") {
                String aenderungWort = JOptionPane.showInputDialog(null, "Geben Sie das neue Enddatum ein");
                model.setValueAt(aenderungWort, table.getSelectedRow(), table.getSelectedColumn());
                Bauauftrag.bauAuftragListe.get(table.getSelectedRow()).setEndDatum(aenderungWort);
            }
        }
    }

    //----------------------------------------
    public void arbeiterKriegtJob(JTable table1, JTable table2, Arbeiter a1) {
        if (Bauauftrag.bauAuftragListe.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Wir haben keine Bauaufträge");
            return;
        } //checkt erstmal, ob wir überhaupt Mitarbeiter haben :D
        if (!table1.isRowSelected(table1.getSelectedRow())) {
            JOptionPane.showMessageDialog(null, "Sie müssen noch einen Arbeiter auswählen");
            return;
        } //checkt erstmal, ob ein Mitarbeiter ausgewählt wurde
        
        if(Arbeiter.mitArbeiterListe.get(table1.getSelectedRow()).getHatAuftrag() == true){
           JOptionPane.showMessageDialog(null, "Dieser Arbeiter hat schon einen Job");
           return;
        }
        
        if (Arbeiter.mitArbeiterListe.get(table1.getSelectedRow()).getHatAuftrag() == false) {

            Bauauftrag.bauAuftragListe.get(table2.getSelectedRow()).getBauAuftragMitArbeiter().add(a1);
            JOptionPane.showMessageDialog(null, "Arbeier erfolgreich hinzugefügt");
            Arbeiter.mitArbeiterListe.get(table1.getSelectedRow()).setHatAuftrag(true);
            table1.setValueAt('✓', table1.getSelectedRow(), 5);
        }
    }

    public void arbeiterWirdArbeitslos(JTable table1, JTable table2, Arbeiter a1) {
        if (Bauauftrag.bauAuftragListe.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Wir haben keine Bauaufträge");
            return;
        } //checkt erstmal, ob wir überhaupt bauaufträge haben :D

        if (!table1.isRowSelected(table1.getSelectedRow())) {
            JOptionPane.showMessageDialog(null, "Sie müssen noch einen Arbeiter auswählen");
            return;
        } //checkt erstmal, ob ein Mitarbeiter ausgewählt wurde
        
        if(Arbeiter.mitArbeiterListe.get(table1.getSelectedRow()).getHatAuftrag() == false){
           JOptionPane.showMessageDialog(null, "Dieser Arbeiter ist schon Arbeitslos :pp");
           return;
        }

        if (Arbeiter.mitArbeiterListe.get(table1.getSelectedRow()).getHatAuftrag() == true) {
            Bauauftrag.bauAuftragListe.get(table2.getSelectedRow()).getBauAuftragMitArbeiter().remove(a1);
            JOptionPane.showMessageDialog(null, "Arbeier erfolgreich entfernt");
            Arbeiter.mitArbeiterListe.get(table1.getSelectedRow()).setHatAuftrag(false);
            table1.setValueAt('✖', table1.getSelectedRow(), 5);
        }
    }
    
}
