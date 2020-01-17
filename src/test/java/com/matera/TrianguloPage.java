package com.matera;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.ChromeDriverManager;

public class TrianguloPage {
	
	public static final String URL = "https://calculadoratriangulo.herokuapp.com";
	
	private WebDriver driver;
	
	public TrianguloPage() {
		ChromeDriverManager.getInstance().version("79.0.3945.36").setup();
		this.driver = new ChromeDriver();
	}
	
	public void acessarCalculadoraTriangulo() {
		driver.navigate().to(URL);
	}
	
	public void informarLadoA(String valorA) {
		driver.findElement(By.id("lado1")).clear();
		driver.findElement(By.id("lado1")).sendKeys(valorA);
	}
	
	public void informarLadoB(String valorB) {
		driver.findElement(By.id("lado2")).clear();
		driver.findElement(By.id("lado2")).sendKeys(valorB);
	}
	
	public void informarLadoC(String valorC) {
		driver.findElement(By.id("lado3")).clear();
		driver.findElement(By.id("lado3")).sendKeys(valorC);
	}
	
	public void calcularClick() {
		driver.findElement(By.id("calcular")).click();
	}
	
	public String obterTipoTriangulo() {
		return driver.findElement(By.id("message")).getText();
	}
	
	public void finalizar() {
		driver.close();
	}
	
}
