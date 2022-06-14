package entities;

import entities.enums.Color;

public abstract class Shape {

	private Color color;

	public Shape() {
	}

	public Shape(Color color) {
		this.color = color;
	}

	public Color getColor() {
		return color;
	}

	public void setCalor(Color color) {
		this.color = color;
	}

	public abstract Double area();
}
