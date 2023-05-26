package com.example.myfirstspringweb.ToDo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class ToDoService {

	private static List<ToDo> todo = new ArrayList<>();
	private static int id = 0;

	static {
		todo.add(new ToDo(++id, "men", "Springboot", LocalDate.now().plusYears(1), false));
		todo.add(new ToDo(++id, "abebe", "kebe", LocalDate.now().plusYears(6), true));
		todo.add(new ToDo(++id, "bro", "react", LocalDate.now().plusYears(13), false));
	}

	public List<ToDo> findByUsername(String name) {
		return todo;
	}
	
	public void addtodo(String name, String desc, LocalDate d, boolean m) {
		ToDo data = new ToDo(++id,name,desc,d,m);
		todo.add(data);
	}
	public void deleteToDo(int id) {
		Predicate<?super ToDo> predicate = todo -> todo.getId() == id;
		todo.removeIf(predicate);
	}
	public ToDo findById(int id) {
		Predicate<?super ToDo> predicate = todo -> todo.getId() == id;
//		ToDo todo = todo.stream.filter(predicate).findFirst().get();
//		return todo;
		return null;
	}
	public List<ToDo> findAll(){
//		Predicate<?super ToDo> predicate = todo -> todo.get ;
		return null;
	}
}
