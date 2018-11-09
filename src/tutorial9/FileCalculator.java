package tutorial9;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import javax.script.ScriptException;

public class FileCalculator {
    String operator;
    ArrayList <String> lines = new ArrayList<String>();
    ArrayList <Integer> results = new ArrayList<Integer>();
    int [][] numbers;
    String inputPath;
    
    public FileCalculator(String path, String operator){
       this.inputPath = path;
       this.operator = operator;
    }
    
    public void readLineByLine(BufferedReader reader)throws IOException{
    	String line = "";
    	while((line = reader.readLine()) != null) {
    		lines.add(line);
    	}
    	numbers = new int[lines.size()][2];
    }
    
    public void convertToArray(){
    	for (int i = 0; i < lines.size(); i++) {
    		numbers[i][0] = Integer.parseInt(lines.get(i).split(",")[0]);
    		numbers[i][1] = Integer.parseInt(lines.get(i).split(",")[1]);
    	}  
    }
    
    public void calculate()throws ScriptException{
    	if (operator.equals("*")) {
    		for (int i = 0; i < numbers.length; i++) {
    			results.add(numbers[i][0] * numbers[i][1]);
    		}
    	}
    	else if (operator.equals("+")) {
    		for (int i = 0; i < numbers.length; i++) {
    			results.add(numbers[i][0] + numbers[i][1]);
    		}
    	}
    	else if (operator.equals("-")) {
    		for (int i = 0; i < numbers.length; i++) {
    			results.add(numbers[i][0] - numbers[i][1]);
    		}
    	}
    	else {
    		System.out.println("Operator is invalid");
    	}
    }
    
    public void writeToFile()throws IOException{
        String newFile = "answers.txt";
        File file = new File(this.inputPath);
        // create file from input path
        String parentDirectory = this.inputPath.substring(0,file.getAbsolutePath().lastIndexOf(File.separator));
        String newPath = parentDirectory + "/" + newFile;
        System.out.println("Written to: " + newPath);
        // create BufferedWriter from newPath
        BufferedWriter bw = new BufferedWriter(new FileWriter(newPath));
        
        for (int i = 0; i < results.size(); i++) {
        	bw.write(results.get(i) + "\n");
        }
        
        bw.close();
    }
    public static void main(String [] args)throws IOException{
        String path = "C:/Users/100655384/workspace/ObjectOrientedProgramming/src/tutorial9/numbers.txt";
        try{
        	FileCalculator fc = new FileCalculator(path, "+");
        	BufferedReader br = new BufferedReader(new FileReader(path));
        	
        	fc.readLineByLine(br);
        	fc.convertToArray();
        	fc.calculate();
        	fc.writeToFile();
        	
        }catch(FileNotFoundException ex) {
            System.out.println("Unable to open file '" +  path + "'");                
        }catch(ScriptException ex) {
            System.out.println("Error executing operation");                
        }
    }
}

