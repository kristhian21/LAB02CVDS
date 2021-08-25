package edu.eci.cvds.patterns.shapes;
import edu.eci.cvds.patterns.concrete;

public abstract class ShapeFactory {

    public abstract Shape create(RegularShapeType type){
        switch (type) {
            case Triangle:
                return new Triangle(3);
                break;
            case Quadrilateral:
                return new Quadrilateral(4);
                break;
            case Pentagon:
                return new Pentagon(5);
                break;
            case Hexagon:
                return new Hexagon(6);
                break;
        }
    }
}