package gm.fit;

import gm.fit.servicio.IClienteServicio;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class FitApplication implements CommandLineRunner {

	@Autowired
	private IClienteServicio clienteServicio;
	private static final Logger logger = LoggerFactory.getLogger(FitApplication.class);

	public static void main(String[] args) {
		logger.info("Iniciando la aplicacion");
		SpringApplication.run(FitApplication.class, args);
	}

	@Override
	public void run(String... args)throws Exception{
		fitApp();
	}
	private void fitApp() {
		logger.info("Iniciando la aplicacion");
		var salir = false;
		var consola = new Scanner(System.in);
		while(!salir) {
			var opcion = mostrarMenu();
			salir = ejecutarOpciones(consola,opcion);
		}
	}

}
