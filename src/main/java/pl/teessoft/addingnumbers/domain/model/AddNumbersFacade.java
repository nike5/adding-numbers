package pl.teessoft.addingnumbers.domain.model;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import pl.teessoft.addingnumbers.domain.ports.JavaRandomRepository;
import pl.teessoft.addingnumbers.domain.ports.RandomOrgRepository;

@Component
@RequiredArgsConstructor
public class AddNumbersFacade {

    private final JavaRandomRepository javaRandomRepository;
    private final RandomOrgRepository randomOrgRepository;

    public int add() {
        final AddNumbers addNumbers = new AddNumbers();
        final int javaRandomValue = javaRandomRepository.get();
        final int randomOrgValue = randomOrgRepository.get();

        return addNumbers.add(javaRandomValue, randomOrgValue);
    }
}
