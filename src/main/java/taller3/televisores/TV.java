/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller3.televisores;

/**
 *
 * @author Carlos M Calle
 * 
 */
public class TV {

    public Marca marca;
    public int canal;
    public int precio;
    public boolean estado;
    public int volumen;
    public Control control;
    public static int numTV;

    public TV(Marca marca, boolean estado) {
        this.marca = marca;
        this.estado = estado;
        this.canal = 1;
        this.volumen = 1;
        this.precio = 500;
        numTV++;
    }

    public static void setNumTV(int numtv){
        numTV = numtv;
    }   
    
    public void estadoInicial() {
        this.canal = 1;
        this.volumen = 1;
    }

    public Marca getMarca() {
        return marca;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }

    public int getCanal() {
        return canal;
    }

    public void setCanal(int canal) {
        if (canal >= 1 && canal <= 120 && estado) {
            this.canal = canal;
        }
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getVolumen() {
        return volumen;
    }

    public void setVolumen(int volumen) {
        if (volumen >= 0 && volumen <= 7 && estado) {
            this.volumen = volumen;
        }
    }

    public Control getControl() {
        return control;
    }

    public void setControl(Control control) {
        this.control = control;
    }

    public static int getNumTV() {
        return numTV;
    }

    public void turnOn() {
        this.estado = true;
    }

    public void turnOff() {
        this.estado = false;
        this.estadoInicial();
    }

    public boolean getEstado() {
        return estado;
    }

    public void canalUp() {
        if (canal < 120 && estado) {
            this.canal += 1;
        }
    }

    public void canalDown() {
        if (canal > 1 && estado) {
            this.canal -= 1;
        }
    }

    public void volumenUp() {
        if (volumen < 7 && estado) {
            this.volumen += 1;
        }
    }

    public void volumenDown() {
        if (volumen > 0 && estado) {
            this.canal -= 1;
        }
    }
    
    
}
