package com.example;

public final class App {

    public static String calcularIMC(Float peso, Integer altura) {
        Float alturaMetros = altura / 100.0f;
        Float resultado = peso / (alturaMetros * alturaMetros);

        if (resultado < 16) {
            return "Resultado del IMC = Delgadez severa";
        } else if (resultado < 17) {
            return "Resultado del IMC = Delgadez moderada";
        } else if (resultado < 18.5) {
            return "Resultado del IMC = Delgadez leve";
        } else if (resultado < 25) {
            return "Resultado del IMC = Peso normal";
        } else if (resultado < 30) {
            return "Resultado del IMC = Sobrepeso";
        } else if (resultado < 35) {
            return "Resultado del IMC = Obesidad leve";
        } else if (resultado < 40) {
            return "Resultado del IMC = Obesidad moderada";
        } else {
            return "Resultado del IMC = Obesidad mórbida";
        }
    }
}
