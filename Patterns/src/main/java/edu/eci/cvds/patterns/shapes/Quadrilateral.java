package edu.eci.cvds.patterns.shapes;

public class QuadrilateralCreator implements ShapeFactory{


    public Quadrilateral createQuadrilateral(){
        Quadrilateral qua = new Quadrilateral();
        return qua;
    }
}