package assignments.Assignment2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class CircuitCurrent {

	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in);
		
		ArrayList<String> inputs = new ArrayList<String>();
		
		String path = "src/assignments/Assignment2/";
		BufferedWriter bw = new BufferedWriter(new FileWriter(path + "forwardCurrent.txt"));
		
		System.out.println("Please enter the name of the file you would like to read from: ");
		path += scan.nextLine();
		
		try{
        	BufferedReader br = new BufferedReader(new FileReader(new File(path)));
        	inputs = readLineByLine(br);
        	br.close();
        }catch(FileNotFoundException ex) {
            System.out.println("Unable to open file: '" +  path + "'");                
        }
		
		
		
		for (int i = 0; i < inputs.size(); i++) {
			String[] arr = inputs.get(i).split(" ");
			try {
				double current, voltage, resistance = 0;
				double resistor[] = new double[4];
				for (int j = 1; j < 5; j++) {
					resistor[j - 1] = Double.parseDouble(arr[j]);
					resistance += 1 / resistor[j - 1];
				}
				voltage = Double.parseDouble(arr[0]);
				resistance = 1 / resistance;
				current = voltage / resistance;
										
				if (current < 0) {
					System.out.println(voltage + " " + resistor[0] + " " + resistor[1] + " " + resistor[2] + " " + resistor[3]);
				}
				else {
					bw.write(voltage + " " + resistor[0] + " " + resistor[1] + " " + resistor[2] + " " + resistor[3] + "\n");
				}
			}
			catch (NumberFormatException e) {
				continue;
			}
		}
		
		scan.close();
		bw.close();
	}

	public static ArrayList<String> readLineByLine(BufferedReader reader)throws IOException {
    	String input = "";
    	ArrayList<String> list = new ArrayList<String>();

    	input = reader.readLine();
    	
    	while (input != null) {
    		list.add(input);
    		input = reader.readLine();
    	}
    	return list;
    }
}
