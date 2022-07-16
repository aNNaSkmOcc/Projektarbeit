/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package lelelleel;

import java.io.File;
import java.io.FileWriter;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class FirmaGUI extends JFrame {

    
    //* Das Hauptfenster der GUI wird erstellt
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
        mitarbeiterZuBauauftrag = new javax.swing.JButton();
        arbeiterVonBauauftragLöschenButton = new javax.swing.JButton();
        bauAufträgeHinzufügenButton = new javax.swing.JButton();
        bauAuftragÄndernButton = new javax.swing.JButton();
        zugewieseneArbeiterAnzeigen = new javax.swing.JButton();
        bauAuftragEntfernenButton = new javax.swing.JButton();

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

        mitarbeiterZuBauauftrag.setText("Arbeit geben");
        mitarbeiterZuBauauftrag.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mitarbeiterZuBauauftragActionPerformed(evt);
            }
        });

        arbeiterVonBauauftragLöschenButton.setText("Arbeit entziehen");
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

        bauAuftragÄndernButton.setText("Bauauftrag ändern");
        bauAuftragÄndernButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bauAuftragÄndernButtonActionPerformed(evt);
            }
        });

        zugewieseneArbeiterAnzeigen.setText("zugewiesene Arbeiter anzeigen");
        zugewieseneArbeiterAnzeigen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zugewieseneArbeiterAnzeigenActionPerformed(evt);
            }
        });

        bauAuftragEntfernenButton.setText("Bauauftrag entfernen");
        bauAuftragEntfernenButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bauAuftragEntfernenButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout mainFrameLayout = new javax.swing.GroupLayout(mainFrame);
        mainFrame.setLayout(mainFrameLayout);
        mainFrameLayout.setHorizontalGroup(
            mainFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainFrameLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(mainFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainFrameLayout.createSequentialGroup()
                        .addComponent(mitarbeiterHinzufügenButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(arbeiterÄndernButton, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(mitarbeiterEntfernenButton)
                        .addGap(15, 15, 15))
                    .addGroup(mainFrameLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 481, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addGroup(mainFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(mainFrameLayout.createSequentialGroup()
                                .addComponent(arbeiterVonBauauftragLöschenButton, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 3, Short.MAX_VALUE))
                            .addComponent(mitarbeiterZuBauauftrag, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(mainFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainFrameLayout.createSequentialGroup()
                        .addComponent(zugewieseneArbeiterAnzeigen)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(bauAuftragEntfernenButton))
                    .addGroup(mainFrameLayout.createSequentialGroup()
                        .addComponent(bauAufträgeHinzufügenButton)
                        .addGap(24, 24, 24)
                        .addComponent(bauAuftragÄndernButton, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 509, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        mainFrameLayout.setVerticalGroup(
            mainFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainFrameLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(mainFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mitarbeiterHinzufügenButton)
                    .addComponent(mitarbeiterEntfernenButton)
                    .addComponent(arbeiterÄndernButton)
                    .addComponent(bauAufträgeHinzufügenButton)
                    .addComponent(bauAuftragÄndernButton))
                .addGroup(mainFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainFrameLayout.createSequentialGroup()
                        .addGap(187, 187, 187)
                        .addComponent(mitarbeiterZuBauauftrag)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(arbeiterVonBauauftragLöschenButton)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainFrameLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(mainFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(zugewieseneArbeiterAnzeigen)
                            .addComponent(bauAuftragEntfernenButton))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(mainFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1)
                            .addComponent(jScrollPane2))))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainFrame, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainFrame, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents
    
    //Knopf zur erstellung eines Mitarbeiters
    //-----------------------------------------
    private void mitarbeiterHinzufügenButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mitarbeiterHinzufügenButtonActionPerformed
        String name = JOptionPane.showInputDialog(null, "Name? (Vorname - Nachname)");
        
        //Hier ein try-catch, damit dass wenn ein String eingegeben wird, das Programm nicht abschmiert
        int mitarbID = 0;
        try {
            mitarbID = Integer.parseInt(JOptionPane.showInputDialog(null, "ID?"));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Hier muss eine Zahl eingegeben werden");
            return;
        }

        String berufsBez = JOptionPane.showInputDialog(null, "Berufsbezeichnung?");
        double jahresGehalt = Double.parseDouble(JOptionPane.showInputDialog(null, "Jahresgehalt?"));
        String einstelDat = JOptionPane.showInputDialog(null, "Einstellungsdatum?");
        boolean istVorhanden = false;
        
        //Hier wird nochmal überprüft, ob die MitarbeiterID bereits existiert oder nicht. Falls er bereits existiert, dann kriegt er den status "istVorhanden"
        for (int i = 0; i < Arbeiter.mitArbeiterListe.size(); i++) {
            if (Arbeiter.mitArbeiterListe.get(i).getMitarbeiterId() == mitarbID) {
                JOptionPane.showMessageDialog(null, "Diese MitarbeiterID existiert bereits!!");
                istVorhanden = true;
                return;
            }
        }
        //Wenn der Mitarbeiter nicht vorhanden ist, dann erstell einen Arbeiter und füge ihn zur Tabelle hinzu.
        //Der try-catch sorgt dafür, dass die Eingabe des Datum vom Typ "DateTime" abgefangen werden kann :D
        if (istVorhanden == false) {
            try {
                Arbeiter.arbeiterErstellen(name, mitarbID, berufsBez, jahresGehalt, Arbeiter.stringZuDatumKonvertieren(einstelDat));
                ArbeiterZurTabelleHinzufügen();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "uupsi da ist wohl was schief gegangen :DD");
            }
        }
    }//GEN-LAST:event_mitarbeiterHinzufügenButtonActionPerformed
    //-----------------------------------------
    
    
    //Knopf zum entfernen des Arbeiters
    //-----------------------------------------
    private void mitarbeiterEntfernenButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mitarbeiterEntfernenButtonActionPerformed
        //Hier wird geschaut, ob es überhaupt Mitarbeiter gibt, denn wir können Mitarbeiter nicht entfernen die nicht existieren.
        //Wenn Mitarbeiter existieren, führe die Methode "ArbeiterVonTabelleEntfernen()" aus.
        if (Arbeiter.mitArbeiterListe.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Wir haben keine Mitarbeiter");
        } else {
            ArbeiterVonTabelleEntfernen(tableMitarbeiter);
        }
    }//GEN-LAST:event_mitarbeiterEntfernenButtonActionPerformed
    //-----------------------------------------
    
    
    //Knopf zum Abändern eines Arbeiters
    //-----------------------------------------
    private void arbeiterÄndernButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_arbeiterÄndernButtonActionPerformed
        //Auch hier machen wir einen try-catch, falls wir das Einstellugnsdatum des Mitarbeiters ändern möchten, die Eingabe falsch machen
        try {
            //Zusätzlich wird bei der if-Abfrage geschaut, ob überhaupt ein Mitarbeiter existiert, wenn nicht, dann führe die Methode "ArbeiterTabelleAbÄndern()" aus :D
            if (Arbeiter.mitArbeiterListe.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Wir haben keine Mitarbeiter");
            }
            ArbeiterTabelleAbÄndern(tableMitarbeiter);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Die Eingabe war wohl nicht ganz so korrekt");
        };

    }//GEN-LAST:event_arbeiterÄndernButtonActionPerformed
    //-----------------------------------------
    
    //Knopf, um einen Arbeiter, zu einem Bauauftrag hinzuzufügen
    //-----------------------------------------
    private void mitarbeiterZuBauauftragActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mitarbeiterZuBauauftragActionPerformed
        //Hier ein try-catch, weil das Programm eine Exception ausgibt, sobald man keinen Arbeiter und einen Bauauftrag auswählt
        try{
        //Hier werden verschiedenste if-Abfragen gemacht, um die verschiedensten Fälle abzudecken.
        if (!Bauauftrag.bauAuftragListe.isEmpty()) {
            arbeiterKriegtJob(tableMitarbeiter, tableBauaufträge, Arbeiter.mitArbeiterListe.get(tableMitarbeiter.getSelectedRow()));
        }
        if (Bauauftrag.bauAuftragListe.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Wir haben keine Bauaufträge");
        }
        if (Arbeiter.mitArbeiterListe.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Wir haben keine Arbeiter");
        }
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, "Sie müssen ein einen Mitarbeiter und ein Bauuaftrag auswählen");
        }


    }//GEN-LAST:event_mitarbeiterZuBauauftragActionPerformed
    //-----------------------------------------
    
    
    //Knopf um einen Arbeiter, von einem Bauauftrag zu entfernen
    //-----------------------------------------
    private void arbeiterVonBauauftragLöschenButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_arbeiterVonBauauftragLöschenButtonActionPerformed
        //Hier eine verschiedene if-Abfragen, um denn fall "Liste leer oder nicht" abzudecken. 
        //Wenn nicht, dann führe die "arbeiterWirdArbeitslos()" Methode aus
        if (Bauauftrag.bauAuftragListe.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Wir haben keine Bauaufträge");
        }
        if (!Bauauftrag.bauAuftragListe.isEmpty()) {
            arbeiterWirdArbeitslos(tableMitarbeiter, tableBauaufträge, Arbeiter.mitArbeiterListe.get(tableMitarbeiter.getSelectedRow()));
        }
    }//GEN-LAST:event_arbeiterVonBauauftragLöschenButtonActionPerformed
    //-----------------------------------------
    
    //Knopf um einen Bauauftrag hinzuzufügen
    //-----------------------------------------
    private void bauAufträgeHinzufügenButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bauAufträgeHinzufügenButtonActionPerformed
        int bauauftragID = 0;
        //Hier wird ein try-catch gemacht, falls anstatt ein Integer, etwas anderes eingegeben wird.
        try {
            bauauftragID = Integer.parseInt(JOptionPane.showInputDialog(null, "ID?"));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Hier muss ein Integer hin diggi");
            return;
        }
        String auftragGeber = JOptionPane.showInputDialog(null, "Aufftraggeber?");
        String adresse = JOptionPane.showInputDialog(null, "Adresse ?");
        String ort = JOptionPane.showInputDialog(null, "Ort? ");
        String beschreibungg = JOptionPane.showInputDialog(null, "Was wird dort gemacht? ");
        String eingabeStartDatum = (JOptionPane.showInputDialog(null, "Startdatum? (Bitte die Eingabe in dd(Tage) - mm(Monat in Zahl) - yyyy(Jahr))"));
        String eingabeEndDatumm = (JOptionPane.showInputDialog(null, "Enddatum? (Bitte die Eingabe in dd(Tage) - mm(Monat in Zahl) - yyyy(Jahr))"));

        boolean istVorhanden = false;
        
        //Hier wird überprüft, ob die eingegebene ID bereits existiert. Denn wenn doch, dann erhält sie den Status "ist Vorhanden"
        for (int i = 0; i < Bauauftrag.bauAuftragListe.size(); i++) {
            if (Bauauftrag.bauAuftragListe.get(i).getBauauftragsID() == bauauftragID) {
                JOptionPane.showMessageDialog(null, "Dieser BauauftragsID existiert bereits :DD");
                istVorhanden = true;
            }
        }
        //Falls der Status nicht "ist Vorhanden" ist, dann erstellt der ein Objekt und fügt ihn zur Tabelle hinzu.
        //Ein try-catch wird für die Eingabe des Datums benötigt, falls man diese falsch eingibt.
        if (istVorhanden == false) {
            try {
                Bauauftrag.bauauftragErstellen(auftragGeber, ort, bauauftragID, adresse, beschreibungg, Bauauftrag.stringZuDatumKonvertieren(eingabeStartDatum), Bauauftrag.stringZuDatumKonvertieren(eingabeEndDatumm));
                bauauftragZurTabelleHinzufügen();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Oh nein das mit dem Datum hat wohl nicht ganz so geklappt :DD");
            }
        }
    }//GEN-LAST:event_bauAufträgeHinzufügenButtonActionPerformed
    //-----------------------------------------
    
    
    //Knopf um einen Bauauftrag zu entfernen
    private void bauAuftragEntfernenButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bauAuftragEntfernenButtonActionPerformed
        if(Bauauftrag.bauAuftragListe.isEmpty()){
            JOptionPane.showMessageDialog(null, "Wir haben keine Bauaufträge");
            return;
        }
        bauauftragVonTabelleEntfernen(tableMitarbeiter, tableBauaufträge);
        JOptionPane.showMessageDialog(null, "Bauauftrag erfolgreich entfernt.");
    }//GEN-LAST:event_bauAuftragEntfernenButtonActionPerformed

    private void bauAuftragÄndernButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bauAuftragÄndernButtonActionPerformed
        try {
            bauAuftragTabelleAbändern(tableBauaufträge);
        } catch (ParseException e) {
            JOptionPane.showMessageDialog(null, "Ohh irgendwas wurde falsch eingegeben :DD");
            return;
        }
    }//GEN-LAST:event_bauAuftragÄndernButtonActionPerformed

    private void zugewieseneArbeiterAnzeigenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zugewieseneArbeiterAnzeigenActionPerformed
        new zugewieseneMitArbeiter(tableBauaufträge).setVisible(true);
    }//GEN-LAST:event_zugewieseneArbeiterAnzeigenActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton arbeiterVonBauauftragLöschenButton;
    private javax.swing.JButton arbeiterÄndernButton;
    private javax.swing.JButton bauAuftragEntfernenButton;
    private javax.swing.JButton bauAuftragÄndernButton;
    private javax.swing.JButton bauAufträgeHinzufügenButton;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel mainFrame;
    private javax.swing.JButton mitarbeiterEntfernenButton;
    private javax.swing.JButton mitarbeiterHinzufügenButton;
    private javax.swing.JButton mitarbeiterZuBauauftrag;
    private javax.swing.JTable tableBauaufträge;
    private javax.swing.JTable tableMitarbeiter;
    private javax.swing.JButton zugewieseneArbeiterAnzeigen;
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

            if (Arbeiter.mitArbeiterListe.get(i).getHatAuftrag() == false) {
                row[5] = '✖';
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

    public void ArbeiterTabelleAbÄndern(JTable table) throws Exception {        //das throws Exception mach ich, damit ich überhaupt den try-catch nutzen kann, denn die Methode wirft ggf einen Fehler der aufgefangen werden möchte :DD
        DefaultTableModel model = (DefaultTableModel) this.tableMitarbeiter.getModel();
        if (table.getSelectedRow() != -1) {
            // gucken ob die Zeile überhautpt elemente enthält                    //Entfernt das 
            if (model.getColumnName(table.getSelectedColumn()) == "ID") {
                int aenderungZahl = Integer.parseInt(JOptionPane.showInputDialog(null, "Geben Sie die neue ID ein?"));
                for (int i = 0; i < Arbeiter.mitArbeiterListe.size(); i++) {
                    if (Arbeiter.mitArbeiterListe.get(i).getMitarbeiterId() == aenderungZahl) {
                        JOptionPane.showMessageDialog(null, "Diese MitarbeiterID existiert bereits");
                        return;
                    }   
                }
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
            } else if (model.getColumnName(table.getSelectedColumn()) == "Einstellungsdatum") {
                String aenderungWort = JOptionPane.showInputDialog(null, "was wollen sie am Einstellungsdatum ändern?");
                model.setValueAt(aenderungWort, table.getSelectedRow(), table.getSelectedColumn());
                Arbeiter.mitArbeiterListe.get(table.getSelectedRow()).setEinstellungsDatum(Arbeiter.stringZuDatumKonvertieren(aenderungWort));

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

    public void bauauftragVonTabelleEntfernen(JTable table1, JTable table2) {
        DefaultTableModel model = (DefaultTableModel) this.tableBauaufträge.getModel();
        if (table2.getSelectedRow() != -1) {
            for (int i = 0; i < Bauauftrag.bauAuftragListe.get(table2.getSelectedRow()).getBauAuftragMitArbeiter().size(); i++) {
                Bauauftrag.bauAuftragListe.get(table2.getSelectedRow()).getBauAuftragMitArbeiter().get(i).setHatAuftrag(false);
                table1.setValueAt('✖', i, 5);
            }
            Bauauftrag.bauAuftragListe.remove(table2.getSelectedRow());
            model.removeRow(table2.getSelectedRow());
        }
    }

    public void bauAuftragTabelleAbändern(JTable table) throws ParseException {
        DefaultTableModel model = (DefaultTableModel) this.tableBauaufträge.getModel();
        if (table.getSelectedRow() != -1) {
            // gucken ob die Zeile überhautpt elemente enthält                    //Entfernt das 
            if (model.getColumnName(table.getSelectedColumn()) == "ID") {
                int aenderungZahl = Integer.parseInt(JOptionPane.showInputDialog(null, "Geben Sie die neue ID ein"));
                for (int i = 0; i < Bauauftrag.bauAuftragListe.size(); i++) {
                    if (Bauauftrag.bauAuftragListe.get(i).getBauauftragsID() == aenderungZahl) {
                        JOptionPane.showMessageDialog(null, "Dieser Bauauftrag exisitert schon :D");
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
                String aenderungWort = JOptionPane.showInputDialog(null, "Geben Sie das neue Anfangsdatum ein!!");
                model.setValueAt(Bauauftrag.stringZuDatumKonvertieren(aenderungWort), table.getSelectedRow(), table.getSelectedColumn());
                Bauauftrag.bauAuftragListe.get(table.getSelectedRow()).setEndDatum(Bauauftrag.stringZuDatumKonvertieren(aenderungWort));

            } else if (model.getColumnName(table.getSelectedColumn()) == "Enddatum") {
                String aenderungWort = JOptionPane.showInputDialog(null, "Geben Sie das neue Enddatum ein!!");
                model.setValueAt(Bauauftrag.stringZuDatumKonvertieren(aenderungWort), table.getSelectedRow(), table.getSelectedColumn());
                Bauauftrag.bauAuftragListe.get(table.getSelectedRow()).setStartDatum(Bauauftrag.stringZuDatumKonvertieren(aenderungWort));
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

        for (int k = 0; k < Arbeiter.mitArbeiterListe.get(table1.getSelectedRow()).getAuftragsBegin().size(); k++) {

            if (Bauauftrag.bauAuftragListe.get(table2.getSelectedRow()).getStartDatum().isBefore(Arbeiter.mitArbeiterListe.get(table1.getSelectedRow()).getEinstellungsDatum()) == true) {
                JOptionPane.showMessageDialog(null, "Der Arbeiter wurde zu diesem Zeitpunkt noch nicht eingestellt :DD");
                return;
            }

            if (!Arbeiter.mitArbeiterListe.get(table1.getSelectedRow()).getAuftragsBegin().get(k).isAfter(Bauauftrag.bauAuftragListe.get(table2.getSelectedRow()).getStartDatum()) && Arbeiter.mitArbeiterListe.get(table1.getSelectedRow()).getAuftragsEnde().get(k).isAfter(Bauauftrag.bauAuftragListe.get(table2.getSelectedRow()).getEndDatum()) == true) {
                JOptionPane.showMessageDialog(null, "Zu diesem Zeitraum ist der Arbeiter bereits beschäftigt :DD");
                return;
            }
            if (Arbeiter.mitArbeiterListe.get(table1.getSelectedRow()).getAuftragsBegin().get(k).isBefore(Bauauftrag.bauAuftragListe.get(table2.getSelectedRow()).getStartDatum()) && Arbeiter.mitArbeiterListe.get(table1.getSelectedRow()).getAuftragsEnde().get(k).isBefore(Bauauftrag.bauAuftragListe.get(table2.getSelectedRow()).getEndDatum()) == true) {
                JOptionPane.showMessageDialog(null, "Zu diesem Zeitraum ist der Arbeiter bereits beschäftigt :DD");
                return;
            }

        }
        Bauauftrag.bauAuftragListe.get(table2.getSelectedRow()).getBauAuftragMitArbeiter().add(a1);

        Arbeiter.mitArbeiterListe.get(table1.getSelectedRow()).getAuftragsBegin().add(Bauauftrag.bauAuftragListe.get(table2.getSelectedRow()).getStartDatum());
        Arbeiter.mitArbeiterListe.get(table1.getSelectedRow()).getAuftragsEnde().add(Bauauftrag.bauAuftragListe.get(table2.getSelectedRow()).getEndDatum());

        JOptionPane.showMessageDialog(null, "Arbeier erfolgreich hinzugefügt");
        Arbeiter.mitArbeiterListe.get(table1.getSelectedRow()).setHatAuftrag(true);
        table1.setValueAt('✓', table1.getSelectedRow(), 5);
        System.out.println(Bauauftrag.bauAuftragListe.get(table2.getSelectedRow()).getStartDatum().isBefore(Arbeiter.mitArbeiterListe.get(table1.getSelectedRow()).getEinstellungsDatum()));

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

        Bauauftrag.bauAuftragListe.get(table2.getSelectedRow()).getBauAuftragMitArbeiter().remove(a1);

        for (int i = 0; i < Arbeiter.mitArbeiterListe.get(table1.getSelectedRow()).getAuftragsBegin().size(); i++) {
            if (Arbeiter.mitArbeiterListe.get(table1.getSelectedRow()).getAuftragsBegin().get(i).equals(Bauauftrag.bauAuftragListe.get(table2.getSelectedRow()).getStartDatum())) {
                Arbeiter.mitArbeiterListe.get(table1.getSelectedRow()).getAuftragsBegin().remove(i);
                Arbeiter.mitArbeiterListe.get(table1.getSelectedRow()).getAuftragsEnde().remove(i);
            }
        }

        if (Arbeiter.mitArbeiterListe.get(table1.getSelectedRow()).getAuftragsBegin().isEmpty()) {
            Arbeiter.mitArbeiterListe.get(table1.getSelectedRow()).setHatAuftrag(false);
            table1.setValueAt('✖', table1.getSelectedRow(), 5);
        }
        JOptionPane.showMessageDialog(null, "Arbeier erfolgreich entfernt");
    }

}
