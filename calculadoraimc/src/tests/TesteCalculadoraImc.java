package tests;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import program.CalculadoraImc;

public class TesteCalculadoraImc {
    CalculadoraImc calc;

    @Before
    public void setup() {
        calc = new CalculadoraImc();
    }

    @After
    public void tearDown() {
        calc = null;
    }

    @Test
    public void testeAdultoBaixoPesoMuitoGrave() {
        Assert.assertEquals("Baixo peso muito grave", calc.calcularImc(49, 1.751, 19, "masculino"));
    }

    @Test
    public void testeIdosoHomemObesidadeGrauI() {
        Assert.assertEquals("Baixo peso muito grave", calc.calcularImc(49, 1.751, 19, "masculino"));
    }

    @Test
    public void testeAdultoBaixoPesoGrave1() {
        Assert.assertEquals("Baixo peso grave", calc.calcularImc(47.0, 1.71, 19, "masculino"));
    }

    @Test
    public void testeAdultoBaixoPesoGrave2() {
        Assert.assertEquals("Baixo peso grave", calc.calcularImc(55.0, 1.7999, 19, "masculino"));
    }

    @Test
    public void testeAdultoBaixoPeso1() {
        Assert.assertEquals("Baixo peso", calc.calcularImc(55, 1.798,19, "masculino"));
    }
    @Test
    public void testeAdultoBaixoPeso2() {
        Assert.assertEquals("Baixo peso", calc.calcularImc(55, 1.725,19, "masculino"));
    }
    @Test
    public void testeAdultoPesoNormal1() {
        Assert.assertEquals("Peso normal", calc.calcularImc(55, 1.7239,19, "masculino"));
    }
    @Test
    public void testeAdultoPesoNormal2() {
        Assert.assertEquals("Peso normal", calc.calcularImc(60, 1.5497,19, "masculino"));
    }
    @Test
    public void testeAdultoSobrePeso1() {
        Assert.assertEquals("Sobrepeso", calc.calcularImc(60, 1.549,19, "masculino"));
    }
    @Test
    public void testeAdultoSobrepeso2() {
        Assert.assertEquals("Sobrepeso", calc.calcularImc(70, 1.529,19, "masculino"));
    }
    @Test
    public void testeAdultoObesidadeGrauI1() {
        Assert.assertEquals("Obesidade grau 1", calc.calcularImc(70, 1.527,19, "masculino"));
    }
    @Test
    public void testeAdultoObesidadeGrauI2() {
        Assert.assertEquals("Obesidade grau 1", calc.calcularImc(80, 1.512,19, "masculino"));
    }
    @Test
    public void testeAdultoObesidadeGrauII1() {
        Assert.assertEquals("Obesidade grau 2", calc.calcularImc(80, 1.5115,19, "masculino"));
    }
    @Test
    public void testeAdultoObesidadeGrauII2() {
        Assert.assertEquals("Obesidade grau 2", calc.calcularImc(90, 1.5001,19, "masculino"));
    }
    @Test
    public void testeAdultoObesidadeGrauIII1() {
        Assert.assertEquals("Obesidade grau 3 (Obesidade mórbida)", calc.calcularImc(90, 1.5,19, "masculino"));
    }
    @Test
    public void testeIdosoMasculinoBaixoPeso() {
        Assert.assertEquals("Baixo peso", calc.calcularImc(50, 1.511,66, "masculino"));
    }
    @Test
    public void testeIdosoMasculinoPesoNormal1() {
        Assert.assertEquals("Peso normal", calc.calcularImc(50, 1.505,66, "masculino"));
    }
    @Test
    public void testeIdosoMasculinoPesoNormal2() {
        Assert.assertEquals("Peso normal", calc.calcularImc(60, 1.491,66, "masculino"));
    }
    @Test
    public void testeIdosoMasculinoSobrepeso1() {
        Assert.assertEquals("Sobrepeso", calc.calcularImc(60, 1.486,66, "masculino"));
    }
    @Test
    public void testeIdosoMasculinoSobrepeso2() {
        Assert.assertEquals("Sobrepeso", calc.calcularImc(70, 1.528,66, "masculino"));
    }
    @Test
    public void testeIdosoMasculinoObesidadeGrauI1() {
        Assert.assertEquals("Obesidade grau 1", calc.calcularImc(70, 1.5245,66, "masculino"));
    }
    @Test
    public void testeIdosoMasculinoObesidadeGrauI2() {
        Assert.assertEquals("Obesidade grau 1", calc.calcularImc(79, 1.504,66, "masculino"));
    }
    @Test
    public void testeIdosoMasculinoObesidadeGrauII1() {
        Assert.assertEquals("Obesidade grau 2", calc.calcularImc(79, 1.5,66, "masculino"));
    }
    @Test
    public void testeIdosoMasculinoObesidadeGrauII2() {
        Assert.assertEquals("Obesidade grau 2", calc.calcularImc(90, 1.503,66, "masculino"));
    }
    @Test
    public void testeIdosoMasculinoObesidadeGrauIII1() {
        Assert.assertEquals("Obesidade grau 3 (Obesidade mórbida)", calc.calcularImc(90, 1.5,66, "masculino"));
    }
    @Test
    public void testeIdosoFemininoBaixoPeso() {
        Assert.assertEquals("Baixo peso", calc.calcularImc(50, 1.511,66, "feminino"));
    }
    @Test
    public void testeIdosoFemininoPesoNormal1() {
        Assert.assertEquals("Peso normal", calc.calcularImc(50, 1.505,66, "feminino"));
    }
    @Test
    public void testeIdosoFemininoPesoNormal2() {
        Assert.assertEquals("Peso normal", calc.calcularImc(60, 1.491,66, "feminino"));
    }
    @Test
    public void testeIdosoFemininoSobrepeso1() {
        Assert.assertEquals("Sobrepeso", calc.calcularImc(60, 1.486,66, "feminino"));
    }
    @Test
    public void testeIdosoFemininoSobrepeso2() {
        Assert.assertEquals("Sobrepeso", calc.calcularImc(70, 1.48,66, "feminino"));
    }
    @Test
    public void testeIdosoFemininoObesidadeGrauI1() {
        Assert.assertEquals("Obesidade grau 1", calc.calcularImc(70, 1.476,66, "feminino"));
    }
    @Test
    public void testeIdosoFemininoObesidadeGrauI2() {
        Assert.assertEquals("Obesidade grau 1", calc.calcularImc(80, 1.471,66, "feminino"));
    }
    @Test
    public void testeIdosoFemininoObesidadeGrauII1() {
        Assert.assertEquals("Obesidade grau 2", calc.calcularImc(80, 1.468,66, "feminino"));
    }
    @Test
    public void testeIdosoFemininoObesidadeGrauII2() {
        Assert.assertEquals("Obesidade grau 2", calc.calcularImc(90, 1.465,66, "feminino"));
    }
    @Test
    public void testeIdosoFemininoObesidadeGrauIII() {
        Assert.assertEquals("Obesidade grau 3 (Obesidade mórbida)", calc.calcularImc(90, 1.463,66, "feminino"));
    }
}
