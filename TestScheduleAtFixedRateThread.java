/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trypoi;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Caner
 */  //not extends Thread

//a controlling thread to cancel the task,and executor.Without it,it is nearly impossible to control it...
public class TestScheduleAtFixedRateThread implements Runnable {
    
    
    private volatile boolean isRunning=true; //a sentinel to control the execution of THIS thread which executes task(s)..
    private final Task test=new Task("Task1");//This is our task...
    private final Task test2=new Task("Task2");//This is our task...
    private Task test3;//This is our task...
    private Task test4;//This is our task...
    private final Task[] taskArray=new Task[10];
    private final ScheduledFuture<?>[] futureArray=new ScheduledFuture<?>[taskArray.length];
    private final ScheduledExecutorService s=Executors.newScheduledThreadPool(1);//this is our thread pool..or executor.....
    private ScheduledFuture<?> result;//the future result we get..
    private ScheduledFuture<?> result2;//the future result we get..
    private volatile int counter=0;
    
    @Override
    public void run() {
         //test=new Task("Task1");
       //test2=new Task("Task2");
       //for(int i=0;i<taskArray.length;i++){
         //  taskArray[i]=new Task("Task"+i);
           //futureArray[i]=s.scheduleAtFixedRate(taskArray[i], 1, 1, TimeUnit.DAYS);
           //}
       //for(int i=0;i<futureArray.length;i++){
         //  futureArray[i]=s.scheduleAtFixedRate(taskArray[i], 1, 1, TimeUnit.DAYS);
           //}
       
       result=s.scheduleAtFixedRate(test, 1, 1, TimeUnit.SECONDS);
        result2=s.scheduleAtFixedRate(test2, 1, 1, TimeUnit.SECONDS);
        
        while(isRunning){
            
            synchronized(test){
                synchronized(test2){
                //for(int i=0;i<taskArray.length;i++){
            if(test.getN()==15 || test2.getN()==15){
                counter++;
                //System.err.println("-the task " + i + " is about to be cancelled.."+Thread.currentThread().getName());
                result.cancel(Boolean.TRUE);
                result2.cancel(Boolean.TRUE);
                //futureArray[i].cancel(true);
                System.err.println("+the task1 and task2 is cancelled.."+Thread.currentThread().getName());
                //if(counter==taskArray.length-1){
                System.err.println("-the executor is about to be cancelled.."+Thread.currentThread().getName());
                s.shutdownNow();
                System.err.println("+the executor is cancelled.."+Thread.currentThread().getName());
                //}
   
               //break;//to exit the controlling thread,so the program returns to main thread..
               //or..you could set isRunning to FALSE...
                this.isRunning=false;
   }
        //}
        }
        }
        }
    }
    
    public Task getTask(){
        return this.test;
    }
    
    public ScheduledFuture getFuture(){
        return this.result;
    }
    
     public ScheduledExecutorService getExecutor(){
        return this.s;
    }
   
}
