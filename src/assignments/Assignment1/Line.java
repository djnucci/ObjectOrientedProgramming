package assignments.Assignment1;

public class Line {
	
	Point p1, p2;
	
	/**
	 * empty constructor
	 */
	public Line() {
		
	}
	
	/**
	 * creates a full populated Line object
	 * @param p1 - Point
	 * @param p2 - Point
	 */
	public Line(Point p1, Point p2){
		this.p1 = new Point();
		this.p2 = new Point();
		
		this.p1.setPosition(p1.getPosition());
		this.p2.setPosition(p2.getPosition());
	}
	
	/**
	 * Gets the length of the line
	 * @return length of the array - double
	 */
	public double getLength(){
		return Math.sqrt(Math.pow((p2.getX() - p1.getX()), 2) + Math.pow((p2.getY() - p1.getY()), 2));
	}
}
