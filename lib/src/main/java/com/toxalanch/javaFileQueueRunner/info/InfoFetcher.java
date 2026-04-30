package com.toxalanch.javaFileQueueRunner.info;

import com.toxalanch.javaFileQueueRunner.QueueObject;

public interface InfoFetcher {

    QueueObject fetchInfo();

    void setInfo(QueueObject object);
}
