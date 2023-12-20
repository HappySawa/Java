package prac1;

public class TestBook {
public static void main(String[] args)
	{	
	Book one = new Book ("Metro", 436);
	Book two = new Book ("Babaika", 214);
	Book three = new Book ("Doka 2", 1007);
	System.out.println(three);
	one.differentBooks();
	two.differentBooks();
	three.differentBooks();
	}
}