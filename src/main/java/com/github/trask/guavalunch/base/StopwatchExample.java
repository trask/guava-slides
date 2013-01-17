package com.github.trask.guavalunch.base;

import com.google.common.base.Stopwatch;

public class StopwatchExample {

    public static void main(String[] args) throws InterruptedException {

        Stopwatch stopwatch = new Stopwatch();

        stopwatch.start();
        for (int i = 0; i < 1000; i++) {}
        stopwatch.stop();
        System.out.println(stopwatch);

        stopwatch.reset();

        stopwatch.start();
        for (int i = 0; i < 1234; i++) {
            Thread.sleep(1);
        }
        stopwatch.stop();
        System.out.println(stopwatch);
    }
}
