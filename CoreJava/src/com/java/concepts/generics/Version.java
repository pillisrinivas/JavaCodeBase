package com.java.concepts.generics;

import java.util.ArrayList;
import java.util.List;

public class Version implements Versioning {
	
	private String createdBy;
	private String dateAdded;
	static int versionNo;
	
	
	public void addVersion(List<? extends Shape> shapes) {
		// TODO Auto-generated method stub
		drawHistory.add(shapes);
		versionNo +=1;
		System.out.println("New version created: Version no is: " + versionNo);
	}
	
	public int getVersionNo() {
		return versionNo;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public String getDateAdded() {
		return dateAdded;
	}

	public void setDateAdded(String dateAdded) {
		this.dateAdded = dateAdded;
	}

	@Override
	public void addDate() {
		System.out.println("Date created: 02/01/2019" );
	}

	@Override
	public void addName() {
		System.out.println("Added by Srinivas");
	}
}
