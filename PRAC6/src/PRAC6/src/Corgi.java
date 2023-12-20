package PRAC6.src;

class Corgi extends Dog {
    public Corgi(int age) {
        super("Corgi", age);
    }

    @Override
    public void eat() {
        System.out.println("Corgi is eating");
    }
}