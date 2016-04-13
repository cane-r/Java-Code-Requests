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
public class TestReceive implements ClassWithCallback.OnResultReceived { 

//implements ClassWithCallback.OnResultReceived{
   private final ClassWithCallback cwc;
   
   public TestReceive(){
       cwc=new ClassWithCallback();
       cwc.setCallBack(this);
       /*
      //anonymous interface delegating..
       cwc.setCallBack(new ClassWithCallback.OnResultReceived(){
       @Override
       public void onReceive(int var){
       System.err.println("Result is received from delegate and value is " + var);
       }
       
       });
       */
   }
 public void callOther(){
 cwc.call(16);
 }
   @Override
   public void onReceive(int var){
       System.err.println("Result is received from class implementation and value is " + var);
   }
    
    public static void main(String ... args){
       TestReceive tc=new TestReceive();
       tc.callOther();
    }
    
}
