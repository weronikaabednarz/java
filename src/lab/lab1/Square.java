package lab.lab1;

class Square extends Figure implements Printable {
    //wyjatek informuje o bledach np dzielenie przez 0, tu bedzie przypadek niepoprawnego argumentu konstruktora
    private double b;

    Square(double bok){    //rzuca wyjatek o tym niepoprawnym arg czyt wyzej!!!!
        if(bok <= 0 ){
            throw new IllegalArgumentException("Wrong value!");
        }
        else {
            this.b = bok;
        }
    }

    @Override
    double calculateArea() {
        double area = b * b;
        return area;
    }

    @Override
    double calculatePerimeter() {
        double perimeter = 4 * b;
        return perimeter;
    }

    @Override
    public void print() {
        System.out.println("Square");
        System.out.println("Side length: " + b);
        System.out.println("Area: " + calculateArea());
        System.out.println("Perimeter: " + calculatePerimeter());
    }
}
