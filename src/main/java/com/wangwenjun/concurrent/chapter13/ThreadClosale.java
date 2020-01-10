package com.wangwenjun.concurrent.chapter13;

import java.util.concurrent.TimeUnit;

/***************************************
 * @author:Alex Wang
 * @Date:2017/12/13
 * QQ: 532500648
 * QQ群:463962286
 ***************************************/
public class ThreadClosale extends Thread
{
    private  boolean started = true;

    @Override
    public void run()
    {
        int i = 0;
        int j = 10;
        while (started)
        {
            i++;
            i--;
            j = i;
            //do work
        }
        System.out.println(j);
        System.out.println("closed");
    }

    public void shutdown()
    {
        this.started = false;
    }

    public static void main(String[] args) throws InterruptedException
    {
        ThreadClosale t = new ThreadClosale();
        t.start();

        TimeUnit.SECONDS.sleep(1);
        t.shutdown();
    }


}