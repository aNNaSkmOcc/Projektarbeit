package lelelleel;

import javax.swing.*;
import java.util.*;

public class Arbeiter {


    //Attribute

    //-----------------------------------------
    private String name;
    private int mitarbeiterId;
    private String berufsBezeichnung;
    private String einstellungsDatum;
    private double jahresGehalt;

    private boolean hatAuftrag;
    static Scanner scanner = new Scanner(System.in).useDelimiter("\n");
    static LinkedList<Arbeiter> mitArbeiterListe = new LinkedList<Arbeiter>();
    //-----------------------------------------

    //methoden
    //-----------------------------------------
    public static Arbeiter arbeiterErstellen(String name,int mitarbID,String berufsBez,String einstelDat,double jahresGehalt) {
       
            Arbeiter a1 = new Arbeiter(name, mitarbID, berufsBez, einstelDat, jahresGehalt);
            mitArbeiterListe.add(a1);
        return a1;

    }       //Methode zum erstellen eines Arbeiters

    public static void arbeiterEntfernen() {
      
            int delete = Integer.parseInt(JOptionPane.showInputDialog(null,"Welchen Mitarbeiter möchten Sie entfernen?"));
            for (int k = 0; k < mitArbeiterListe.size(); k++) {
                if (mitArbeiterListe.get(k).getMitarbeiterId() == delete) {
                    mitArbeiterListe.remove(k);
                }
            }
        }                  //Um einen Mitarbeiter zu entfernen

    public static void arbeiterListeAusgeben() {
        if (mitArbeiterListe.isEmpty()) {
            System.out.println("Die Liste ist Leer du spasti :D");
        }
        
        for (int j = 0; j < mitArbeiterListe.size(); j++) {
            
            System.out.println("Stelle im Array: "+j);
            System.out.println("MitarbeiterID: " + mitArbeiterListe.get(j).getMitarbeiterId());
            System.out.println("Name: " + mitArbeiterListe.get(j).getName());
            System.out.println("Berufsvezeichnung: " + mitArbeiterListe.get(j).getBerufsBezeichnung());
            System.out.println("Einstellungsdatum: " + mitArbeiterListe.get(j).getEinstellungsDatum());
            System.out.println("Jahresgehalt: " + mitArbeiterListe.get(j).getJahresGehalt());
            System.out.println("--------------------------");
        }
    }       //Um alle Mitarbeiter auszugeben

    public static void arbeiterAbändern() {
    
        int auswahlID = scanner.nextInt();
        System.out.println("Was möchten Sie ändern ?");
        System.out.println("--------------------------");
        System.out.println("0. Name ändern");
        System.out.println("1. ID ändern");
        System.out.println("--------------------------");
        System.out.print("Auswahl: ");
        int entscheidung = scanner.nextInt();
        System.out.println("--------------------------");
        switch (entscheidung) {
            case 0: {
                System.out.println("Geben Sie den neuen Namen ein: ");
                System.out.print("Neuer Vorname: ");
                String neuerName = scanner.next();
                for (int i = 0; i < mitArbeiterListe.size(); i++) {
                    if (mitArbeiterListe.get(i).getMitarbeiterId() == auswahlID) {
                        mitArbeiterListe.get(i).setName(neuerName);
                    }
                }
                System.out.println("Der Name wurde erfolgreich geändert");
                break;
            }   //Den Namen Editieren
            case 1: {
                System.out.print("Geben Sie die neue ID ein: ");
                int neueID = scanner.nextInt();
                boolean vorhanden = false;
                for (int i = 0; i < mitArbeiterListe.size(); i++) {
                    if (mitArbeiterListe.get(i).getMitarbeiterId() == neueID) {
                        vorhanden = true;
                        System.out.println("Diese MitarbeiterID existiert schon");
                    }

                }
                if (vorhanden == false) {
                    for (int k = 0; k < mitArbeiterListe.size(); k++) {
                        if (mitArbeiterListe.get(k).getMitarbeiterId() == auswahlID) {
                            mitArbeiterListe.get(k).setMitarbeiterId(neueID);
                            System.out.println("Die MitarbeiterID wurde erfolgreich geändert");
                        }
                    }
                }
                break;
            }   //Die MitarbeiterID editieren

        }
    }           //Um einzelne Mitarbeiter zu bearbeiten :DD


    //-----------------------------------------


    //konstruktoren
    //-----------------------------------------
    public Arbeiter(String name, int mitarbeiterId, String berufsBezeichnung, String einstellungsDatum, double jahresGehalt) {
        this.name = name;
        this.mitarbeiterId = mitarbeiterId;
        this.berufsBezeichnung = berufsBezeichnung;
        this.einstellungsDatum = einstellungsDatum;
        this.jahresGehalt = jahresGehalt;
        this.hatAuftrag = false;
    }   //Konstruktor zum erstellen von Arbeitern

    public Arbeiter() {
    }               //Standartkonstruktor für die Veerbung nach Bauauftrag
    //-----------------------------------------

    //getter & setter

    //-----------------------------------------

    public int getMitarbeiterId() {
        return mitarbeiterId;
    }

    public void setMitarbeiterId(int mitarbeiterId) {
        this.mitarbeiterId = mitarbeiterId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getBerufsBezeichnung() {
        return berufsBezeichnung;
    }

    public void setBerufsBezeichnung(String berufsBezeichnung) {
        this.berufsBezeichnung = berufsBezeichnung;
    }


    public String getEinstellungsDatum() {
        return einstellungsDatum;
    }

    public void setEinstellungsDatum(String einstellungsDatum) {
        this.einstellungsDatum = einstellungsDatum;
    }

    public double getJahresGehalt() {
        return jahresGehalt;
    }

    public void setJahresGehalt(double jahresGehalt) {
        this.jahresGehalt = jahresGehalt;
    }

    public boolean getHatAuftrag() {
        return hatAuftrag;
    }

    public void setHatAuftrag(boolean hatAuftrag) {
        this.hatAuftrag = hatAuftrag;
    }

    public static LinkedList<Arbeiter> getMitArbeiterListe(){
        return mitArbeiterListe;
    }

    public static void listeZuArray(){
        mitArbeiterListe.toArray();
    }

    //-----------------------------------------
}
