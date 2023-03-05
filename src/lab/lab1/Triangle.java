package lab.lab1;

// implementuje interfejs Printable wiec musze zaimplementowac pod rodzaj figury jego metody
class Triangle extends Figure implements Printable {             //extends-dziedziczy
    private double a;
    private double b;
    private double c;
    //definiuje pole, trojkat ma podstawe i wysokosc

    Triangle(double a, double b, double c) throws Exception {                 //ustawiam pole, ta podstawa ma wartosc taka jaka mu podaje
        if (a < b + c && b < a + c && c < a + b) {
            this.a = a;
            this.b = b;
            this.c = c;
        } else {
            throw new Exception("Can not create triangle!!!");
        }
    }

    @Override
        //override - nadpisuje
    double calculateArea() {
        double p = calculatePerimeter() / 2;
        double area = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        return area;
    }

    @Override
    double calculatePerimeter() {
        double perimeter = a + b + c;
        return perimeter;
    }

    @Override
    public void print() {
        System.out.println("Triangle");
        System.out.println("Side lengths: " + a + ", " + b + ", " + c);
        System.out.println("Area: " + calculateArea());
        System.out.println("Perimeter: " + calculatePerimeter());
    }

}
