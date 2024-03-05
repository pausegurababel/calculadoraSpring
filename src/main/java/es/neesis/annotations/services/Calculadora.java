package es.neesis.annotations.services;

import org.springframework.stereotype.Service;

@Service
public class Calculadora implements ICalculadora {

    @Override
    public float suma(float a, float b){
        return (a+b);
    }

    @Override
    public float resta(float a, float b){
        return (a-b);
    }
    @Override
    public float mul(float a, float b){
        return (a * b);
    }
    @Override
    public float div(float a, float b){
        return (a / b);
    }

    public void printIndications(){
        System.out.println("¿Que operacion quieres hacer?");
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");
        System.out.println("5. Salir");
        System.out.println("Introduce el número correspondiente a la operación");
    }


}
