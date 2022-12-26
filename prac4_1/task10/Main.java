package prac.prac4_1.task10;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("12 часов", "5700 рублей");
        Airplane airplane = new Airplane("1 час", "4000 рублей");
        Train train = new Train("8 часов", "3000 рублей");
        Ship ship = new Ship("19 часов", "8000 рублей");
        System.out.println(car);
        System.out.println(airplane);
        System.out.println(train);
        System.out.println(ship);
    }
}
