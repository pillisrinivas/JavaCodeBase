package com.java.collections.listexamples;

import java.util.ArrayList;
import java.util.List;

public class Design extends Version implements Versioning{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Create a new Canvas to start drawing
		Canvas c = new Canvas();
		c.draw(new Rectangle()); // Draw Rectangle
		c.draw(new Circle()); // Draw Circle

		List<Shape> sh = new ArrayList<Shape>();
		System.out.println("size of Shape sh: " + sh.size());
		sh.add(new Rectangle());
		sh.add(new Circle());
		sh.add(new Circle("Circle 1"));
		sh.add(new Circle("Circle 2"));

		System.out.println(sh);
		System.out.println("size of Shape sh after changes: " + sh.size());

		for (Shape t : sh) {
			c.draw(t);
		}

		List<Circle> c1 = new ArrayList<Circle>();
		c1.add(new Circle("Circle 3"));
		c1.add(new Circle("Circle 4"));

		for (Shape t : c1) {
			c.draw(t);
		}

		System.out.println("Invoke drawAll method");
		c.drawAll(sh);
		c.drawAll(c1);
		System.out.println("drawHistory: " + drawHistory);

		System.out.println("Size of drawHistory:" + drawHistory.size());

		for (List<? extends Shape> other : drawHistory) {
			System.out.println("Print of Other: " + other);
		}
	}

}
