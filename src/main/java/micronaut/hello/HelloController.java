package micronaut.hello;

import io.micronaut.http.HttpResponse;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;

@Controller("/hello")
public class HelloController {

  @Get
  HttpResponse<String> hello() {
    return HttpResponse.ok("Hello Micronaut!");
  }

}
