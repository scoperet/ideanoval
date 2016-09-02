package com.humanbooster.g5.ideanoval.jst.model;

/**
 * 
 * @author Sylvain
 *
 */
public class User implements Moderable {
	private long userId;
	private String pseudo;
	private String email;
	private boolean active;
	private Role role;
	

	/**
	 * 
	 */
	public User() {
		super();
	}

	/**
	 * 
	 * @param pseudo
	 * @param email
	 * @param active
	 * @param role
	 */
	public User(String pseudo, String email, boolean active, Role role) {
		super();
		this.pseudo = pseudo;
		this.email = email;
		this.active = active;
		this.role = role;
	}

	/**
	 * 
	 * @return
	 */
	public long getUserId() {
		return userId;
	}
	
	/**
	 * 
	 * @return
	 */
	public String getPseudo() {
		return pseudo;
	}
	
	/**
	 * 
	 * @param pseudo
	 */
	public void setPseudo(String pseudo) {
		this.pseudo = pseudo;
	}
	public String getEmail() {
		return email;
	}
	
	/**
	 * 
	 * @param email
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	
	/**
	 * 
	 * @return
	 */
	public boolean isActive() {
		return active;
	}

	/**
	 * 
	 * @param active
	 */
	public void setActive(boolean active) {
		this.active = active;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	/**
	 * 
	 */
	@Override
	public void activate() {
		this.active = true;
	}

	/**
	 * 
	 */
	@Override
	public void deativate() {
		this.active = false;
	}
	
	@Override
	public String toString() {
		return "User [userId=" + userId + ", pseudo=" + pseudo + ", email=" + email + ", active=" + active + ", role="
				+ role + "]";
	}
	
}
