package com.sample;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Person { 
private String name;  
private Double age;  
private String desc;
private List<Integer> carts=new ArrayList<Integer>();
    
public Person(String name, Double age) {  
    this.name = name;  
    this.age = age;  
}  
public String getName() {  
    return name;  
}  
public void setName(String name) {  
    this.name = name;  
}  
public Double getAge() {  
    return age;  
}  
public void setAge(Double age) {  
    this.age = age;  
}  
public String getDesc() {  
    return desc;  
}  
public void setDesc(String desc) {  
    this.desc = desc;  
}  
public String toString()  
{  
    return "[name="+name+",age="+age+",desc="+desc+" "+carts+"]";  
}
public List<Integer> getCarts() {
	return carts;
}
public void setCarts(List<Integer> carts) {
	this.carts = carts;
}  }
