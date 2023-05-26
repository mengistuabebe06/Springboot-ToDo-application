package com.example.myfirstspringweb.ToDo;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.bind.BindResult;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import jakarta.validation.Valid;

@Controller
public class ToDoController {

//	@Autowired
	private ToDoService doService;

//	this is using constractor injection

	public ToDoController(ToDoService doService) {
		super();
		this.doService = doService;
	} 

	@RequestMapping("/")
	public String goTOWellcome(ModelMap model) {
		model.put("name", "mengistu");
		return "wellcame";
	}
	@RequestMapping("/todolist")
	public String listuser(ModelMap model) {
		List<ToDo> todo = doService.findByUsername("men");
		model.put("todo", todo);
		return "todolist";
	}
	
	@RequestMapping(value = "/add-todo", method = RequestMethod.GET)
	public String addToDo(ModelMap model) {
		String name = (String) model.get("name");
		ToDo todo = new ToDo(0, name , "Defualt Description", LocalDate.now().plusYears(1), false);
		model.put("todo", todo);
		return "addtodo";
	}
//	@RequestMapping(value = "/add-todo", method = RequestMethod.POST)
//	public String addToData(@RequestParam String description, ModelMap model) {
////		model.put("description", description);
//		String name = (String) model.get("name");
//		doService.addtodo(name, description,LocalDate.now(), false);
//		return "redirect:todolist";
//	}
	// this is using command bean binding or 2-way binding
	@RequestMapping(value = "/add-todo", method = RequestMethod.POST)
	public String addToData(@ModelAttribute("todo") @Valid ToDo todo, BindingResult result, ModelMap model) {
		if(result.hasErrors()) {
			return "addtodo";
		}
//		model.put("description", description);
		String name = (String) model.get("name");
//		String name = todo.setUsername("wnegel");
		
		doService.addtodo(name, todo.getDescription(),todo.getTargetDate(), false);
		return "redirect:todolist";
	}
	
	@RequestMapping("/delete-todo")
	public String deleteTodo(@RequestParam int id) {
		  doService.deleteToDo(id);
		return "redirect:todolist";
	}
	@RequestMapping("/update-todo")
	public String updateTodo(@RequestParam int id, ModelMap model) {
		  ToDo todo= doService.findById(id);
		  model.addAttribute("todo", todo);
		return "redirect:todolist";
	}
}
