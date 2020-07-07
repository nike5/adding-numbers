package pl.teessoft.addingnumbers.adapters.randomorgservice;

import lombok.RequiredArgsConstructor;
import org.springframework.cloud.client.circuitbreaker.CircuitBreaker;
import org.springframework.cloud.client.circuitbreaker.CircuitBreakerFactory;
import org.springframework.stereotype.Component;
import pl.teessoft.addingnumbers.domain.ports.RandomOrgRepository;

import java.util.Random;

@Component
@RequiredArgsConstructor
class RandomOrgRestClient implements RandomOrgRepository {

    private final RandomOrgClient randomOrgClient;
    private final CircuitBreakerFactory circuitBreakerFactory;

    @Override
    public int get() {
        final CircuitBreaker circuitBreaker = circuitBreakerFactory.create("random-org-circuit-breaker");
        return circuitBreaker.run(() -> Integer.parseInt(randomOrgClient.get()), throwable -> getJavaRandom());
    }

    private Integer getJavaRandom() {
        return new Random().nextInt();
    }
}
