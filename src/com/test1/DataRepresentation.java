package com.test1;

public class DataRepresentation {
	private long representationId;
	private String representationName;
	private String representationType;
	private String representationBehaviour;
	private String creationDate;
	private String modifiedDate;
	private String entityState;

	public DataRepresentation() {

	}

	public DataRepresentation(long representationId, String representationName, String representationType,
			String representationBehaviour, String creationDate, String modifiedDate, String entityState) {
		super();
		this.representationId = representationId;
		this.representationName = representationName;
		this.representationType = representationType;
		this.representationBehaviour = representationBehaviour;
		this.creationDate = creationDate;
		this.modifiedDate = modifiedDate;
		this.entityState = entityState;
	}

	public long getRepresentationId() {
		return representationId;
	}

	public void setRepresentationId(long representationId) {
		this.representationId = representationId;
	}

	public String getRepresentationName() {
		return representationName;
	}

	public void setRepresentationName(String representationName) {
		this.representationName = representationName;
	}

	public String getRepresentationType() {
		return representationType;
	}

	public void setRepresentationType(String representationType) {
		this.representationType = representationType;
	}

	public String getRepresentationBehaviour() {
		return representationBehaviour;
	}

	public void setRepresentationBehaviour(String representationBehaviour) {
		this.representationBehaviour = representationBehaviour;
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
