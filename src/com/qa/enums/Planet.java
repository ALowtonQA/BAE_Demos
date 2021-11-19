package com.qa.enums;

public enum Planet {
    MERCURY(3.03e+23, 2.4397e6),
    VENUS(4.869e+24, 6.0518e6),
    EARTH(5.976e+24, 6.37814e6),
    MARS(6.421e+23, 3.3972e6),
    JUPITER(1.9e+27,   7.1492e7),
    SATURN(5.688e+26, 6.0268e7),
    URANUS(8.686e+25, 2.5559e7),
    NEPTUNE(1.024e+26, 2.4746e7);

    private final double MASS;
    private final double RADIUS;

    Planet(double mass, double radius) {
        this.MASS = mass;
        this.RADIUS = radius;
    }

    public double getMass() {
		return MASS;
	}

	public double getRadius() {
		return RADIUS;
	}

	//universal gravitational constant  (m3 kg-1 s-2)
    public static final double GRAVITATIONAL_CONSTANT = 6.67300E-11;

    public double surfaceGravity() {
        return GRAVITATIONAL_CONSTANT * MASS / (RADIUS * RADIUS);
    }

    public double surfaceWeight(double otherMass) {
        return otherMass * surfaceGravity();
    }
}
