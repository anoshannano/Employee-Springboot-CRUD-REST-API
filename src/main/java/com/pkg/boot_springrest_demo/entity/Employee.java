package com.pkg.boot_springrest_demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="employee")
public class Employee {
		
		@Id
		@GeneratedValue(strategy= GenerationType.IDENTITY)
		@Column(name="id")
		private int id;
		
		@Column(name="phoneNum")
		private String phoneNum;
		
		@Column(name="email")
		private String email;

		@Column(name="address")
		private String address;
		
		Employee(){}

		public Employee(String phoneNum, String email, String address) {
			this.phoneNum = phoneNum;
			this.email = email;
			this.address = address;
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getPhoneNum() {
			return phoneNum;
		}

		public void setPhoneNum(String phoneNum) {
			this.phoneNum = phoneNum;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public String getAddress() {
			return address;
		}

		public void setddress(String address) {
			this.address = address;
		}

		@Override
		public String toString() {
			return "Employee [id=" + id + ", Phond Number=" + phoneNum + ", Email=" + email+ ", Address=" + address 
					+ "]";
		}
		
		
}
