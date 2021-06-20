package com.example.padraobuilder;

import com.example.padraobuilder.model.CasaComGaragemBuilder;
import com.example.padraobuilder.model.builder.Diretor;
import com.example.padraobuilder.model.Casa;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PadraobuilderApplication implements CommandLineRunner {

	public static void main(String[] args) {
        SpringApplication.run(PadraobuilderApplication.class,args);
	}

    @Override
    public void run(String... args) throws Exception {
        Diretor diretor = new Diretor();

        CasaComGaragemBuilder builder = new CasaComGaragemBuilder();
        diretor.construirCasaComGaragem(builder);
        Casa casa = builder.getResult();

        System.out.println(casa);
    }
}
