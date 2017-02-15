package com.indiatech.domain;

import com.indiatech.Enum.UserRoleEnum;
import com.indiatech.Enum.UserTypeEnum;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by Dhruti on 15/02/17.
 */
@Entity
@Table(name = "USER_MASTER", uniqueConstraints = @UniqueConstraint(columnNames = "USER_NAME"))
public class UserMaster extends BaseEntity {

	@Column(name = "FIRST_NAME", nullable = false, length = 50)
	private String firstName;
	@Column(name = "LAST_NAME", nullable = false, length = 50)
	private String lastName;
	@Column(name = "USER_NAME", nullable = false, length = 50)
	private String userName;
	@Column(name = "PASSWORD", nullable = false, length = 50)
	private String password;
	@Column(name = "USER_ROLE", nullable = false, length = 10)
	private UserRoleEnum userRole;
	@Column(name = "USER_TYPE", nullable = false, length = 10)
	private UserTypeEnum userType;
	@Column(name = "DATO_OF_BIRTH")
	@Temporal(value = TemporalType.DATE)
	private Date birthdate;
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "user")
	private List<AddressMaster> addressMasterList = new ArrayList<AddressMaster>();
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "user")
	private List<TrasactionMaster> trasactionMasterList = new ArrayList<TrasactionMaster>();

	public Date getBirthdate() {
		return birthdate;
	}

	public void setBirthdate(Date birthdate) {
		this.birthdate = birthdate;
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

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public UserRoleEnum getUserRole() {
		return userRole;
	}

	public void setUserRole(UserRoleEnum userRole) {
		this.userRole = userRole;
	}

	public UserTypeEnum getUserType() {
		return userType;
	}

	public void setUserType(UserTypeEnum userType) {
		this.userType = userType;
	}

	public List<AddressMaster> getAddressMasterList() {
		return addressMasterList;
	}

	public void setAddressMasterList(List<AddressMaster> addressMasterList) {
		this.addressMasterList = addressMasterList;
	}

	public List<TrasactionMaster> getTrasactionMasterList() {
		return trasactionMasterList;
	}

	public void setTrasactionMasterList(List<TrasactionMaster> trasactionMasterList) {
		this.trasactionMasterList = trasactionMasterList;
	}
}
