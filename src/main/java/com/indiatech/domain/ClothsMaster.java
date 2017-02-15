package com.indiatech.domain;

import com.indiatech.Enum.ClothsBrandEnum;
import com.indiatech.Enum.ClothsSizeEnum;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.math.BigDecimal;

/**
 * Created by Dhruti on 14/02/17.
 */
@Entity
@Table(name = "CLOTHS_MASTER")
public class ClothsMaster extends BaseEntity {

	@Column(name = "CLOTH_NAME", nullable = false, length = 500)
	private String clothName;

	@Column(name = "CLOTH_SIZE", nullable = false, length = 20)
	private ClothsSizeEnum clothsSizeEnum;

	@Column(name = "CLOTH_BRAND", nullable = true, length = 100)
	private ClothsBrandEnum clothsBrandEnum;

	@Column(name = "CLOTH_PRICE", nullable = false)
	private BigDecimal clothsPrize;

	@JoinColumn(name = "type_id", referencedColumnName = "id")
	@ManyToOne
	private ClothsType clothsType;

	public ClothsMaster() {
	}

	public ClothsMaster(String clothName, ClothsSizeEnum clothsSizeEnum, ClothsBrandEnum clothsBrandEnum, BigDecimal clothsPrize) {
		this.clothName = clothName;
		this.clothsSizeEnum = clothsSizeEnum;
		this.clothsBrandEnum = clothsBrandEnum;
		this.clothsPrize = clothsPrize;
	}

	public String getClothName() {
		return clothName;
	}

	public void setClothName(String clothName) {
		this.clothName = clothName;
	}

	public ClothsSizeEnum getClothsSizeEnum() {
		return clothsSizeEnum;
	}

	public void setClothsSizeEnum(ClothsSizeEnum clothsSizeEnum) {
		this.clothsSizeEnum = clothsSizeEnum;
	}

	public ClothsBrandEnum getClothsBrandEnum() {
		return clothsBrandEnum;
	}

	public void setClothsBrandEnum(ClothsBrandEnum clothsBrandEnum) {
		this.clothsBrandEnum = clothsBrandEnum;
	}

	public BigDecimal getClothsPrize() {
		return clothsPrize;
	}

	public void setClothsPrize(BigDecimal clothsPrize) {
		this.clothsPrize = clothsPrize;
	}

	public ClothsType getClothsType() {
		return clothsType;
	}

	public void setClothsType(ClothsType clothsType) {
		this.clothsType = clothsType;
	}
}
