package net.codejava.hibernate;
// Generated 8 nov. 2018 14:18:49 by Hibernate Tools 5.3.6.Final

/**
 * CNewOrderId generated by hbm2java
 */
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

	public int getNoOId() {
		return this.noOId;
	}

	public void setNoOId(int noOId) {
		this.noOId = noOId;
	}

	public int getNoDId() {
		return this.noDId;
	}

	public void setNoDId(int noDId) {
		this.noDId = noDId;
	}

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