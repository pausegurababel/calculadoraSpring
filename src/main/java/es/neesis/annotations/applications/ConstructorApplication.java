package es.neesis.annotations.applications;

import es.neesis.annotations.services.ICalculadora;
import org.springframework.stereotype.Component;

@Component
public class ConstructorApplication {
    private final ICalculadora calculadora;

    public ConstructorApplication(ICalculadora calculadora){
        this.calculadora = calculadora;
    }

    public float suma(float a, float b){
        return calculadora.suma(a,b);
    }

    public float resta(float a, float b){
        return calculadora.resta(a,b);
    }

    public float mul(float a, float b){
        return calculadora.mul(a,b);
    }

    public float div(float a, float b){
        return calculadora.div(a,b);
    }
    public void printIndications(){
        calculadora.printIndications();
    }

}
