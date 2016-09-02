package com.humanbooster.g5.ideanoval.jst.model;

/**
 * 
 * @author Sylvain
 *
 */
public class PollAnswer {
	private User user;
	private Poll poll;
	private PollAnswerChoice pollAnswerChoice;
	private String otherText;
	
	/**
	 * 
	 */
	public PollAnswer() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param user
	 * @param poll
	 * @param pollAnswerChoice
	 * @param otherText
	 */
	public PollAnswer(User user, Poll poll, PollAnswerChoice pollAnswerChoice, String otherText) {
		super();
		this.user = user;
		this.poll = poll;
		this.pollAnswerChoice = pollAnswerChoice;
		this.otherText = otherText;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public PollAnswerChoice getPollAnswerChoice() {
		return pollAnswerChoice;
	}
	public void setPollAnswerChoice(PollAnswerChoice pollAnswerChoice) {
		this.pollAnswerChoice = pollAnswerChoice;
	}
	public String getOtherText() {
		return otherText;
	}
	public void setOtherText(String otherText) {
		this.otherText = otherText;
	}
	public Poll getPoll() {
		return poll;
	}
	public void setPoll(Poll poll) {
		this.poll = poll;
	}
	@Override
	public String toString() {
		return "PollAnswer [user=" + user + ", poll=" + poll + ", pollAnswerChoice=" + pollAnswerChoice + ", otherText="
				+ otherText + "]";
	}

}
