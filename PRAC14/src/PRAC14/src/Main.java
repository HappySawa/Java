package PRAC14.src;

public class Main {
    public static void main(String[] args) {
        var afs = new UnfairWaitList(7);
        afs.add(4);
        afs.add(6);
        afs.add(1);
        afs.add(9);
        System.out.println(afs);
        System.out.println(afs.getCapacity());
    }
}