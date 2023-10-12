package com.employeemanagement2.model;

	import jakarta.persistence.Column;
	import jakarta.persistence.Entity;
	import jakarta.persistence.Id;
	import jakarta.persistence.Table;

	@Entity
	@Table(name = "employee")
	public class Employee {
		
		@Id
		@Column(name = "emp_id")
		private int emp_Id;
		
		@Column(name = "emp_name")
		private String emp_Name;
		
		@Column(name = "emp_age")
		private int emp_Age ;
		
		@Column(name = "emp_salary")
		private int emp_Salary;

		public int getEmp_Id() {
			return emp_Id;
		}

		public void setEmp_Id(int emp_Id) {
			this.emp_Id = emp_Id;
		}

		public String getEmp_Name() {
			return emp_Name;
		}

		public void setEmp_Name(String emp_Name) {
			this.emp_Name = emp_Name;
		}

		public int getEmp_Age() {
			return emp_Age;
		}

		public void setEmp_Age(int emp_Age) {
			this.emp_Age = emp_Age;
		}

		public int getEmp_Salary() {
			return emp_Salary;
		}

		public void setEmp_Salary(int emp_Salary) {
			this.emp_Salary = emp_Salary;
		}

		@Override
		public String toString() {
			return "Employee [emp_Id=" + emp_Id + ", emp_Name=" + emp_Name + ", emp_Age=" + emp_Age + ", emp_Salary="
					+ emp_Salary + "]";
		}
		
		
		
		

	
}
