package com.example.myfirstspringweb.Hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SayHelloController {

	@RequestMapping("hello")
	@ResponseBody
	public String sayhello() {
		return "this is my first code";
	}
	@RequestMapping("html")
	@ResponseBody
	public String sayhtml() {
		StringBuffer sb = new StringBuffer();
		sb.append("<html>");
		sb.append("<head>");
		sb.append("<title> my page </title>");
		sb.append("</head>");
		sb.append("<body>");
		sb.append("<h1> this is my first page </h1>");
		sb.append("</body>");
		sb.append("</html>");
		return sb.toString();
	}
	@RequestMapping("jsp")
//	@ResponseBody
	public String sayjsp() {
		return "hello";
	}
}
