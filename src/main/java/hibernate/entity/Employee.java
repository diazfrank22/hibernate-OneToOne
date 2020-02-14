package hibernate.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "idEmployee")
	private int idEmployee;
	@Column(name = "nameEmployee")
	private String nameEmployee;
	@Column(name = "salaryEmployee")
	private double salaryEmployee;
	@Column(name = "degEmployee")
	private String degEmployee;
	
	@OneToOne
	private Department department;
	
	public int getIdEmployee() {
		return idEmployee;
	}
	public void setIdEmployee(int idEmployee) {
		this.idEmployee = idEmployee;
	}
	public String getNameEmployee() {
		return nameEmployee;
	}
	public void setNameEmployee(String nameEmployee) {
		this.nameEmployee = nameEmployee;
	}
	public double getSalaryEmployee() {
		return salaryEmployee;
	}
	public void setSalaryEmployee(double salaryEmployee) {
		this.salaryEmployee = salaryEmployee;
	}
	public String getDegEmployee() {
		return degEmployee;
	}
	public void setDegEmployee(String degEmployee) {
		this.degEmployee = degEmployee;
	}
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}
}
