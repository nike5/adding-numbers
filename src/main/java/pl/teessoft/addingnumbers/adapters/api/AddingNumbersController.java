package pl.teessoft.addingnumbers.adapters.api;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.teessoft.addingnumbers.domain.model.AddNumbersFacade;

@RestController
@RequestMapping("adding")
@RequiredArgsConstructor
class AddingNumbersController {

    private final AddNumbersFacade facade;

    @GetMapping
    ResponseEntity<Integer> get() {
        final int added = facade.add();

        return ResponseEntity.ok(added);
    }
}
