package tutorial3;

public class Signature {
    private String first, last;
    
    /**
     * Constuctor that takes in a first and a last name
     * @param first - String
     * @param last - String
     */
    public Signature(String first, String last){
    	this.first = first;
    	this.last = last;
    }
    /**
     * return length of first name
     * @return length - int
     */
    public int lengthFirst(){
        return first.length();
    }
    /**
     * return length of last name
     * @return length - int
     */
    public int lengthLast(){
        return last.length();
    }
    /**
     * getter for first name
     * @return name - String
     */
    public String getFirst(){
        return this.first;
    }
    
    /**
     * getter for last name
     * @return - String
     */
    public String getLast(){
    	return this.last;   
    }
    
    /**
     * setter for first name
     * @param first - String
     */
    public void setFirst(String str){
        this.first = str;
    }
    
    /**
     * setter for last name
     * @param last - String
     */
    public void setLast(String str){
    	this.last = str;   
    }
    
    
    public String getFull(){
        return getFirst() + " " + getLast();
    } 
    
    /**
     * get full name and check if full name contains substring
     * @param str - String
     * @return ifContains - boolean
     */
    public boolean contains(String str){
    	return getFull().contains(str);
    }
    
    /**
     * check if first name contains substring
     * @param str - String
     * @return ifContains - boolean
     */
    private boolean firstContains(String str){
    	return getFirst().contains(str);
    }
    
    /**
     * check if first name contains substring
     * @param str - String
     * @return ifContains - boolean
     */
    private boolean lastContains(String str){
    	return getLast().contains(str);
    }
    
    
    private static boolean stringContains(String str, char c){
    	for (int i = 0; i < str.length(); i++) {
    		if (str.charAt(i) == c) {
    			return true;
    		}
    	}
    	return false;
    }
    
    /**
     * check if first contains the full string
     * if it exists, get the first index of the string
     * use the first index to create substring out of first name
     * to create substring, use beginning and end indexes of str in first name
     * output error if str is not a substring of the first name
     * @param str - String
     */
    public void shortenFirstTo(String str){
        if(firstContains(str)){
        	setFirst(getFirst().substring(getFirst().indexOf(str), getFirst().indexOf(str) + str.length()));
        }
        else{
        	System.out.println("Error: First name does not contain specified characters.");
        }
    }
    
    /**
     * check both the first and last names if the wrong char is contained in the names
     * if it exists in the first or last name, use String replace method to swap the wrong char with the fix char
     * output the corrected names
     * if the chars do not exist, output error statements for both occurrences
     * @param wrong - char
     * @param fix - char
     */
    public void replaceChar(char wrong, char fix){
        if(stringContains(getFirst(), wrong)){
        	char[] splitWord = getFirst().toCharArray();
        	for (int i = 0; i < getFirst().length(); i++) {
        		splitWord[i] = getFirst().charAt(i);
        		if (getFirst().charAt(i) == wrong) {
        			splitWord[i] = fix;
        		}
        	}
        	String temp = "";
        	for (int i = 0; i < getFirst().length(); i++) {
        		temp += splitWord[i];
        	}
        	setFirst(temp);
        }
        else{
        	System.out.println("Error: First name does not contain specified characters.");
        }
        if(stringContains(getLast(), wrong)){
        	char[] splitWord = getLast().toCharArray();
        	for (int i = 0; i < getLast().length(); i++) {
        		splitWord[i] = getLast().charAt(i);
        		if (getLast().charAt(i) == wrong) {
        			splitWord[i] = fix;
        		}
        	}
        	String temp = "";
        	for (int i = 0; i < getLast().length(); i++) {
        		temp += splitWord[i];
        	}
        	setLast(temp);
        }
        else{
        	System.out.println("Error: Last name does not contain specified characters.");
        }
    }
    public static void main(String[] args){
        
        // initialize variables
        // TODO: edit these variables to use your name!
        String firstName = "Daniel";         // first name
        String lastName = "Nucci";           // last name
        String partOfFirstName = "nie";     // a few characters of your first name
        String shortFirstName = "Dani";     // beginning characters of your name
        char randomLetter = 'i';            // a random letter from your name
        char fixedLetter = 'q';             // a different letter to replace in your name

        // init Signature object
        Signature name = new Signature(firstName, lastName);

        // print length of first and last name, and print full name
        System.out.println("Length of first name: " + name.lengthFirst());
        System.out.println("Length of last name: " + name.lengthLast());
        System.out.println("Full name: " + name.getFull());

        // full name contains partOfFirstName
        System.out.println("Full name contains " + partOfFirstName + ": " +  name.contains(partOfFirstName));

        // change first name to shortFirstName
        name.shortenFirstTo(shortFirstName);
        System.out.println("Full name after shortening: " + name.getFull());

        // replace character in name
        name.replaceChar(randomLetter, fixedLetter);
        System.out.println("Full name after changing letters: " + name.getFull());

    }
    
}
