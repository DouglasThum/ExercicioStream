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
	
		List<Pessoa> listaMulheres = filtrarMulheres(lista);
		String mulheresMensagem = returnMensagem(listaMulheres);
		
		JOptionPane.showMessageDialog(null, mulheresMensagem, "Lista de mulheres cadastradas", JOptionPane.INFORMATION_MESSAGE);
		
		List<Pessoa> listaHomens = filtrarHomens(lista);
		String homensMensagem = returnMensagem(listaHomens);
			
		JOptionPane.showMessageDialog(null, homensMensagem, "Lista de homens cadastrados", JOptionPane.INFORMATION_MESSAGE);
	}
	
	public static List<Pessoa> filtrarMulheres(List<Pessoa> lista) {
		return lista.stream()
		.filter(p -> p.getSexo().equals("feminino"))
		.collect(Collectors.toList());
	}
	
	public static List<Pessoa> filtrarHomens(List<Pessoa> lista) {
		return lista.stream()
			.filter(p -> p.getSexo().equals("masculino"))
			.collect(Collectors.toList());
	}
	
	public static String returnMensagem(List<Pessoa> lista) {
		return lista.stream()
			.map(Pessoa::toString)
			.collect(Collectors.joining("\n"));
	}
}
