package com.humanbooster.g5.ideanoval.jst.model;

/**
 * 
 * @author Sylvain
 *
 */
public class CategoryIdea {
	private long categoryId;
	private String label;
	private String description;
	
	/**
	 * 
	 */
	public CategoryIdea() {
		super();
	}

	public CategoryIdea(String label, String description) {
		this.label = label;
		this.description = description;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
	public String toString() {
		return "CategoryIdea [categoryId=" + categoryId + ", label=" + label + "]";
	}
	
}
