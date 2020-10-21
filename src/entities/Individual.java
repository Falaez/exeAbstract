package entities;

public class Individual extends Contributors{

	private Double healthExpenditures;
	
	public Individual() {
		super();
	}
	
	public Individual(String name, Double anualIncome, Double healthExpenditures) {
		super(name, anualIncome);
		this.healthExpenditures = healthExpenditures;
	}

	public Double getHealthExpenditures() {
		return healthExpenditures;
	}

	public void setHealthExpenditures(Double healthExpenditures) {
		this.healthExpenditures = healthExpenditures;
	}

	@Override
	public Double payTax() {
		if (anualIncome<=20000.00) {
			return (anualIncome*0.15)-(healthExpenditures/2);
		}
		else {
			return (anualIncome*0.25)-(healthExpenditures/2);

		}
	}

}
