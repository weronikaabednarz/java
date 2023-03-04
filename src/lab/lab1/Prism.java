package lab.lab1;


import java.sql.SQLOutput;

public class Prism implements Printable{
    private Figure base;
    private double h;

    Prism(Figure base, double h){
        this.base = base;
        this.h = h;
    }
    double calculateArea() {
        double area = base.calculatePerimeter() * h + 2 * base.calculateArea();
        return area;
    }
    double calculateVolume() {
        double volume = base.calculateArea() * h;
        return volume;
    }

    @Override
    public void print() {
        System.out.println("Height: " + h);
        System.out.println("Area: " + calculateArea());
        System.out.println("Volume: " + calculateVolume());
    }
}
