 /**
	SOFE 2710 Assignment 2 
	@author Daniel Nucci 100655384
 */

package assignments.Assignment2;

public class Pilots {
    private String name;   //pilot name
    private int id;        //pilot id 
	private String role;  //Captain, co-pilot, navigator 

	/**
	 * Full pilots constructor
	 * @param String name - the pilot name
	 * @param int id - the pilot id
	 * @param String role - the role the pilot has (Captain, co-pilot, navigator)
	 */
    public Pilots(String name, int id, String role) {
        this.name = name;
        this.id = id;
		this.role = role;
    }
    
    @Override
    public String toString() {
    	return this.role  + ", " +  this.name + ", " + this.id;
    }
    
    /**
     * checks if the current pilot is flying the given aircraft
     * @param Aircraft aircraft - the aircraft in question
     * @return boolean - if the pilot is on or not
     */
    public boolean isPilotForFlight(Aircraft aircraft) {
    	return aircraft.pilots.contains(this);
    }

    /**
     * pilot name getter
     * @return String name - the name
     */
    public String getName() {
        return name;
    }
    
    /**
     * pilot role getter
     * @return String role - the role
     */
    public String getRole() {
        return role;
    } 
    
    /**
     * pilot id getter
     * @return int id - the id
     */
    public int getId() {
        return id;
    }  
        
}
