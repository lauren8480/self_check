package com.bit.controller;

import java.util.Locale;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class OpenBoardController {

	@RequestMapping(value = "/openboard/list", method = RequestMethod.GET)
	public void home(Locale locale, Model model) {
		
	}
}
