package net.code.java.hibernate;
// Generated 13 nov. 2018 10:53:07 by Hibernate Tools 5.2.11.Final

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * CHistory generated by hbm2java
 */
@Entity
@Table(name = "C_History", catalog = "tpcc")
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

	@EmbeddedId

	@AttributeOverrides({ @AttributeOverride(name = "HCId", column = @Column(name = "h_c_id")),
			@AttributeOverride(name = "HCDId", column = @Column(name = "h_c_d_id")),
			@AttributeOverride(name = "HCWId", column = @Column(name = "h_c_w_id")),
			@AttributeOverride(name = "HDId", column = @Column(name = "h_d_id")),
			@AttributeOverride(name = "HWId", column = @Column(name = "h_w_id")),
			@AttributeOverride(name = "HDate", column = @Column(name = "h_date", length = 19)),
			@AttributeOverride(name = "HAmount", column = @Column(name = "h_amount", precision = 12, scale = 0)),
			@AttributeOverride(name = "HData", column = @Column(name = "h_data", length = 24)) })
	public CHistoryId getId() {
		return this.id;
	}

	public void setId(CHistoryId id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({ @JoinColumn(name = "h_c_id", referencedColumnName = "c_id", insertable = false, updatable = false),
			@JoinColumn(name = "h_c_d_id", referencedColumnName = "c_d_id", insertable = false, updatable = false),
			@JoinColumn(name = "h_c_w_id", referencedColumnName = "c_w_id", insertable = false, updatable = false) })
	public CCustomer getCCustomer() {
		return this.CCustomer;
	}

	public void setCCustomer(CCustomer CCustomer) {
		this.CCustomer = CCustomer;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({ @JoinColumn(name = "h_d_id", referencedColumnName = "d_id", insertable = false, updatable = false),
			@JoinColumn(name = "h_w_id", referencedColumnName = "d_w_id", insertable = false, updatable = false) })
	public CDistrict getCDistrict() {
		return this.CDistrict;
	}

	public void setCDistrict(CDistrict CDistrict) {
		this.CDistrict = CDistrict;
	}

}
