package com.example;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AppTest {

    App app = new App();

    @Test
    void testImcSevero() {
        Double peso = 35.0;
        Integer altura = 150;

        String salida = App.calcularImc(peso, altura);

        assertEquals("Resultado del IMC = Delgadez severa", salida);
    }

    @Test
    void testImcModerado() {
        Double peso = 38.1;
        Integer altura = 150;

        String salida = App.calcularImc(peso, altura);

        assertEquals("Resultado del IMC = Delgadez moderada", salida);
    }

    @Test
    void testImcLeve() {
        Double peso = 41.5;
        Integer altura = 150;

        String salida = App.calcularImc(peso, altura);

        assertEquals("Resultado del IMC = Delgadez leve", salida);
    }

    @Test
    void testImcNormal() {
        Double peso = 45.7;
        Integer altura = 150;

        String salida = App.calcularImc(peso, altura);

        assertEquals("Resultado del IMC = Peso normal", salida);
    }

    @Test
    void testImcSobrepeso() {
        Double peso = 71.8;
        Integer altura = 150;

        String salida = App.calcularImc(peso, altura);

        assertEquals("Resultado del IMC = Obesidad leve", salida);
    }

    @Test
    void testImcObesidadLeve() {
        Double peso = 71.8;
        Integer altura = 150;

        String salida = App.calcularImc(peso, altura);

        assertEquals("Resultado del IMC = Obesidad leve", salida);
    }

    @Test
    void testImcObesidadModerada() {
        Double peso = 80.7;
        Integer altura = 150;

        String salida = App.calcularImc(peso, altura);

        assertEquals("Resultado del IMC = Obesidad moderada", salida);
    }

    @Test
    void testImcObesidadMorbida() {
        Double peso = 98.2;
        Integer altura = 150;

        String salida = App.calcularImc(peso, altura);

        assertEquals("Resultado del IMC = Obesidad mórbida", salida);
    }
}
