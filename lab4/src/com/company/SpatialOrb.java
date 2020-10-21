package com.company;

public class SpatialSphere extends SpatialPoint{
    public float radius;

    public SpatialSphere (float x, float y, float z, float radius) {
        super(x,y,z);
        this.radius = radius;
    }
    public boolean contains(SpatialPoint point) {
        if (point.distanceTo(point) <= radius)
            return true;
        else
            return false;
    }
}
