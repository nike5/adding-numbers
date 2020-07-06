package pl.teessoft.addingnumbers.domain.model;

import org.junit.jupiter.api.Test;
import pl.teessoft.addingnumbers.domain.ports.JavaRandomRepository;
import pl.teessoft.addingnumbers.domain.ports.RandomOrgRepository;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class AddNumbersTest {

    final JavaRandomRepository javaRandomRepository = mock(JavaRandomRepository.class);
    final RandomOrgRepository randomOrgRepository = mock(RandomOrgRepository.class);
    final AddNumbersFacade facade = new AddNumbersFacade(javaRandomRepository, randomOrgRepository);

    @Test
    void shouldReturnAddedNumbers() {
        //given
        final int first = 1;
        final int second = 1;

        //when
        when(javaRandomRepository.get()).thenReturn(first);
        when(randomOrgRepository.get()).thenReturn(second);
        final int addedNumbers = facade.add();

        //then
        assertEquals(2, addedNumbers);
    }
}
