package gyak_6_het_ora;

public class Employee {

	String name;
	int age;
	int salary;
	int ageLimit=65;
	
	public Employee() {
		
	}
	
	public Employee(String name, int age, int sal) {
		this.name=name;
		this.age=age;
		this.salary=sal;
	}
	
	public Employee(String name, int age) {
		this.name=name;
		this.age=age;
		this.salary=age*10000;
	}
	
	public int untilRest() {
		return this.ageLimit-this.age;
	}
	
	@Override
	public String toString() {
	return "Név:"+this.name+" Kor:"+this.age+" Fizetés:"+this.salary;

	}
	
	public Employee employeeStay(Employee e1, Employee e2) {
		if(e1.untilRest()>e2.untilRest()) {
			return e2;
		}
		return e1;
	}
	
	public void setAgeLimit(int num) {
		this.ageLimit=num;
	}
	public void setName(String nam) {
		this.name=nam;
	}
	
	public void setAge(int num) {
		this.age=num;
	}
	
	public void setSalary(int sal) {
		this.salary=sal;
	}
	
}
