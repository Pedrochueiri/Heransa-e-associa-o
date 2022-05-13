package br.com.fiap;

public class VigiaNoturno extends Funcionario{
	private float adcionalNoturno;
	
	public VigiaNoturno() {
		
	}
	public VigiaNoturno(float valorHoraTrabalho, float adcionalNoturno) {
		super.setValorHoraTrabalho(valorHoraTrabalho);
		this.adcionalNoturno = adcionalNoturno;
	}
	public float getAdcionalNoturno() {
		return adcionalNoturno;
	}
	public void setAdcionalNoturno(float adcionalNoturno) {
		this.adcionalNoturno = adcionalNoturno;
	}
	public float calculaSalario() {
		float Resultado = (super.getValorHoraTrabalho() * 40) * 4 + adcionalNoturno;
		return Resultado;
	}
}
