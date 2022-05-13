package br.com.fiap;

import javax.swing.JOptionPane;

public class Pagamento {
	public static void main(String[] args) {
		String aux, escolha = "sim", nome;
		int Resultado;
		float valorHoraTrabalho,adcionalNoturn,comissao,Salario;
		
		while (escolha.equalsIgnoreCase("sim")) {
			aux = JOptionPane.showInputDialog("Qual tipo de funcionario voce deseja calcular o salario? \n(1)Funcionario \n(2)Vigia Noturno \n(3)Vendedor");
			Resultado = Integer.parseInt(aux);
			try {
				switch (Resultado) {
				case 1:
					Funcionario fun;
					nome = JOptionPane.showInputDialog("Qual o seu nome? ");
					aux = JOptionPane.showInputDialog("Qual o valor de horas trabalhada?");
					valorHoraTrabalho = Float.parseFloat(aux);
					fun = new Funcionario(nome,valorHoraTrabalho);
					Salario = fun.calculaSalario();
					JOptionPane.showMessageDialog(null, "Nome: " + nome + "\nValor do Salario: " + Salario);
					break;
                case 2:
					VigiaNoturno vn;
					nome = JOptionPane.showInputDialog("Qual o seu nome? ");
					aux = JOptionPane.showInputDialog("Qual o valor de horas trabalhadas");
					valorHoraTrabalho = Float.parseFloat(aux);
					aux = JOptionPane.showInputDialog("Qual o seu adicional? ");
					adcionalNoturn = Float.parseFloat(aux);
					vn = new VigiaNoturno(valorHoraTrabalho,adcionalNoturn);
					Salario = vn.calculaSalario();
					JOptionPane.showMessageDialog(null, "Nome: " + nome + "\nSalario adcional: "+ adcionalNoturn + " \nValor do Salario: " + Salario);
					break;
				case 3:
					Vendedor vend;
					nome = JOptionPane.showInputDialog("Qual o seu nome? ");
					aux = JOptionPane.showInputDialog("Qual o valor de horas trabalhadas");
					valorHoraTrabalho = Float.parseFloat(aux);
					aux = JOptionPane.showInputDialog("Qual a sua comissao? ");
					comissao = Float.parseFloat(aux);
					vend = new Vendedor(valorHoraTrabalho,comissao);
					Salario = vend.calculaSalario();
					JOptionPane.showMessageDialog(null, "Nome: " + nome + "\nSalario comissao: "+ comissao + " \nValor do Salario: " + Salario);
					break;
				default:
					throw new Exception("Opção incorreta");
				}
				escolha = JOptionPane.showInputDialog("Deseja Continuar: sim - nao");
			} catch (Exception e) {
				JOptionPane.showInternalMessageDialog(null, e.getMessage());
			}
					
		}
		JOptionPane.showMessageDialog(null, "Fim do programa, Até breve");
	}
}
