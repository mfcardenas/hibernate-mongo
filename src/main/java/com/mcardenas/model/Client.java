/**
 * File Client.java
 * @see 1.0
 *
 */
package com.mcardenas.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.hibernate.annotations.GenericGenerator;

/**
 * Class client.
 * @author mcardenas
 */
@Entity
public class Client {

	/**
	 * Input name.
     */
	private String name;

	/**
	 * Input username.
     */
	private String lastName;

	/**
	 * input phone.
     */
	private int phone;

	/**
	 * Inpu address.
     */
	private String address;

	/**
	 * Input email.
     */
	private String email;

	/**
	 * Input bank.
     */
	private String bank;

	/**
	 * List purchases of client.
     */
	@OneToMany(mappedBy = "buyer", cascade = CascadeType.PERSIST)
	private Set<Store> purchases = new HashSet<>();

	/**
	 * id for _id mongodb.
	 */
	@Id
	@GeneratedValue(generator = "uuid")
	@GenericGenerator(name = "uuid", strategy = "uuid2")
	private String id;

	/**
	 *  Constructor Client.
     */
	Client() {

	}

	/**
	 * Constructor Client.
	 * @param name
	 * @param lastName
	 * @param email
	 * @param address
     * @param bank
     */
	public Client(String name, String lastName, String email, String address, String bank) {
		this.name = name;
		this.lastName = lastName;
		this.email = email;
		this.address = address;
		this.bank = bank;
	}

	/**
	 *
	 * @return
     */
	public String getId() {
		return id;
	}

	/**
	 *
	 * @param id
     */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * Get Name.
	 * @return
     */
	public String getName() {
		return name;
	}

	/**
	 * Set Name.
	 * @param name
     */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Get Phone.
	 * @return
     */
	public int getPhone() {
		return phone;
	}

	/**
	 * Set Phone.
	 * @param phone
     */
	public void setPhone(int phone) {
		this.phone = phone;
	}

	/**
	 * Get Address.
	 * @return
     */
	public String getAddress() {
		return address;
	}

	/**
	 * Ser Address.
	 * @param address
     */
	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * Get Email.
	 * @return
     */
	public String getEmail() {
		return email;
	}

	/**
	 * Set Email.
	 * @param email
     */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * Get Bank.
	 * @return
     */
	public String getBank() {
		return bank;
	}

	/**
	 * Set Bank.
	 * @param bank
     */
	public void setBank(String bank) {
		this.bank = bank;
	}

	/**
	 *
	 * @return
     */
	public String getLastName() {

		return lastName;
	}

	/**
	 *
	 * @param lastName
     */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 *
	 * @return
     */
	public Set<Store> getPurchases() {
		return purchases;
	}

	/**
	 *
	 * @param purchases
     */
	public void setPurchases(Set<Store> purchases) {
		this.purchases = purchases;
	}
}
