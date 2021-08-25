package edu.eci.cvds.patterns.shapes.concrete;

import edu.eci.cvds.patterns.shapes.Shape;

public class Triangle implements Shape {

    private int vertices;

    public Triangle(int vertices){
        this.vertices = vertices;
    }
    
    public int getNumberOfEdges() {
        return vertices;
    }
}