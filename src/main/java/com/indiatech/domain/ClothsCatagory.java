package com.indiatech.domain;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Dhruti on 14/02/17.
 */
@Entity
@Table(name = "CLOTHS_CATAGORY")
public class ClothsCatagory extends BaseEntity {

	@Column(name = "CATAGORY_NAME", nullable = false, length = 500)
	private String catagoryName;

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "clothsCatagory")
	private List<ClothsType> clothsTypes = new ArrayList<ClothsType>();

	public ClothsCatagory() {
	}

	public ClothsCatagory(String catagoryName, List<ClothsType> clothsTypes) {

		this.catagoryName = catagoryName;
		this.clothsTypes = clothsTypes;
	}

	public String getCatagoryName() {
		return catagoryName;
	}

	public void setCatagoryName(String catagoryName) {
		this.catagoryName = catagoryName;
	}

	public List<ClothsType> getClothsTypes() {
		return clothsTypes;
	}

	public void setClothsTypes(List<ClothsType> clothsTypes) {
		this.clothsTypes = clothsTypes;
	}
}
