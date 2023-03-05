package lab.lab1;

class Circle extends Figure implements Printable {

    private double r;
    private double pi = 3.14;

    Circle(double r) throws Exception {
        if (r <= 0) {
            throw new IllegalArgumentException("Wrong value!");
        } else {
            this.r = r;
        }
    }

    @Override
    double calculateArea() {
        double area = pi * r * r;
        return area;
    }

    @Override
    double calculatePerimeter() {
        double perimeter = 2 * pi * r;
        return perimeter;
    }

    @Override
    public void print() {
        System.out.println("Circle");
        System.out.println("Radius: " + r);
        System.out.println("Area: " + calculateArea());
        System.out.println("Perimeter: " + calculatePerimeter());
    }

}
