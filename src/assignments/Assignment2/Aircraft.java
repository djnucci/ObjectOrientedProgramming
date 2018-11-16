/**
	SOFE 2710 Assignment 2 
	@author Daniel Nucci 100655384
*/

package assignments.Assignment2;

import java.util.ArrayList;


public class Aircraft {
	private String name; // Aircraft name
	private String state; // Aircraft state : working/under repair
	private String flightState; // landed/Airborme
	ArrayList<Pilots> pilots; // list of all pilots for the aircraft

	/**
	 * Constructs a full aircraft
	 * @param String name - the name of the aircraft
	 * @param String state -  the current state of the aircraft (working, under repair, etc.)
	 * @param String flightState - landed/Airborme
	 * @param ArrayList<Pilots> pilots - all the pilots flying the aircraft
	 */
	public Aircraft(String name, String state, String flightState, ArrayList<Pilots> pilots) {
		this.name = name;
		this.state = state;
		this.flightState = flightState;
		this.pilots = pilots;
	}

	/**
	 * Adds a pilot to the aircraft
	 * @param Pilot pilot - the pilot object to add
	 */
	public void joinPilot(Pilots pilot) {
		pilots.add(pilot);
	}

	/**
	 * Prints a list of the pilots crafting the aircraft
	 */
	public void printPilot() {
		for (Pilots pilot : pilots) {
			System.out.println(pilot.toString());
		}
	}

	/**
	 * Flight name getter
	 * @return String name - the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * Aircraft state getter
	 * @return String state - the state
	 */
	public String getState() {
		return state;
	}

	/**
	 * Flight state getter
	 * @return String flightState - the state
	 */
	public String getFlightState() {
		return flightState;
	}

}
