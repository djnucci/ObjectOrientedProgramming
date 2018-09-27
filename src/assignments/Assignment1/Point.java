package assignments.Assignment1;

class Point {
	
	private double xVal, yVal;
		
	/**
	 * Basic constructor that sets values to zero
	 */
	public Point(){
		setPosition(0, 0);
	}
	
	/**
	 * Constructor that initializes Point object with a position (x and y value on a 2D plane)
	 * @param xVal - double
	 * @param yVal - double
	 */
	public Point(double xVal, double yVal){
		setPosition(xVal, yVal);
	}
	
	/**
	 * X value setter method
	 * @param xVal - double
	 */
	public void setX(double xVal){
		this.xVal = xVal;
	}
	
	/**
	 * Y value setter method
	 * @param yVal - double
	 */
	public void setY(double yVal){
		this.yVal = yVal;
	}
	
	/**
	 * both x and y value setter at the same time as two separate doubles
	 * @param xVal - double
	 * @param yVal - double
	 */
	public void setPosition(double xVal, double yVal){
		setX(xVal);
		setY(yVal);
	}
	
	/**
	 * both x and y value setter at the same time as a double array
	 * @param values - double[]
	 */
	public void setPosition(double[] values){
		setX(values[0]);
		setY(values[1]);
	}
	
	/**
	 * X value getter method
	 * @return X value - double
	 */
	public double getX(){
		return this.xVal;
	}
	
	/**
	 * X value getter method
	 * @return Y value - double
	 */
	public double getY(){
		return this.yVal;
	}
	
	/**
	 * Position getter method
	 * @return array - double[]
	 */
	public double[] getPosition(){
		double[] array = {xVal, yVal};
		return array;
	}
}
