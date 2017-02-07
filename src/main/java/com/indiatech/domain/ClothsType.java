package com.indiatech.domain;
import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;
import javax.persistence.TableGenerator;
/**
 * Created by Dhruti on 07/02/17.
 */
@Entity
@Table(name = "cloths_type")
public class ClothsType {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name ="id", updatable = false, nullable = false)
	private Long id;
	@Column(name ="type_name", updatable = false, nullable = false)
	private String typeName ;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTypeName() {
		return typeName;
	}

	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}
}
