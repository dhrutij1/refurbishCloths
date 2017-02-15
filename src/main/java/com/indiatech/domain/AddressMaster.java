package com.indiatech.domain;

import com.indiatech.Enum.CityEnum;
import com.indiatech.Enum.CountryEnum;
import com.indiatech.Enum.StateEnum;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

/**
 * Created by Dhruti on 15/02/17.
 */
@Entity
@Table(name = "ADDRESS_MASTER", uniqueConstraints = @UniqueConstraint(columnNames = "EMAIL"))
public class AddressMaster extends BaseEntity {
	@Column(name = "ADDRESS_LINE1", nullable = false)
	private String addressLine1;
	@Column(name = "ADDRESS_LINE2")
	private String addressLine2;
	@Column(name = "PHONE1", nullable = false, length = 12)
	private String phoneNumber1;
	@Column(name = "PHONE2", length = 12)
	private String phoneNumber2;
	@Column(name = "EMAIL", nullable = false, length = 50)
	private String emailId;
	@Column(name = "PINCODE", nullable = false, length = 6)
	private String pincode;
	@Column(name = "CITY", nullable = false, length = 50)
	private CityEnum city;
	@Column(name = "STATE", nullable = false, length = 50)
	private StateEnum state;
	@Column(name = "COUNTRY", nullable = false, length = 50)
	private CountryEnum country;
	@JoinColumn(name = "address_id", referencedColumnName = "id")
	@ManyToOne
	private UserMaster user;

}
