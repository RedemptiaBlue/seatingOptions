package com.redemptiablue.plane.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="type")
public class SeatingType {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int typeId;
	
	@Column
	private String typeName;
	
	@Column
	private int availableOnSmall;

	public SeatingType(String typeName, int availableOnSmall) {
		this.typeName = typeName;
		this.availableOnSmall = availableOnSmall;
	}

	public SeatingType() {
	}

	public int getTypeId() {
		return typeId;
	}

	public void setTypeId(int id) {
		this.typeId = id;
	}

	public String getTypeName() {
		return typeName;
	}

	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}

	public int getavailableOnSmall() {
		return availableOnSmall;
	}

	public void setavailableOnSmall(int availableOnSmall) {
		this.availableOnSmall = availableOnSmall;
		}

	@Override
	public String toString() {
		return "SeatingType [typeName=" + typeName + ", availableOnSmall=" + availableOnSmall + "]";
	}
	
	
 
}
