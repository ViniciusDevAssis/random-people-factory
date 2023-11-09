package config;

import java.util.Arrays;
import java.util.List;

public class DadosPessoaFisica {

	private List<String> nomes;
	private List<String> sobrenomes;
	private List<String> cidadesBa;
	private List<String> estados;
	
	public DadosPessoaFisica() {
		nomes = Arrays.asList("Maria", "José", "Ana", "João", "Antônio", "Francisco", "Carlos", "Paulo", "Pedro", "Lucas", "Luiz", "Marcos", "Luis", "Gabriel", "Rafael", "Daniel",
				"Marcelo", "Bruno", "Eduardo", "Felipe", "Raimundo", "Rodrigo", "Fernanda", "Patrícia", "Aline", "Sandra", "Camila", "Alessandra", "Júlia", "André", "Thiago",
				"Leonardo", "Miguel", "Alice", "Manoel", "Joaquim", "Matheus", "Davi", "Jorge", "Márcia", "Diego", "Adriana", "Victor", "Maria Eduarda", "Isabela", "Helena",
				"Gustavo", "Beatriz", "Mariana", "Catarina", "Otávio", "Samuel", "Benedito", "Guilherme", "Lúcia", "Ana Clara", "Lívia", "Isabel", "Laís", "Bianca", "Enzo",
				"Murilo", "Vinícius", "Ricardo", "Maria Clara", "Joana", "Isabelly", "Yasmin", "Lorena", "Melissa", "Sarah", "Emanuelly", "Elisa", "Nicole", "Sofia", "Laura",
				"Arthur", "Enzo Gabriel", "Levi", "Valentina", "Cecília", "Vitor", "Breno", "Caio", "Clara", "Esther", "Isadora", "João Miguel", "Lorenzo", "Luana", "Maria Alice",
				"Maria Cecília", "Maria Eduarda", "Maria Fernanda", "Maria Helena", "Maria Júlia", "Maria Luiza", "Maria Sophia", "Mariana", "Martin", "Matheus", "Miguel", "Noah",
				"Pedro Henrique", "Pietro", "Rafael", "Samuel", "Sophia", "Theo", "Thomas", "Vitor Hugo", "Vitoria", "Jefferson");
		
		sobrenomes = Arrays.asList("Almeida", "Alves", "Andrade", "Araújo", "Azevedo", "Barbosa", "Barros", "Batista", "Borges", "Campos", "Cardoso", "Carvalho", "Castro",
				"Costa", "Dias", "Duarte", "Fernandes", "Ferreira", "Fonseca", "Freitas", "Garcia", "Gomes", "Gonçalves", "Guimarães", "Lima", "Lopes", "Machado", "Marques",
				"Martins", "Medeiros", "Mendes", "Menezes", "Monteiro", "Moreira", "Moura", "Nascimento", "Nogueira", "Nunes", "Oliveira", "Pereira", "Pinto", "Ribeiro", "Rios",
				"Rocha", "Rodrigues", "Sá", "Sampaio", "Santos", "Silva", "Soares", "Sousa", "Teixeira", "Torres", "Vasconcelos", "Viana", "Vieira", "Xavier", "Assis", "Teles", "Luz");

		cidadesBa = Arrays.asList();
		estados = Arrays.asList("BA");
	}

	public List<String> getNomes() {
		return nomes;
	}

	public List<String> getSobrenomes() {
		return sobrenomes;
	}

	public List<String> getCidadesBa() {
		return cidadesBa;
	}

	public List<String> getEstados() {
		return estados;
	}
	
	
}
