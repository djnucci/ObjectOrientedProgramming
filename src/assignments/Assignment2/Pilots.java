 /*
	SOFE 2710 Assignment 2 
	
 */

package assignments.Assignment2;

/**
 *
 * @author   
 */
public class Pilots {
    private String name;   //pilot name
    private int id;        //pilot id 
	private String role;  //Captian, co-pilot, navigator 

    public Pilots(String name, int id, String role) {
        this.name = name;
        this.id = id;
		this.role = role;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }  
        
}
