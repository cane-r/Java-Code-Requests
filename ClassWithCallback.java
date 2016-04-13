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
public class ClassWithCallback  {
  private int value=144;
  private OnResultReceived orr;
  
  protected interface OnResultReceived{
  public void onReceive(int var);
  }
  
  public void setCallBack(OnResultReceived callback){
  orr=callback;
  }
  
  protected OnResultReceived getCallBack(){
  return this.orr;
  }
  protected void call(int var){
  value+=var;
  orr.onReceive(value);
  }
  
}
