package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="address")
public class AddressEntity {

	

		@Id
		//@GeneratedValue(strategy =GenerationType.IDENTITY)
		
		private Integer id;
		@Column(name = "houseno")
		private String houseNo;

		@Column(name="name")
		private String ownerName;

		public String getOwnerName() {
			return ownerName;
		}
		public void setOwnerName(String ownerName) {
			this.ownerName = ownerName;
		}
		public Integer getId() {
			return id;
		}
		public void setId(Integer id) {
			this.id = id;
		}
		
		@Column(name = "streetaddress")
		private String streetAddress;
		@Column(name = "city")
		private String city;
		@Column(name = "state")
		private String state;
		@Column(name = "zipcode")
		private String zipCode;

	    
		public AddressEntity() {
			super();
		}
		public AddressEntity(String houseNo, String streetAddress, String city, String state, String zipCode,
			Integer id) {
			super();
			this.houseNo = houseNo;
			this.streetAddress = streetAddress;
			this.city = city;
			this.state = state;
			this.zipCode = zipCode;
			//this.appartmentEntity = appartmentEntity;
			this.id=id;
		}
		public String getHouseNo() {
			return houseNo;
		}
		public void setHouseNo(String houseNo) {
			this.houseNo = houseNo;
		}
		public String getStreetAddress() {
			return streetAddress;
		}
		public void setStreetAddress(String streetAddress) {
			this.streetAddress = streetAddress;
		}
		public String getCity() {
			return city;
		}
		public void setCity(String city) {
			this.city = city;
		}
		public String getState() {
			return state;
		}
		public void setState(String state) {
			this.state = state;
		}
		public String getZipCode() {
			return zipCode;
		}
		public void setZipCode(String zipCode) {
			this.zipCode = zipCode;
		}
		
}
