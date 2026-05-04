package com.toxalanch.javaFileQueueRunner.executor;

public class Executor {
    private static Executor single_instance = null;

    private Executor() {

    }

    public static synchronized Executor getInstance() {
        if (single_instance == null) {
            single_instance = new Executor();
        }

        return single_instance;
    }
}
