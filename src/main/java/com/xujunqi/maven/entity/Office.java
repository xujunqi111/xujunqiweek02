package com.xujunqi.maven.entity;

import java.math.BigInteger;
import java.util.Date;

public class Office {
	private BigInteger oid;
	private String guanjianzi;
	private String miaoshu;
	private String oname;
	private String chanpin;
	private String address;
	private Integer money;
	private Date otime;
	private String nriqi;
	private String beizhu;

	private Nianjian nianjians;

	@Override
	public String toString() {
		return "Office [oid=" + oid + ", guanjianzi=" + guanjianzi + ", miaoshu=" + miaoshu + ", oname=" + oname
				+ ", chanpin=" + chanpin + ", address=" + address + ", money=" + money + ", otime=" + otime + ", nriqi="
				+ nriqi + ", beizhu=" + beizhu + ", nianjians=" + nianjians + "]";
	}

	public Office(BigInteger oid, String guanjianzi, String miaoshu, String oname, String chanpin, String address,
			Integer money, Date otime, String nriqi, String beizhu, Nianjian nianjians) {
		super();
		this.oid = oid;
		this.guanjianzi = guanjianzi;
		this.miaoshu = miaoshu;
		this.oname = oname;
		this.chanpin = chanpin;
		this.address = address;
		this.money = money;
		this.otime = otime;
		this.nriqi = nriqi;
		this.beizhu = beizhu;
		this.nianjians = nianjians;
	}

	public Office() {
		super();
	}

	public BigInteger getOid() {
		return oid;
	}

	public void setOid(BigInteger oid) {
		this.oid = oid;
	}

	public String getGuanjianzi() {
		return guanjianzi;
	}

	public void setGuanjianzi(String guanjianzi) {
		this.guanjianzi = guanjianzi;
	}

	public String getMiaoshu() {
		return miaoshu;
	}

	public void setMiaoshu(String miaoshu) {
		this.miaoshu = miaoshu;
	}

	public String getOname() {
		return oname;
	}

	public void setOname(String oname) {
		this.oname = oname;
	}

	public String getChanpin() {
		return chanpin;
	}

	public void setChanpin(String chanpin) {
		this.chanpin = chanpin;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Integer getMoney() {
		return money;
	}

	public void setMoney(Integer money) {
		this.money = money;
	}

	public Date getOtime() {
		return otime;
	}

	public void setOtime(Date otime) {
		this.otime = otime;
	}

	public String getNriqi() {
		return nriqi;
	}

	public void setNriqi(String nriqi) {
		this.nriqi = nriqi;
	}

	public String getBeizhu() {
		return beizhu;
	}

	public void setBeizhu(String beizhu) {
		this.beizhu = beizhu;
	}

	public Nianjian getNianjians() {
		return nianjians;
	}

	public void setNianjians(Nianjian nianjians) {
		this.nianjians = nianjians;
	}

}