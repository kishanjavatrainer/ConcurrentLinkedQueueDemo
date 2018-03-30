package com.infotech.client;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import com.infotech.buffer.Buffer;
import com.infotech.worker.ConsumerTask;
import com.infotech.worker.ProdcerTask;

public class ClientTest {

    public static void main(String[] args) {
        Buffer buffer = new Buffer();
        ExecutorService executorService = Executors.newFixedThreadPool(4);
        // Calling one producer
        executorService.execute(new ProdcerTask(buffer));
        // Calling three consumers
        executorService.execute(new ConsumerTask(buffer));
        executorService.execute(new ConsumerTask(buffer));
        executorService.execute(new ConsumerTask(buffer));
        executorService.shutdown();
    }
}