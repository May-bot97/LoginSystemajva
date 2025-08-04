package Loginsystem;

import java.util.HashMap;

public class IDandPasswords {
	
	HashMap<String,String> Logininfo= new HashMap<String,String>();
	IDandPasswords(){
		
		Logininfo.put("bro", "pizza");
		Logininfo.put("may", "asdfg");
		Logininfo.put("nal;", "afds");
	}
	protected HashMap getLogininfo() {
		return Logininfo;
	}

	

}
