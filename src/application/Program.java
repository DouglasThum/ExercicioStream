package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import javax.swing.JOptionPane;

import domain.Pessoa;

public class Program {
	
	public static void main(String[] args) {
		
		List<Pessoa> lista = new ArrayList<>();
		
		while(true) {
			String dados = JOptionPane.showInputDialog(null, "Insira um novo cadastro, no seguinte formato: 'Nome, Sexo, CPF, Nacionalidade'",
					"Cadastro", JOptionPane.INFORMATION_MESSAGE);
			String[] dadosSep = dados.split(",");
			
			lista.add(new Pessoa(dadosSep[0], dadosSep[1].toLowerCase(), Long.parseLong(dadosSep[2]), dadosSep[3]));
			
			int opcao = JOptionPane.showConfirmDialog(null, "Deseja realizar um novo cadastro?", "Continuar", JOptionPane.YES_NO_OPTION);
			if (opcao == 1) {
				break;
			}
		}
	
		String mulheres = lista.stream()
			.filter(p -> p.getSexo().equals("feminino"))
			.map(Pessoa::toString)
			.collect(Collectors.joining("\n"));
		
		JOptionPane.showMessageDialog(null, mulheres, "Lista de mulheres cadastradas", JOptionPane.INFORMATION_MESSAGE);
		
		String homens = lista.stream()
				.filter(p -> p.getSexo().equals("masculino"))
				.map(Pessoa::toString)
				.collect(Collectors.joining("\n"));
			
			JOptionPane.showMessageDialog(null, homens, "Lista de homens cadastrados", JOptionPane.INFORMATION_MESSAGE);
			
			
	}
}
