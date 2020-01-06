package com.xujunqi.maven.entity;

public class Nianjian {
	private Integer nid;
	private String nname;

	public Integer getNid() {
		return nid;
	}

	public void setNid(Integer nid) {
		this.nid = nid;
	}

	public String getNname() {
		return nname;
	}

	public void setNname(String nname) {
		this.nname = nname;
	}

	@Override
	public String toString() {
		return "Nianjian [nid=" + nid + ", nname=" + nname + "]";
	}

	public Nianjian(Integer nid, String nname) {
		super();
		this.nid = nid;
		this.nname = nname;
	}

	public Nianjian() {
		super();
	}

}
