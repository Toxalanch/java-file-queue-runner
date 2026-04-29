package com.toxalanch.javaFileQueueRunner;

import com.toxalanch.javaFileQueueRunner.info.Info;

public class QueueObject {
    
    // The instance in the database
    int id = -1;

    /**
     * The String of code that is runnable through
     * {@link run()}
     */
    final String code;

    public QueueObject(Info info) {
        this.code = info.getCode();
    }
}
