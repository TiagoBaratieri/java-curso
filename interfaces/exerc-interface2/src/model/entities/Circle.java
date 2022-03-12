package model.entities;

import model.enums.Color;

public class Circle extends AbstractShape{
    private Double radius;

    public Circle(Color color, Double radius) {
        super(color);
        this.radius = radius;
    }

    public Double getRaio() {
        return radius;
    }

    public void setRaio(Double raio) {
        this.radius = raio;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

}
