package br.com.example;

import io.smallrye.mutiny.Multi;
import org.eclipse.microprofile.reactive.messaging.Outgoing;

import jakarta.enterprise.context.ApplicationScoped;
import java.time.Duration;
import java.util.Random;

@ApplicationScoped
public class ProducesExample {

    private final Random random = new Random();

    @Outgoing("prices-out")
    public Multi<Double> generate() {
        return Multi.createFrom().ticks().every(Duration.ofSeconds(1))
            .map(x -> random.nextDouble());
    }

}