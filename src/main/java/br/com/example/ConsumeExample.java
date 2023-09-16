package br.com.example;

import org.eclipse.microprofile.reactive.messaging.Incoming;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class ConsumeExample {

    @Incoming("prices")
    public void consume(Double price) {
        System.out.println("Consume: "+ price);
    }

}