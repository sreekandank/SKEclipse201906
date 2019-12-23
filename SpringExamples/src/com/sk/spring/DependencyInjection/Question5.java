package com.sk.spring.DependencyInjection;  
import java.util.Iterator;
import java.util.List;  
  
public class Question5 {  
private int id;  
private String name;  
private List<Answer2> answers;    
  
public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public List<Answer2> getAnswers() {
	return answers;
}

public void setAnswers(List<Answer2> answers) {
	this.answers = answers;
}

public void displayInfo(){  
    System.out.println(id+" "+name);  
    System.out.println("answers are:");  
    Iterator<Answer2> itr=answers.iterator();  
    while(itr.hasNext()){  
        System.out.println(itr.next());  
    }  
}    
  
}