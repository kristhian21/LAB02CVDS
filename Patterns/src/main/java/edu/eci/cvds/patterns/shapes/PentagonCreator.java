package edu.eci.cvds.patterns.shapes;

public class PentagonCreator implements ShapeFactory{


    public Pentagon createPentagon(){
        Pentagon pen = new Pentagon();
        return pen;
    }
}