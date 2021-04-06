package net.codejava;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import net.codejava.models.InfoAluno;
import net.codejava.models.InfoEscola;
import net.codejava.models.Lista;
import net.codejava.models.User;
import net.codejava.repositories.ListaRepository;

@SpringBootApplication
public class SpringBootRegistrationLoginApplication {
	@Autowired
	ListaRepository listaRepository;
	public static void main(String[] args) {
		SpringApplication.run(SpringBootRegistrationLoginApplication.class, args);
	}

	@PostConstruct
	public void init() {

	/*	
		Lista listolha = new Lista();
		InfoAluno infoAluno = new InfoAluno();
		InfoEscola infoEscola = new InfoEscola();
		infoEscola.setBairro("pqp");
		infoEscola.setNomeEscola("Escola cu");

		infoAluno.setIdade(19);
		infoAluno.setMatricula("1876463545-Y");
		infoAluno.setNomeAluno("Jorge Cunha");
		infoAluno.setNomeResponsavel("Umbuerto Porta");
		
		listolha.setEmailUsuario("ypierazo@gmail.com");
		listolha.setInfoAluno(infoAluno);
		listolha.setInfoEscola(infoEscola);

		List<Itens> itens = new ArrayList<Itens>();
		itens.set

		itens.add("Cola");
		itens.add("Escova");
		itens.add("Suco");
		itens.add("Jogo de tabuleiro");

		listolha.setItens(itens);

		listaRepository.save(listolha);
		*/

		//List<Lista> list = new ArrayList<Lista>();
		//list = listaRepository.findAll();
		
	}


	
}
