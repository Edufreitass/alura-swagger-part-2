package br.com.alura.funcionarios.api.swagger;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

	@Bean
	public Docket api() {
		
		return new Docket(DocumentationType.SWAGGER_2)
				// auxilia no build(construção) da documentação interativa
				.select()
				// sera documentado a partir de um package especifico,
				// geralmente isso acontece na raiz(src) do projeto
				.apis(RequestHandlerSelectors.basePackage("br.com.alura.funcionarios.api"))
				// construção da documentação
				.build()
				// informações da API
				.apiInfo(getApiInfo());
	}

	private ApiInfo getApiInfo() {

		return new ApiInfoBuilder()
				// titulo
				.title("Funcionarios API")
				// descrição
				.description("Está API faz o cadastro, consulta, alteração e exclusão de funcionários.")
				// contato
				.contact(new Contact("Contato Alura", "http://alura.com.br", "contato@alura.com.br"))
				// versão
				.version("1.0.0")
				// construção da ApiInfo
				.build();
	}
	
}
