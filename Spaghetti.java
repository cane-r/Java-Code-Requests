/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trypoi;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.joda.time.DateTime;
import org.joda.time.Duration;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.mail.internet.InternetAddress;

/**
 *
 * @author Caner
 */
public class TryUuid {
    
    
    public static void main(String... args) {
  /*     
  DateTime dt=new DateTime().plusDays(1);
 System.err.println(dt.toString());
 System.err.println(add(1,2,2.2,0.1,3.44,(byte)12,(short)12,3.6f,2L));
 List<? super Number> nums = new ArrayList<Number>();//put
 List<? extends Number> nums2 = new ArrayList<Number>();//get 
  nums.add(2);
          */
        
  /*      
  doSomething(7,2,new Callback(){

      @Override
      public void call(int arg) {
          System.err.println("Callback called in anonymous implementation and result is : " + arg);
      }
      
  }); 
  
  //doSomething(7,2,new Test());
  Callback c=new Test();
  doSomething(7,2,c);
  
        
        Build b=new Build();
        System.err.println(b);
        b.add(2).add(22).add(2).sub(1).add(-3);
        System.err.println(b);
          */
        
        //System.err.println(changeXY("xxstss"));
        //System.err.println(strDist("catcatcatcatccat","cat"));
        //strDist("catcowcatcatcat","cat");
        make(4,1,9);
}
    //big 5 kg,small 1 kg..
    public static int make(int a,int b,int c){
        /*
        System.err.println((goal%5));
        System.err.println((goal/5));
        System.err.println(goal-5*(goal/5));
        */
        int v1=Math.abs(a-b);
  int v2=Math.abs(a-c);
  int v3=Math.abs(b-c);
        
        
        System.err.println(v1+","+v2+","+v3);
        return 0;
        
    }
    
    
    public static void doSomething(int param1,int param2,Callback c){
    int result=param1+param2;
        try {
            Thread.sleep(5000);
        } catch (InterruptedException ex) {
            Logger.getLogger(TryUuid.class.getName()).log(Level.SEVERE, null, ex);
        }
    System.err.println("Callback is about to be called..");  
    c.call(result);
    System.err.println("Callback is called.."); 
    
}
    
    public static String change(String str,String arg1,String arg2) {
  String str1,str2;
  String temp1=arg1;
  String temp2=arg2;
  if(str.length()<1)//or ==0
  return str;
  if(str.substring(0,1).equals(arg1)){
      System.err.println(str);
  str=arg2+ change(str.substring(1),temp1,temp2);
  System.err.println(x);
  return str1;
  }
  
  else {
      System.err.println(str);
      str2= str.charAt(0)+change(str.substring(1),temp1,temp2);
      System.err.println(str2);
  return str2;
  }
}
     public static int strDist(String str, String sub){
         int i,y,z;
         System.err.println("1");
        if(str.length() < sub.length()) return 0;
        if(str.substring(0,sub.length()).equals(sub)
                && str.substring(str.length()-sub.length()).equals(sub))
        {
            
            y=str.length();
            System.err.println("2");
            return y;
        }
        if(str.substring(0,sub.length()).equals(sub)) 
            
        {
            
            i= strDist(str.substring(0,str.length()-1), sub);
            System.err.println("3");
            return i;
        }
        z= strDist(str.substring(1),sub);
        System.err.println("4");
        return z;
    }

    
 
public void testCovariance(List<? extends B> myBlist) {
        B b = new B();
        C c = new C();
        //myBlist.add(b); // does not compile
        //myBlist.add(c); // does not compile
        A a = myBlist.get(0); 
    } 



    
public static <T extends Number> double add(T... params){
    double sum=0;
    for(T param:params){
        
        if(param instanceof Integer){
           sum+=param.intValue();
        }
        else if(param instanceof Double){
            sum+=param.doubleValue();
        }
        else if(param instanceof Byte){
            sum+=param.byteValue();
        }
        
        else if(param instanceof Short){
            sum+=param.shortValue();
           
        }
        
        else if(param instanceof Float){
            sum+=param.floatValue();
           
        }
        
        else if(param instanceof Long){
            sum+=param.longValue();
           
        }
       
 }
    return sum;
}

public class A {}

    public class B extends A {}

    public class C extends B {}
    
    public interface Callback{
        
        abstract public void call(int arg);
    }
    
    public static class Test implements Callback{
   @Override
   public void call(int arg) {
          System.err.println("Callback called in class implementation and result is : " + arg);
}
    }
    public static class Build {
        private int i=0;
        
        public Build add(int arg){
            this.i+=arg;
            return this;
        }
        
        public Build sub(int arg){
            this.i-=arg;
            return this;
        }
        @Override
        public String toString(){
            return "i is -> : " + this.i;
        }
        
    }
    
  
}