package prac1;

public class Book {
	private String title;
	private int pages;
	public Book(String t, int p) {
		title = t;
		pages = p;
	}
	public Book (String t) {
		title = t;
		pages = 0;
	}
	public Book() {
		title = "Cursed zxc";
		pages = 0;
	}
	public void setTitle (String title){
		this.title = title;
	}
	public void setPages (int pages) {
		this.pages = pages;
	}
	public String getTtitle (String title) {
		return title;
	}
	public int getPages(int pages) {
		return pages;
	}
	public String toString() {
		return this.title+" with "+this.pages+" pages";
	}
	public void differentBooks() {
		System.out.println(title+" with "+pages+" pages");
	}
}