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
    
    @Override
    public String toString() {
    	return this.role  + ", " +  this.name + ", " + this.id;
    }
    
    public boolean isPilotForFlight(Aircraft aircraft) {
    	return aircraft.pilots.contains(getName());
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }  
        
}
