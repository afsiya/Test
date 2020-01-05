package com.example.demo.model;



public class Apartment {
	private Integer apartmentId;
	private String ownerName;
	private Address address;
	public Integer getApartmentId() {
		return apartmentId;
	}
	public Apartment() {
		super();
	}
	public Apartment(Integer apartmentId, String ownerName, Address address) {
		super();
		this.apartmentId = apartmentId;
		this.ownerName = ownerName;
		this.address = address;
	}
	public void setApartmentId(Integer apartmentId) {
		this.apartmentId = apartmentId;
	}
	public String getOwnerName() {
		return ownerName;
	}
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}


}
