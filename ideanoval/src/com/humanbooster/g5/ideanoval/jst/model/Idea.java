package com.humanbooster.g5.ideanoval.jst.model;

import java.util.Date;

/**
 * 
 * @author Sylvain
 *
 */
public class Idea implements Moderable {
	private String title;
	private String descritpion;
	private boolean active;
	private Date publicationDate;
	private boolean pollAccessible;
	private boolean votable;
	private boolean stopEvaluation;
	private Illustration illustration;
	private Poll poll;
	private CategoryIdea category;

	/**
	 * 
	 */
	public Idea() {
		super();
	}

	/**
	 * @param title
	 * @param descritpion
	 * @param active
	 * @param publicationDate
	 * @param pollAccessible
	 * @param votable
	 * @param stopEvaluation
	 * @param illustration
	 * @param poll
	 * @param category
	 */
	public Idea(String title, String descritpion, boolean active, Date publicationDate, boolean pollAccessible,
			boolean votable, boolean stopEvaluation, Illustration illustration, Poll poll, CategoryIdea category) {
		super();
		this.title = title;
		this.descritpion = descritpion;
		this.active = active;
		this.publicationDate = publicationDate;
		this.pollAccessible = pollAccessible;
		this.votable = votable;
		this.stopEvaluation = stopEvaluation;
		this.illustration = illustration;
		this.poll = poll;
		this.category = category;
	}

	/**
	 * 
	 * @return
	 */
	public CategoryIdea getCategory() {
		return category;
	}

	/**
	 * 
	 * @param category
	 */
	public void setCategory(CategoryIdea category) {
		this.category = category;
	}

	/**
	 * 
	 * @return
	 */
	public Poll getPoll() {
		return poll;
	}

	/**
	 * 
	 * @param poll
	 */
	public void setPoll(Poll poll) {
		this.poll = poll;
	}

	/**
	 * 
	 * @return
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * 
	 * @param title
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * 
	 * @return
	 */
	public String getDescritpion() {
		return descritpion;
	}

	/**
	 * 
	 * @param descritpion
	 */
	public void setDescritpion(String descritpion) {
		this.descritpion = descritpion;
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
	 * @return
	 */
	public Date getPublicationDate() {
		return publicationDate;
	}

	public void setPublicationDate(Date publicationDate) {
		this.publicationDate = publicationDate;
	}

	/**
	 * 
	 * @return
	 */
	public boolean isPoll() {
		return pollAccessible;
	}

	/**
	 * 
	 * @param poll
	 */
	public void setPoll(boolean poll) {
		this.pollAccessible = poll;
	}

	/**
	 * 
	 * @return
	 */
	public boolean isVotable() {
		return votable;
	}

	/**
	 * 
	 * @param votable
	 */
	public void setVotable(boolean votable) {
		this.votable = votable;
	}

	/**
	 * 
	 * @return
	 */
	public Illustration getIllustration() {
		return illustration;
	}

	/**
	 * 
	 * @param illustration
	 */
	public void setIllustration(Illustration illustration) {
		this.illustration = illustration;
	}

	/**
	 * 
	 * @return
	 */
	public boolean isStopEvaluation() {
		return stopEvaluation;
	}

	/**
	 * 
	 * @param stopEvaluation
	 */
	public void setStopEvaluation(boolean stopEvaluation) {
		this.stopEvaluation = stopEvaluation;
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
		return "Idea [title=" + title + ", descritpion=" + descritpion + ", active=" + active + ", publicationDate="
				+ publicationDate + ", pollAccessible=" + pollAccessible + ", votable=" + votable + ", stopEvaluation="
				+ stopEvaluation + ", illustration=" + illustration + ", poll=" + poll + ", category=" + category + "]";
	}

}
