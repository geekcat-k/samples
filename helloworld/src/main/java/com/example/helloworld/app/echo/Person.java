package com.example.helloworld.app.echo;

import java.io.Serializable;
import java.util.Date;

public class Person implements Serializable{
    private static final long serialVersionUID = 23453245678L;
    private String name;
    private int age;
    private Date birthDay;
    
    public Person(){
    }
    
    public Person(String _name, int _age, Date _birthDay){
    	name = _name;
    	age = _age;
    	birthDay = _birthDay;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Date getBirthDay() {
		return birthDay;
	}

	public void setBirthDay(Date birthDay) {
		this.birthDay = birthDay;
	}
	
}
