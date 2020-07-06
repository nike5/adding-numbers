package pl.teessoft.addingnumbers.adapters.randomorgservice;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "randomOrgService", url = "https://www.random.org/")
interface RandomOrgClient {

    @GetMapping("integers/?num=1&min=1&max=1000000000&col=1&base=10&format=plain&rnd=new")
    String get();
}
