package prac1;

public class TestBall {
public static void main(String[] args)
	{
	Ball one = new Ball("Red ball", 3);
	Ball two = new Ball("Back ball", 1);
	Ball three = new Ball("Blue ball", 5);
	System.out.println (one);
	one.differentBalls();
	two.differentBalls();
	three.differentBalls();
	}
}