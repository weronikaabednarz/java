package lab.lab1;

import java.util.Scanner;                                               //tu ten import SCANNER

public class Main { //tworze maina w klasie XD
    private static Scanner scanner = new Scanner(System.in);                   //zaimportowalam alt+enter

    public static void main(String[] args) {
        boolean run = true;                 //zmienna logiczna true/false
        while (run == true) {                        //true - wykonuj sie bez konca, az ja cie zakoncze
            System.out.println("_______________________________");
            System.out.println("Choose figure: ");
            System.out.println("1. square");
            System.out.println("2. triangle");
            System.out.println("3. circle");
            System.out.println("4. exit");
            int choosenFigure = scanner.nextInt();          //definiuje wprowadzenie
            Figure figure;
            Prism prism;
            double prismHeight;
            switch (choosenFigure) {
                case 1:
                    System.out.println("You've choosen square.");
                    System.out.println("Type side length: ");
                    double b = scanner.nextDouble();
                    try {
                        figure = new Square(b);
                        ((Square) figure).print();
                        System.out.println("Type prisms height: ");
                        prismHeight = scanner.nextDouble();
                        prism = new Prism(figure, prismHeight);
                        prism.print();
                    } catch (Exception ex) {
                        System.out.println(ex.getMessage());
                    }
                    break;
                case 2:
                    System.out.println("You've choosen triangle.");
                    System.out.println("Type side lengths: ");
                    double a = scanner.nextDouble();
                    double d = scanner.nextDouble();
                    double c = scanner.nextDouble();
                    try {                                        //w Try stworzyc trojkat, jak sie nie uda przez zle wymiary to poleci Exception ktory lapiemy w
                        figure = new Triangle(a, d, c);         // catchu - nie wywali nam programu
                        ((Triangle) figure).print();
                        System.out.println("Type prisms height: ");
                        prismHeight = scanner.nextDouble();
                        prism = new Prism(figure, prismHeight);
                        prism.print();
                    } catch (Exception e) {                       //e - to nazwa exception
                        System.out.println(e.getMessage());         //e.getmassage - wez komunikat exception
                    }
                    break;
                case 3:
                    System.out.println("You've choosen circle.");
                    System.out.println("Type side radius: ");
                    double r = scanner.nextDouble();
                    try {
                        figure = new Circle(r);
                        ((Circle) figure).print();                 //rzutuje figure na circle bo on ma printa
                        System.out.println("Type prisms height: ");
                        prismHeight = scanner.nextDouble();
                        prism = new Prism(figure, prismHeight);
                        prism.print();
                    } catch (Exception exc) {
                        System.out.println(exc.getMessage());
                    }
                    break;
                case 4:
                    System.out.println("Exit program");
                    run = false;
                    break;
                default:
                    System.out.println("WRONG CHOICE!!!");
                    break;
            }

        }

    }
}
