/**
 * 
 */
package com.humanbooster.g5.ideanoval.jst.model;

/**
 * @author Sylvain
 *
 */
public class Role {
	private long roleId;
	private String roleName;
	private String description;
	
	/**
	 * 
	 */
	public Role() {
		super();
	}

	/**
	 * 
	 * @param roleName
	 * @param description
	 */
	public Role(String roleName, String description) {
		super();
		this.roleName = roleName;
		this.description = description;
	}

	/**
	 * 
	 * @return
	 */
	public String getRoleName() {
		return roleName;
	}
	/**
	 * 
	 * @param roleName
	 */
	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}
	/**
	 * 
	 * @return
	 */
	public String getDescription() {
		return description;
	}
	/**
	 * 
	 * @param description
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	/**
	 * 
	 * @return
	 */
	public long getRoleId() {
		return roleId;
	}

	@Override
	public String toString() {
		return "Role [roleId=" + roleId + ", roleName=" + roleName + ", description=" + description + "]";
	}
	
	
}
