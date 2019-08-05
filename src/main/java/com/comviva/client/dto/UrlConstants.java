package com.comviva.client.dto;

public class UrlConstants {

	public static final String SERVER_PORT = "8087";
	
	public static final String BASE_URL =  "http://localhost:"+ SERVER_PORT +"/bank";
	
	public static final String USER_LOGIN = BASE_URL + "/login";
	
	public static final String USER_REGISTER = BASE_URL +"/register";
	
	public static final String USER_DELETE = BASE_URL +"/delete";
	
	public static final String USER_PASSWORD_AUTHENTICATION = BASE_URL +"/modifyPassCheck";
	
	public static final String USER_MODIFY = BASE_URL +"/modify";
	
	public static final String USER_DETAILS = BASE_URL +"/userDetails";
	
}
