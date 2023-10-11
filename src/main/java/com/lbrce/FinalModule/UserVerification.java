package com.lbrce.FinalModule;
import java.util.*;
public class UserVerification {
	public boolean check(String uname,String pawd) {
		ResourceBundle rb=ResourceBundle.getBundle("config");
		String username=rb.getString("username");
		String password=rb.getString("password");
		if(uname.equals(username)&&pawd.equals(password)) {
			return true;
		}
		else{
			return false;
		}
	}
}
