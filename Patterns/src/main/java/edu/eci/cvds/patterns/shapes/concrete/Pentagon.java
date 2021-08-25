package edu.eci.cvds.patterns.shapes.concrete;

import edu.eci.cvds.patterns.shapes.Shape;

public class Pentagon implements Shape {

    private int vertices;

    public Pentagon(int vertices){
        this.vertices = vertices;
    }

    public int getNumberOfEdges() {
        return vertices;
    }
}