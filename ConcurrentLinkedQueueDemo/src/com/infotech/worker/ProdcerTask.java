package com.infotech.worker;

import com.infotech.buffer.Buffer;

public class ProdcerTask implements Runnable{
    private Buffer buffer;
    public ProdcerTask(Buffer buffer){
        this.buffer = buffer;
    }
    @Override
    public void run() {
        // putting just three elements
        for(int i = 0; i < 3; i++){
            buffer.put(i);
        }
    }
}