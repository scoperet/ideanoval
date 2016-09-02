package com.humanbooster.g5.ideanoval.jst.model;

/**
 * 
 * @author Sylvain
 *
 */
public class PollAnswerChoice {
	private long pollAnwerChoiceId;
	private String label;
	private boolean otherType;
	
	/**
	 * 
	 */
	public PollAnswerChoice() {		
		super();
	}

	/**
	 * 
	 * @param pollAnwerChoiceId
	 * @param label
	 * @param otherType
	 */
	public PollAnswerChoice(long pollAnwerChoiceId, String label, boolean otherType) {
		super();
		this.pollAnwerChoiceId = pollAnwerChoiceId;
		this.label = label;
		this.otherType = otherType;
	}

	/**
	 * 
	 * @return
	 */
	public long getPollAnwerChoiceId() {
		return pollAnwerChoiceId;
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
	public boolean isOtherType() {
		return otherType;
	}
	
	/**
	 * 
	 * @param otherType
	 */
	public void setOtherType(boolean otherType) {
		this.otherType = otherType;
	}

	@Override
	public String toString() {
		return "PollAnswerChoice [pollAnwerChoiceId=" + pollAnwerChoiceId + ", label=" + label + ", otherType="
				+ otherType + "]";
	}
	
}
