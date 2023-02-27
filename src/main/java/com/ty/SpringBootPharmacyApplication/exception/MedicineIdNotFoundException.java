package com.ty.SpringBootPharmacyApplication.exception;

public class MedicineIdNotFoundException extends RuntimeException {
 
	String message = "medicine id is not found ";
 
		// TODO Auto-generated method stub
 

	 

	public MedicineIdNotFoundException(String message) {
		super();
		this.message = message;
	}

	public String getMessage() {
 
		return message;
	}

	public MedicineIdNotFoundException() {

	}
 
 
 
}
