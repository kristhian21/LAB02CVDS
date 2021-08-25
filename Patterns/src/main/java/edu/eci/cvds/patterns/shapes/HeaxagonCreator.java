package edu.eci.cvds.patterns.shapes;

public class HexagonCreator implements ShapeFactory{


    public Hexagon createHexagon(){
        Hexagon hex = new Hexagon();
        return hex;
    }
}