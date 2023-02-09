package com.example.solidprinciples

/* Open: This means that we can add new features to our classes. When there is a new requirement, we should be able to add new features
to our class easily.
Close: This means that the base features of the class should not be changed. */



/* public interface Shape {
    fun getArea();
}

public class Rectangle: Shape {
    private var length;
    private var height;
    // getters/setters ...
    @Override
    public getArea(): Double {
        return (length * height);
    }
}

public class Circle : Shape{
    private var radius;
    // getters/setters ...
    @Override
    public getArea() : Double {
        return (radius * radius * Math.PI);
    }
}

public class AreaFactory {
    fun calculateArea(shapes: ArrayList<String>): Double {
        var area: Double = 0.toDouble();
        for (shape in shapes) {
            area += shape.getArea();
        }
        return area;
    }
}*/


