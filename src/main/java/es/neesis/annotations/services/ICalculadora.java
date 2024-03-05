package es.neesis.annotations.services;

public interface ICalculadora {
    float suma(float a, float b);
    float resta(float a, float b);
    float mul(float a, float b);
    float div(float a, float b);

    void printIndications();
}
