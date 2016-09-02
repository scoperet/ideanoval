package com.humanbooster.g5.ideanoval.jst.model;

/**
 * 
 * @author Sylvain
 *
 */
public class AlertMotive {
	private long alertMotiveId;
	private String label;
	private String description;

	/**
	 * 
	 */
	public AlertMotive() {
		super();
	}

	/**
	 * 
	 * @param label
	 * @param description
	 */
	public AlertMotive(String label, String description) {
		super();
		this.label = label;
		this.description = description;
	}

	/**
	 * 
	 * @return
	 */
	public long getAlertMotiveId() {
		return alertMotiveId;
	}
	
	/**
	 * 
	 * @param alertMotiveId
	 */
	public void setAlertMotiveId(long alertMotiveId) {
		this.alertMotiveId = alertMotiveId;
	}
	
	/**
	 * 
	 * @return
	 */
	public String getLabel() {
		return label;
	}
	
	/**
	 * 
	 * @param label
	 */
	public void setLabel(String label) {
		this.label = label;
	}
	
	/**
	 * 
	 * @return
	 */
	public String getDescription() {
		return description;
	}
	
	/**
	 * 
	 * @param description
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "AlertMotive [alertMotiveId=" + alertMotiveId + ", label=" + label + ", description=" + description
				+ "]";
	}
	
}
