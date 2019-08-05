package com.comviva.client.service;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import org.json.simple.JSONObject;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;
import com.comviva.client.dto.Constants;
import com.comviva.client.dto.PostResponseStatus;
import com.comviva.client.dto.UrlConstants;
import com.comviva.client.model.PostResponse;
import com.comviva.client.model.UserDetails;

public class ClientService {
	public ModelAndView login_verification(PostResponse result) {
		ModelAndView mv = new ModelAndView(Constants.INDEX);
		System.out.println("hello");
		System.out.println(PostResponseStatus.ACCOUNT_FAIL);
		if(result.getStatus().equals(PostResponseStatus.ACCOUNT_FAIL)) 
			{System.out.println("hello22"); mv.addObject(Constants.ACCOUNT_ERROR , Constants.ACCOUNT_NOT_EXIST);}
		else if(result.getStatus().equals(PostResponseStatus.PASSWORD_FAIL)) 
			mv.addObject(Constants.PASSWORD_ERROR, Constants.ACCOUNT_OR_PASSWORD_NOT_EXIST);
		else 
			return setUser(Constants.CHECK_1);
		return mv;
	}
	
	public UserDetails success_view() {
		RestTemplate restTemplate = new RestTemplate();
		return restTemplate.postForObject(UrlConstants.USER_DETAILS , null,UserDetails.class );
	}
	
	public ModelAndView setUser(String check_radio) {
		UserDetails u=success_view();
		ModelAndView profile = new ModelAndView(Constants.USER_DETAILS);
		profile.addObject("account",u.getAccount());
		profile.addObject("name",u.getName());
		profile.addObject("dob", u.getDob());
		profile.addObject("email", u.getEmail());
		profile.addObject("phone", u.getPhone());
		profile.addObject("fathername", u.getFathername());
		profile.addObject("mothername", u.getMothername());
		profile.addObject("gender", u.getGender());
		profile.addObject("adhaar", u.getAdhaar());
		profile.addObject("pan", u.getPan());
		profile.addObject("bloodgroup", u.getBloodgroup());
		profile.addObject("alternatenumber", u.getAlternatenumber());
		if(check_radio.equals(Constants.CHECK_3)) {
			profile.addObject(Constants.CHECK_3 , Constants.CHECKED);
			profile.addObject(Constants.DELETE_PASSWORD_ERROR , Constants.WRONG_PASSWORD_ERROR);
		}
		if(check_radio.equals(Constants.CHECK_1))
			profile.addObject(Constants.CHECK_1 , Constants.CHECKED);
		if(check_radio.equals(Constants.CHECK_2)) {
			profile.addObject(Constants.CHECK_2 , Constants.CHECKED);
			profile.addObject(Constants.MODIFY_PASSWORD_ERROR, Constants.WRONG_PASSWORD_ERROR);
		}
		return profile;
	}
	
	@SuppressWarnings("unchecked")
	public PostResponse json_init(UserDetails req, String url) {
		RestTemplate restTemplate = new RestTemplate();
		  HttpHeaders headers = new HttpHeaders(); 
		  headers.setContentType(MediaType.APPLICATION_JSON); 
		  JSONObject personJsonObject = new JSONObject(); 
		  personJsonObject.put("account", req.getAccount());
		  personJsonObject.put("password",getSHA(req.getPassword()));
		  personJsonObject.put("name", req.getName());
		  personJsonObject.put("dob", req.getDob());
		  personJsonObject.put("email", req.getEmail());
		  personJsonObject.put("phone", req.getPhone());
		  personJsonObject.put("fathername", req.getFathername());
		  personJsonObject.put("mothername", req.getMothername());
		  personJsonObject.put("adhaar", req.getAdhaar());
		  personJsonObject.put("pan", req.getPan());
		  personJsonObject.put("gender", req.getGender());
		  personJsonObject.put("bloodgroup", req.getBloodgroup());
		  personJsonObject.put("alternatenumber", req.getAlternatenumber());
		  HttpEntity<String> request=new HttpEntity<String>(personJsonObject.toString(),headers);
		  return restTemplate.postForObject(url, request,PostResponse.class);
	}
	
	public ModelAndView register(PostResponse response) {
		ModelAndView mv;
		if(response.getStatus().equals(PostResponseStatus.SUCCESS)) {
			mv = new ModelAndView(Constants.INDEX);
		}
		else{
			mv=new ModelAndView(Constants.REGISTER);
			mv.addObject(Constants.EXISTS, Constants.ACCOUNT_ALREADY_EXISTS);  
		}
		return mv;
	}
	
	
	public ModelAndView delete(PostResponse response) {
		ModelAndView mv;
		if(response.getStatus().equals(PostResponseStatus.SUCCESS))
			mv = new ModelAndView(Constants.INDEX);
		else
			return setUser(Constants.CHECK_3);
		return mv;
	}
	
	public ModelAndView modifyRedirect(PostResponse response) {
		if(response.getStatus().equals(PostResponseStatus.SUCCESS))
			return modifyPresetContent();
		else
			return setUser(Constants.CHECK_2);
	}
	
	public ModelAndView modifyPresetContent() {
		UserDetails u=success_view();
		ModelAndView mv=new ModelAndView(Constants.MODIFY_FORM);
		mv.addObject("account", u.getAccount());
		mv.addObject("name",u.getName());
		mv.addObject("dob", u.getDob());
		mv.addObject("email", u.getEmail());
		mv.addObject("phone", u.getPhone());
		mv.addObject("fathername", u.getFathername());
		mv.addObject("mothername", u.getMothername());
		mv.addObject("adhaar", u.getAdhaar());
		mv.addObject("pan", u.getPan());
		mv.addObject("bloodgroup", u.getBloodgroup());
		mv.addObject("alternatenumber", u.getAlternatenumber());
		
		return mv;
	}
	
	
	public static String getSHA(String input) 
    {
        try { 
            // Static getInstance method is called with hashing SHA 
            MessageDigest md = MessageDigest.getInstance(Constants.SHA_256); 

            // digest() method called 
            // to calculate message digest of an input 
            // and return array of byte 
            byte[] messageDigest = md.digest(input.getBytes()); 
  
            // Convert byte array into signum representation 
            BigInteger no = new BigInteger(1, messageDigest); 
  
            // Convert message digest into hex value 
            String hashtext = no.toString(16); 
  
            while (hashtext.length() < 32) { 
                hashtext = "0" + hashtext; 
            } 
  
            return hashtext; 
        } 
  
        // For specifying wrong message digest algorithms 
        catch (NoSuchAlgorithmException e) { 
            System.out.println("Exception thrown"
                               + " for incorrect algorithm: " + e); 
            e.printStackTrace();
            return null; 
        } 
    } 
  
}
