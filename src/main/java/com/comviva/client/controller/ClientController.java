package com.comviva.client.controller;

import javax.servlet.http.HttpSession;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import com.comviva.client.dto.Constants;
import com.comviva.client.dto.PostResponseStatus;
import com.comviva.client.dto.UrlConstants;
import com.comviva.client.model.PostResponse;
import com.comviva.client.model.UserDetails;
import com.comviva.client.service.ClientService;

@RestController
public class ClientController {
	ClientService clientService = new ClientService();
	HttpSession session;
	
	@RequestMapping("/")
	public ModelAndView home() {
		ModelAndView mv = new ModelAndView(Constants.INDEX);
		return mv;
	}

	@RequestMapping(value = "/login_credentials", method = RequestMethod.POST)
	public ModelAndView login(@RequestParam(value="account") int account,@RequestParam(value="password") String password) {
		UserDetails user = new UserDetails();
		user.setAccount(account);
		user.setPassword(password);
		PostResponse response = clientService.json_init(user, UrlConstants.USER_LOGIN);
		System.out.println(response.getStatus());
		return clientService.login_verification(response);
	}	
	
	@RequestMapping(value="/register", method=RequestMethod.POST)
	public ModelAndView redirect_register() {
		ModelAndView mv = new ModelAndView(Constants.REGISTER);
		return mv;
	}
	
	@RequestMapping(value = "/userDetails", method = RequestMethod.POST)
    public ModelAndView view(@ModelAttribute UserDetails req, Model model) {
		PostResponse response = clientService.json_init(req, UrlConstants.USER_LOGIN);
		return clientService.login_verification(response);	  
	}
	 
	@RequestMapping(value="/add_account", method = RequestMethod.POST)
	public ModelAndView add(@ModelAttribute UserDetails request) {
		PostResponse response = clientService.json_init(request, UrlConstants.USER_REGISTER);
		System.out.println(response.getStatus());
		return clientService.register(response);
	}
	 
	@RequestMapping(value="/delete", method=RequestMethod.POST)
	public ModelAndView delete(@ModelAttribute UserDetails request) {
		PostResponse response = clientService.json_init(request, UrlConstants.USER_DELETE);
		return clientService.delete(response);
	}
	 
	@RequestMapping(value="/modify_account", method = RequestMethod.POST)
	public ModelAndView modify_account(@ModelAttribute UserDetails request) {
		PostResponse response = clientService.json_init(request, UrlConstants.USER_PASSWORD_AUTHENTICATION);
		return clientService.modifyRedirect(response);
	}
	 
	@RequestMapping(value="/modify", method = RequestMethod.POST)
	public ModelAndView modify(@ModelAttribute UserDetails request) {
		PostResponse response = clientService.json_init(request, UrlConstants.USER_MODIFY);
		if(response.getStatus().equals(PostResponseStatus.SUCCESS))
			return clientService.setUser(Constants.CHECK_1);
		return clientService.setUser(Constants.CHECK_1);
	 }
	 
	@RequestMapping(value="/logout", method = RequestMethod.POST)
	public ModelAndView logout(){
		ModelAndView mv = new ModelAndView(Constants.INDEX);
		return mv;  
	}
	 
	//Further imprrovements
	/*
	 * @RequestMapping(value="/logout_redirect", method = RequestMethod.POST) public
	 * ModelAndView logout_redirect(){ ModelAndView mv = new ModelAndView("logout");
	 * return mv; }
	 */

}