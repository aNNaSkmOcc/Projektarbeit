
package lelelleel;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author enesates
 */
public class zugewieseneMitArbeiter extends JFrame {
    
    public zugewieseneMitArbeiter(JTable table)   {       //Erstellt das GUIFenster mit dem Titel Baufirma
        
        if(!table.isRowSelected(table.getSelectedRow())){
            JOptionPane.showMessageDialog(null, "Sie müssen einen Bauauftrag auswählen");
            return;
        }
        initComponents();
        this.setContentPane(jPanel1);                           
        this.setVisible(true);                                  //sorgt dafür, dass wir das Fenster überhaupt sehenn
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.pack();
        ArbeiterZurTabelleHinzufügen(table);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setTitle("zugewiesene Arbeiter");

        jPanel1.setName("lelelelle"); // NOI18N

        jTable1.setAutoCreateRowSorter(true);
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Beruf", "Jahresgehalt", "Einstellungsdatum"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 537, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 347, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables

    public void ArbeiterZurTabelleHinzufügen(JTable table2) {
        
        if(Bauauftrag.bauAuftragListe.get(table2.getSelectedRow()).getBauAuftragMitArbeiter().isEmpty()){
            JOptionPane.showMessageDialog(null, "Diesem Auftrag, wurden keine Mitarbeiter zugeteilt :D");
            return;
        }

        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        Object[] row = new Object[5];

        for (int i = 0; i < Bauauftrag.bauAuftragListe.get(table2.getSelectedRow()).getBauAuftragMitArbeiter().size(); i++) {
            row[0] = Bauauftrag.bauAuftragListe.get(table2.getSelectedRow()).getBauAuftragMitArbeiter().get(i).getMitarbeiterId();
            row[1] = Bauauftrag.bauAuftragListe.get(table2.getSelectedRow()).getBauAuftragMitArbeiter().get(i).getName();
            row[2] = Bauauftrag.bauAuftragListe.get(table2.getSelectedRow()).getBauAuftragMitArbeiter().get(i).getBerufsBezeichnung();
            row[3] = Bauauftrag.bauAuftragListe.get(table2.getSelectedRow()).getBauAuftragMitArbeiter().get(i).getJahresGehalt();
            row[4] = Bauauftrag.bauAuftragListe.get(table2.getSelectedRow()).getBauAuftragMitArbeiter().get(i).getEinstellungsDatum();
            
        model.addRow(row);
        }
    }
    
}
