package br.com.fiap;

public class Vendedor extends Funcionario{
	private float comissao;
	
	public Vendedor() {
		
	}
	public Vendedor(float valorHoraTrabalho,float comissao) {
		super.setValorHoraTrabalho(valorHoraTrabalho);
		this.comissao = comissao;	
	}
	public float getComissao() {
		return comissao;
	}
	public void setComissao(float comissao) {
		this.comissao = comissao;
	}
	public float calculaSalario() {
		float Resultado = (super.getValorHoraTrabalho() * 40) * 4 * (1+comissao/100);
		return Resultado;
	}
}
