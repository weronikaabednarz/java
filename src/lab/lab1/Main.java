package lab.lab1;

import java.util.Scanner;                                               //tu ten import SCANNER

public class Main { //tworze maina w klasie XD
    private static Scanner scanner = new Scanner(System.in);                   //zaimportowalam alt+enter
    public static void main(String[] args) throws Exception {
        boolean run = true;                 //zmienna logiczna true/false
        while(run==true){                        //true - wykonuj sie bez konca, az ja cie zakoncze XD
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
            switch(choosenFigure){
                case 1:
                    System.out.println("You've choosen square.");
                    System.out.println("Type side length: ");
                    double b = scanner.nextDouble();
                    figure = new Square(b);
                    ((Square) figure).print();
                    System.out.println("Type prisms height: ");
                    prismHeight = scanner.nextDouble();
                    prism = new Prism(figure, prismHeight);
                    prism.print();
                    break;
                case 2:
                    System.out.println("You've choosen triangle.");
                    System.out.println("Type side lengths: ");
                    double a = scanner.nextDouble();
                    double d = scanner.nextDouble();
                    double c = scanner.nextDouble();
                    figure = new Triangle(a, d, c);
                    ((Triangle) figure). print();
                    System.out.println("Type prisms height: ");
                    prismHeight = scanner.nextDouble();
                    prism = new Prism(figure, prismHeight);
                    prism.print();
                    break;
                case 3:
                    System.out.println("You've choosen circle.");
                    System.out.println("Type side radius: ");
                    double r = scanner.nextDouble();
                    figure = new Circle(r);
                    ((Circle) figure). print();                 //rzutuje figure na circle bo on ma printa
                    System.out.println("Type prisms height: ");
                    prismHeight = scanner.nextDouble();
                    prism = new Prism(figure, prismHeight);
                    prism.print();
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
