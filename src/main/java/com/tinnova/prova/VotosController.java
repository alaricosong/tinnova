package com.tinnova.prova;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VotosController {
	
	@RequestMapping("/votosValidos")
	public String votosValidos(){
		int validos = Votos.getValidos();
		int total_eleitores = Votos.getTotal_eleitores();
		return Votos.percentualVotosValidos(total_eleitores, validos);
	}

	@RequestMapping("/votosBrancos")
	public String votosBrancos(){
		int brancos = Votos.getBrancos();
		int total_eleitores = Votos.getTotal_eleitores();
		return Votos.percentualVotosBrancos(total_eleitores, brancos);
	}

	@RequestMapping("/votosNulos")
	public String votosNulos(){
		int nulos = Votos.getNulos();
		int total_eleitores = Votos.getTotal_eleitores();
		return Votos.percentualVotosNulos(total_eleitores, nulos);
	}

}
