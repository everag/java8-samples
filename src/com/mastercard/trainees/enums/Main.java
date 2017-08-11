package com.mastercard.trainees.enums;

public class Main {

	private static String STATUS_HIRED = "HIRED";
	private static String STATUS_TERMINATED = "TERMINATED";

	public static void main(String[] args) {
//		Employee emp = new Employee();
//		emp.setStatus(STATUS_HIRED);

		EmployeeStatus statusTerm = EmployeeStatus.TERMINATED;
//
//		emp.setStatus(statusTerm.name());

		Employee2 emp2 = new Employee2();
		emp2.setStatus(statusTerm);
		emp2.setStatus(EmployeeStatus.TERMINATED);

		Employee3 emp3 = new Employee3();
		emp3.setStatus(statusTerm.getDatabaseCode());

		char dbCode = emp3.getStatus();

		EmployeeStatus status = EmployeeStatus.fromDatabaseCode(dbCode);
		emp2.setStatus(status);
		emp2.setStatus(EmployeeStatus.fromDatabaseCode('Z'));
	}

	static class Employee {
		private String status;

		public String getStatus() {
			return status;
		}

		public void setStatus(String status) {
			this.status = status;
			System.out.println("Status is now " + this.status);
		}
	}

	static class Employee2 {
		private EmployeeStatus status;

		public EmployeeStatus getStatus() {
			return status;
		}

		public void setStatus(EmployeeStatus status) {
			this.status = status;
			System.out.println("Status is now " + this.status);
		}
	}

	static class Employee3 {
		private char status;

		public char getStatus() {
			return status;
		}

		public void setStatus(char status) {
			this.status = status;
			System.out.println("Status is now " + this.status);
		}
	}
}
