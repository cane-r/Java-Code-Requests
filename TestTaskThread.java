/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trypoi;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Caner
 */
public class TestTaskThread {
    public static void main(String [] args){
        TestScheduleAtFixedRateThread task1=new TestScheduleAtFixedRateThread();
        TestScheduleAtFixedRateThread task2=new TestScheduleAtFixedRateThread();
        System.err.println("Task1 is : " + task1.toString());
        System.err.println("Task2 is : " + task2.toString());
        Thread t0=new Thread(task1);
        Thread t1=new Thread(task2);
        
        t0.start();
        t1.start();
        
        try {
            System.err.println("Thread 0 is about to be cancelled..");
            t0.join();
            
            System.err.println("Thread 0 is cancelled..");
            System.err.println("Thread 1 is about to be cancelled..");
           t1.join();
            System.err.println("Thread 1 is cancelled..");
        } catch (InterruptedException ex) {
            System.err.println("A Thread is interrupted..");
        }
        
        task1=null;
        task2=null;
        
        System.err.println("Program finished..");
      
    }
    
}
