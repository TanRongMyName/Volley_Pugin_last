package com.coffe.shentao.volly.http;

import android.util.Log;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ThreadPoolManager {
    //把任务添加到请求队列中
    private LinkedBlockingQueue<Runnable> queue=new LinkedBlockingQueue<>();//链表柱塞式队列
    //添加任务
    public void execute(Runnable runnable){
        if(runnable!=null){
            try {
                Log.v("TanRong","将Runnable 添加到队列中");
                queue.put(runnable);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    //把对立中的任务放入线程池中
      private ThreadPoolExecutor threadPoolExecutor;//线程池
      private ThreadPoolManager(){             //核心线程数 最对线程数  线程存活时间                                          数组队列
          threadPoolExecutor=new ThreadPoolExecutor(4,20,15,TimeUnit.SECONDS,new ArrayBlockingQueue<Runnable>(4),rejectedExecutionHandler);
          //开启传送带 让程序运行起来
          threadPoolExecutor.execute(runnable);
      }
      //拒绝策略 将超时未完成的线程重新放入到队列中
      private RejectedExecutionHandler rejectedExecutionHandler=new RejectedExecutionHandler() {
          @Override
          public void rejectedExecution(Runnable r, ThreadPoolExecutor executor) {
                  //r 就是超时的线程
              try {
                  queue.put(r);
              } catch (InterruptedException e) {
                  e.printStackTrace();
              }
          }
      };


    //让线程运动起来   ---将线程 重线程队列中 取出放入到 线程池中执行
    private Runnable runnable=new Runnable() {
        @Override
        public void run() {
            while(true){
                Runnable runnable=null;
                try {
                    runnable=queue.take();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                if(runnable!=null){
                    threadPoolExecutor.execute(runnable);
                }
            }
        }
    };

    //单例
    private static ThreadPoolManager ourInstance=new ThreadPoolManager();
    public static ThreadPoolManager getOurInstance(){
        return ourInstance;
    }
}
