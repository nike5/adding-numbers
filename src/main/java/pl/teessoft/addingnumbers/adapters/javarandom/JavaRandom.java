package pl.teessoft.addingnumbers.adapters.javarandom;

import org.springframework.stereotype.Component;
import pl.teessoft.addingnumbers.domain.ports.JavaRandomRepository;

import java.util.Random;

@Component
public class JavaRandom implements JavaRandomRepository {

    @Override
    public int get() {
        final Random random = new Random();

        return random.nextInt();
    }
}
