/*
 * Copyright (c) Hasnain Energy 2026 ALL RIGHTS RESERVED
 *
 * HE-DCS
 */

// Working correctly: copyright header

package com.he.dcs.poc.hello.world; // Working correctly: line before package name

/**
 * Class to check checkstyle rules
 *
 * @author Tariq Hasnain
 */
public class Checkstyle // Working correctly: checkstyle error reported for missing Javadocs for class
{
    /** Working correctly: Checkstyle reports error for missing Javadocs and upper case */
    public static final String PUBLIC_STATIC_VARIABLE = "";

    // Working correctly: checkstyle error reported for static variable to be upper case
    private static final String PRIVATE_STATIC_VARIABLE = "";

    // Working correctly: Checkstyle reports error if memory variable is not starting with m
    private String mName = null;

    /**
     * Default constructor
     */
    public Checkstyle() // Working correctly: checkstyle error reported for missing Javadocs for constructor
    {
    }

    /**
     * A public method
     *
     * @param parameter sample parameter
     */
    public void publicMethod(int parameter) // Working correctly: method indentation, checkstyle error reported for missing Javadocs for public method
    {// Working correctly: method brace indentation
        if (true) // Working correctly: if indentation
        { // Working correctly: if open brace indentation
            while (true) // Working correctly: loop indentation
            { // Working correctly: loop open brace indentation
                if (true) // Working correctly: if indentation
                {// Working correctly: if open brace indentation
                }// Working correctly: if closing brace indentation
            } // Working correctly: loop closing brace indentation
        } // Working correctly: if closing brace indentation
    }// Working correctly: method closing brace indentation

    /**
     * A protected method
     */
    protected void protectedMethod() // Working correctly: checkstyle error reported for missing Javadocs for protected method
    {
    }

    /**
     * A private method
     */
    private void privateMethod() // Working correctly: checkstyle error reported for missing Javadocs for private method
    {
    }

    @Override
    public String toString() // no checkstyle error reported for missing @Override
    {
        return "";
    }
}
