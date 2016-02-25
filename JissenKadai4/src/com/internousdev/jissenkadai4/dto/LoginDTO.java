/**
 *
 */
package com.internousdev.jissenkadai4.dto;

/**
 * @author internous
 *
 */
public class LoginDTO {
	private static String username;
	private static String password;

	
	public String getpassword() {
		return password;
	}

	public void setPassword(String password) {
		LoginDTO.password = password;
	}

	public String getUsername() {
		return username;
	}

	public void serUsername(String username) {
		LoginDTO.username = username;
	}

}
