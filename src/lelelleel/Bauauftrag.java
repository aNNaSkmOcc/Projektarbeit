package lelelleel;

import lelelleel.Arbeiter;
import java.util.*;
import javax.swing.SpringLayout;

public class Bauauftrag extends Arbeiter {


    //Attribute
    //----------------------
    private String auftragGeber;
    private String ort;
    private String adresse;
    private String beschreibung;
    private String startDatum;
    private String endDatum;
    private int bauauftragsID;
    

    static Scanner scanner = new Scanner(System.in).useDelimiter("\n");
    static LinkedList<Bauauftrag> bauAuftragListe = new LinkedList<Bauauftrag>();
    static LinkedList<Arbeiter> bauAuftragMitArbeiter;


    //----------------------

    //Methoden

    public static Bauauftrag bauauftragErstellen(String auftragGeber, String ort, int bauauftragsID, String adresse, String beschreibung, String startDatum, String endDatum) {
        
        
        Bauauftrag b1 = new Bauauftrag(bauauftragsID,auftragGeber,adresse, ort, beschreibung, startDatum, endDatum);
        bauAuftragListe.add(b1);
        return b1;
    }


    public static void AuftragListeAusgeben() {
        if (bauAuftragListe.isEmpty()) {
            System.out.println("Die Liste ist Leer du spasti :D");
        }
        for (int j = 0; j < bauAuftragListe.size(); j++) {
            System.out.println("--------------------------");
            Collections.sort(bauAuftragListe, new Comparator<Bauauftrag>() {
                @Override
                public int compare(Bauauftrag o1, Bauauftrag o2) {
                    return Integer.valueOf(o1.bauauftragsID).compareTo(o2.bauauftragsID);
                }
            });
            System.out.println("AuftragsId: " + bauAuftragListe.get(j).getBauauftragsID());
            System.out.println("Auftragsgeber: " + bauAuftragListe.get(j).getAuftragGeber());
            System.out.println("adresse: " + bauAuftragListe.get(j).getadresse());
            System.out.println("ort: " + bauAuftragListe.get(j).getOrt());
            System.out.println("Beschreibung: " + bauAuftragListe.get(j).getBeschreibung());
            System.out.println("AnfangsDatum: " + bauAuftragListe.get(j).getStartDatum());
            System.out.println("Enddatum: " + bauAuftragListe.get(j).getEndDatum());
            System.out.println("Zugewiesene FirmaGUI.Arbeiter: ");
            if (bauAuftragListe.get(j).getBauAuftragMitArbeiter().isEmpty()) {
                System.out.println("keine :D ");
            } else {
                for (int k = 0; k < bauAuftragMitArbeiter.size(); k++) {
                    System.out.println("* "+bauAuftragListe.get(j).getBauAuftragMitArbeiter().get(k).getName());
                }
            }
            System.out.println("--------------------------");
        }
    }


    public static void bauauftragEntfernen() {
        if (bauAuftragListe.isEmpty()) {
            System.out.println("--------------------------");
            System.out.println("Die Liste ist Leer du spasti :D");
            System.out.println("--------------------------");
        } else {


            System.out.println("Welchen Bauauftrag möchten sie entfernen? (ID eingeben)");
            for (int j = 0; j < bauAuftragListe.size(); j++) {
                System.out.println("BauauftragsID: " + bauAuftragListe.get(j).getBauauftragsID());
                System.out.println("Adresse: " + bauAuftragListe.get(j).getadresse());
                System.out.println("Ort: " + bauAuftragListe.get(j).getOrt());
            }
            int delete = scanner.nextInt();
            for (int k = 0; k < bauAuftragListe.size(); k++) {
                if (bauAuftragListe.get(k).getBauauftragsID() == delete) {
                    bauAuftragListe.remove(k);
                }
            }
        }
    }


    public static void bauauftragändern() {
        if (bauAuftragListe.isEmpty()) {
            System.out.println("Du hast keine Mitarbeiter du Opferrrr");
            return;
        } //Wenn die Liste leer ist, dann gib bescheid :D

        System.out.println("Welchen Bauauftrag möchtest du abändern? (ID-Eingeben)");

        for (int j = 0; j < bauAuftragListe.size(); j++) {
            System.out.println("BauauftragsID: " + bauAuftragListe.get(j).getBauauftragsID());
            System.out.println("Auftraggeber: " + bauAuftragListe.get(j).getAuftragGeber());
            System.out.println("Nachname: " + bauAuftragListe.get(j).getadresse());
            System.out.println("Vorname: " + bauAuftragListe.get(j).getOrt());
        } //Gibt alle Mitarbeiter für die Auswahl aus

        int auswahlID = scanner.nextInt();
        System.out.println("Was möchten Sie ändern ?");
        System.out.println("--------------------------");
        System.out.println("0. Beschreibung ändern");
        System.out.println("1. Start/Enddatum ändern");
        System.out.println("2. ID ändern");
        System.out.println("--------------------------");
        System.out.print("Auswahl: ");
        int entscheidung = scanner.nextInt();
        System.out.println("--------------------------");
        switch (entscheidung) {
            case 0: {
                System.out.print("Geben Sie die neue Beschreibung ein: ");
                System.out.print("Neue Beschreibung ");
                String neueBeschreibung = scanner.next();
                for (int i = 0; i < bauAuftragListe.size(); i++) {
                    if (bauAuftragListe.get(i).getBauauftragsID() == auswahlID) {
                        bauAuftragListe.get(i).setBeschreibung(neueBeschreibung.toUpperCase());
                    }
                }
                System.out.println("Die Beschreibung wurde Erfolgreich geändert");
                break;
            }   //Die Beschreibung editieren
            case 1: {
                System.out.print("Geben Sie das Startdatum ein ein: ");
                String neuerStartDatum = scanner.next();
                System.out.println("Geben Sie das neue Enddatum ein");
                String neuesEndDatum = scanner.next();
                for (int i = 0; i < bauAuftragListe.size(); i++) {
                    if (bauAuftragListe.get(i).bauauftragsID == auswahlID) {
                        bauAuftragListe.get(i).setStartDatum(neuerStartDatum.toUpperCase());
                    }// Die Auftragszeit ändern
                }
                System.out.println("Der Start und Enddatum wurden erfolgreich geändert");
                break;
            }   //Das Auftragsdatum ändern
            case 2: {
                System.out.print("Geben Sie die neue ID ein: ");
                int neueID = scanner.nextInt();
                boolean vorhanden = false;
                for (int i = 0; i < bauAuftragListe.size(); i++) {
                    if (bauAuftragListe.get(i).getBauauftragsID() == neueID) {
                        vorhanden = true;
                        System.out.println("Diese BauauftragsID existiert schon");
                    }

                }
            }
        }
    }


    public static void arbeiterZuBauAuftragHinzufügen(Arbeiter a1) {
        //Bauaufträge
    
        

    }
    
    
    public static void arbeiterVonAuftragEntfernen() {
            if (bauAuftragListe.isEmpty()) {
                System.out.println("Wir haben keine Bauaufträge");
                return;
            } //checkt erstmal, ob wir überhaupt Mitarbeiter haben :D
            System.out.println("Aus welchem Auftrag möchtest du ? (ID-eingeben)");
            for (int a = 0; a < bauAuftragListe.size(); a++) {
                System.out.println("--------------------------");
                System.out.println("BauauftragsID: " + bauAuftragListe.get(a).getBauauftragsID());
                System.out.println("Auftraggeber: " + bauAuftragListe.get(a).getAuftragGeber());
                System.out.println("Adresse: " + bauAuftragListe.get(a).getadresse());
                System.out.println("Ort: " + bauAuftragListe.get(a).getOrt());
                System.out.println("--------------------------");
            } //gib alle Bauaufträge aus die ich habe :D
            int auswahlIDBauauftag = scanner.nextInt();            //wähl aus von wem du das haben möchtest :D

            for (int b = 0; b < mitArbeiterListe.size(); b++) {
                if (mitArbeiterListe.get(b).getHatAuftrag() == true) {
                    System.out.println("--------------------------");
                    Collections.sort(mitArbeiterListe, new Comparator<Arbeiter>() {
                        @Override
                        public int compare(Arbeiter o1, Arbeiter o2) {
                            return Integer.valueOf(o1.getMitarbeiterId()).compareTo(o2.getMitarbeiterId());
                        }
                    }); //sortiert die Mitarbeiter nach der ID :D

                    System.out.println("MitarbeiterID: " + mitArbeiterListe.get(b).getMitarbeiterId());
                    System.out.println("Name: " + mitArbeiterListe.get(b).getName());
                    System.out.println("Berufsbezeichnung: " + mitArbeiterListe.get(b).getBerufsBezeichnung());
                    System.out.println("--------------------------");
                }
            } //gib alle Mitarbeiter aus die ich habe :D
            int auswahlIDMitarbeiter = scanner.nextInt();           //such aus, welchen mitarbeiter du rauskicken möchtest .DD

            for(int i = 0; i < bauAuftragListe.size();i++){
                for(int j = 0; j < mitArbeiterListe.size();j++){
                    if(bauAuftragListe.get(i).getBauauftragsID() == auswahlIDBauauftag && mitArbeiterListe.get(j).getMitarbeiterId() == auswahlIDMitarbeiter){
                        bauAuftragListe.get(i).getBauAuftragMitArbeiter().remove(mitArbeiterListe.get(j));
                        System.out.println("Mitarbeiter erfolgreich vom Job entzogen");
                        mitArbeiterListe.get(j).setHatAuftrag(false);
                    }
                }
            }
        }


    //Konstruktor
    //----------------------
    public Bauauftrag(int bauauftragsID, String auftragGeber, String adresse, String ort ,String beschreibung, String startDatum, String endDatum) {
        super();
        this.bauAuftragMitArbeiter = new LinkedList<Arbeiter>();
        this.auftragGeber = auftragGeber;
        this.ort = ort;
        this.bauauftragsID = bauauftragsID;
        this.adresse = adresse;
        this.beschreibung = beschreibung;
        this.startDatum = startDatum;
        this.endDatum = endDatum;
    }
    //----------------------

    //getter und setter
    //----------------------
    public String getAuftragGeber() {
        return auftragGeber;
    }

    public void setAuftragGeber(String auftragGeber) {
        this.auftragGeber = auftragGeber;
    }

    public int getBauauftragsID() {
        return bauauftragsID;
    }

    public void setBauauftragsID(int bauauftragsID) {
        this.bauauftragsID = bauauftragsID;
    }

    public String getOrt() {
        return ort;
    }

    public void setOrt(String ort) {
        this.ort = ort;
    }


    public String getadresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }


    public String getBeschreibung() {
        return beschreibung;
    }

    public void setBeschreibung(String beschreibung) {
        this.beschreibung = beschreibung;
    }


    public String getStartDatum() {
        return startDatum;
    }

    public void setStartDatum(String startDatum) {
        this.startDatum = startDatum;
    }


    public String getEndDatum() {
        return endDatum;
    }

    public void setEndDatum(String endDatum) {
        this.endDatum = endDatum;
    }

    public LinkedList<Arbeiter> getBauAuftragMitArbeiter() {
        return bauAuftragMitArbeiter;
    }

}

