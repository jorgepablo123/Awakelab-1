package com.awakelab.evaluacion.modelo;

public class Carro {
	private byte cantidadOcupantes;
	private String fechaIngreso;
	private byte ubicacionX;
	private byte ubicacionY;
	
	public byte getCantidadOcupantes() {
		return cantidadOcupantes;
	}
	public void setCantidadOcupantes(byte cantidadOcupantes) {
		this.cantidadOcupantes = cantidadOcupantes;
	}
	public String getFechaIngreso() {
		return fechaIngreso;
	}
	public void setFechaIngreso(String fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}
	public byte getUbicacionX() {
		return ubicacionX;
	}
	public void setUbicacionX(byte ubicacionX) {
		this.ubicacionX = ubicacionX;
	}
	public byte getUbicacionY() {
		return ubicacionY;
	}
	public void setUbicacionY(byte ubicacionY) {
		this.ubicacionY = ubicacionY;
	}
	
	@Override
	public String toString() {
		return "Carro [cantidadOcupantes=" + cantidadOcupantes + ", fechaIngreso=" + fechaIngreso + ", ubicacionX="
				+ ubicacionX + ", ubicacionY=" + ubicacionY + "]";
	}
	
	
}
