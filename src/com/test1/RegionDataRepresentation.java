package com.test1;

public class RegionDataRepresentation {
	private String countyCode;
	private String regionCode;
	private String regionName;
	private String representationId;
	private String isPrimary;
	private String creationDate;
	private String modifiedDate;
	private String entityState;

	public RegionDataRepresentation() {

	}

	public RegionDataRepresentation(String countyCode, String regionCode, String regionName, String representationId,
			String isPrimary, String entityState, String creationDate, String modifiedDate) {
		super();
		this.countyCode = countyCode;
		this.regionCode = regionCode;
		this.regionName = regionName;
		this.representationId = representationId;
		this.isPrimary = isPrimary;
		this.entityState = entityState;
		this.creationDate = creationDate;
		this.modifiedDate = modifiedDate;
	}

	public String getCountyCode() {
		return countyCode;
	}

	public void setCountyCode(String countyCode) {
		this.countyCode = countyCode;
	}

	public String getRegionCode() {
		return regionCode;
	}

	public void setRegionCode(String regionCode) {
		this.regionCode = regionCode;
	}

	public String getRegionName() {
		return regionName;
	}

	public void setRegionName(String regionName) {
		this.regionName = regionName;
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

	public String getEntityState() {
		return entityState;
	}

	public void setEntityState(String entityState) {
		this.entityState = entityState;
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

}
