package es.neesis.annotations;

import es.neesis.annotations.configuration.AppConfig;
import es.neesis.annotations.applications.ConstructorApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Scanner;

public class ApplicationRunner {

    public static void main(String[] args){

        Scanner keyboard = new Scanner(System.in);

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        ConstructorApplication constructorApplication = context.getBean(ConstructorApplication.class);
        constructorApplication.printIndications();

        int option = keyboard.nextInt();

        while(option != 5){

            float result = 0;
            System.out.println("Introduce el primer operando");
            float a = keyboard.nextFloat();
            System.out.println("Introduce el segundo operando");
            float b = keyboard.nextFloat();
            switch (option) {
                case 1:
                    result = constructorApplication.suma(a, b);
                    break;
                case 2:
                    result = constructorApplication.resta(a, b);
                    break;
                case 3:
                    result = constructorApplication.mul(a, b);
                    break;
                case 4:
                    result = constructorApplication.div(a, b);
                    break;
                default:
                    System.out.println("Opción no válida");
            }

            System.out.println("El resultado de la operación es: " + result);
            constructorApplication.printIndications();
            option = keyboard.nextInt();

        }



    }
}
