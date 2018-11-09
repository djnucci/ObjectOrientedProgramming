/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignments.Assignment2;

import java.util.ArrayList;

/**
 *
 * @author 100466561
 */
public class Airline {
    private String id;              // airline id
    ArrayList<Flight> flights;      // list of fligths for this airline
    ArrayList<Aircraft> aircraft;   // list of aircraft for this airline

    public Airline(String id, ArrayList<Flight> flights, ArrayList<Aircraft> aircraft) {
        this.id = id;
        this.flights = flights;
        this.aircraft = aircraft;
    }

    public String getId() {
        return id;
    }

    public ArrayList<Flight> getFlights() {
        return flights;
    }

    public ArrayList<Aircraft> getAircraft() {
        return aircraft;
    }
    
    // add  an aircraft to an airline
    // If the aircraft is already owned by the airline then the method does nothing.   
    
    public void owns(Aircraft aircraft){
       if (!this.aircraft.contains(aircraft))
    	  this.aircraft.add(aircraft);
    } 
    //	Write a method in the Airline class called printFlightByName() that displays a list of all flights who are own by the current airline. 
    //This method should show all flights information
   public void printFlightByName(){
	   for (Flight f: flights){
		   System.out.println(f.getId() + " "+ f.getAircraft().getName()+ " " + f.getArrivalTime() + " " + f.getDepartureTime());
	   }   
   } 
   
   
   //returns an ArrayList containing all pilots who are working in the with the given code.   
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
   
     public ArrayList<Flight> getDepartureFlightByAirport(Airport airport, String departTime){
	       ArrayList<Flight> list = new ArrayList<Flight>();
    	   for (int i=0; i<flights.size();i++){
	    	  if (flights.get(i).departureAirport.equals(airport) & (flights.get(i).getDepartureTime().equals(departTime)))
	    		   list.add(flights.get(i));
	       }
           return list;
     }   
    
     public ArrayList<Flight> getArrivalFlightByAirport(Airport airport, String arrivalTime){
	       ArrayList<Flight> list = new ArrayList<Flight>();
  	   for (int i=0; i<flights.size();i++){
	    	  if (flights.get(i).arrivalAirport.equals(airport) & (flights.get(i).getArrivalTime().equals(arrivalTime)))
	    		   list.add(flights.get(i));
	       }  
	   
         return list;
   }   


}
