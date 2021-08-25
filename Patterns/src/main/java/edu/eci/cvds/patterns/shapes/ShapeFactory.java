package edu.eci.cvds.patterns.shapes;

public abstract class ShapeFactory {

    public abstract Shape create(RegularShapeType type){
        switch (type)) {
            case Triangle:
                return TriangleCreator();
                break;
            case Quadrilateral:
                return QuadrilateralCreator();
                break;
            case Pentagon:
                return PentagonCreator();
                break;
            case Hexagon:
                return HexagonCreator();
                break;
        }
    }
}