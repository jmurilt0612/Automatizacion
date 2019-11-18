package com.buscarvuelo.steps;

import org.fluentlenium.core.annotation.Page;

import com.buscarvuelo.pages.SeleccionPages;


import net.thucydides.core.annotations.Step;

public class SeleccionSteps {

	@Page
	SeleccionPages prueba;
	
	@Step
	public void abrirApp () {
		prueba.open();
	}
	
	@Step
	public void ingresarDatos () throws InterruptedException {
		prueba.ingresarDatos();
	}
	
	@Step
	public void validarInicio ()  {
		prueba.validarAcceso();
	}
	
}
