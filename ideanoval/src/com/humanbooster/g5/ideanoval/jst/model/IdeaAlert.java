package com.humanbooster.g5.ideanoval.jst.model;

/**
 * 
 * @author Sylvain
 *
 */
public class IdeaAlert extends Alert {
	private Idea idea;

	/**
	 * 
	 */
	public IdeaAlert() {
		super();
	}

	/**
	 * @param idea
	 */
	public IdeaAlert(Idea idea) {
		super();
		this.idea = idea;
	}

	/**
	 * @param user
	 * @param alertMotive
	 */
	public IdeaAlert(User user, AlertMotive alertMotive) {
		super(user, alertMotive);
		// TODO Auto-generated constructor stub
	}

	public Idea getIdea() {
		return idea;
	}

	public void setIdea(Idea idea) {
		this.idea = idea;
	}

	@Override
	public String toString() {
		return "IdeaAlert [idea=" + idea + "]";
	}


}
