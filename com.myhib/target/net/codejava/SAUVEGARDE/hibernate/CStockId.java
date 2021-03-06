package net.code.java.hibernate;
// Generated 13 nov. 2018 10:53:07 by Hibernate Tools 5.2.11.Final

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * CStockId generated by hbm2java
 */
@Embeddable
public class CStockId implements java.io.Serializable {

	private int SIId;
	private int SWId;

	public CStockId() {
	}

	public CStockId(int SIId, int SWId) {
		this.SIId = SIId;
		this.SWId = SWId;
	}

	@Column(name = "s_i_id", nullable = false)
	public int getSIId() {
		return this.SIId;
	}

	public void setSIId(int SIId) {
		this.SIId = SIId;
	}

	@Column(name = "s_w_id", nullable = false)
	public int getSWId() {
		return this.SWId;
	}

	public void setSWId(int SWId) {
		this.SWId = SWId;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof CStockId))
			return false;
		CStockId castOther = (CStockId) other;

		return (this.getSIId() == castOther.getSIId()) && (this.getSWId() == castOther.getSWId());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getSIId();
		result = 37 * result + this.getSWId();
		return result;
	}

}
