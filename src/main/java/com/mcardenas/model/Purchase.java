/**
 * File Purchase.java
 * @see 1.0
 *
 */
package com.mcardenas.model;

import javax.persistence.Embeddable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * Object Purchase.
 * @author mcardenas
 */
@Embeddable
public class Purchase {

	/**
	 * Article.
     */
	private String article;

	/**
	 * Date purchase.
     */
	private Date datePurchase;

	/**
	 * Total mount.
     */
	private BigDecimal total;

	/**
	 * IVA.
     */
	private BigDecimal IVA;

	/**
	 * Constructor.
     */
	Purchase() {
	}

	/**
	 * Purchase  constructor.
	 * @param article
	 * @param datePurchase
	 * @param total
     * @param IVA
     */
	public Purchase(String article, Date datePurchase, BigDecimal total, BigDecimal IVA) {
		this.article = article;
		this.datePurchase = datePurchase;
		this.total = total;
		this.IVA = IVA;
	}

	public String getArticle() {

		return article;
	}

	public void setArticle(String article) {

		this.article = article;
	}

	public Date getDatePurchase() {
		return datePurchase;
	}

	public void setDatePurchase(Date datePurchase) {
		this.datePurchase = datePurchase;
	}

	public BigDecimal getTotal() {
		return total;
	}

	public void setTotal(BigDecimal total) {
		this.total = total;
	}

	public BigDecimal getIVA() {
		return IVA;
	}

	public void setIVA(BigDecimal IVA) {
		this.IVA = IVA;
	}
}
