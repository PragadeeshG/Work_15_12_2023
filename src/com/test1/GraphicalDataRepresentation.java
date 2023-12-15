package com.test1;

public class GraphicalDataRepresentation {
	private long dataRefId;
	private String xAxisColours;
	private String yAxisColours;
	private String xAxisData;
	private String yAxisData;
	private String graphType;
	private String graphFormula;
	private String remarks;
	private String dataDescription;
	private long duration;
	private boolean isActive;
	private String creationDate;
	private String modifiedDate;
	private String entityState;

	public GraphicalDataRepresentation() {

	}

	public GraphicalDataRepresentation(long dataRefId, String xAxisColours, String yAxisColours, String xAxisData,
			String yAxisData, String graphType, String graphFormula, String remarks, String dataDescription,
			long duration, boolean isActive, String creationDate, String modifiedDate, String entityState) {
		super();
		this.dataRefId = dataRefId;
		this.xAxisColours = xAxisColours;
		this.yAxisColours = yAxisColours;
		this.xAxisData = xAxisData;
		this.yAxisData = yAxisData;
		this.graphType = graphType;
		this.graphFormula = graphFormula;
		this.remarks = remarks;
		this.dataDescription = dataDescription;
		this.duration = duration;
		this.isActive = isActive;
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

	public String getxAxisColours() {
		return xAxisColours;
	}

	public void setxAxisColours(String xAxisColours) {
		this.xAxisColours = xAxisColours;
	}

	public String getyAxisColours() {
		return yAxisColours;
	}

	public void setyAxisColours(String yAxisColours) {
		this.yAxisColours = yAxisColours;
	}

	public String getxAxisData() {
		return xAxisData;
	}

	public void setxAxisData(String xAxisData) {
		this.xAxisData = xAxisData;
	}

	public String getyAxisData() {
		return yAxisData;
	}

	public void setyAxisData(String yAxisData) {
		this.yAxisData = yAxisData;
	}

	public String getGraphType() {
		return graphType;
	}

	public void setGraphType(String graphType) {
		this.graphType = graphType;
	}

	public String getGraphFormula() {
		return graphFormula;
	}

	public void setGraphFormula(String graphFormula) {
		this.graphFormula = graphFormula;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public String getDataDescription() {
		return dataDescription;
	}

	public void setDataDescription(String dataDescription) {
		this.dataDescription = dataDescription;
	}

	public long getDuration() {
		return duration;
	}

	public void setDuration(long duration) {
		this.duration = duration;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
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
