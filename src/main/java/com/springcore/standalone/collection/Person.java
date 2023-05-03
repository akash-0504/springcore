package com.springcore.standalone.collection;

import java.util.List;
import java.util.Map;
import java.util.Properties;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Person {
	
	@Autowired
	@Qualifier("person2")
	private List<String> friends;
	private Map<String, Integer> fessStructure;
	private Properties properties;

	public Map<String, Integer> getFessStructure() {
		return fessStructure;
	}

	public void setFessStructure(Map<String, Integer> fessStructure) {
		this.fessStructure = fessStructure;
	}

	public List<String> getFriends() {
		return friends;
	}

	public void setFriends(List<String> friends) {
		this.friends = friends;
	}

	public Properties getProperties() {
		return properties;
	}

	public void setProperties(Properties properties) {
		this.properties = properties;
	}

	@Override
	public String toString() {
		return "Person [friends=" + friends + ", fessStructure=" + fessStructure + ", properties=" + properties + "]";
	}

	
	

}
