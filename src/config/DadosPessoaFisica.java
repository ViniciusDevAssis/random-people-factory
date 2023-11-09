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

		cidadesBa = Arrays.asList("Salvador", "Feira de Santana", "Vitória da Conquista", "Camaçari", "Juazeiro", "Itabuna", "Lauro de Freitas", "Ilhéus", "Jequié",
				"Teixeira de Freitas", "Barreiras", "Alagoinhas", "Porto Seguro", "Simões Filho", "Paulo Afonso", "Eunápolis", "Santo Antônio de Jesus", "Valença",
				"Luís Eduardo Magalhães", "Guanambi", "Serrinha", "Senhor do Bonfim", "Jacobina", "Irecê", "Candeias", "Gandu", "Dias d'Ávila", "Brumado", "Cruz das Almas",
				"Ipirá", "Catu", "Cafarnaum", "Coaraci", "Santo Amaro", "Campo Formoso", "Itamaraju", "Itapetinga", "Bom Jesus da Lapa", "Conceição do Coité", "Itaberaba",
				"Ribeira do Pombal", "Madre de Deus", "Mata de São João", "Poções", "São Sebastião do Passé", "São Francisco do Conde", "Seabra", "Xique-Xique", "Jaguaquara",
				"Santa Maria da Vitória", "Lauro de Freitas", "Livramento de Nossa Senhora", "Amargosa", "Itacaré", "Mucuri", "Entre Rios", "Curaçá", "Saubara", "Esplanada",
				"Ipiaú", "Maragogipe", "Santo Estêvão", "Morro do Chapéu", "Nova Viçosa", "Paripiranga", "Piritiba", "Prado", "Remanso", "Riachão do Jacuípe", "Rio Real",
				"Sapeaçu", "Sátiro Dias", "Taperoá", "Uauá", "Ubaíra", "Ubaitaba", "Ubatã", "Una", "Urandi", "Uruçuca", "Valente", "Vera Cruz", "Wenceslau Guimarães");

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
