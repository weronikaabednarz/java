public class Main {

    Integer liczba = new Integer(9);
    int age = 21;

    public static void main(String[] args) {
        Car car1 = new Car("bmw", "black", 2, 0, 0);
        System.out.println(car1.getColor());
        car1.printAll();
        Car car2 = new Car();
        car2.printAll();
        car2.setBrand("audi");
        car2.printAll();
    }
}