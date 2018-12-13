package net.code.java.hibernate;
// Generated 13 nov. 2018 11:01:02 by Hibernate Tools 5.2.11.Final

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * DssSupplier generated by hbm2java
 */
@Entity
@Table(name = "dss_supplier", catalog = "tpcd")
public class DssSupplier implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5857960334413501391L;
	private int SSuppkey;
	private DssNation dssNation;
	private String SName;
	private String SAddress;
	private String SPhone;
	private double SAcctbal;
	private String SComment;
	private Set<DssPartsupp> dssPartsupps = new HashSet<DssPartsupp>(0);

	public DssSupplier() {
	}

	public DssSupplier(int SSuppkey, DssNation dssNation, String SName, String SAddress, String SPhone, double SAcctbal,
			String SComment) {
		this.SSuppkey = SSuppkey;
		this.dssNation = dssNation;
		this.SName = SName;
		this.SAddress = SAddress;
		this.SPhone = SPhone;
		this.SAcctbal = SAcctbal;
		this.SComment = SComment;
	}

	public DssSupplier(int SSuppkey, DssNation dssNation, String SName, String SAddress, String SPhone, double SAcctbal,
			String SComment, Set<DssPartsupp> dssPartsupps) {
		this.SSuppkey = SSuppkey;
		this.dssNation = dssNation;
		this.SName = SName;
		this.SAddress = SAddress;
		this.SPhone = SPhone;
		this.SAcctbal = SAcctbal;
		this.SComment = SComment;
		this.dssPartsupps = dssPartsupps;
	}

	@Id

	@Column(name = "s_suppkey", unique = true, nullable = false)
	public int getSSuppkey() {
		return this.SSuppkey;
	}

	public void setSSuppkey(int SSuppkey) {
		this.SSuppkey = SSuppkey;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "s_nationkey", nullable = false)
	public DssNation getDssNation() {
		return this.dssNation;
	}

	public void setDssNation(DssNation dssNation) {
		this.dssNation = dssNation;
	}

	@Column(name = "s_name", nullable = false, length = 25)
	public String getSName() {
		return this.SName;
	}

	public void setSName(String SName) {
		this.SName = SName;
	}

	@Column(name = "s_address", nullable = false, length = 40)
	public String getSAddress() {
		return this.SAddress;
	}

	public void setSAddress(String SAddress) {
		this.SAddress = SAddress;
	}

	@Column(name = "s_phone", nullable = false, length = 15)
	public String getSPhone() {
		return this.SPhone;
	}

	public void setSPhone(String SPhone) {
		this.SPhone = SPhone;
	}

	@Column(name = "s_acctbal", nullable = false, precision = 22, scale = 0)
	public double getSAcctbal() {
		return this.SAcctbal;
	}

	public void setSAcctbal(double SAcctbal) {
		this.SAcctbal = SAcctbal;
	}

	@Column(name = "s_comment", nullable = false, length = 101)
	public String getSComment() {
		return this.SComment;
	}

	public void setSComment(String SComment) {
		this.SComment = SComment;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "dssSupplier")
	public Set<DssPartsupp> getDssPartsupps() {
		return this.dssPartsupps;
	}

	public void setDssPartsupps(Set<DssPartsupp> dssPartsupps) {
		this.dssPartsupps = dssPartsupps;
	}

}
