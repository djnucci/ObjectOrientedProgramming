package tutorial3;
/**
 * Rectangle Class
 *
 * @author Neil
 * @version 2.00, 25 Sep 2017
 */
public class Rectangle{
  int x,y,w,h;
    /**
     * Constructor that populates the start position and dimensions of the rectangle
     * @param x - int
     * @param y - int
     * @param w - int
     * @param h - int
     */
    public Rectangle(int x, int y, int w, int h){
      this.x = x;
      this.y = y;
      this.w = w;
      this.h = h;
    }

    /**
     * Moves the position by the specified amount (x, y)
     * @param x - int
     * @param y - int
     */
    public void translate(int x, int y){
      this.x += x;
      this.y += y;
    }

    /**
     * Returns the area
     * @return area - int
     */
    public int area(){
      return this.w * this.h;
    }

     /**
      * returns the perimeter
      * @return perimeter - int
      */
    public int getPerimeter(){
      return 2 * (this.w + this.h);
    }

    /**
     * getter for the width
     * @return width - int
     */
   public int getWidth(){
      return this.w;
    }

    /**
     * getter for 
     * @return
     */
    public int getHeight(){
      return this.h;
    }

    /**
     * 
     * @return
     */
    public int getX(){
      return this.x;
    }

    /**
     * 
     * @return
     */
    public int getY(){
      return this.y;
    }
}
