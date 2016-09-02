package com.humanbooster.g5.ideanoval.jst.model;

/**
 * 
 * @author Sylvain
 *
 */
public class Illustration {
	private long ideaId;
	private String title;
	private int width;
	private int height;
	private int weight;
	private IllustrationFormat format;

	/**
	 * 
	 */
	public Illustration() {
		super();
	}

	/**
	 * @param title
	 * @param width
	 * @param height
	 * @param weight
	 * @param format
	 */
	public Illustration(String title, int width, int height, int weight, IllustrationFormat format) {
		super();
		this.title = title;
		this.width = width;
		this.height = height;
		this.weight = weight;
		this.format = format;
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
	public int getWidth() {
		return width;
	}

	/**
	 * 
	 * @param width
	 */
	public void setWidth(int width) {
		this.width = width;
	}

	/**
	 * 
	 * @return
	 */
	public int getHeight() {
		return height;
	}

	/**
	 * 
	 * @param height
	 */
	public void setHeight(int height) {
		this.height = height;
	}

	/**
	 * 
	 * @return
	 */
	public int getWeight() {
		return weight;
	}

	/**
	 * 
	 * @param weight
	 */
	public void setWeight(int weight) {
		this.weight = weight;
	}

	/**
	 * 
	 * @return
	 */
	public IllustrationFormat getFormat() {
		return format;
	}

	/**
	 * 
	 * @param format
	 */
	public void setFormat(IllustrationFormat format) {
		this.format = format;
	}

	/**
	 * 
	 * @return
	 */
	public long getIdeaId() {
		return ideaId;
	}
	
	/**
	 * 
	 * @author Sylvain
	 *
	 */
	public enum IllustrationFormat {
		JPG,
		PNG,
		GIF
	}

	@Override
	public String toString() {
		return "Illustration [ideaId=" + ideaId + ", title=" + title + ", width=" + width + ", height=" + height
				+ ", weight=" + weight + ", format=" + format + "]";
	}
	
	
	
}
