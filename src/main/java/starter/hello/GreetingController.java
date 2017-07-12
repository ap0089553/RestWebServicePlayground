package starter.hello;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

/**
 * Created by Anirudha on 18-06-2017.
 */
@RestController
public class GreetingController {
    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @ApiOperation(value = "Return greeting to the user")
    @RequestMapping(method = RequestMethod.GET, value = "/greeting")
    public Greeting getGreeting(@ApiParam(value = "Name of user logged inn")@RequestParam(value = "name", defaultValue = "World") String name) {
        return new Greeting(counter.getAndIncrement(), String.format(template, name));
    }
}
