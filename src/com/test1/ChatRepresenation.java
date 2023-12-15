package com.test1;

public class ChatRepresenation {
	private long dataRefId;
	private String chartColours;
	private String dataSegregation;
	private String minorPartColour;
	private boolean majorPartColour;
	private String creationDate;
	private String modifiedDate;
	private String entityState;

	public ChatRepresenation() {

	}

	public ChatRepresenation(long dataRefId, String chartColours, String dataSegregation, String minorPartColour,
			boolean majorPartColour, String creationDate, String modifiedDate, String entityState) {
		super();
		this.dataRefId = dataRefId;
		this.chartColours = chartColours;
		this.dataSegregation = dataSegregation;
		this.minorPartColour = minorPartColour;
		this.majorPartColour = majorPartColour;
		this.creationDate = creationDate;
		this.modifiedDate = modifiedDate;
		this.entityState = entityState;
	}

	public long getDataRefId() {
		return dataRefId;
	}

	public void setDataRefId(long dataRefId) {
		this.dataRefId = dataRefId;
	}

	public String getChartColours() {
		return chartColours;
	}

	public void setChartColours(String chartColours) {
		this.chartColours = chartColours;
	}

	public String getDataSegregation() {
		return dataSegregation;
	}

	public void setDataSegregation(String dataSegregation) {
		this.dataSegregation = dataSegregation;
	}

	public String getMinorPartColour() {
		return minorPartColour;
	}

	public void setMinorPartColour(String minorPartColour) {
		this.minorPartColour = minorPartColour;
	}

	public boolean isMajorPartColour() {
		return majorPartColour;
	}

	public void setMajorPartColour(boolean majorPartColour) {
		this.majorPartColour = majorPartColour;
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
