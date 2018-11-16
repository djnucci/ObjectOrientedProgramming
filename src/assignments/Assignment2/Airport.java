 /**
	SOFE 2710 Assignment 2 
	@author Daniel Nucci 100655384
 */
 
package assignments.Assignment2;

public class Airport {
    private String city;    //airport city
    private String country; //airport country
    private String id;      //airport id
    
    /**
     * Filled Airport constructor
     * @param String city - the city the airport is in
     * @param String country - the country the airport is in
     * @param String id - the identifying code of the airport (ie YYZ)
     */
    public Airport(String city, String country, String id){        
        this.city = city;
        this.country = country;
        this.id = id;        
    }
    
    /**
     * Airport city getter 
     * @return String city - the city
     */
    public String getAirportCity(){
        return city;
    }
    
    /**
     * Airport country getter 
     * @return String country - the country
     */
    public String getAirportCountry(){
        return country;
    }    
    
    /**
     * Airport id getter 
     * @return String id - the id
     */
    public String getAirportId(){
        return id;
    }    
  
  

}
