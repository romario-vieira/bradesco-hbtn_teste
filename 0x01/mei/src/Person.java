package mei.src;

import java.util.Date;

public class Person {
	private String name;
	private String surname;
	private Date birthDate;
	private boolean anotherCompanyOwner;
	private boolean pensioner;
	private boolean publicServer;
	private float salary;
	
	
	public Person(String name, String surname, Date birthDate, boolean anotherCompanyOwner, boolean pensioner,
			boolean publicServer) {
		super();
		this.name = name;
		this.surname = surname;
		this.birthDate = birthDate;
		this.anotherCompanyOwner = anotherCompanyOwner;
		this.pensioner = pensioner;
		this.publicServer = publicServer;
	}

	public String fullName() {
		return name + " " + surname;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}
	
	public double calculateYearlySalary() {
		return salary * 12;
	}
	
	public boolean isMEI() {
		int age = new Date().getYear() - birthDate.getYear();
		boolean retorno = false;
		if (this.calculateYearlySalary() < 130000 && age > 18 && !anotherCompanyOwner && !pensioner && !publicServer) {
			retorno = true;
		}
		return retorno;
	}
	
}
