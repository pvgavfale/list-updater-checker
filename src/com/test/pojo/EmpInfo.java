package com.test.pojo;

public class EmpInfo {

	private String name;

	private String id;

	private String value;

	public EmpInfo() {

	}

	public EmpInfo(String name, String id, String value) {

		super();

		this.name = name;

		this.id = id;

		this.value = value;

	}

	public String getName() {

		return name;

	}

	public void setName(String name) {

		this.name = name;

	}

	public String getId() {

		return id;

	}

	public void setId(String id) {

		this.id = id;

	}

	public String getValue() {

		return value;

	}

	public void setValue(String value) {

		this.value = value;

	}

	@Override

	public String toString() {

		return "EmpInfo [name=" + name + ", id=" + id + ", value=" + value + "]";

	}

}
