package com.humanbooster.g5.ideanoval.jst.model;

/**
 * 
 * @author Sylvain
 *
 */
public class Comment implements Moderable {
	private long userId;
	private long ideaId;
	private String text;
	private boolean active;

	/**
	 * 
	 */
	public Comment() {
		super();
	}

	/**
	 * 
	 * @param ideaId
	 * @param text
	 * @param active
	 */
	public Comment(long ideaId, String text, boolean active) {
		super();
		this.ideaId = ideaId;
		this.text = text;
		this.active = active;
	}

	/**
	 * 
	 * @param authorComment
	 * @return
	 */
	public boolean isCommentedByAuthor(User authorComment) {
		// TODO isCommentedByAuthor()
		/** Get the author of the idea and compare to authorComment
		 *  If they are the same, return true
		 *  Otherwise return false
		 */
		
		return false;
	}

	/**
	 * 
	 * @return
	 */
	public long getUserId() {
		return userId;
	}

	public long getIdeaId() {
		return ideaId;
	}

	/**
	 * 
	 * @return
	 */
	public String getText() {
		return text;
	}


	public void setText(String text) {
		this.text = text;
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
		return "Comment [userId=" + userId + ", ideaId=" + ideaId + ", text=" + text + ", active=" + active + "]";
	}
	
}
