package com.sk.spring.DependencyInjection;  
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;  
  
public class Question7 {  
	private int id;  
	private String name;  
	private Map<Answer3,User> answers;

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

	public Map<Answer3, User> getAnswers() {
		return answers;
	}

	public void setAnswers(Map<Answer3, User> answers) {
		this.answers = answers;
	}

	public void displayInfo(){  
	    System.out.println("question id:"+id);  
	    System.out.println("question name:"+name);  
	    System.out.println("Answers....");  
	    Set<Entry<Answer3, User>> set=answers.entrySet();  
	    Iterator<Entry<Answer3, User>> itr=set.iterator();  
	    while(itr.hasNext()){  
	        Entry<Answer3, User> entry=itr.next();  
	        Answer3 ans=entry.getKey();  
	        User user=entry.getValue();  
	        System.out.println("Answer Information:");  
	        System.out.println(ans);  
	        System.out.println("Posted By:");  
	        System.out.println(user);  
	    }  
	}  
}