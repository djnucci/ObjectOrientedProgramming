 /**
	SOFE 2710 Assignment 2 
	@author Daniel Nucci 100655384
 */

package assignments.Assignment2;

import java.util.ArrayList;
import java.util.Date;

public class Airline {
    private String id;              // airline id
    ArrayList<Flight> flights;      // list of fligths for this airline
    ArrayList<Aircraft> aircraft;   // list of aircraft for this airline

    /**
     * Filled Airline constructor
     * @param String id - the airport identifying code
     * @param ArrayList<Flight> flights - a list of flights in the airport
     * @param ArrayList<Aircraft> aircraft - a list of the aircrafts in the airport 
     */
    public Airline(String id, ArrayList<Flight> flights, ArrayList<Aircraft> aircraft) {
        this.id = id;
        this.flights = flights;
        this.aircraft = aircraft;
    }

    /**
     * Id getter 
     * @return String id - the id
     */
    public String getId() {
        return id;
    }

    /**
     * Flight list getter
     * @return ArrayList<Flight> flights - a list of the flights
     */
    public ArrayList<Flight> getFlights() {
        return flights;
    }

    /**
     * Aircraft list getter
     * @return ArrayList<Aircraft> aircraft - a list of the aircrafts
     */
    public ArrayList<Aircraft> getAircraft() {
        return aircraft;
    }
    
       
    /**
     * add an aircraft to an airline
     * If the aircraft is already owned by the airline then the method does nothing.
     * @param Aircraft aircraft - the aircraft to add
     */
    public void owns(Aircraft aircraft){
       if (!this.aircraft.contains(aircraft))
    	  this.aircraft.add(aircraft);
    } 
    
    
    /**
     *	Write a method in the Airline class called printFlightByName() that displays a list of all flights who are own by the current airline. 
     *  This method shows all flights information
     */
   public void printFlightByName(){
	   for (Flight f: flights){
		   System.out.println(f.toString());
	   }   
   } 
   
   
   /**
    * returns an ArrayList containing all pilots who are working in the with the given code.
    * @param int code - pilot code to search for
    * @return ArrayList<Pilots> arr - the array of pilots with that code in the airline
    */
     public ArrayList<Pilots> pilotsWorkingForAirlines(int code){
    	 ArrayList<Pilots> arr = new ArrayList<Pilots>();
    	 for (Aircraft air : aircraft) {
    		 for (Pilots pilot : air.pilots) {
    			 if (pilot.getId() == code) {
    				 arr.add(pilot);
    			 }
    		 }
    	 }
		return arr;
     }
   
     /**
      * Gets all the flights departing at a specified time
      * @param Airport airport - the check airport
      * @param Date departTime - the time the flights leave the airport
      * @return ArrayList<Flight> list - the list of flights
      */
     public ArrayList<Flight> getDepartureFlightByAirport(Airport airport, Date departTime){
	       ArrayList<Flight> list = new ArrayList<Flight>();
    	   for (int i = 0; i < flights.size(); i++) {
    		   if (flights.get(i).departureAirport.equals(airport) && (flights.get(i).getDepartureTime().equals(departTime))) {
	    		   	list.add(flights.get(i));
    		   }
	       }
    	   return list;
     }   
    
     /**
      * Gets all the flights arriving at a specified time
      * @param Airport airport - the check airport
      * @param Date arrivalTime - the time the flights leave the airport
      * @return ArrayList<Flight> list - the list of flights
      */
     public ArrayList<Flight> getArrivalFlightByAirport(Airport airport, Date arrivalTime){
	       ArrayList<Flight> list = new ArrayList<Flight>();
  	   for (int i=0; i<flights.size();i++) {
  		   if (flights.get(i).arrivalAirport.equals(airport) && (flights.get(i).getArrivalTime().equals(arrivalTime))) {
	    		   list.add(flights.get(i));
  		   }
	   }  
  	   return list;
   }   


}
