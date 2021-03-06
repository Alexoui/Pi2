package net.codejava.hibernate;
// Generated 8 nov. 2018 14:18:49 by Hibernate Tools 5.3.6.Final

import java.util.HashSet;
import java.util.Set;

/**
 * CStock generated by hbm2java
 */
public class CStock implements java.io.Serializable {

	private CStockId id;
	private CItem CItem;
	private CWarehouse CWarehouse;
	private Integer SQuantity;
	private String SDist01;
	private String SDist02;
	private String SDist03;
	private String SDist04;
	private String SDist05;
	private String SDist06;
	private String SDist07;
	private String SDist08;
	private String SDist09;
	private String SDist10;
	private Integer SYtd;
	private Integer SOrderCnt;
	private Integer SRemoteCnt;
	private String SData;
	private Set COrderLines = new HashSet(0);

	public CStock() {
	}

	public CStock(CStockId id, CItem CItem, CWarehouse CWarehouse) {
		this.id = id;
		this.CItem = CItem;
		this.CWarehouse = CWarehouse;
	}

	public CStock(CStockId id, CItem CItem, CWarehouse CWarehouse, Integer SQuantity, String SDist01, String SDist02,
			String SDist03, String SDist04, String SDist05, String SDist06, String SDist07, String SDist08,
			String SDist09, String SDist10, Integer SYtd, Integer SOrderCnt, Integer SRemoteCnt, String SData,
			Set COrderLines) {
		this.id = id;
		this.CItem = CItem;
		this.CWarehouse = CWarehouse;
		this.SQuantity = SQuantity;
		this.SDist01 = SDist01;
		this.SDist02 = SDist02;
		this.SDist03 = SDist03;
		this.SDist04 = SDist04;
		this.SDist05 = SDist05;
		this.SDist06 = SDist06;
		this.SDist07 = SDist07;
		this.SDist08 = SDist08;
		this.SDist09 = SDist09;
		this.SDist10 = SDist10;
		this.SYtd = SYtd;
		this.SOrderCnt = SOrderCnt;
		this.SRemoteCnt = SRemoteCnt;
		this.SData = SData;
		this.COrderLines = COrderLines;
	}

	public CStockId getId() {
		return this.id;
	}

	public void setId(CStockId id) {
		this.id = id;
	}

	public CItem getCItem() {
		return this.CItem;
	}

	public void setCItem(CItem CItem) {
		this.CItem = CItem;
	}

	public CWarehouse getCWarehouse() {
		return this.CWarehouse;
	}

	public void setCWarehouse(CWarehouse CWarehouse) {
		this.CWarehouse = CWarehouse;
	}

	public Integer getSQuantity() {
		return this.SQuantity;
	}

	public void setSQuantity(Integer SQuantity) {
		this.SQuantity = SQuantity;
	}

	public String getSDist01() {
		return this.SDist01;
	}

	public void setSDist01(String SDist01) {
		this.SDist01 = SDist01;
	}

	public String getSDist02() {
		return this.SDist02;
	}

	public void setSDist02(String SDist02) {
		this.SDist02 = SDist02;
	}

	public String getSDist03() {
		return this.SDist03;
	}

	public void setSDist03(String SDist03) {
		this.SDist03 = SDist03;
	}

	public String getSDist04() {
		return this.SDist04;
	}

	public void setSDist04(String SDist04) {
		this.SDist04 = SDist04;
	}

	public String getSDist05() {
		return this.SDist05;
	}

	public void setSDist05(String SDist05) {
		this.SDist05 = SDist05;
	}

	public String getSDist06() {
		return this.SDist06;
	}

	public void setSDist06(String SDist06) {
		this.SDist06 = SDist06;
	}

	public String getSDist07() {
		return this.SDist07;
	}

	public void setSDist07(String SDist07) {
		this.SDist07 = SDist07;
	}

	public String getSDist08() {
		return this.SDist08;
	}

	public void setSDist08(String SDist08) {
		this.SDist08 = SDist08;
	}

	public String getSDist09() {
		return this.SDist09;
	}

	public void setSDist09(String SDist09) {
		this.SDist09 = SDist09;
	}

	public String getSDist10() {
		return this.SDist10;
	}

	public void setSDist10(String SDist10) {
		this.SDist10 = SDist10;
	}

	public Integer getSYtd() {
		return this.SYtd;
	}

	public void setSYtd(Integer SYtd) {
		this.SYtd = SYtd;
	}

	public Integer getSOrderCnt() {
		return this.SOrderCnt;
	}

	public void setSOrderCnt(Integer SOrderCnt) {
		this.SOrderCnt = SOrderCnt;
	}

	public Integer getSRemoteCnt() {
		return this.SRemoteCnt;
	}

	public void setSRemoteCnt(Integer SRemoteCnt) {
		this.SRemoteCnt = SRemoteCnt;
	}

	public String getSData() {
		return this.SData;
	}

	public void setSData(String SData) {
		this.SData = SData;
	}

	public Set getCOrderLines() {
		return this.COrderLines;
	}

	public void setCOrderLines(Set COrderLines) {
		this.COrderLines = COrderLines;
	}

}
