package com.indiatech.domain;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.List;

/**
 * Created by Dhruti on 14/02/17.
 */
@Entity
@Table(name = "CLOTHS_TYPE")
public class ClothsType extends BaseEntity {

	@Column(name = "TYPE_NAME", nullable = false, length = 500)
	private String typeName;

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "clothsType")
	private List<ClothsMaster> clothsMaster;

	@JoinColumn(name = "catagory_id", referencedColumnName = "id")
	@ManyToOne
	private ClothsCatagory clothsCatagory;

	public ClothsType() {
	}

	public ClothsType(String typeName, List<ClothsMaster> clothsMasterSet) {
		this.clothsMaster = clothsMasterSet;
		this.typeName = typeName;
	}

	public String getTypeName() {
		return typeName;
	}

	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}

	public ClothsCatagory getClothsCatagory() {
		return clothsCatagory;
	}

	public void setClothsCatagory(ClothsCatagory clothsCatagory) {
		this.clothsCatagory = clothsCatagory;
	}

	public List<ClothsMaster> getClothsMaster() {
		return clothsMaster;
	}

	public void setClothsMaster(List<ClothsMaster> clothsMaster) {
		this.clothsMaster = clothsMaster;
	}
}
