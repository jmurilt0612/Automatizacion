package com.buscarvuelo.definitions;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

import com.buscarvuelo.steps.SeleccionSteps;

import net.thucydides.core.annotations.Steps;

public class SeleccionDefinitions {
	
	@Steps
	SeleccionSteps pasos;
	
	@Given("Que me encuentro en la pagina makemytrip")
	public void abrirUrl() {
		pasos.abrirApp();
	}
	@When("Cuando agrego los datos de mi vuelo")
	public void ingresarDatos() throws InterruptedException {
		pasos.ingresarDatos();
		
	}
	@Then("puedo visualizar todos los disponibles")
	public void validarAcceso() {
		pasos.validarInicio();
	}
	
	
}
