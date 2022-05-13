package br.com.fiap;

import javax.swing.JOptionPane;

public class CalculaArea {
	public static void main(String[] args) {
		String aux, escolha = "sim";
		int Resultado;
		float area, lado, altura;

		while (escolha.equalsIgnoreCase("sim")) {
			aux = JOptionPane.showInputDialog(
					"Escolha qual a opção desejada Calcular? \n(1)Quadrado \n(2)Retangulo \n(3)Triagulo");
			Resultado = Integer.parseInt(aux);
			try {
				switch (Resultado) {
				case 1:
					Quadrado quad;
					aux = JOptionPane.showInputDialog("Digite o valor do lado: ");
					lado = Float.parseFloat(aux);
					quad = new Quadrado(lado);
					area = quad.calculaArea();
					JOptionPane.showMessageDialog(null, "Area do Quadrado: " + area);
					break;
				case 2:
					Retangulo ret;
					aux = JOptionPane.showInputDialog("Digite o valor do lado: ");
					lado = Float.parseFloat(aux);
					aux = JOptionPane.showInputDialog("Digite o valor do altura: ");
					altura = Float.parseFloat(aux);
					ret = new Retangulo(lado, altura);
					area = ret.calculaAtea();
					JOptionPane.showMessageDialog(null, "Area do Retangulo: " + area);
					break;
				case 3:
					Triangulo tri;
					aux = JOptionPane.showInputDialog("Digite o valor do lado: ");
					lado = Float.parseFloat(aux);
					aux = JOptionPane.showInputDialog("Digite o valor do altura: ");
					altura = Float.parseFloat(aux);
					tri = new Triangulo(lado, altura);
					area = tri.calculaArea();
					JOptionPane.showMessageDialog(null, "Area do Triangul: " + area);
					break;
				default:
					throw new Exception("Opção Incorreta");
				}
				escolha = JOptionPane.showInputDialog("Deseja Continuar: sim - nao");
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, e.getMessage());
			}
		}
		JOptionPane.showMessageDialog(null, "Fim do programa. Até breve");
	}
}
