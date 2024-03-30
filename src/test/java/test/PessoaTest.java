package test;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import application.Program;
import domain.Pessoa;

public class PessoaTest {

	@Test
	public void testarListaMulheres() {
		
		List<Pessoa> lista = new ArrayList<>();
		
		lista.add(new Pessoa("Douglas", "masculino", 9876543210L, "Brasil"));
		lista.add(new Pessoa("João", "masculino", 9876543210L, "Brasil"));
		lista.add(new Pessoa("Ana", "feminino", 1357924680L, "Argentina"));
		lista.add(new Pessoa("Maria", "feminino", 1234567890L, "México"));

		List<Pessoa> mulheres = Program.filtrarMulheres(lista);
		
		for (Pessoa p : mulheres) {
			Assert.assertEquals("feminino", p.getSexo());
		}
	}
}
