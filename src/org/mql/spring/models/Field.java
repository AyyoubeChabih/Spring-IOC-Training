package org.mql.spring.models;

public class Field {
	private String label;
	private int size;
	private Object value = null;

	public Field() {
		super();
	}

	public Field(String label, int size) {
		super();
		this.label = label;
		this.size = size;
	}

	public Field(String label, int size, Object value) {
		super();
		this.label = label;
		this.size = size;
		this.value = value;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public Object getValue() {
		return value;
	}

	public void setValue(Object value) {
		this.value = value;
	}
}
