package com.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class LibraryHome {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int readerID;
	String fullName;
	String email;
	String department;
	String course;
	int yearOfStudy;
	@Column(name = "Contact")
	String phone;
	String address;
	String membershipDate;

	boolean isActiveMember;

	public LibraryHome() {

	}

	public int getReaderID() {
		return readerID;
	}

	public void setReaderID(int readerID) {
		this.readerID = readerID;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public int getYearOfStudy() {
		return yearOfStudy;
	}

	public void setYearOfStudy(int yearOfStudy) {
		this.yearOfStudy = yearOfStudy;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getMembershipDate() {
		return membershipDate;
	}

	public void setMembershipDate(String membershipDate) {
		this.membershipDate = membershipDate;
	}

	public boolean isActiveMember() {
		return isActiveMember;
	}

	public void setActiveMember(boolean isActiveMember) {
		this.isActiveMember = isActiveMember;
	}

	public LibraryHome(int readerID, String fullName, String email, String department, String course, int yearOfStudy,
			String phone, String address, String membershipDate, boolean isActiveMember) {
		super();
		this.readerID = readerID;
		this.fullName = fullName;
		this.email = email;
		this.department = department;
		this.course = course;
		this.yearOfStudy = yearOfStudy;
		this.phone = phone;
		this.address = address;
		this.membershipDate = membershipDate;
		this.isActiveMember = isActiveMember;
	}

	@Override
	public String toString() {
		return "LibraryHome [readerID=" + readerID + ", fullName=" + fullName + ", email=" + email + ", department="
				+ department + ", course=" + course + ", yearOfStudy=" + yearOfStudy + ", phone=" + phone + ", address="
				+ address + ", membershipDate=" + membershipDate + ", isActiveMember=" + isActiveMember + "]";
	}

}
