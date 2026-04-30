package com.toxalanch.javaFileQueueRunner;


/**
 * Runner is the class and enterance to the java queue runner
 * and sets up the environment to store delete and run the files
 * through various methods
 * 
 * @author      Gregory Arnold
 * @version     %I%, %G%
 * @since       1.0
 */
public class Runner {
    
    /**
     * Adds the information given to the Queue as a {@link QueueObject} and returns 
     * the session id in order to look back at it
     * 
     * @param       pathToClasses the path to the code files that will be run
     * @param       mainClass the name of the class that has the main method
     * @return      the session id of the QueueObject that is stored in the 
     *              database as an <code>int</code>
     *
     * @see         QueueObject
     */
    public int addToQueue(String pathToClasses, String mainClass) {
        return -1;
    }

    /**
     * Adds the information given to the Queue as a {@link QueueObject} and returns 
     * the session id in order to look back at it and also takes in the user who
     * ran it
     * 
     * @param       pathToClasses the path to the code files that will be run
     * @param       mainClass the name of the class that has the main method
     * @param       username the user on the server
     * @return      the session id of the QueueObject that is stored in the 
     *              database as an <code>int</code>
     *
     * @see         QueueObject
     */
    public int addToQueue(String pathToClasses, String mainClass, String username) {
        return addToQueue(pathToClasses, mainClass);
    }

}
