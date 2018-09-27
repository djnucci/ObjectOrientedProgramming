package assignments.Assignment1;

public class IsTriangle {

	public static void main(String[] args) {
		//build line one
		Point p1 = new Point();
		Point p2 = new Point(0, 10);
		Line line1 =new Line(p1, p2);
		//build line two
		Point p3 = new Point();
		Point p4 = new Point(10, 0);
		Line line2 =new Line(p3, p4);
		//build line three
		Point p5 = new Point(0, 10);
		Point p6 = new Point(10, 0);
		Line line3 =new Line(p5, p6);
		
		if (isTriangle(line1, line2, line3)){
			System.out.println("The three lines make a triangle");
		}
		else {
			System.out.println("The three lines do not make a triangle");

		}
		
	}

	/**
	 * Returns if 3 lines make up a triangle
	 * @param line1 - Line
	 * @param line2 - Line
	 * @param line3 - Line
	 * @return true if lines make up a triangle
	 */
	public static Boolean isTriangle(Line line1, Line line2, Line line3){
		double length1 = line1.getLength();
		double length2 = line2.getLength();
		double length3 = line3.getLength();

		if (length1 == 0 || length2 == 0 || length3 == 0){
			return false;
		}
		
		if ((length1 < (length2 + length3)) || (length2 < (length1 + length3)) || (length3 < (length1 + length2))){
			return true;
		}
		
		return false;
	}
	
}
