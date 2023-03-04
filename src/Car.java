public class Car {                  //wszystkie klasy z duzej litery
    private String brand;
    private String color;
    private int age;
    private double velocity;
    private double distance;

    //wygenerowalam konstruktor zeby moc stworzyc obiekt
    public Car(String brand, String color, int age, double velocity, double distance) {
        this.brand = brand;
        this.color = color;
        this.age = age;
        this.velocity = velocity;
        this.distance = distance;
    }

    public Car() {

    }

    //jak chce zeby z innej klasy dostac sie do Color to potrzebuje GET, ktory jest PUBLIC i ma dostep do prywatnego pola kolor
    // a ma dostep bo jest w jednej klasie!!
    public String getColor() {          //stworzylam metode ktora wyciagnie(get) wartosc pola COLOr
        return color;                   //jak mam kilka slow to kazde nastepne jest z duzej litery
    }                                   //uładniam kod ctrl+alt+l
    //GENERATE - GETTER - wszystkie dalam ctrl + a
    public String getBrand() {
        return brand;
    }

    public int getAge() {
        return age;
    }

    public double getVelocity() {
        return velocity;
    }

    public double getDistance() {
        return distance;
    }

    public void printAll() {            //VOID bo niczego nie zwraca, void - proznia
        System.out.println(brand + ", " + color + ", " + age + ", " + velocity + ", " + distance);
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setVelocity(double velocity) {
        this.velocity = velocity;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }
}

