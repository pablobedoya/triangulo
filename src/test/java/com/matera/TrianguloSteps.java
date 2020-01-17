package com.matera;

import static org.junit.Assert.assertEquals;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;

public class TrianguloSteps {
	
	TrianguloPage trianguloPage;

	@Dado ("^que eu desejo verificar o tipo de um triângulo$")
	public void que_eu_desejo_verificar_o_tipo_de_um_triangulo() {
		trianguloPage.acessarCalculadoraTriangulo();
	}
	
	@Quando ("^eu informo o ([^\"]*) para o lado A$")
	public void informar_o_lado_a(String valorA) {
		trianguloPage.informarLadoA(valorA);
	}
	
	@E ("^informo o ([^\"]*) para o lado B$")
	public void informar_o_lado_b(String valorB) {
		trianguloPage.informarLadoB(valorB);
	}
	
	@E ("^informo o ([^\"]*) para o lado C$")
	public void informar_o_lado_c(String valorC) {
		trianguloPage.informarLadoC(valorC);
	}
	
	@E ("^consulto o tipo do triângulo$")
	public void consulto_o_tipo_do_triangulo() {
		trianguloPage.calcularClick();
	}
	
	@Então ("^o sistema informa que o triângulo é ([^\"]*)$")
	public void o_sistema_informa_que_o_triangulo_e(String tipoTriangulo) {
		String resultado = trianguloPage.obterTipoTriangulo();
		assertEquals(tipoTriangulo, resultado);
	}
	
	@Before
	public void setUp() {
		trianguloPage = new TrianguloPage();
	}
	
	@After
	public void tearDown() {
		trianguloPage.finalizar();
	}
	
}
