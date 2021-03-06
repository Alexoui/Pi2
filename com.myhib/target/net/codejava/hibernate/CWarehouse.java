package net.codejava.hibernate;
// Generated 8 nov. 2018 14:18:49 by Hibernate Tools 5.3.6.Final

import java.util.HashSet;
import java.util.Set;

/**
 * CWarehouse generated by hbm2java
 */
public class CWarehouse implements java.io.Serializable {

	private int WId;
	private String WName;
	private String WStreet1;
	private String WStreet2;
	private String WCity;
	private String WState;
	private String WZip;
	private Float WTax;
	private Float WYtd;
	private Set CStocks = new HashSet(0);
	private Set CDistricts = new HashSet(0);

	public CWarehouse() {
	}

	public CWarehouse(int WId) {
		this.WId = WId;
	}

	public CWarehouse(int WId, String WName, String WStreet1, String WStreet2, String WCity, String WState, String WZip,
			Float WTax, Float WYtd, Set CStocks, Set CDistricts) {
		this.WId = WId;
		this.WName = WName;
		this.WStreet1 = WStreet1;
		this.WStreet2 = WStreet2;
		this.WCity = WCity;
		this.WState = WState;
		this.WZip = WZip;
		this.WTax = WTax;
		this.WYtd = WYtd;
		this.CStocks = CStocks;
		this.CDistricts = CDistricts;
	}

	public int getWId() {
		return this.WId;
	}

	public void setWId(int WId) {
		this.WId = WId;
	}

	public String getWName() {
		return this.WName;
	}

	public void setWName(String WName) {
		this.WName = WName;
	}

	public String getWStreet1() {
		return this.WStreet1;
	}

	public void setWStreet1(String WStreet1) {
		this.WStreet1 = WStreet1;
	}

	public String getWStreet2() {
		return this.WStreet2;
	}

	public void setWStreet2(String WStreet2) {
		this.WStreet2 = WStreet2;
	}

	public String getWCity() {
		return this.WCity;
	}

	public void setWCity(String WCity) {
		this.WCity = WCity;
	}

	public String getWState() {
		return this.WState;
	}

	public void setWState(String WState) {
		this.WState = WState;
	}

	public String getWZip() {
		return this.WZip;
	}

	public void setWZip(String WZip) {
		this.WZip = WZip;
	}

	public Float getWTax() {
		return this.WTax;
	}

	public void setWTax(Float WTax) {
		this.WTax = WTax;
	}

	public Float getWYtd() {
		return this.WYtd;
	}

	public void setWYtd(Float WYtd) {
		this.WYtd = WYtd;
	}

	public Set getCStocks() {
		return this.CStocks;
	}

	public void setCStocks(Set CStocks) {
		this.CStocks = CStocks;
	}

	public Set getCDistricts() {
		return this.CDistricts;
	}

	public void setCDistricts(Set CDistricts) {
		this.CDistricts = CDistricts;
	}

}
