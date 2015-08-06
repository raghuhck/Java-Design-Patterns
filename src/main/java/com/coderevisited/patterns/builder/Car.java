/*
 * The MIT License (MIT)
 *
 * Copyright (c) 2015  CodeRevisited.com
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 *
 */

package com.coderevisited.patterns.builder;

/**
 * 1. Create a builder class.
 * 2. Add constructor with required properties
 * 3. Return updated builder object after setting each property
 * 4. finally call build to return car object
 */
public class Car
{
    private final String variant;
    private final int numberOfSeats;
    private final boolean powerSteering;
    private final boolean enableGPS;
    private final boolean alloyWheels;

    public Car(CarBuilder builder)
    {
        this.variant = builder.getVariant();
        this.numberOfSeats = builder.getNumberOfSeats();
        this.powerSteering = builder.isPowerSteering();
        this.enableGPS = builder.isEnableGPS();
        this.alloyWheels = builder.isAlloyWheels();
    }

    public String getVariant() {
        return variant;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public boolean isPowerSteering() {
        return powerSteering;
    }

    public boolean isEnableGPS() {
        return enableGPS;
    }

    public boolean isAlloyWheels() {
        return alloyWheels;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("A new car is ready : ");
        sb.append("Varient : " + getVariant());
        sb.append("number of seats : " + getNumberOfSeats());
        sb.append("power steering enabled ? : " + isPowerSteering());
        sb.append("GPS enabled ? : " + isEnableGPS());
        sb.append("Alloy Wheels ? : " + isAlloyWheels());
        return sb.toString();
    }
}
