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
public class SubClazz extends TestStaticVariable {
    
    
  public static void main(String ... args){
  System.err.println(new SubClazz().getVar());
  System.err.println(new TestStaticVariable().getVar());
  System.err.println(new SubClazz().getVar());
  System.err.println(new TestStaticVariable().getVar());
  
  }  
    
}
