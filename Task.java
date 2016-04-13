/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trypoi;


/**
 *
 * @author Caner
 */
public class Task implements Runnable {
    
    private int n=0;
    private final String name;
    
    public Task(String str){
        name=str;
    }
    
    private synchronized void increment(){
        n++;
    }
    
    private synchronized void getNumber(){
        increment();
        System.err.println("--Thread is : " + Thread.currentThread().getName() + " Task is : " +this.name + " Number is : " + n);
    }
    
     @Override
    public void run () {
        
        getNumber();
       }
    
    public int getN(){
        return n;
    }
    public String getName(){
        return this.name;
    }
   
    }

