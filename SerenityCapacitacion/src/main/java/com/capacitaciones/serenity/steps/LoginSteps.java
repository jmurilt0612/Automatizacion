package com.capacitaciones.serenity.steps;

import org.fluentlenium.core.annotation.Page;

import com.capacitacion.serenity.pages.LoginPages;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class LoginSteps extends ScenarioSteps {
	
	@Page
	LoginPages prueba;
	
	@Step
	public void abrirApp () {
		prueba.open();
	}
	
	@Step
	public void ingresarDatos () {
		prueba.login();
	}
	
	@Step
	public void validarInicio () {
		prueba.validacion();
	}
	
	
}
