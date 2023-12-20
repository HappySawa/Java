package PRAC10.src;

public class Main {
    public static void main(String[] args) {
        var rec = new Recursions();
        System.out.println(rec.SumOfNumbersFromNumber(20));
        System.out.println(rec.FromLeftToRight(123456));
        System.out.println (rec.GetTriangleSequence(10));
        System.out.println (rec.FromRightToLeft(123456));
        System.out.println (rec.FromOneToN(20));
    }
}