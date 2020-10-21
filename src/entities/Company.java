package entities;

public class Company extends Contributors {

	public Integer employee;
	
	public Company() {
		super();
	}
	
	public Company(String name, Double anualIncome, Integer employee) {
		super(name, anualIncome);
		this.employee = employee;
	}

	public Integer getEmployee() {
		return employee;
	}

	public void setEmployee(Integer employee) {
		this.employee = employee;
	}

	@Override
	public Double payTax() {
		if (employee>10) {
			return anualIncome*0.14;
		}
		else {
			return anualIncome*0.16;
		}
	}

}
