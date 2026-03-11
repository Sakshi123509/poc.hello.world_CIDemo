/*
 * Copyright (c) Hasnain Energy 2026 ALL RIGHTS RESERVED
 *
 * HE-DCS
 */

package com.he.dcs.poc.hello.world;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Sample hello world application that can be deployed in actual production runtime.
 *
 * @author Tariq Hasnain
 */
public class App
{
    private static Logger logger = Logger.getLogger(App.class.getName());

    /**
     * Main method of hello world application
     *
     * @param args array of runtime arguments
     */
    public static void main(String[] args)
    {
        System.out.println("Hello world on command prompt. Additional text from branch!");

        logger.log(Level.INFO, "Hello world in log file !");

        System.out.println("Hello world from branch!");
    }
}
