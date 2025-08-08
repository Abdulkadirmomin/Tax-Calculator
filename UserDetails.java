package combineAll;

public class UserDetails {
	   private String name;
	    private double income;
	    private int age;
	    private boolean isMarried;

	    public UserDetails(String name, double income, int age, boolean isMarried) {
	        this.name = name;
	        this.income = income;
	        this.age = age;
	        this.isMarried = isMarried;
	    }

	    public String getName() {
	        return name;
	    }

	    public double getIncome() {
	        return income;
	    }

	    public int getAge() {
	        return age;
	    }

	    public boolean isMarried() {
	        return isMarried;
	    }
	}


