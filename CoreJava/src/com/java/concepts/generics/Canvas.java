package com.java.concepts.generics;

import java.util.ArrayList;
import java.util.List;

public class Canvas extends Version {

	public void draw(Shape s) {
		s.draw(this);
	}

	public void drawAll(List<? extends Shape> shapes) {
		Version vi = new Version();
		vi.addDate();
		vi.addName();
		vi.addVersion(shapes);
		vi.getVersionNo();
		for (Shape s : shapes) {
			s.draw(this);
		}		
	}

}
