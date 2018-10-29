package tutorial6;

import java.util.*;
import java.lang.Math;

public class Triangle {
    int intB, intA, intH;
    double doubleB, doubleA, doubleH;

    public Triangle(String a, String b){
        this.intB = Integer.parseInt(b);
        this.intA = Integer.parseInt(a);
        this.intH = pythagoreanInt();
        this.doubleB = stringToDouble(b);
        this.doubleA = stringToDouble(a);
        this.doubleH = pythagoreanDouble();
    }
    
    public double stringToDouble(String str){
        return Double.parseDouble(str);
    }
    
    public int stringToInt(String str){
    	return Integer.parseInt(str);
    }
    
    public double pythagoreanDouble(){
    	return Math.sqrt((Math.pow(this.doubleA, 2) + Math.pow(doubleB, 2)));
    }
    
    public int pythagoreanInt(){
    	return (int) Math.sqrt((Math.pow(this.intA, 2) + Math.pow(intB, 2)));
    }
    
    public void areaTriangleInt(){
        int area = ((this.intH * this.intB) / 2);

        System.out.println("Int Area of Triangle: " + area);
        System.out.println("Int Height of Triangle: " + this.intH);
    }
    public void areaTriangleDouble(){
    	double area = ((this.doubleH * this.doubleB) / 2);

        System.out.println("Double Area of Triangle: " + area);
        System.out.println("Double Height of Triangle: " + this.doubleH);
    }

    public static void main(String [] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Input the length: ");
        String a = input.nextLine();

        System.out.println("Input the base: ");
        String b = input.nextLine();

        Triangle tri = new Triangle(a,b);
        tri.areaTriangleDouble();
        tri.areaTriangleInt();
    }
}

