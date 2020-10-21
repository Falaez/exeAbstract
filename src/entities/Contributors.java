package entities;

public abstract class Contributors {

	private String name;
	protected Double anualIncome;
	
	public Contributors() {
	}

	public Contributors(String name, Double anualIncome) {
		this.name = name;
		this.anualIncome = anualIncome;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getYearlyIncome() {
		return anualIncome;
	}

	public void setYearlyIncome(Double yearlyIncome) {
		this.anualIncome = yearlyIncome;
	}
	
	public abstract Double payTax();
}
