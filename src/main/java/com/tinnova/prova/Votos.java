package com.tinnova.prova;

public class Votos {

	private static int total_eleitores = 1000;
	private static int validos = 800;
	private static int brancos = 150; 
	private static int nulos = 50;

	public static int getTotal_eleitores() {
		return total_eleitores;
	}

	public static void setTotal_eleitores(int total_eleitores) {
		Votos.total_eleitores = total_eleitores;
	}

	public static int getValidos() {
		return validos;
	}

	public static void setValidos(int validos) {
		Votos.validos = validos;
	}

	public static int getBrancos() {
		return brancos;
	}

	public static void setBrancos(int brancos) {
		Votos.brancos = brancos;
	}

	public static int getNulos() {
		return nulos;
	}

	public static void setNulos(int nulos) {
		Votos.nulos = nulos;
	}

	public static String percentualVotosValidos(float total_eleitores, float validos){
		int pvv = (int) (validos/total_eleitores*100);
		return "Percentual de votos válidos: "+pvv+"%";
	}

	public static String percentualVotosBrancos(float total_eleitores, float brancos){
		int pvb = (int) (brancos/total_eleitores*100);
		return "Percentual de votos brancos: "+pvb+"%";
	}

	public static String percentualVotosNulos(float total_eleitores, float nulos){
		int pvn = (int) (nulos/total_eleitores*100);
		return "Percentual de votos nulos: "+pvn+"%";
	}

}
