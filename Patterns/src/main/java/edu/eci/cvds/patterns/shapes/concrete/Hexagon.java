package edu.eci.cvds.patterns.shapes.concrete;

import edu.eci.cvds.patterns.shapes.Shape;

public class Hexagon implements Shape {

    private int vertices;

    public Hexagon(int vertices){
        this.vertices = vertices;
    }

    public int getNumberOfEdges() {
        return vertices;
    }
}