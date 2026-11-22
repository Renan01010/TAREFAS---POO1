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

    protected int getX() {
        return x;
    }

    protected void setX(int x) {
        this.x = x;
    }

    protected int getY() {
        return y;
    }

    protected void setY(int y) {
        this.y = y;
    }

    protected int getZ() {
        return z;
    }

    protected void setZ(int z) {
        this.z = z;
    }

    protected String getCor() {
        return cor;
    }

    protected void setCor(String cor) {
        this.cor = cor;
    }

    protected double getIntensidade() {
        return intensidade;
    }

    protected void setIntensidade(double intensidade) {
        this.intensidade = intensidade;
    }

    protected double calculaDistancia(Ponto3D p) {
        int difeX = this.x - p.x;
        int difeY = this.y - p.y;
        int difeZ = this.z - p.z;
                
        return Math.sqrt(Math.pow(difeX, 2)+
                Math.pow(difeY, 2)+
                Math.pow(difeZ, 2));
    }
}
