package com.epam.unit08.task01;

import java.util.Random;

public class Customer {
	private int id;
	private String firstName;
	private String lastName;
	private String middleName;
	private long cardNumber;
	private long bankAccount;
	public int getId() {
		return id;
	}
	public void setId() {
		Random rand = new Random();
		this.id = rand.nextInt(1000);
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getMiddleName() {
		return middleName;
	}
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public long getCardNumber() {
		return cardNumber;
	}
	public void setCardNumber(long cardNumber) {
		this.cardNumber = cardNumber;
	}
	public long getBankAccount() {
		return bankAccount;
	}
	public void setBankAccount(long bankAccount) {
		this.bankAccount = bankAccount;
	}
	public Customer( String firstName, String lastName, String middleName, long cardNumber, long bankAccount) {
		super();
		this.setId();
		this.firstName = firstName;
		this.lastName = lastName;
		this.middleName = middleName;
		this.cardNumber = cardNumber;
		this.bankAccount = bankAccount;
	}
	@Override
	public String toString() {
		return "Customer [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", middleName="
				+ middleName + ", cardNumber=" + cardNumber + ", bankAccount=" + bankAccount + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (bankAccount ^ (bankAccount >>> 32));
		result = prime * result + (int) (cardNumber ^ (cardNumber >>> 32));
		result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
		result = prime * result + id;
		result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
		result = prime * result + ((middleName == null) ? 0 : middleName.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Customer other = (Customer) obj;
		if (bankAccount != other.bankAccount)
			return false;
		if (cardNumber != other.cardNumber)
			return false;
		if (firstName == null) {
			if (other.firstName != null)
				return false;
		} else if (!firstName.equals(other.firstName))
			return false;
		if (id != other.id)
			return false;
		if (lastName == null) {
			if (other.lastName != null)
				return false;
		} else if (!lastName.equals(other.lastName))
			return false;
		if (middleName == null) {
			if (other.middleName != null)
				return false;
		} else if (!middleName.equals(other.middleName))
			return false;
		return true;
	}
	
	
	
	

}
