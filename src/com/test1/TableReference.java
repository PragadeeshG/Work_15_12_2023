package com.test1;

public class TableReference {
	private long dataRefId;
	private String tableLength;
	private String tableHeaders;
	private Integer rowCount;
	private Integer columnCount;
	private String headerColour;
	private String rowDataColour;
	private boolean isActive;
	private String creationDate;
	private String modifiedDate;
	private String entityState;

	public TableReference() {

	}

	public TableReference(long dataRefId, String tableLength, String tableHeaders, Integer rowCount,
			Integer columnCount, String headerColour, String rowDataColour, boolean isActive, String creationDate,
			String modifiedDate, String entityState) {
		super();
		this.dataRefId = dataRefId;
		this.tableLength = tableLength;
		this.tableHeaders = tableHeaders;
		this.rowCount = rowCount;
		this.columnCount = columnCount;
		this.headerColour = headerColour;
		this.rowDataColour = rowDataColour;
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

	public String getTableLength() {
		return tableLength;
	}

	public void setTableLength(String tableLength) {
		this.tableLength = tableLength;
	}

	public String getTableHeaders() {
		return tableHeaders;
	}

	public void setTableHeaders(String tableHeaders) {
		this.tableHeaders = tableHeaders;
	}

	public Integer getRowCount() {
		return rowCount;
	}

	public void setRowCount(Integer rowCount) {
		this.rowCount = rowCount;
	}

	public Integer getColumnCount() {
		return columnCount;
	}

	public void setColumnCount(Integer columnCount) {
		this.columnCount = columnCount;
	}

	public String getHeaderColour() {
		return headerColour;
	}

	public void setHeaderColour(String headerColour) {
		this.headerColour = headerColour;
	}

	public String getRowDataColour() {
		return rowDataColour;
	}

	public void setRowDataColour(String rowDataColour) {
		this.rowDataColour = rowDataColour;
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
