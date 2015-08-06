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

    public Car(Builder builder)
    {
        this.variant = builder.variant;
        this.numberOfSeats = builder.numberOfSeats;
        this.powerSteering = builder.powerSteering;
        this.enableGPS = builder.enableGPS;
        this.alloyWheels = builder.alloyWheels;
    }

    public static class Builder
    {

        private final String variant;
        private final int numberOfSeats;
        private boolean powerSteering;
        private boolean enableGPS;
        private boolean alloyWheels;

        public Builder(String variant, int numberOfSeats)
        {
            this.variant = variant;
            this.numberOfSeats = numberOfSeats;
        }


        public Builder setPowerSteering(boolean powerSteering)
        {
            this.powerSteering = powerSteering;
            return this;
        }

        public Builder setEnableGPS(boolean enableGPS)
        {
            this.enableGPS = enableGPS;
            return this;

        }

        public Builder setAlloyWheels(boolean alloyWheels)
        {
            this.alloyWheels = alloyWheels;
            return this;
        }

        public Car build()
        {
            return new Car(this);
        }
    }

}
