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
        tableArbeiter = new javax.swing.JTable();
        mitarbeiterEntfernenButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableBauaufträge = new javax.swing.JTable();
        arbeiterÄndernButton = new javax.swing.JButton();
        arbeiterZuBauauftrag = new javax.swing.JButton();
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

        tableArbeiter.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Beruf", "Jahresgehalt", "Einstellungsdatum", "hat Job"
            }
        ));
        jScrollPane1.setViewportView(tableArbeiter);

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

        arbeiterZuBauauftrag.setText("Arbeit geben");
        arbeiterZuBauauftrag.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                arbeiterZuBauauftragActionPerformed(evt);
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
                            .addComponent(arbeiterZuBauauftrag, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                        .addComponent(arbeiterZuBauauftrag)
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
        for (int i = 0; i < Arbeiter.arbeiterListe.size(); i++) {
            if (Arbeiter.arbeiterListe.get(i).getArbeiterID() == mitarbID) {
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
        if (Arbeiter.arbeiterListe.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Wir haben keine Mitarbeiter");
            return;
        }
        ArbeiterVonTabelleEntfernen(tableArbeiter);
        JOptionPane.showMessageDialog(null, "Der Arbeiter wurde erfolgreich entfernt");
    }//GEN-LAST:event_mitarbeiterEntfernenButtonActionPerformed
    //-----------------------------------------
    
    
    //Knopf zum Abändern eines Arbeiters
    //-----------------------------------------
    private void arbeiterÄndernButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_arbeiterÄndernButtonActionPerformed
        //Auch hier machen wir einen try-catch, falls wir das Einstellugnsdatum des Mitarbeiters ändern möchten, die Eingabe falsch machen
        try{
            //Zusätzlich wird bei der if-Abfrage geschaut, ob überhaupt ein Mitarbeiter existiert, wenn nicht, dann führe die Methode "ArbeiterTabelleAbÄndern()" aus :D
            if (Arbeiter.arbeiterListe.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Wir haben keine Mitarbeiter");
                return;
            }
            arbeiterTabelleAbÄndern(tableArbeiter);
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, "Ein Fehler ist aufgetreten");
                return;
            }
        

    }//GEN-LAST:event_arbeiterÄndernButtonActionPerformed
    //-----------------------------------------
    
    //Knopf, um einen Arbeiter, zu einem Bauauftrag hinzuzufügen
    //-----------------------------------------
    private void arbeiterZuBauauftragActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_arbeiterZuBauauftragActionPerformed
        //Hier ein try-catch, weil das Programm eine Exception ausgibt, sobald man keinen Arbeiter und einen Bauauftrag auswählt
        if (Bauauftrag.bauAuftragListe.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Wir haben keine Bauaufträge");
        }
        if (Arbeiter.arbeiterListe.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Wir haben keine Arbeiter");
        }
        //Hier werden verschiedenste if-Abfragen gemacht, um die verschiedensten Fälle abzudecken.
        if (!Bauauftrag.bauAuftragListe.isEmpty()) {
            arbeiterKriegtJob(tableArbeiter, tableBauaufträge, Arbeiter.arbeiterListe.get(tableArbeiter.getSelectedRow()));
        }
        


    }//GEN-LAST:event_arbeiterZuBauauftragActionPerformed
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
            arbeiterWirdArbeitslos(tableArbeiter, tableBauaufträge, Arbeiter.arbeiterListe.get(tableArbeiter.getSelectedRow()));
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
    //-----------------------------------------
    private void bauAuftragEntfernenButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bauAuftragEntfernenButtonActionPerformed
        if(Bauauftrag.bauAuftragListe.isEmpty()){
            JOptionPane.showMessageDialog(null, "Wir haben keine Bauaufträge");
            return;
        }
        bauauftragVonTabelleEntfernen(tableArbeiter, tableBauaufträge);
        JOptionPane.showMessageDialog(null, "Bauauftrag erfolgreich entfernt.");
    }//GEN-LAST:event_bauAuftragEntfernenButtonActionPerformed
    //-----------------------------------------
    
    //Knopf um einen Bauauftrag zu verändern
    //-----------------------------------------
    private void bauAuftragÄndernButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bauAuftragÄndernButtonActionPerformed
        /*
        Hier muss ein try-catch ausgeführt werden, falls man eines der Daten vom Typ "DateTime" verändert werden möchte
        und diesen dann aber falsch eingibt.
        */
        try {
            bauAuftragTabelleAbändern(tableBauaufträge);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ein Fehler ist aufgetreten");
            return;
        }
    }//GEN-LAST:event_bauAuftragÄndernButtonActionPerformed
    //-----------------------------------------
    
    private void zugewieseneArbeiterAnzeigenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zugewieseneArbeiterAnzeigenActionPerformed
        /*
        Hier wird die GUI "zugewieseneMitArbeiter aufgerufen.
        */
        new zugewieseneMitArbeiter(tableBauaufträge).setVisible(true);
    }//GEN-LAST:event_zugewieseneArbeiterAnzeigenActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton arbeiterVonBauauftragLöschenButton;
    private javax.swing.JButton arbeiterZuBauauftrag;
    private javax.swing.JButton arbeiterÄndernButton;
    private javax.swing.JButton bauAuftragEntfernenButton;
    private javax.swing.JButton bauAuftragÄndernButton;
    private javax.swing.JButton bauAufträgeHinzufügenButton;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel mainFrame;
    private javax.swing.JButton mitarbeiterEntfernenButton;
    private javax.swing.JButton mitarbeiterHinzufügenButton;
    private javax.swing.JTable tableArbeiter;
    private javax.swing.JTable tableBauaufträge;
    private javax.swing.JButton zugewieseneArbeiterAnzeigen;
    // End of variables declaration//GEN-END:variables

    public static void main(String[] args) {
        FirmaGUI gui = new FirmaGUI();
    }

    //Methode um Arbeiter in die Tabelle hinzuzufügen
    //----------------------------------------
    public void ArbeiterZurTabelleHinzufügen() {
        /*
        Hier wird erstmal ein Array "row" vom Typ "Object" erstellt. Wir können ganz einfach ein Array nutzen,
        weil die anzahl der Spalten bzw. Attribute fix ist und nicht noch vergrößert bzw.
        verkleinert werden muss. Der Datentyp "Object" ist quasi ein Allrouder unter den
        Datentypen. Der Vorteil ist, dass wir praktisch alles reinpacken können (int, String,Objekte etc.)
        
        Das DefaultTableModel, kann man sich vorstellen wie ein 2-Dimensionales Array. Der Vorteil dieser Klasse ist es,
        dass man ganz einfach rows (zeilen) hinzufügen kann oder Zellen aufrufen kann. Um diesen zu erstellen, wird as model das die
        Tabelle Standartgemäß hat, einfach auf das DefaultTableModel "getypecastet".
        Wichtig ist noch zu wissen, dass es lediglich nur Tabelleneinträge sind. Leider wird allein durch das hinzufügen in die 
        Tabelle, nicht per se ein Objekt erstellt.
        */
        Object[] row = new Object[6];
        DefaultTableModel model = (DefaultTableModel) tableArbeiter.getModel();
        
        //Hier wird jeder Mitarbeiter, in eine "schublade" des Arrays gestellt.
        for (int i = 0; i < Arbeiter.arbeiterListe.size(); i++) {
            row[0] = Arbeiter.arbeiterListe.get(i).getArbeiterID();
            row[1] = Arbeiter.arbeiterListe.get(i).getName();
            row[2] = Arbeiter.arbeiterListe.get(i).getBerufsBezeichnung();
            row[4] = Arbeiter.arbeiterListe.get(i).getEinstellungsDatum();
            row[3] = Arbeiter.arbeiterListe.get(i).getJahresGehalt();
            row[5] = Arbeiter.arbeiterListe.get(i).getHatAuftrag();

            //Diese if-Abfrage hat einen esthetischen Grund, nämlich wenn ein Arbeiter komplett Arbeitslos ist, dann mach ein Kreuz als zeichen.
            if (Arbeiter.arbeiterListe.get(i).getHatAuftrag() == false) {
                row[5] = '✖';
            }

        }
        /*
        Diese Methode macht das entscheidende.... nämlich fügt sie die Tabelle als eine Hintereinanderreihung des Arrays 
        in eine Zeile ein.
        */
        model.addRow(row);
        

    }
    //----------------------------------------
    
    
    //Methode um einen Arbeiter, von der Tabelle zu entfernen
    //----------------------------------------
    public void ArbeiterVonTabelleEntfernen(JTable table) {
        /*
        Auch hier wurde das DefaultTableModel benutzt, um Zeilen zu entfernen oder hinzuzufügen. Auch hier können wir das
        Standartmodel vom JTable, als den DefaultTableModel Typecasten.
        */
        DefaultTableModel model = (DefaultTableModel) this.tableArbeiter.getModel();
        /*
        mit der if-Abfrage, gucken wir ob die Zeile überhautpt elemente enthält. Wenn ein Element Leer ist, hat es im Jtable immer
        den Wert -1. Wenn die Zeile nicht leer ist also nicht den Wert -1 hat, kann das System bedenkenlos die Folgenden Methoden
        ausführen. Die Erste Methode entfern das Objekt, während die zweite Methode lediglich den Tabelleneintrag entfernt.
        */
        if (table.getSelectedRow() != -1) {                                                   
            Arbeiter.arbeiterListe.remove(table.getSelectedRow());
            model.removeRow(table.getSelectedRow());
        }
    }
    //----------------------------------------
    
    //Methode um die Attribute der Arbeiter zu verändern.
    //----------------------------------------
    public void arbeiterTabelleAbÄndern(JTable table) throws Exception  { 
        /*
        Das throws Exception mach ich, damit ich überhaupt den try-catch nutzen kann. Außerdem signalisieren wir mit dem Stichtwort, 
        "throws" dass es sein kann, dass das System ein Exception (plötzlich unerwarteter Fehler) rauswirft und abgefangen werden möchte.
        */
        //Hier nutzen wir wieder das DefaultTableModel, aufgrund seiner bereits genannten Vorteile.
        DefaultTableModel model = (DefaultTableModel) this.tableArbeiter.getModel();
        //Die if-Abfrage überprüft, ob die Zelle leer ist, die wie verändern möchten. 
        if (table.getSelectedRow() != -1) {
            /*
            Nun wollen wür überprüfen, um welche Spalte bzw. Attribut des Objekt es sich handelt. Dazu nutzen wir viele
            if-Abfragen, die alle genau das überprüfen. Alternativ, hätte man die Überprüfung auch mithilfe eines "switch-case"
            machen können. Trifft eines der if-Abfragen zu, dann erscheint ein Eingabefenster, wo wir das neue Attribut eingeben können.
            Nach der Eingabe, wird der neue Eintrag sowohl in der Tabelle, als auch im Objekt verändert.
            */
            if (model.getColumnName(table.getSelectedColumn()) == "ID") {
                int aenderungZahl = Integer.parseInt(JOptionPane.showInputDialog(null, "Geben Sie die neue ID ein?"));
                //Hier wird überprüft, ob die ArbeiterID, bereits vorhanden ist.
                for (int i = 0; i < Arbeiter.arbeiterListe.size(); i++) {
                    if (Arbeiter.arbeiterListe.get(i).getArbeiterID() == aenderungZahl) {
                        JOptionPane.showMessageDialog(null, "Diese ArbeiterID existiert bereits");
                        return;
                    }   
                }
                /*
                Diesen try-catch, müssen wir unbedingt machen, wenn wir die Exception auffangen wollen, die erscheint, wenn man keine
                ganze Zahl eingibt
                */
                model.setValueAt(aenderungZahl, table.getSelectedRow(), table.getSelectedColumn());
                Arbeiter.arbeiterListe.get(table.getSelectedRow()).setArbeiterID(aenderungZahl);
            } else if (model.getColumnName(table.getSelectedColumn()) == "Name") {
                String aenderungWort = JOptionPane.showInputDialog(null, "Geben Sie den neuen Namen ein");
                model.setValueAt(aenderungWort, table.getSelectedRow(), table.getSelectedColumn());
                Arbeiter.arbeiterListe.get(table.getSelectedRow()).setName(aenderungWort);
            } else if (model.getColumnName(table.getSelectedColumn()) == "Beruf") {
                String aenderungWort = JOptionPane.showInputDialog(null, "Geben Sie den neuen Beruf ein");
                model.setValueAt(aenderungWort, table.getSelectedRow(), table.getSelectedColumn());
                Arbeiter.arbeiterListe.get(table.getSelectedRow()).setBerufsBezeichnung(aenderungWort);
            } else if (model.getColumnName(table.getSelectedColumn()) == "Jahresgehalt") {
                double aenderungZahl = Double.parseDouble(JOptionPane.showInputDialog(null, "Geben Sie das neue Gehalt ein"));
                model.setValueAt(aenderungZahl, table.getSelectedRow(), table.getSelectedColumn());
                Arbeiter.arbeiterListe.get(table.getSelectedRow()).setJahresGehalt(aenderungZahl);
            } else if (model.getColumnName(table.getSelectedColumn()) == "Einstellungsdatum") {
                String neuesDatum = JOptionPane.showInputDialog(null, "Geben Sie das neue Einstellungsdatum ein");
                model.setValueAt(Arbeiter.stringZuDatumKonvertieren(neuesDatum), table.getSelectedRow(), table.getSelectedColumn());
                Arbeiter.arbeiterListe.get(table.getSelectedRow()).setEinstellungsDatum(Arbeiter.stringZuDatumKonvertieren(neuesDatum));
            }
           
        }
    }
    //----------------------------------------

    //Methoden für die Bauaufträge
    
    //Methode um den Bauauftrag, zur Tabelle hinzuzufügen
    //----------------------------------------
    public void bauauftragZurTabelleHinzufügen() {
        /*
        Hier ist das Prinzip eigentlich genau gleich wie bei der Methode "ArbeiterZurTabelleHinzufügen()".
        Auch hier wird zunächst ein Array erstellt. Diesmal ist es größer, weil wir für die Klasse Bauauftrag,
        auch mehr Attribute haben als bei der Klasse Arbeiter. Auch hier benutzen wir das DefaultTableModel, damit wir 
        Zeilen bearbeiten und abfragen können.
        */
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
        
        /*
        Auch hier wird werden die Information mittels einer hintereinanderreihung der Elemente des Arrays in eine Zeile eingefügt.
        */
        model.addRow(row);

    }

    //Methode, um Bauauftrag von der Tabelle zu entfernen
    //----------------------------------------
    public void bauauftragVonTabelleEntfernen(JTable table1, JTable table2) {
        //Hier benutzen wir für die methode addRow das DefaultTableModel.
        DefaultTableModel model = (DefaultTableModel) this.tableBauaufträge.getModel();
        //Mit der if-Abfrage überprüfen wir, ob die Reihe leer ist, denn man kann ja nicht nichts entfernen
        if (table2.getSelectedRow() != -1) {
            /*
            Diese Schleife, hat nur einen Esthetischen Aspekt. Wenn ein Bauauftrag entfernt wird, und fügt ein x bei der Spalte
            "hatAuftrag" des Arbeiters, falls das der einzige Job war, den dieser Arbeiter hatte.
            */
            for (int i = 0; i < Bauauftrag.bauAuftragListe.get(table2.getSelectedRow()).getBauAuftragMitArbeiter().size(); i++) {
                Bauauftrag.bauAuftragListe.get(table2.getSelectedRow()).getBauAuftragMitArbeiter().get(i).setHatAuftrag(false);
                table1.setValueAt('✖', i, 5);
            }
            /*
            Diese for-Schleife ist schon etwas wichtiger. Hier ist das so, dass jeder Arbeiter, die Start und Enddaten der Bauaufträge zu denen 
            er zugeteilt wird speichert. Diese for schleife, und die darin enthaltenen if-Abfragen sorgen dafür, dass die Daten dann entfernt werden,
            und der Arbeiter dann diese Zeitspanne wieder frei hat.
            */
            if(!Bauauftrag.bauAuftragListe.get(table2.getSelectedRow()).getBauAuftragMitArbeiter().isEmpty())
            for (int k = 0; k < Arbeiter.arbeiterListe.get(table1.getSelectedRow()).getAuftragsBegin().size();k++){
                if(Arbeiter.arbeiterListe.get(table1.getSelectedRow()).getAuftragsBegin().get(k) == Bauauftrag.bauAuftragListe.get(table2.getSelectedRow()).getStartDatum()){
                    Arbeiter.arbeiterListe.get(table1.getSelectedRow()).getAuftragsBegin().remove(k);
                }
                if(Arbeiter.arbeiterListe.get(table1.getSelectedRow()).getAuftragsEnde().get(k) == Bauauftrag.bauAuftragListe.get(table2.getSelectedRow()).getEndDatum()){
                    Arbeiter.arbeiterListe.get(table1.getSelectedRow()).getAuftragsEnde().remove(k);
                }
            }
            
            /*
            Haben wir die Termine vom arbeiter entfernt, entfernen wir nun das Objekt, und den Tabelleneintrag.
            */
            Bauauftrag.bauAuftragListe.remove(table2.getSelectedRow());
            model.removeRow(table2.getSelectedRow());
            System.out.println(Arbeiter.arbeiterListe.get(table1.getSelectedRow()).getAuftragsBegin());
            System.out.println(Arbeiter.arbeiterListe.get(table1.getSelectedRow()).getAuftragsEnde());
            
        }
    }
    //----------------------------------------
    
    //Methode, um Bauaufträge von der
    //----------------------------------------
    public void bauAuftragTabelleAbändern(JTable table) throws Exception {
        /*
        Hier Funktioniert das Prinzip analog zu der Methode "ArbeiterTabelleAbändern()". 
        */
        DefaultTableModel model = (DefaultTableModel) this.tableBauaufträge.getModel();
        if (table.getSelectedRow() != -1) {
            /*
            Auch hier klappern wir viele Fälle ab um zu überprüfen, welches Attribut wir jetzt verändern müssen.
            */
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
    
    //Methode, um Arbeiter zu einem Bauauftrag zuzuweisen.
    //----------------------------------------
    public void arbeiterKriegtJob(JTable table1, JTable table2, Arbeiter a1) {
        /*
        Hier geben wir diesmal 2 Tabellen, als Parameter an. Anstelle von table1 übergeben wir dann die Tabelle von den Mitarbeitern.
        Anstelle von table2, übergeben wir dann die Tabelle der Bauaufträge.
        */
        //Diese Variable kann man sich wie ein Hebel vorstellen der aktiv werden muss, damit das System den Arbeiter zuweisen kann.
        boolean beschäftigt = false;
        if (Bauauftrag.bauAuftragListe.isEmpty() && Arbeiter.arbeiterListe.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Wir haben keine Bauaufträge und keine Arbeiter");
            return;
        }
        //checkt erstmal, ob ein Mitarbeiter ausgewählt wurde
        if (!table1.isRowSelected(table1.getSelectedRow())) {
            JOptionPane.showMessageDialog(null, "Sie müssen noch einen Arbeiter auswählen");
            return;
        }
        //checkt erstmal, ob ein Bauauftrag ausgewählt wurde
        if (!table2.isRowSelected(table2.getSelectedRow())) {
            JOptionPane.showMessageDialog(null, "Sie müssen noch ein Bauauftrag auswählen.");
            return;
        }
        
        /*
        Diese if-Abfrage dient dazu, dass wenn ein Arbeiter zu einem Job eingetragen wird, wo es ihn nichtmal gab eine Fehlermeldung
        kommt und der Arbeiter dann selbstverständlich nicht eingetragen wird.
        */
        if (Bauauftrag.bauAuftragListe.get(table2.getSelectedRow()).getStartDatum().isBefore(Arbeiter.arbeiterListe.get(table1.getSelectedRow()).getEinstellungsDatum())) {
                JOptionPane.showMessageDialog(null, "Der Arbeiter war zu diesem Zeitpunkt noch nicht eingestellt :DD");
                return;
        }
        
        /*
        Diese for-schleife ist Essenziell für diese Methode. Sie blockt den Arbeiter für einen bestimmten Zeitraum, damit er 
        in diesem Zeitraum nicht für andere Bauaufträge eingetragen werden kann.
        Außerdem wird nochmal geguckt, ob er nicht schon bereits in diesem Auftrag zugeteilt wurde.
        Wenn wir jetzt den Fall haben, dass der Arbeiter für einen bestimmten Auftrag geblockt ist,weil er zu diesem Zeitpunkt beschäfrigt ist,
        dann schaltet sich die variable "beschäftigt" auf "true" und die folgende if-Abfrage fällt negativ aus.
        */
        
        for (int k = 0; k < Arbeiter.arbeiterListe.get(table1.getSelectedRow()).getAuftragsBegin().size(); k++) {
            if(Bauauftrag.bauAuftragListe.get(table2.getSelectedRow()).getBauAuftragMitArbeiter().get(k) == Arbeiter.arbeiterListe.get(table1.getSelectedRow())){
               JOptionPane.showMessageDialog(null, "Dieser Mitarbeiter, ist bereits in diesem Bauauftrag.");
               return;
            }
            if(Arbeiter.arbeiterListe.get(table1.getSelectedRow()).getAuftragsBegin().get(k).isBefore(Bauauftrag.bauAuftragListe.get(table2.getSelectedRow()).getStartDatum()) && Arbeiter.arbeiterListe.get(table1.getSelectedRow()).getAuftragsEnde().get(k).isAfter(Bauauftrag.bauAuftragListe.get(table2.getSelectedRow()).getEndDatum())){
                JOptionPane.showMessageDialog(null, "Der Arbeiter ist zu diesem Zeitpunkt beschäftigt");
                beschäftigt = true;
                return;
            }
        }
        if(beschäftigt == false){
        Bauauftrag.bauAuftragListe.get(table2.getSelectedRow()).getBauAuftragMitArbeiter().add(a1);

        Arbeiter.arbeiterListe.get(table1.getSelectedRow()).getAuftragsBegin().add(Bauauftrag.bauAuftragListe.get(table2.getSelectedRow()).getStartDatum());
        Arbeiter.arbeiterListe.get(table1.getSelectedRow()).getAuftragsEnde().add(Bauauftrag.bauAuftragListe.get(table2.getSelectedRow()).getEndDatum());

        JOptionPane.showMessageDialog(null, "Arbeier erfolgreich hinzugefügt");
        Arbeiter.arbeiterListe.get(table1.getSelectedRow()).setHatAuftrag(true);
        table1.setValueAt('✓', table1.getSelectedRow(), 5);
        Arbeiter.arbeiterListeAusgeben();
        }
    }
    //----------------------------------------
    
    
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

        for (int i = 0; i < Arbeiter.arbeiterListe.get(table1.getSelectedRow()).getAuftragsBegin().size(); i++) {
            if (Arbeiter.arbeiterListe.get(table1.getSelectedRow()).getAuftragsBegin().get(i).equals(Bauauftrag.bauAuftragListe.get(table2.getSelectedRow()).getStartDatum())) {
                Arbeiter.arbeiterListe.get(table1.getSelectedRow()).getAuftragsBegin().remove(i);
                Arbeiter.arbeiterListe.get(table1.getSelectedRow()).getAuftragsEnde().remove(i);
            }
        }

        if (Arbeiter.arbeiterListe.get(table1.getSelectedRow()).getAuftragsBegin().isEmpty()) {
            Arbeiter.arbeiterListe.get(table1.getSelectedRow()).setHatAuftrag(false);
            table1.setValueAt('✖', table1.getSelectedRow(), 5);
        }
        JOptionPane.showMessageDialog(null, "Arbeier erfolgreich entfernt");
    }

}
