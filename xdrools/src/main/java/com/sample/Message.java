package com.sample;

import java.util.Set;

 
public class Message {

    public static final int HELLO = 0;
    public static final int GOODBYE = 1;

    private String message;
    private Set<Person> persons;
    public Set<Person> getPersons() {
		return persons;
	}

	public void setPersons(Set<Person> persons) {
		this.persons = persons;
	}

	private int status;

    public String getMessage() {
        return this.message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getStatus() {
        return this.status;
    }

    public void setStatus(int status) {
        this.status = status;
    }



}
