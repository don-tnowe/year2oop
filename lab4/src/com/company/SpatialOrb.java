package com.company;

public class SpatialOrb extends SpatialPoint{
    public float radius;

    public SpatialOrb (float x, float y, float z, float radius) {
        super(x,y,z);
        this.radius = radius;
    }
    public boolean contains(SpatialPoint point) {
        if (distanceTo(point) <= radius)
            return true;
        else
            return false;
    }
}
