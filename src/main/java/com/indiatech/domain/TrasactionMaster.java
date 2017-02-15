package com.indiatech.domain;

import com.indiatech.Enum.TrasactionStatusEnum;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Created by Dhruti on 15/02/17.
 */
@Entity
@Table(name = "TRASACTION_MASTER")
public class TrasactionMaster extends BaseEntity {

	@JoinColumn(name = "trasaction_id", referencedColumnName = "id")
	@ManyToOne
	private UserMaster user;

	@JoinColumn(name = "cloth_id", referencedColumnName = "id")
	@ManyToOne
	private ClothsMaster cloths;

	private TrasactionStatusEnum trasactionStatus;

	public UserMaster getUser() {
		return user;
	}

	public void setUser(UserMaster user) {
		this.user = user;
	}

	public ClothsMaster getCloth() {
		return cloths;
	}

	public void setCloth(ClothsMaster cloths) {
		this.cloths = cloths;
	}

	public TrasactionStatusEnum getTrasactionStatus() {
		return trasactionStatus;
	}

	public void setTrasactionStatus(TrasactionStatusEnum trasactionStatus) {
		this.trasactionStatus = trasactionStatus;
	}
}
