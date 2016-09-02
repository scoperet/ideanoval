package com.humanbooster.g5.ideanoval.jst.model;

/**
 * 
 * @author Sylvain
 *
 */
public class CategoryIdea {
	private long categoryId;
	private String label;
	
	/**
	 * 
	 */
	public CategoryIdea() {
		super();
	}

	/**
	 * @param label
	 */
	public CategoryIdea(String label) {
		super();
		this.label = label;
	}

	/**
	 * 
	 * @return
	 */
	public long getCategoryId() {
		return categoryId;
	}
	
	/**
	 * 
	 * @param categoryId
	 */
	public void setCategoryId(long categoryId) {
		this.categoryId = categoryId;
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

	@Override
	public String toString() {
		return "CategoryIdea [categoryId=" + categoryId + ", label=" + label + "]";
	}
	
}
