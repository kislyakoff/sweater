package by.kislyakoff.sweater;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import by.kislyakoff.sweater.domain.Message;
import by.kislyakoff.sweater.repository.MessageRepo;

@Controller
public class GreetingController {
	
	@Autowired
	private MessageRepo messageRepo; 

	@GetMapping("/greeting")
	public String greeting(
			@RequestParam(name="name", required=false, defaultValue="World") String name, 
			Map<String, Object> model
			) {
		model.put("name", name);
		return "greeting";
	}
	
	@GetMapping
	public String main(Map<String, Object> model) {
		
		Iterable<Message> message = messageRepo.findAll();
		model.put("messages", "Hello, let's Spring!");
		return "main";
	}
}
