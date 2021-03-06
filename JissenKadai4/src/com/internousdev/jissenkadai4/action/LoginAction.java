
package com.internousdev.jissenkadai4.action;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.jissenkadai4.dao.LoginDAO;
import com.opensymphony.xwork2.ActionSupport;

	public class LoginAction extends ActionSupport implements SessionAware{

		private String id;
		private String password;
		private Map<String,Object>session;

		public String execute() {
			LoginDAO dao = new LoginDAO();
			boolean ret = dao.select(id,password);
			if(ret==false){
				return ERROR;
			}
			session.put("name_key",dao.getAdmin_name());
		return SUCCESS;
		}


		public String getId() {
			return id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public Map<String, Object> getSession() {
			return session;
		}


		public void setSession(Map<String, Object> session) {
			this.session = session;
		}


		public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
		}


		}