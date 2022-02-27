package com.jdbc.assignment;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class Brand {
	private int brandId;
	private String brandName;
	
	

	public Brand() {
		// TODO Auto-generated constructor stub
	}

	public int getBrandId() {
		return brandId;
	}

	public void setBrandId(int brandId) {
		this.brandId = brandId;
	}

	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	@Override
	public String toString() {
		return "Brand [brandId=" + brandId + ", brandName=" + brandName + "]";
	}
	


}
