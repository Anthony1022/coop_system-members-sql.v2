package dev.niss.models.users;

import dev.sol.core.application.FXModel;
import dev.sol.core.properties.beans.FXDoubleProperty;
import dev.sol.core.properties.beans.FXIntegerProperty;
import dev.sol.core.properties.beans.FXStringProperty;

public class User extends FXModel {

	private FXIntegerProperty userId;
	private FXStringProperty username;
	private FXStringProperty designation;
	private FXStringProperty fName;
	private FXStringProperty mName;
	private FXStringProperty lName;
	private FXStringProperty address;
	private FXStringProperty password;
	private FXDoubleProperty salary;

	public User(Integer userId,
			String username,
			String designation,
			String fName,
			String mName,
			String lName,
			String address,
			String password,
			Double salary) {
		this.userId = new FXIntegerProperty(userId);
		this.username = new FXStringProperty(username);
		this.designation = new FXStringProperty(designation);
		this.fName = new FXStringProperty(fName);
		this.mName = new FXStringProperty(mName);
		this.lName = new FXStringProperty(lName);
		this.address = new FXStringProperty(address);
		this.password = new FXStringProperty(password);
		this.salary = new FXDoubleProperty(salary);

		track_properties(this.userId,
				this.username,
				this.designation,
				this.fName,
				this.mName,
				this.lName,
				this.address,
				this.password,
				this.salary);
	}

	// userid
	public FXIntegerProperty useridProperty() {
		return userId;
	}

	public Integer getUserID() {
		return useridProperty().get();
	}

	public void setUserID(Integer userId) {
		useridProperty().set(userId);
	}

	// username
	public FXStringProperty usernameProperty() {
		return username;
	}

	public String getUserName() {
		return usernameProperty().get();
	}

	public void setUserName(String username) {
		usernameProperty().set(username);
	}

	// designation
	public FXStringProperty designationProperty() {
		return designation;
	}

	// first name
	public FXStringProperty fNameProperty() {
		return fName;
	}

	public String getFName() {
		return fNameProperty().get();
	}

	public void setFName(String fName) {
		fNameProperty().set(fName);
	}

	// middle name
	public FXStringProperty mNameProperty() {
		return mName;
	}

	public String getMName() {
		return mNameProperty().get();
	}

	public void setMName(String mName) {
		mNameProperty().set(mName);
	}

	// last name
	public FXStringProperty lNameProperty() {
		return lName;
	}

	public String getLName() {
		return lNameProperty().get();
	}

	public void setLName(String lName) {
		lNameProperty().set(lName);
	}

	// address
	public FXStringProperty addressProperty() {
		return address;
	}

	public String getAddress() {
		return addressProperty().get();
	}

	public void setAddress(String address) {
		addressProperty().set(address);
	}

	// password
	public FXStringProperty passwordProperty() {
		return password;
	}

	public String getPassword() {
		return passwordProperty().get();
	}

	public void setPassword(String password) {
		passwordProperty().set(password);
	}

	// salary
	public FXDoubleProperty salaryProperty() {
		return salary;
	}

	public Double getSalary() {
		return salaryProperty().get();
	}

	public void setSalary(Double salary) {
		salaryProperty().set(salary);
	}

	@Override
	public FXModel clone() {
		return new User(getUserID(),
				getUserName(),
				getUserName(),
				getFName(),
				getMName(),
				getLName(),
				getAddress(),
				getPassword(),
				getSalary());
		
	}

	@Override
	public void copy(FXModel arg0) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'copy'");
	}

}
