/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


package tutorial1;

import java.io.PrintStream;

public class Tutorial1Person {
    private String firstName, lastName;
    private int age;


    // Constructor
    public Tutorial1Person(String firstName, String lastName, int age){
    	this.firstName = firstName;
    	this.lastName = lastName;
    	this.age = age;
    }


    // return first name
    public String getFirstName(){
		return firstName;

    }


    // return last name
    public String getLastName(){
		return lastName;

    }


    // return age
    public int getAge(){
		return age;
    	
    }

    //prints a string representing the person ie first name, last name, and age 
    @Override
    public String toString(){
    	return getFirstName() + " " + getLastName() + ", aged: " + getAge();
    }

    // main method i.e entry point to this program
    public static void main(String[] args) {
       Tutorial1Person p1 = new Tutorial1Person("Daniel", "Nucci", 19);

        System.out.println(p1.toString());
        System.out.println(p1.toString().length());

    }

}