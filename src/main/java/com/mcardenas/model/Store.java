/**
 * File Store.java
 * @see 1.0
 *
 */
package com.mcardenas.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OrderColumn;

import org.hibernate.annotations.GenericGenerator;

/**
 * Class Store.
 * @author mcardenas
 */
@Entity
public class Store {

	/**
	 * Input name  store.
     */
	private String name;

	/**
	 * Description store.
     */
	private String description;

	/**
	 * Date Store.
     */
	private Date dateStop;

	/**
	 * Input mount Stock
     */
	private BigDecimal mountStock;

	@ManyToOne
	private Client buyer;

	@ElementCollection
	@OrderColumn(name = "sectionNo")
	private List<Purchase> purchases;

	/**
	 * Id as _id for mongodb.
	 */
	@Id
	@GeneratedValue(generator = "uuid")
	@GenericGenerator(name = "uuid", strategy = "uuid2")
	private String id;

	/**
	 * Constructor class.
     */
	Store() {
	}

	/**
	 * Constructor with parameters.
	 */
	public Store(String name, String description, Date dateStop, BigDecimal mountStock, Purchase... purchases) {
		this.name = name;
		this.description = description;
		this.dateStop = dateStop;
		this.mountStock = mountStock;
		this.purchases = purchases != null ? new ArrayList<>( Arrays.<Purchase>asList( purchases ) ) : new ArrayList<Purchase>();
	}

	public String getId() {

		return id;
	}

	public void setId(String id) {

		this.id = id;
	}

	public String getDescription() {

		return description;
	}

	public void setDescription(String description) {

		this.description = description;
	}

	public String getName() {

		return name;
	}

	public void setName(String name) {

		this.name = name;
	}

	public Date getDateStop() {
		return dateStop;
	}

	public void setDateStop(Date dateStop) {
		this.dateStop = dateStop;
	}

	public BigDecimal getMountStock() {
		return mountStock;
	}

	public void setMountStock(BigDecimal mountStock) {
		this.mountStock = mountStock;
	}

	public Client getBuyer() {
		return buyer;
	}

	public void setBuyer(Client buyer) {
		this.buyer = buyer;
	}

	public List<Purchase> getPurchases() {
		return purchases;
	}

	public void setPurchases(List<Purchase> purchases) {
		this.purchases = purchases;
	}
}
