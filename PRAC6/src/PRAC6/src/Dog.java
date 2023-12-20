package PRAC6.src;

abstract class Dog {
    protected String breed;
    protected int age;

    public Dog(String breed, int age) {
        this.breed = breed;
        this.age = age;
    }

    public abstract void eat();

    public void bark() {
        System.out.println("The dog is barking");
    }
}