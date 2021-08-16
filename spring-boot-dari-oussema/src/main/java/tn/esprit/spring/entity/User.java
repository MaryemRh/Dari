package tn.esprit.spring.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@Entity
@Table(name="User")
public class User {
	@Id
	@GeneratedValue( strategy = GenerationType.IDENTITY )
	private Long idU;
	private String username;
	private String password;
	private String firstname;
	private String lastname;
	private String gender;
	private Long phone;
	private String adress;
	@Temporal(TemporalType.DATE)
	private Date dateofbirth;
	private int rating=5;
	private String email;
	@Enumerated(EnumType.STRING)
	public Role role;
	private Integer status=1;
	private float balance;
	private Boolean isActif; 
	@ManyToOne
	private Subscription subscription;

	@OneToMany(mappedBy = "user", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private List<Favorits> favorits;


	@OneToMany(mappedBy = "user", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private List<Reservation> reservation;

    @OneToMany(mappedBy = "user",cascade=CascadeType.ALL,fetch=FetchType.LAZY)
    private List<Item> ItemList;
    @OneToMany(mappedBy = "user1",cascade=CascadeType.ALL,fetch=FetchType.LAZY)
    private List<Orders> OrderList ;
	
	
	
	public List<Favorits> getFavorits() {
		return favorits;
	}

	public void setFavorits(List<Favorits> favorits) {
		this.favorits = favorits;
	}

	public List<Reservation> getReservation() {
		return reservation;
	}

	public void setReservation(List<Reservation> reservation) {
		this.reservation = reservation;
	}

	public User() {
		super();
	}

	public User(Long idU, String username, String password, String firstname, String lastname, String email, Role role,
			float balance, Boolean isActif) {
		super();
		this.idU = idU;
		this.username = username;
		this.password = password;
		this.firstname = firstname;
		this.lastname = lastname;
		this.email = email;
		this.role = role;
		this.balance = balance;
		this.isActif = isActif;
	}

	public User(String username, String password, String firstname, String lastname, Long phone, String email,
			Role role, float balance, Boolean isActif) {
		super();
		this.username = username;
		this.password = password;
		this.firstname = firstname;
		this.lastname = lastname;
		this.phone = phone;
		this.email = email;
		this.role = role;
		this.balance = balance;
		this.isActif = isActif;
	}

	public User(Long idU, String username, String firstname, String lastname, String email, Role role,
			Boolean isActif) {
		super();
		this.idU = idU;
		this.username = username;
		this.firstname = firstname;
		this.lastname = lastname;
		this.email = email;
		this.role = role;
		this.isActif = isActif;
	}

	public User(String username, String password, String firstname, String lastname, String email, Boolean isActif) {
		super();
		this.username = username;
		this.password = password;
		this.firstname = firstname;
		this.lastname = lastname;
		this.email = email;
		this.isActif = isActif;
	}

	public User(String username, String password, String firstname, String lastname, Long phone,
			String email, Role role, Boolean isActif) {
		super();
		this.username = username;
		this.password = password;
		this.firstname = firstname;
		this.lastname = lastname;
		this.phone = phone;
		this.email = email;
		this.role = role;
		this.isActif = isActif;
	}

	public User(String username, String password, String firstname, String lastname, String gender, Long phone,
			String adress, int rating, String email, Role role, float balance, Boolean isActif) {
		super();
		this.username = username;
		this.password = password;
		this.firstname = firstname;
		this.lastname = lastname;
		this.gender = gender;
		this.phone = phone;
		this.adress = adress;
		this.rating = rating;
		this.email = email;
		this.role = role;
		this.balance = balance;
		this.isActif = isActif;
	}

	public User(Long idU, String username, String password, String firstname, String lastname, String gender,
			Long phone, String adress, int rating, String email, Role role, float balance, Boolean isActif) {
		super();
		this.idU = idU;
		this.username = username;
		this.password = password;
		this.firstname = firstname;
		this.lastname = lastname;
		this.gender = gender;
		this.phone = phone;
		this.adress = adress;
		this.rating = rating;
		this.email = email;
		this.role = role;
		this.balance = balance;
		this.isActif = isActif;
	}

	public User(String username, String password, String firstname, String lastname, String email, Role role,
			Boolean isActif) {
		super();
		this.username = username;
		this.password = password;
		this.firstname = firstname;
		this.lastname = lastname;
		this.email = email;
		this.role = role;
		this.isActif = isActif;
	}

	public User(String username, String password, String firstname, String lastname, Role role, Boolean isActif) {
		super();
		this.username = username;
		this.password = password;
		this.firstname = firstname;
		this.lastname = lastname;
		this.role = role;
		this.isActif = isActif;
	}

	public User(Long idU, String username, String password, String firstname, String lastname, String email, Role role,
			Boolean isActif) {
		super();
		this.idU = idU;
		this.username = username;
		this.password = password;
		this.firstname = firstname;
		this.lastname = lastname;
		this.email = email;
		this.role = role;
		this.isActif = isActif;
	}

	public User(Long idU, String username, String password, String firstname, String lastname, String gender,
			Long phone, String adress, Date dateofbirth, int rating, String email, Role role, Integer status,
			float balance, Boolean isActif) {
		super();
		this.idU = idU;
		this.username = username;
		this.password = password;
		this.firstname = firstname;
		this.lastname = lastname;
		this.gender = gender;
		this.phone = phone;
		this.adress = adress;
		this.dateofbirth = dateofbirth;
		this.rating = rating;
		this.email = email;
		this.role = role;
		this.status = status;
		this.balance = balance;
		this.isActif = isActif;
	}

@Override
public String toString() {
	return "User [idU=" + idU + ", username=" + username + ", password=" + password + ", firstname=" + firstname
			+ ", lastname=" + lastname + ", gender=" + gender + ", phone=" + phone + ", adress=" + adress
			+ ", dateofbirth=" + dateofbirth + ", rating=" + rating + ", email=" + email + ", role=" + role + "]";
}



@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((adress == null) ? 0 : adress.hashCode());
	result = prime * result + ((dateofbirth == null) ? 0 : dateofbirth.hashCode());
	result = prime * result + ((email == null) ? 0 : email.hashCode());
	result = prime * result + ((firstname == null) ? 0 : firstname.hashCode());
	result = prime * result + ((gender == null) ? 0 : gender.hashCode());
	result = prime * result + ((idU == null) ? 0 : idU.hashCode());
	result = prime * result + ((lastname == null) ? 0 : lastname.hashCode());
	result = prime * result + ((password == null) ? 0 : password.hashCode());
	result = prime * result + ((phone == null) ? 0 : phone.hashCode());
	result = prime * result + rating;
	result = prime * result + ((role == null) ? 0 : role.hashCode());
	result = prime * result + ((username == null) ? 0 : username.hashCode());
	return result;
}

@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	User other = (User) obj;
	if (adress == null) {
		if (other.adress != null)
			return false;
	} else if (!adress.equals(other.adress))
		return false;
	if (dateofbirth == null) {
		if (other.dateofbirth != null)
			return false;
	} else if (!dateofbirth.equals(other.dateofbirth))
		return false;
	if (email == null) {
		if (other.email != null)
			return false;
	} else if (!email.equals(other.email))
		return false;
	if (firstname == null) {
		if (other.firstname != null)
			return false;
	} else if (!firstname.equals(other.firstname))
		return false;
	if (gender == null) {
		if (other.gender != null)
			return false;
	} else if (!gender.equals(other.gender))
		return false;
	if (idU == null) {
		if (other.idU != null)
			return false;
	} else if (!idU.equals(other.idU))
		return false;
	if (lastname == null) {
		if (other.lastname != null)
			return false;
	} else if (!lastname.equals(other.lastname))
		return false;
	if (password == null) {
		if (other.password != null)
			return false;
	} else if (!password.equals(other.password))
		return false;
	if (phone == null) {
		if (other.phone != null)
			return false;
	} else if (!phone.equals(other.phone))
		return false;
	if (rating != other.rating)
		return false;
	if (role != other.role)
		return false;
	if (username == null) {
		if (other.username != null)
			return false;
	} else if (!username.equals(other.username))
		return false;
	return true;
}

public Long getIdU() {
	return idU;
}

public void setIdU(Long idU) {
	this.idU = idU;
}

public String getUsername() {
	return username;
}

public void setUsername(String username) {
	this.username = username;
}

public String getPassword() {
	return password;
}

public void setPassword(String password) {
	this.password = password;
}

public String getFirstname() {
	return firstname;
}

public void setFirstname(String firstname) {
	this.firstname = firstname;
}

public String getLastname() {
	return lastname;
}

public void setLastname(String lastname) {
	this.lastname = lastname;
}

public String getGender() {
	return gender;
}

public void setGender(String gender) {
	this.gender = gender;
}

public Long getPhone() {
	return phone;
}

public void setPhone(Long phone) {
	this.phone = phone;
}

public String getAdress() {
	return adress;
}

public void setAdress(String adress) {
	this.adress = adress;
}
@Temporal(TemporalType.DATE)
public Date getDateofbirth() {
	return dateofbirth;
}

public void setDateofbirth(Date dateofbirth) {
	this.dateofbirth = dateofbirth;
}

public int getRating() {
	return rating;
}

public void setRating(int rating) {
	this.rating = rating;
}
@Enumerated(EnumType.STRING)
public Role getRole() {
	return role;
}

public void setRole(Role role) {
	this.role = role;
}

public User(Long idU, String username, String password, String firstname, String lastname, String gender, Long phone,
		String adress, Date dateofbirth, int rating, Role role) {
	super();
	this.idU = idU;
	this.username = username;
	this.password = password;
	this.firstname = firstname;
	this.lastname = lastname;
	this.gender = gender;
	this.phone = phone;
	this.adress = adress;
	this.dateofbirth = dateofbirth;
	this.rating = rating;
	this.role = role;
}

public User(Long idU) {
	super();
	this.idU = idU;
}

public float getBalance() {
	return balance;
}

public void setBalance(float balance) {
	this.balance = balance;
}

public Boolean getIsActif() {
	return isActif;
}

public void setIsActif(Boolean isActif) {
	this.isActif = isActif;
}
public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

public Integer getStatus() {
	return status;
}

public void setStatus(Integer status) {
	this.status = status;
}
}