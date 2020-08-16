package org.POJO;

public class Student {
	public static Integer count;
	private String name;
	private Integer age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public void show() {
		System.out.print(this.getName()+"今年"+this.getAge()+"岁了");
	}
}
