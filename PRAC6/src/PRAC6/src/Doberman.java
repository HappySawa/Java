package PRAC6.src;

class Doberman extends Dog {
    public Doberman(int age) {
        super("Doberman", age);
    }

    @Override
    public void eat() {
        System.out.println("Doberman is eating");
    }
}