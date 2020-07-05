package com.main;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;  
	
	@Controller  
	public class CocController {  
	@RequestMapping("/Playerdetails")  
	    public String display(HttpServletRequest req,Model m) {
		CocFetchPlayerInfo cocfetchplayerinfo=new CocFetchPlayerInfo();
		//Map<String, Object> map=cocfetchplayerinfo.details(req.getParameter("playerid"));
		CoCFetchPlayerInfoPojo cocfetchplayerinfopojo=new CoCFetchPlayerInfoPojo();
		Root root=cocfetchplayerinfopojo.details(req.getParameter("playerid"));
		m.addAttribute("message",root.getTroops()); 
	        return "Players";  
	    }     
	}  

