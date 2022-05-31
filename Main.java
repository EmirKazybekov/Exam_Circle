
public class Main {
	public static void main(String[] args) {
		Circle circles [] = new Circle[10];

		for (int i = 0; i < circles.length; i++) {
			circles[i] = new Circle(Math.random()*(10-1)+1);			
		}	
		for(int i = 0; i < circles.length; i++) {	
			if(circles[i].getL() % 3 == 0) {
				System.out.println("index = " + i+ ": " + circles[i]);
			}
		}
	}
}		
	


