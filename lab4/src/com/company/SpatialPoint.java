package com.company;

public class SpatialPoint {
    public float x;
    public float y;
    public float z;
    public SpatialPoint (float x, float y, float z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
    public double distanceTo(SpatialPoint point) {
        return (
            Math.pow(
                Math.pow(x - point.x, 2) +
                Math.pow(y - point.y, 2) +
                Math.pow(z - point.z, 2)
                , 0.5)
        );
    }
}
