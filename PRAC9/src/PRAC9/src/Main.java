package PRAC9.src;

public class Main {
    public static void main(String[] args) {
        Planet earth = new Planet("Земля");
        System.out.println(earth.getName());

        Car mazda = new Car("mazda");
        System.out.println(mazda.getName());
        
        Car mercedes = new Car("mercedes");
        System.out.println(mercedes.getName());

        Phone realme = new Phone(18700.99);
        System.out.println(realme.getPrice());
        
        Phone iphone = new Phone(68900.99);
        System.out.println(iphone.getPrice());
        

        Book harryPotter = new Book(1400.99);
        System.out.println(harryPotter.getPrice());
    }
}