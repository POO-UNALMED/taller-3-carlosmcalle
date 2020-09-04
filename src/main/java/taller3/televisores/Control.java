/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller3.televisores;

/**
 *
 * @author Carlos M Calle
 */
public class Control {
    private TV tv;

    public Control() {
        
    }
    
    public TV getTv() {
        return tv;
    }

    public void enlazar(TV tv) {
        this.tv = tv;
        this.tv.setControl(this);
    }

    public void turnOn(){
        this.tv.turnOn();
    }
    
    public void turnOff(){
        this.tv.turnOff();
    }
    
    
    public void canalUp(){
        this.tv.canalUp();
    }
    
    public void canalDown(){
        this.tv.canalDown();
    }
    
    public void volumenUp(){
       this.tv.volumenUp();
    }
    
    public void volumenDown(){
        this.tv.volumenDown();
    }
  
    public void setCanal(int canal){
        this.tv.setCanal(canal);
    }
    
}
