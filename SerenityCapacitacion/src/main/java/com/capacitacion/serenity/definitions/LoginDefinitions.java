package com.capacitacion.serenity.definitions;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

import com.capacitaciones.serenity.steps.LoginSteps;

import net.thucydides.core.annotations.Steps;

public class LoginDefinitions {
	
	@Steps
	LoginSteps pasos;
	
	@Given("That I am on Training Site WEB")
	public void abrirUrl() {
		pasos.abrirApp();
	}
	
	@When("I start session")
	public void iniciarSesion() {
		pasos.ingresarDatos();
	}
	
	@Then("I have access to the buy of books")
	public void validarAcceso() {
		 pasos.validarInicio();
	}
}