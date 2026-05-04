package com.toxalanch.javaFileQueueRunner.info;

import com.toxalanch.javaFileQueueRunner.QueueObject;

public interface InfoFetcher {

    QueueObject fetchInfo();

    int addInfo(QueueObject object);

    QueueObject getObjectFromId(int sessionid);
}
