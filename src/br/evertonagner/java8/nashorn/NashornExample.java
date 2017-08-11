package br.evertonagner.java8.nashorn;

import br.evertonagner.java8.Gender;
import br.evertonagner.java8.Person;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class NashornExample {

	static ScriptEngine nashorn = new ScriptEngineManager().getEngineByName("nashorn");
	
	public static void main(String[] args) throws ScriptException {
		nashorn.eval("print('Hello Nashorn!')");
		
		Person p = new Person(1, "John Doe", 27, Gender.MALE);
		
		nashorn.put("john", p);
		
		nashorn.eval("var johnAge = john.getAge();");
		nashorn.eval("print(johnAge);");
	}

}
