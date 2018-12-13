package net.code.java.hibernate;
// Generated 13 nov. 2018 10:53:07 by Hibernate Tools 5.2.11.Final

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * CNewOrderId generated by hbm2java
 */
@Embeddable
public class CNewOrderId implements java.io.Serializable {

	private int noOId;
	private int noDId;
	private int noWId;

	public CNewOrderId() {
	}

	public CNewOrderId(int noOId, int noDId, int noWId) {
		this.noOId = noOId;
		this.noDId = noDId;
		this.noWId = noWId;
	}

	@Column(name = "no_o_id", nullable = false)
	public int getNoOId() {
		return this.noOId;
	}

	public void setNoOId(int noOId) {
		this.noOId = noOId;
	}

	@Column(name = "no_d_id", nullable = false)
	public int getNoDId() {
		return this.noDId;
	}

	public void setNoDId(int noDId) {
		this.noDId = noDId;
	}

	@Column(name = "no_w_id", nullable = false)
	public int getNoWId() {
		return this.noWId;
	}

	public void setNoWId(int noWId) {
		this.noWId = noWId;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof CNewOrderId))
			return false;
		CNewOrderId castOther = (CNewOrderId) other;

		return (this.getNoOId() == castOther.getNoOId()) && (this.getNoDId() == castOther.getNoDId())
				&& (this.getNoWId() == castOther.getNoWId());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getNoOId();
		result = 37 * result + this.getNoDId();
		result = 37 * result + this.getNoWId();
		return result;
	}

}
