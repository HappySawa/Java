package prac1;

public class Ball {
	private String colour;
	private int massa;
	
	public Ball (String c, int m) {
		colour = c;
		massa = m;
		}
		public Ball (String c) {
		colour = c;
		massa = 0;
		}
		public Ball() {
		colour = "white ball";
		massa = 0;
		}
		public void setMassa( int massa) {
			this.massa = massa;
		}
		public void setColour(String colour) {
			this.colour = colour;
		}
		public String getColour(String colour) {
			return colour;
		}
		public int getMassa() {
			return massa;
		}
		public String toString() {
			return this.colour +", massa "+this.massa+" kg ";
		}
		public void differentBalls () {
			System.out.println(colour+ " has a mass of "+massa+" kg");
		}
}
