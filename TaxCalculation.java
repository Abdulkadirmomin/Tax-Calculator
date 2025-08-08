package combineAll;

public class TaxCalculation {
	 private UserDetails user;

	    public TaxCalculation(UserDetails user) {
	        this.user = user;
	    }

	    public double calculateTax() {
	        double income = user.getIncome();
	        double tax;

	        // Adjust tax brackets based on marital status
	        if (user.isMarried()) {
	            if (income <= 20000) {
	                tax = 0;
	            } else if (income <= 100000) {
	                tax = income * 0.1; // 10% tax
	            } else {
	                tax = income * 0.2; // 20% tax
	            }
	        } else {
	            if (income <= 10000) {
	                tax = 0;
	            } else if (income <= 50000) {
	                tax = income * 0.1; // 10% tax
	            } else {
	                tax = income * 0.2; // 20% tax
	            }
	        }

	        // Additional tax benefits for senior citizens (age 65 and above)
	        if (user.getAge() >= 65) {
	            tax *= 0.9; // 10% discount on tax for senior citizens
	        }

	        return tax;
	    }
	}


