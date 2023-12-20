package PRAC6.src;

class Shiba_Inu extends Dog {
    public Shiba_Inu(int age) {
        super("Shiba_Inu", age);
    }

    @Override
    public void eat() {
        System.out.println("Shiba_Inu is eating");
    }
}