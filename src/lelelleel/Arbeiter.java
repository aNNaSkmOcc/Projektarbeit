 package lelelleel;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import javax.swing.*;
import java.util.*;

public class Arbeiter {
    //Attribute

    //-----------------------------------------
    private String name;
    private int mitarbeiterId;
    private String berufsBezeichnung;
    private LocalDate einstellungsDatum;
    private double jahresGehalt;
    private String auftragAnfang;
    private String auftragEnde;
    private boolean hatAuftrag;
    private LinkedList <LocalDate> auftragsBegin;
    private LinkedList <LocalDate> auftragsEnde;
    
    static Scanner scanner = new Scanner(System.in).useDelimiter("\n");
    static LinkedList<Arbeiter> mitArbeiterListe = new LinkedList<Arbeiter>();
    //-----------------------------------------

    //methoden
    //-----------------------------------------
    public static Arbeiter arbeiterErstellen(String name,int mitarbID,String berufsBez,double jahresGehalt,LocalDate einstelDat) {
       
            Arbeiter a1 = new Arbeiter(name, mitarbID, berufsBez, jahresGehalt, einstelDat);
            mitArbeiterListe.add(a1);
        return a1;

    }       //Methode zum erstellen eines Arbeiters

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

    public static LocalDate stringZuDatumKonvertieren(String datum) throws ParseException{
       
    LocalDate datee = LocalDate.parse(datum);
    
    
    return datee;
    }


    //-----------------------------------------


    //konstruktoren
    //-----------------------------------------
    public Arbeiter(String name, int mitarbeiterId, String berufsBezeichnung, double jahresGehalt,LocalDate einstellungsDatum) {
        this.name = name;
        this.mitarbeiterId = mitarbeiterId;
        this.berufsBezeichnung = berufsBezeichnung;
        this.einstellungsDatum = einstellungsDatum;
        this.jahresGehalt = jahresGehalt;
        this.hatAuftrag = false;
        auftragsBegin = new LinkedList<LocalDate>();
        auftragsEnde = new LinkedList<LocalDate>();
    }   //Konstruktor zum erstellen von Arbeitern

                 
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


    public LocalDate getEinstellungsDatum() {
        return einstellungsDatum;
    }

    public void setEinstellungsDatum(LocalDate einstellungsDatum) {
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
    public LinkedList<LocalDate> getAuftragsBegin(){
        return auftragsBegin;
    }
    public LinkedList<LocalDate> getAuftragsEnde(){
        return auftragsEnde;
    }
    
    public static String stringZuDatumKonvertieren(Date date) throws ParseException{
        
       String format = new SimpleDateFormat("dd.MM.yyyy").format(date);
       
        return format;
    }

    //-----------------------------------------
}
