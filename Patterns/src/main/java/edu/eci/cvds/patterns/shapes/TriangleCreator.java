package edu.eci.cvds.patterns.shapes;

public class TriangleCreator implements ShapeFactory{


    public Triangle createTriangle(){
        Triangle triangulo = new Triangle();
        return triangulo;
    }
}