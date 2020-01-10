package com.wangwenjun.concurrent.chapter28;

/**
 * @author cwl
 * @description: TODO
 * @date 2020/1/813:56
 */
public class Test {

    public static void main(String[] args) {
        //1.同步Event Bus
        Bus bus = new EventBus("TestBus");
        bus.register(new SimpleSubscriber1());
        bus.register(new SimpleSubscriber2());
        bus.post("Hello");
        System.out.println("-----------------------");
        bus.post("Hello", "test");

        //2.异步Event Bus
        //Bus bus = new AsyncEventBus("TestBus", (ThreadPoolExecutor) Executors.newFixedThreadPool(10));
        //bus.register(new SimpleSubscriber1());
        //bus.register(new SimpleSubscriber2());
        //bus.post("Hello");
        //System.out.println("-----------------------");
        //bus.post("Hello", "test");
    }



}
