package com.humanbooster.g5.ideanoval.jst.model;

/**
 * 
 * @author Sylvain
 *
 */
public class Alert {
	private long alertId;
	private User user;
	private AlertMotive alertMotive;
	
	/**
	 * 
	 */
	public Alert() {
		super();
	}

	/**
	 * @param user
	 * @param alertMotive
	 */
	public Alert(User user, AlertMotive alertMotive) {
		super();
		this.user = user;
		this.alertMotive = alertMotive;
	}

	public AlertMotive getAlertMotive() {
		return alertMotive;
	}

	public void setAlertMotive(AlertMotive alertMotive) {
		this.alertMotive = alertMotive;
	}

	/**
	 * 
	 * @return
	 */
	public long getAlertId() {
		return alertId;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Override
	public String toString() {
		return "Alert [alertId=" + alertId + ", user=" + user + ", alertMotive=" + alertMotive + "]";
	}

}
