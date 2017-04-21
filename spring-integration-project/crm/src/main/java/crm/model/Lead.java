package crm.model;

import java.util.List;

public class Lead {
	
	private int id;
	private String firstName;
	private String address;
	private String country;
	private String phone;
	private String email;
	private List<Product> products;
	
	public Lead() { }
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getCountry() {
		return country;
	}
	
	public void setCountry(String country) {
		this.country = country;
	}
	
	public boolean isInternational() {
		boolean domestic = ("US".equalsIgnoreCase(country));
		return domestic;
	}
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}

	@Override
	public String toString() {
		return "Lead [id=" + id + ", firstName=" + firstName + ", address=" + address + ", country=" + country
				+ ", phone=" + phone + ", email=" + email + ", products=" + products + "]";
	}
	
	
}
