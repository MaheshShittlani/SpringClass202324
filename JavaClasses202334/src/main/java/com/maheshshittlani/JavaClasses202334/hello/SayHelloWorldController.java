package com.maheshshittlani.JavaClasses202334.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SayHelloWorldController {
	
	@RequestMapping("hello-world")
	@ResponseBody
	public String sayHelloWorld() {
		return "Hello !!! World, How are you doing";
	}
	
	
	@RequestMapping("hello-world-html")
	@ResponseBody
	public String sayHelloWorldHTML() {
		StringBuilder sb = new StringBuilder();
		sb.append("<html>");
			sb.append("<head>");
				sb.append("<title>Spring Web page</title>");
			sb.append("</head>");
			sb.append("<body>");
				sb.append("<h1>Hello World, Learning to create web pages with spring</h1>");
			sb.append("</body>");
		sb.append("</html>");
		
		return sb.toString();
	}
	
	@RequestMapping("hello-world-jsp")
	public String sayHelloWorldJSP() {
		return "helloworld";
	}
	
}
