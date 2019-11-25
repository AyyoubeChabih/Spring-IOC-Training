package org.mql.spring.models;

public class Document {
	private int id;
	private String title;
	private double price;
	private Date datePublished;
	
	public Document() {
	}

	public Document(int id, String title, double price, Date datePublished) {
		super();
		this.id = id;
		this.title = title;
		this.price = price;
		this.datePublished = datePublished;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Date getDatePublished() {
		return datePublished;
	}

	public void setDatePublished(Date datePublished) {
		this.datePublished = datePublished;
	}

	public String toString() {
		return "Document [id=" + id + ", title=" + title + ", price=" + price + ", datePublished=" + datePublished
				+ "]";
	}
}
