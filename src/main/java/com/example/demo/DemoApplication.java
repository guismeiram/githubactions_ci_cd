package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import static com.example.demo.Aula02.Calculator.add;
import static com.example.demo.Aula02.Calculator.subtract;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {

        int x = 10;
        int y = 5;

        int soma = add(x, y);
        int subtracao = subtract(x, y);

        System.out.println("Soma de " + " = " + soma);
        System.out.println("Subtração de " +  " = " + subtracao);

        SpringApplication.run(DemoApplication.class, args);
    }

}
