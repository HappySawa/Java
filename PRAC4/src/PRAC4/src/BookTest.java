package PRAC4.src;

public class BookTest {
	
    public void Test(){
        Book book = new Book("Rayan Gosling", "Drive Sad Ending", 2018);
        System.out.println("Author: " + book.getAuthor());
        System.out.println("Title: " + book.getTitle());
        System.out.println("Year: " + book.getYear());

        book.setAuthor("Rayan Gosling");
        book.setTitle("Drive Happy Ending");
        book.setYear(2021);
        System.out.println("Updated Author: " + book.getAuthor());
        System.out.println("Updated Title: " + book.getTitle());
        System.out.println("Updated Year: " + book.getYear());
    }
}