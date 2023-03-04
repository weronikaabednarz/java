import java.util.ArrayList;
import java.util.List;

public class Człowiek {
    String imie = "Weronika"; //z duzej to obiekt
    String nazwisko;
    int wiek = 20;
    double rozmiarButa = 36.5;
    char rozmiar = 'M';
    String [] zwierzeta = {"pies", "kot", "rybki"};
    static List<String> zwierzetaList = new ArrayList<>(); //alt+enter poprawia bledy jak podkresla i importuje
    //z duzej litery sa nazwy klas, lista to zawsze obiekt
    //lista > tablica
    //pole klasy czlowiek, typu lista przechowujacy liste zwierzat
    public static void main(String[] args) {        //psvm tab - generuje metode main
        zwierzetaList.add("krowa");                 //ctrl+d duplikuje linijke
        zwierzetaList.add("kura");
        zwierzetaList.add("kot");
        zwierzetaList.add("pies");
        zwierzetaList.add("ryba");
        String firstAnimal = zwierzetaList.get(0);                       //get wyciaga element po indeksie, indeks to numer na liscie, od 0
        System.out.println(firstAnimal);
        System.out.println(zwierzetaList.get(0));         //sout tab - wypisuje
        for (String element: zwierzetaList) {               //iteruj elementy po liscie zwierzat
            System.out.println(element);                       //wypisuje elementy
        }
        for (int i = 0; i < zwierzetaList.size(); i++) {            //ide od zera to konca ROZMIARU listy
            System.out.println(zwierzetaList.get(i));               //wypisuje elementy wyciagniete na podstawie indeksu
        }
    }

}
