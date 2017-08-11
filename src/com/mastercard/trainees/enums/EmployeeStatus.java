package com.mastercard.trainees.enums;

public enum EmployeeStatus {
	HIRED('H'),
	TERMINATED('T');

	private final char databaseCode;

	EmployeeStatus(char databaseCode) {
		this.databaseCode = databaseCode;
	}

	public static EmployeeStatus fromDatabaseCode(char dbCode) {
		for (EmployeeStatus elem : EmployeeStatus.values()) {
			if (elem.getDatabaseCode() == dbCode) {
				return elem;
			}
		}
		throw new IllegalArgumentException();
	}

	public char getDatabaseCode() {
		return databaseCode;
	}
}
