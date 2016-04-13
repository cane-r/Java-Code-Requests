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
public class TestStaticVariable{
    
    private static int var=0;
    
    public TestStaticVariable(){
    var++;
    }
  
    protected int getVar(){
    return var;
    }
    
    
}
