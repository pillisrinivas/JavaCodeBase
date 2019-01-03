package com.java.collections.listexamples;

import java.util.ArrayList;
import java.util.List;

public interface Versioning {
	void addDate();
	void addName();
	static List<List<? extends Shape>> drawHistory =  
			new ArrayList<List<? extends Shape>>();
}
