 /*
	SOFE 2710 Assignment 2 
	
 */
 
package assignments.Assignment2;

import java.util.ArrayList;

/**
 *
 * @author 100466561
 */
public class Airport {
    private String city;    //airport city
    private String country; //airport country
    private String id;      //airport id
    
    public Airport(String city,String country, String id){        
        this.city = city;
        this.country = country;
        this.id = id;        
    }
    
    public String getAirportCity(){
        return city;
    }
    public String getAirportCountry(){
        return country;
    }    
    public String getAirportId(){
        return id;
    }    
  
  

}
