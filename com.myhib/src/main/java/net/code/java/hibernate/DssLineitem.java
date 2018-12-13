package net.code.java.hibernate;
// Generated 13 nov. 2018 11:01:02 by Hibernate Tools 5.2.11.Final

import java.util.Date;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * DssLineitem generated by hbm2java
 */
@Entity
@Table(name = "dss_lineitem", catalog = "tpcd")
public class DssLineitem implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3897868277780711546L;
	private DssLineitemId id;
	private DssOrder dssOrder;
	private int LPartkey;
	private int LSuppkey;
	private double LQuantity;
	private double LExtendedprice;
	private double LDiscount;
	private double LTax;
	private char LReturnflag;
	private char LLinestatus;
	private Date LShipdate;
	private Date LCommitdate;
	private Date LReceiptdate;
	private String LShipinstruct;
	private String LShipmode;
	private String LComment;
	private DssPartsupp dssPartsupp;

	public DssLineitem() {
	}

	public DssLineitem(DssLineitemId id, DssOrder dssOrder, int LPartkey, int LSuppkey, double LQuantity,
			double LExtendedprice, double LDiscount, double LTax, char LReturnflag, char LLinestatus,
			String LShipinstruct, String LShipmode) {
		this.id = id;
		this.dssOrder = dssOrder;
		this.LPartkey = LPartkey;
		this.LSuppkey = LSuppkey;
		this.LQuantity = LQuantity;
		this.LExtendedprice = LExtendedprice;
		this.LDiscount = LDiscount;
		this.LTax = LTax;
		this.LReturnflag = LReturnflag;
		this.LLinestatus = LLinestatus;
		this.LShipinstruct = LShipinstruct;
		this.LShipmode = LShipmode;
	}

	public DssLineitem(DssLineitemId id, DssOrder dssOrder, int LPartkey, int LSuppkey, double LQuantity,
			double LExtendedprice, double LDiscount, double LTax, char LReturnflag, char LLinestatus, Date LShipdate,
			Date LCommitdate, Date LReceiptdate, String LShipinstruct, String LShipmode, String LComment,
			DssPartsupp dssPartsupp) {
		this.id = id;
		this.dssOrder = dssOrder;
		this.LPartkey = LPartkey;
		this.LSuppkey = LSuppkey;
		this.LQuantity = LQuantity;
		this.LExtendedprice = LExtendedprice;
		this.LDiscount = LDiscount;
		this.LTax = LTax;
		this.LReturnflag = LReturnflag;
		this.LLinestatus = LLinestatus;
		this.LShipdate = LShipdate;
		this.LCommitdate = LCommitdate;
		this.LReceiptdate = LReceiptdate;
		this.LShipinstruct = LShipinstruct;
		this.LShipmode = LShipmode;
		this.LComment = LComment;
		this.dssPartsupp = dssPartsupp;
	}

	@EmbeddedId

	@AttributeOverrides({
			@AttributeOverride(name = "LOrderkey", column = @Column(name = "l_orderkey", nullable = false, precision = 18, scale = 0)),
			@AttributeOverride(name = "LLinenumber", column = @Column(name = "l_linenumber", nullable = false)) })
	public DssLineitemId getId() {
		return this.id;
	}

	public void setId(DssLineitemId id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "l_orderkey", nullable = false, insertable = false, updatable = false)
	public DssOrder getDssOrder() {
		return this.dssOrder;
	}

	public void setDssOrder(DssOrder dssOrder) {
		this.dssOrder = dssOrder;
	}

	@Column(name = "l_partkey", nullable = false)
	public int getLPartkey() {
		return this.LPartkey;
	}

	public void setLPartkey(int LPartkey) {
		this.LPartkey = LPartkey;
	}

	@Column(name = "l_suppkey", nullable = false)
	public int getLSuppkey() {
		return this.LSuppkey;
	}

	public void setLSuppkey(int LSuppkey) {
		this.LSuppkey = LSuppkey;
	}

	@Column(name = "l_quantity", nullable = false, precision = 22, scale = 0)
	public double getLQuantity() {
		return this.LQuantity;
	}

	public void setLQuantity(double LQuantity) {
		this.LQuantity = LQuantity;
	}

	@Column(name = "l_extendedprice", nullable = false, precision = 22, scale = 0)
	public double getLExtendedprice() {
		return this.LExtendedprice;
	}

	public void setLExtendedprice(double LExtendedprice) {
		this.LExtendedprice = LExtendedprice;
	}

	@Column(name = "l_discount", nullable = false, precision = 22, scale = 0)
	public double getLDiscount() {
		return this.LDiscount;
	}

	public void setLDiscount(double LDiscount) {
		this.LDiscount = LDiscount;
	}

	@Column(name = "l_tax", nullable = false, precision = 22, scale = 0)
	public double getLTax() {
		return this.LTax;
	}

	public void setLTax(double LTax) {
		this.LTax = LTax;
	}

	@Column(name = "l_returnflag", nullable = false, length = 1)
	public char getLReturnflag() {
		return this.LReturnflag;
	}

	public void setLReturnflag(char LReturnflag) {
		this.LReturnflag = LReturnflag;
	}

	@Column(name = "l_linestatus", nullable = false, length = 1)
	public char getLLinestatus() {
		return this.LLinestatus;
	}

	public void setLLinestatus(char LLinestatus) {
		this.LLinestatus = LLinestatus;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "l_shipdate", length = 10)
	public Date getLShipdate() {
		return this.LShipdate;
	}

	public void setLShipdate(Date LShipdate) {
		this.LShipdate = LShipdate;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "l_commitdate", length = 10)
	public Date getLCommitdate() {
		return this.LCommitdate;
	}

	public void setLCommitdate(Date LCommitdate) {
		this.LCommitdate = LCommitdate;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "l_receiptdate", length = 10)
	public Date getLReceiptdate() {
		return this.LReceiptdate;
	}

	public void setLReceiptdate(Date LReceiptdate) {
		this.LReceiptdate = LReceiptdate;
	}

	@Column(name = "l_shipinstruct", nullable = false, length = 25)
	public String getLShipinstruct() {
		return this.LShipinstruct;
	}

	public void setLShipinstruct(String LShipinstruct) {
		this.LShipinstruct = LShipinstruct;
	}

	@Column(name = "l_shipmode", nullable = false, length = 10)
	public String getLShipmode() {
		return this.LShipmode;
	}

	public void setLShipmode(String LShipmode) {
		this.LShipmode = LShipmode;
	}

	@Column(name = "l_comment", length = 44)
	public String getLComment() {
		return this.LComment;
	}

	public void setLComment(String LComment) {
		this.LComment = LComment;
	}

	@OneToOne(fetch = FetchType.LAZY, mappedBy = "dssLineitem")
	public DssPartsupp getDssPartsupp() {
		return this.dssPartsupp;
	}

	public void setDssPartsupp(DssPartsupp dssPartsupp) {
		this.dssPartsupp = dssPartsupp;
	}

}
