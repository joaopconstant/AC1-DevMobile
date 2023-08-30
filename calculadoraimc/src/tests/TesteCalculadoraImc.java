package tests;

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

    @Test
    public void testeAdultoBaixoPesoMuitoGrave() {
        Assert.assertEquals("Baixo peso muito grave",calc.calcularImc(49, 1.751, 19, "masculino" ));
    }

    @Test
    public void testeIdosoHomemObesidadeGrauI() {
        Assert.assertEquals("Baixo peso muito grave",calc.calcularImc(49, 1.751, 19, "masculino" ));
    }
}
