package com.example.myfirstspringweb.calculator;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CalController {

	@RequestMapping(value = "/cal", method = RequestMethod.GET)
	public String calall() {

		return "cal";
	}

	@RequestMapping(value = "/cal", method = RequestMethod.POST)
	public String calall(@RequestParam String numa, @RequestParam String numb, @RequestParam String opt,
			ModelMap model) {
		int a = Integer.parseInt(numa);
		int b = Integer.parseInt(numb);
		int c = 0;
		if (opt.equalsIgnoreCase("+")) {
			c = a + b;
			model.put("add", c);
			return "cal";
		} else if (opt.equals("-")) {
			int k = a - b;
			model.put("sub", k);
			return "cal";
		} else if (opt.equals("*")) {
			int q = a * b;
			model.put("mul", q);
			return "cal";
		} else if (opt.equals("/")) {
			if (b != 0) {
				int d = a / b;
				model.put("diva", d);
				return "cal";
			} else {
				model.put("error", "num 2 mus be non zero");
			}
		} else {
			model.put("error", "Invalid opration!");
		}
		return "cal";
	}
}
