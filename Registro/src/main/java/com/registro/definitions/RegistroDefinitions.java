package com.registro.definitions;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

import com.registro.steps.RegistrosSteps;

import net.thucydides.core.annotations.Steps;

public class RegistroDefinitions {
	
	@Steps
	RegistrosSteps pasos;
	
	@Given("Que estoy en la pagina de registro")
	public void abrirUrlRegistro() {
		pasos.abrirApp();
		
	}
	
	
	@When("ingrese mis datos personales")
	public void ingresarDatos() throws InterruptedException {
		pasos.registrarDatos();
	
	}
	
	
	@Then("este inscrito satisfactoriamente")
	public void certificarRegistro() {
		pasos.validarRegister();
	
	}

}
