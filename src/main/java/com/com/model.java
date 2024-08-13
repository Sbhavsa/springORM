package com.com;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class model {
	@Id
   private int id;
   private String name;
   private String address;
@Override
public String toString() {
	return "model [id=" + id + ", name=" + name + ", address=" + address + "]";
}

public model() {
	super();
	// TODO Auto-generated constructor stub
}
public model(int id, String name, String address) {
	super();
	this.id = id;
	this.name = name;
	this.address = address;
}
   
}
