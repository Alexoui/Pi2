package net.codejava.hibernate;
// Generated 8 nov. 2018 14:18:49 by Hibernate Tools 5.3.6.Final

/**
 * CHistory generated by hbm2java
 */
public class CHistory implements java.io.Serializable {

	private CHistoryId id;
	private CCustomer CCustomer;
	private CDistrict CDistrict;

	public CHistory() {
	}

	public CHistory(CHistoryId id) {
		this.id = id;
	}

	public CHistory(CHistoryId id, CCustomer CCustomer, CDistrict CDistrict) {
		this.id = id;
		this.CCustomer = CCustomer;
		this.CDistrict = CDistrict;
	}

	public CHistoryId getId() {
		return this.id;
	}

	public void setId(CHistoryId id) {
		this.id = id;
	}

	public CCustomer getCCustomer() {
		return this.CCustomer;
	}

	public void setCCustomer(CCustomer CCustomer) {
		this.CCustomer = CCustomer;
	}

	public CDistrict getCDistrict() {
		return this.CDistrict;
	}

	public void setCDistrict(CDistrict CDistrict) {
		this.CDistrict = CDistrict;
	}

}
