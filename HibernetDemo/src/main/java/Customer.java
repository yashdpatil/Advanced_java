import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_cust")
public class Customer {
	@Id
	@GeneratedValue
	@Column(name = "cust_id")
	private int id;
	@Column(name = "cust_name")
	private String name;
	@Column(name = "cust_email")
	private String email;
	@Column(name = "cust_DateOfBirth")
	private LocalDate DateOfBirth;
	@Column(name = "cust_city")
	private String city;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public LocalDate getDateOfBirth() {
		return DateOfBirth;
	}

	  public void setDateOfBirth(String dateString) {
	        // Assuming dateOfBirth is of type LocalDate
	        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
	        this.DateOfBirth = LocalDate.parse(dateString, formatter);
	    }
	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	

	
}