package com.humanbooster.g5.ideanoval.jst.model;

/**
 * 
 * @author Sylvain
 *
 */
public class Vote {
	private User user;
	private Idea idea;
	private int note;
	
	/**
	 * 
	 */
	public Vote() {
		super();
	}
	
	/**
	 * 
	 * @param user
	 * @param idea
	 * @param note
	 */
	public Vote(User user, Idea idea, int note) {
		super();
		this.user = user;
		this.idea = idea;
		this.note = note;
	}

	/**
	 * 
	 * @return
	 */
	public int getNote() {
		return note;
	}
	
	/**
	 * 
	 * @param note
	 */
	public void setNote(int note) {
		this.note = note;
	}
	/**
	 * 
	 * @return
	 */
	public Idea getIdea() {
		return idea;
	}
	/**
	 * 
	 * @param idea
	 */
	public void setIdea(Idea idea) {
		this.idea = idea;
	}
	/**
	 * 
	 * @return
	 */
	public User getUser() {
		return user;
	}
	/**
	 * 
	 * @param user
	 */
	public void setUser(User user) {
		this.user = user;
	}

	@Override
	public String toString() {
		return "Vote [user=" + user + ", idea=" + idea + ", note=" + note + "]";
	}
	
}
