package com.humanbooster.g5.ideanoval.jst.model;

/**
 * 
 * @author Sylvain
 *
 */
public class CommentAlert extends Alert {
	private Comment comment;

	/**
	 * 
	 */
	public CommentAlert() {
		super();
	}

	/**
	 * @param comment
	 */
	public CommentAlert(Comment comment) {
		super();
		this.comment = comment;
	}

	/**
	 * @param user
	 * @param alertMotive
	 */
	public CommentAlert(User user, AlertMotive alertMotive) {
		super(user, alertMotive);
	}

	/**
	 * 
	 * @return
	 */

	public Comment getComment() {
		return comment;
	}

	public void setComment(Comment comment) {
		this.comment = comment;
	}

	@Override
	public String toString() {
		return "CommentAlert [comment=" + comment + "]";
	}
	
}
