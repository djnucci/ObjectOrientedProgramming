package tutorial8;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class ReadFile {
    public static ArrayList<String> readLineByLine(BufferedReader reader)throws IOException{
    	String input = "";
    	ArrayList<String> list = new ArrayList<String>();

    	input = reader.readLine();
    	
    	while (input != null) {
    		list.add(input);
    		input = reader.readLine();
    	}
    	return list;
    }
    
    public static void writeToFile(String [][] wrestlers, String path)throws IOException{       
    	File file = new File(path);
        String parentDirectory = path.substring(0,file.getAbsolutePath().lastIndexOf(File.separator));
        String newPath = parentDirectory + "/" + "wrestlers.txt";
        System.out.println("Written to: " + newPath);

        BufferedWriter bw = new BufferedWriter(new FileWriter(newPath));
        for (int i = 0; i < wrestlers.length; i++) {
        	bw.write(wrestlers[i][0] + ", " + wrestlers[i][1]);
        	bw.newLine();
        }
        bw.close();
    }
    
    public static String[] convertToArray(ArrayList<String> names){
    	String[] newArray = new String[names.size()];
    	for (int i = 0; i < names.size(); i++) {
    		newArray[i] = names.get(i);
    	}
    	return newArray;
    }
    
    public static String[][] getAge(String[] actors){
    	Scanner scan = new Scanner(System.in);
    	
    	String[][] ages = new String[actors.length][2];
    	
    	for (int i = 0; i < actors.length; i++) {
    		ages[i][0] = actors[i];
    		System.out.println("Enter the age of wrestler " + actors[i] + ": ");
    		ages[i][1] = scan.nextLine();
    	}
    	scan.close();
    	return ages;
    }
    
    public static void main(String [] args)throws IOException{
        //String path = "/home/neil/Documents/object-oriented-programming/Tutorial 8/solution/names.txt";
        String path = "C:/Users/100655384/workspace/ObjectOrientedProgramming/src/tutorial8/names.txt";
        try{
        	BufferedReader br = new BufferedReader(new FileReader(path));
        	writeToFile(getAge(convertToArray(readLineByLine(br))), path);
        	br.close();
        }catch(FileNotFoundException ex) {
            System.out.println("Unable to open file '" +  path + "'");                
        }
        
    }
    
}

