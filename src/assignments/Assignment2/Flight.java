 /**
	SOFE 2710 Assignment 2 
	@author Daniel Nucci 100655384
 */
 
package assignments.Assignment2;

import java.util.Date;

public class Flight {    
    private String id;                     //Flight id
    private Date departureTime;       //Flight departureTime
    private Date arrivalTime;         //Flight arrivalTime
    Airport departureAirport;           //Flight departureAirport
    Airport arrivalAirport;             // Flight arrivalAirport
    Aircraft aircraft;                  // Flight aircraft

    /**
     * full flight constructor
     * @param String id - the flight id
     * @param Date departureTime - the flight departure time
     * @param Date arrivalTime - the flight arrival time
     * @param Airport departureAirport - the airport the flight if coming from
     * @param Airport arrivalAirport - the airport the flight is going to 
     * @param Aircraft aircraft - the aircraft that is performing the flight
     */
    public Flight(String id, Date departureTime, Date arrivalTime, Airport departureAirport, Airport arrivalAirport, Aircraft aircraft) {
        this.id = id;
        this.departureTime = departureTime;
        this.arrivalTime = arrivalTime;
        this.departureAirport = departureAirport;
        this.arrivalAirport = arrivalAirport;
        this.aircraft= aircraft;
    }
    
    @Override
    public String toString() {
    	return this.getId() + " " + this.getAircraft().getName()+ " " + this.getArrivalTime() + " " + this.getDepartureTime();
    }
    
    /**
     * flight id getter 
     * @return String id - the id
     */
    public String getId() {
        return id;
    }

    /**
     * flight departure time getter 
     * @return Date departureTime - the time
     */
    public Date getDepartureTime() {
        return departureTime;
    }

    /**
     * flight arrival time getter 
     * @return Date arrivalTime - the time
     */
    public Date getArrivalTime() {
        return arrivalTime;
    }  

    /**
     * flight aircraft getter
     * @return Aircraft aircraft - the aircraft
     */
    public Aircraft getAircraft() {
        return aircraft;
    }      
  }
