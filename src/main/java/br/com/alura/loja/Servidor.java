package br.com.alura.loja;

import java.io.IOException;
import java.net.URI;

import org.glassfish.grizzly.http.server.HttpServer;
import org.glassfish.jersey.grizzly2.httpserver.GrizzlyHttpServerFactory;
import org.glassfish.jersey.server.ResourceConfig;

public class Servidor {
	
	public static void main(String []args) throws IOException {
		HttpServer server = constroiServidor();
		// finaliza o servidor
		System.in.read();
		server.stop();
	}
	
	public static HttpServer constroiServidor() {
		// configuramos os recursos do servidor
		ResourceConfig config = new ResourceConfig().packages("br.com.alura.loja");
		
		// definimos nossa uri alvo da servirse
		URI uri = URI.create("http://localhost:8080");
		
		// retornar instancia do servidor
		return GrizzlyHttpServerFactory.createHttpServer(uri, config);
	}
	
	
}
