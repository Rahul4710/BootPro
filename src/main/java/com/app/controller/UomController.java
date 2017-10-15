package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.app.model.Uom;
import com.app.service.IUomService;

@Controller
public class UomController {
	@Autowired
	private IUomService service;
	
	@GetMapping("/regUom")
	public String showRegPage(){
		return "UomRegister";
	}
	
	@PostMapping("/insertUom")
	public String saveUom(@ModelAttribute Uom uom,ModelMap map){
		long uomId=service.save(uom);
		map.addAttribute("message","UOM("+uomId+")Created");
		return "UomRegister";
				
	}

}
