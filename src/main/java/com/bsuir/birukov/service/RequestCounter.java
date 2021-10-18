package com.bsuir.birukov.service;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Data
@Component
public class RequestCounter extends Thread {                //Счётчик запросов
    private int counter;
    final Thread requestCounter;

    public RequestCounter(){                                //Запуск потока
        this.requestCounter = new Thread();
        this.requestCounter.start();
    }

    @Override
    public void run(){
        log.info("Thread start()");
    }

    public synchronized void incrementCounter(){
        this.counter++;
    }
    public int getCounter() { return counter; }
}
