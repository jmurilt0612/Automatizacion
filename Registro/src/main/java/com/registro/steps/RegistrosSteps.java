package com.registro.steps;

import org.fluentlenium.core.annotation.Page;


import com.registro.registropages.RegistroPages;

import net.thucydides.core.annotations.Step;

public class RegistrosSteps {

	@Page
	RegistroPages prueba;
	
	@Step
	public void abrirApp() {
	prueba.open();	
	}
	
	
	@Step
	public void registrarDatos() throws InterruptedException {
	prueba.ingresarDatos();	
	}
	
	@Step
	public void validarRegister() {
	prueba.validarAcceso();
	}
	
}
