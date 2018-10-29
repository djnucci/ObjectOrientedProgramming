package tutorial7;

/**
 * @author Daniel Nucci - 100655384
 */

public class IncomeTax {    
    public static final double RATE1 = 0.15;
    public static final double RATE2 = 0.30;
    public static final double RATE1_SINGLE_LIMIT = 42000;
    public static final double RATE1_MARRIED_LIMIT = 76000;
    
    private double income;
    private String status;
    
    public IncomeTax(double incomeAmount, String relationshipStatus){
    	this.income = incomeAmount;
    	this.status = relationshipStatus;
    }
    
    public double getIncome() {
    	return this.income;
    }
    
    public String getStatus() {
    	return this.status;
    }
    
    public double getTax(){
        double tax1 = 0.0;
        double tax2 = 0.0;
        
        if (getStatus().equalsIgnoreCase("single")) {
        	if (income <= RATE1_SINGLE_LIMIT) {
        		tax1 =  RATE1 * getIncome();
        	}
        	else {
        		tax1 = RATE1 * (getIncome() - RATE1_SINGLE_LIMIT);
        		tax2 = RATE2 * Math.abs(RATE1_SINGLE_LIMIT - getIncome());
        	}
        }
        else if (getStatus().equalsIgnoreCase("married")) {
        	if (income <= RATE1_MARRIED_LIMIT) {
        		tax1 =  RATE1 * getIncome();
        	}
        	else {
        		tax1 = RATE1 * (getIncome() - RATE1_MARRIED_LIMIT);
        		tax2 = RATE2 * Math.abs(RATE1_MARRIED_LIMIT - getIncome());
        	}
        }
        
        return tax1 + tax2;
        // return the combined amounts for rate1 and rate2
    }
    public static void main(String [] args){
        IncomeTax tax1 = new IncomeTax(80000, "single");
        IncomeTax tax2 = new IncomeTax(20000, "single");
        IncomeTax tax3 = new IncomeTax(80000, "married");
        IncomeTax tax4 = new IncomeTax(20000, "married");
        IncomeTax tax5 = new IncomeTax(20000, "N/A");
        // create IncomeTax array and fill it with the 5 items
        // use a for loop to cycle through the tax items and getTax for each tax item
        IncomeTax[] taxes = {tax1, tax2, tax3, tax4, tax5};
        
        for(int i = 0; i < taxes.length; i++){
        	System.out.println(taxes[i].getTax());
        } 
    }
}

