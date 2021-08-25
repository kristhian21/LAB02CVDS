package edu.eci.cvds.patterns.shapes.concrete;

import edu.eci.cvds.patterns.shapes.Shape;

public class Quadrilateral implements Shape {

    private int vertices;

    public Quadrilateral(int vertices){
        this.vertices = vertices;
    }

    public int getNumberOfEdges() {
        return vertices;
    }
}