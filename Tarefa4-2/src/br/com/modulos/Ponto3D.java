package br.com.modulos;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author renan
 */
public class Ponto3D {

    private int x;
    private int y;
    private int z;
    private String cor;
    private double intensidade;
    
    public Ponto3D() {

    }

    public Ponto3D(int x, int y, int z, String cor, double intensidade) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.cor = cor;
        this.intensidade = intensidade;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public double getIntensidade() {
        return intensidade;
    }

    public void setIntensidade(double intensidade) {
        this.intensidade = intensidade;
    }

    public double calculaDistancia(Ponto3D p) {
        int difeX = this.x - p.x;
        int difeY = this.y - p.y;
        int difeZ = this.z - p.z;
                
        return Math.sqrt(Math.pow(difeX, 2)+
                Math.pow(difeY, 2)+
                Math.pow(difeZ, 2));
    }
}
