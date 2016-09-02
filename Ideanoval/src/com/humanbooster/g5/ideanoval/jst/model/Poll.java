package com.humanbooster.g5.ideanoval.jst.model;

import java.util.Collection;

/**
 * 
 * @author Sylvain
 *
 */
public class Poll {
	private long pollId;
	private String question;
	private int limitAnswerInDays;
	Collection<PollAnswerChoice> pollAnswerChoices;
	
	/**
	 * 
	 * @return
	 */
	public Collection<PollAnswerChoice> getPollAnswerChoices() {
		return pollAnswerChoices;
	}

	public void setPollAnswerChoices(Collection<PollAnswerChoice> pollAnswerChoices) {
		this.pollAnswerChoices = pollAnswerChoices;
	}

	/**
	 * 
	 * @return
	 */
	public long getPollId() {
		return pollId;
	}
	
	/**
	 * 
	 * @param pollId
	 */
	public void setPollId(long pollId) {
		this.pollId = pollId;
	}
	
	/**
	 * 
	 * @return
	 */
	public String getQuestion() {
		return question;
	}
	
	/**
	 * 
	 * @param question
	 */
	public void setQuestion(String question) {
		this.question = question;
	}
	
	/**
	 * 
	 * @return
	 */
	public int getLimitAnswerInDays() {
		return limitAnswerInDays;
	}
	
	/**
	 * 
	 * @param limitAnswerInDays
	 */
	public void setLimitAnswerInDays(int limitAnswerInDays) {
		this.limitAnswerInDays = limitAnswerInDays;
	}
	
}
