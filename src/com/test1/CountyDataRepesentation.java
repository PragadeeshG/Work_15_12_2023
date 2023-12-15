package com.test1;

public class CountyDataRepesentation {
	private String countryCode;
	private String representationId;
	private String isPrimary;
	private String creationDate;
	private String modifiedDate;
	private String entityState;

	public CountyDataRepesentation() {

	}

	public CountyDataRepesentation(String countryCode, String representationId, String isPrimary, String creationDate,
			String modifiedDate, String entityState) {
		super();
		this.countryCode = countryCode;
		this.representationId = representationId;
		this.isPrimary = isPrimary;
		this.creationDate = creationDate;
		this.modifiedDate = modifiedDate;
		this.entityState = entityState;
	}

	public String getCountryCode() {
		return countryCode;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	public String getRepresentationId() {
		return representationId;
	}

	public void setRepresentationId(String representationId) {
		this.representationId = representationId;
	}

	public String getIsPrimary() {
		return isPrimary;
	}

	public void setIsPrimary(String isPrimary) {
		this.isPrimary = isPrimary;
	}

	public String getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(String creationDate) {
		this.creationDate = creationDate;
	}

	public String getModifiedDate() {
		return modifiedDate;
	}

	public void setModifiedDate(String modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	public String getEntityState() {
		return entityState;
	}

	public void setEntityState(String entityState) {
		this.entityState = entityState;
	}

}
