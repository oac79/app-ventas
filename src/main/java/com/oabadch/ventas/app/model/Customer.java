package com.oabadch.ventas.app.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name="CUSTOMERS")
public class Customer {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idCustomer;
	
	@NotNull
	@NotEmpty(message = "El nombre es obligatorio")
	@Size(min = 2 , max = 50, message ="El nombre tiene que tener como mínimo 2 caracteres")
	@Column(name="name", nullable=false, length=50)
	private String name;
	@NotNull
	@NotEmpty(message = "El apellido es obligatorio")
	@Size(min = 2, max = 150, message ="El apellido tiene que tener como mínimo 2 caracteres")
	@Column(name="last_name", nullable=false, length=150)
	private String lastName;
	@Size(max = 150, message = "La dirección no debe superar los 150 caracteres")
	@Column(name="address", nullable=true, length=150)
	private String address;
	@Size(min = 8 , message = "El teléfono tiene que tener como mínimo 8 caracteres")
	@Column(name="phone", nullable=true, length=10)
	private String phone;
	@NotNull
	@NotEmpty(message = "El email no puede estar vacío")
	@Size(min = 10, max = 150, message = "El email tiene que tener como mínimo 10 caracteres")
	@Email(message = "El formato de email no es correcto")
	@Column(name="email", nullable=false, length=150)
	private String email;
	
	public Integer getIdCustomer() {
		return idCustomer;
	}
	public void setIdCustomer(Integer idCustomer) {
		this.idCustomer = idCustomer;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	
	
}
