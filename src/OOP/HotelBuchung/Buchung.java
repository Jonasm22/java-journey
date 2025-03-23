//Exercise of UebungsExam of University of New-Ulm
package OOP.HotelBuchung;
import java.time.LocalDateTime;

public class Buchung {

    //Propierties
    private int anzahlPersonen;
    private int anzahlTage;
    private LocalDateTime startDatum;
    private String verpflegung;


// Constructor

    public Buchung(int anzahlPersonen, int anzahlTage,
                   LocalDateTime startDatum, String verpflegung){
        super();
        this.anzahlPersonen = anzahlPersonen;
        this.anzahlTage = anzahlTage;
        this.startDatum = startDatum;
        this.verpflegung = verpflegung;

    }


    public static double berechneGesamtPreis (int AnzahlPersonen , int AnzahlTage, String verpflegung) {


        Double GruendPreis = 92.00;

        if(verpflegung == "Frühstück" && AnzahlPersonen == 1) {

            GruendPreis= GruendPreis * 0.90 * AnzahlPersonen * AnzahlTage + 8 ;

        }

        else if(verpflegung == "Halbpension" && AnzahlPersonen == 1) {

            GruendPreis= GruendPreis * 0.90 * AnzahlPersonen * AnzahlTage + 24;
        }

        else if(verpflegung == "Fullpension" && AnzahlPersonen == 1) {

            GruendPreis= GruendPreis * 0.90 * AnzahlPersonen * AnzahlTage + 45;

        }


        else if(verpflegung == "Frühstück" && AnzahlPersonen > 1) {

            GruendPreis= GruendPreis * AnzahlPersonen * AnzahlTage + 8 ;

        }

        else if(verpflegung == "Halbpension" && AnzahlPersonen >1) {

            GruendPreis= GruendPreis * AnzahlPersonen * AnzahlTage + 24;
        }

        else if(verpflegung == "Fullpension" && AnzahlPersonen > 1) {

            GruendPreis= GruendPreis  * AnzahlPersonen * AnzahlTage + 45;

        }


        return GruendPreis;

    }


    //My Main Methode
    public static void main(String[] args) {

        PrintTime Date = new PrintTime();
        var PrintDate = Date.DateAndTime();

        System.out.println("Reservations Date: " + PrintDate);
        System.out.println("Total Preis = " + berechneGesamtPreis(2, 3, "Frühstück"));

    }



}