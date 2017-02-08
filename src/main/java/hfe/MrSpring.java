package hfe;

import hfe.next.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.inject.Inject;
import java.util.logging.Logger;

@SpringBootApplication
public class MrSpring {

    private static ConfigurableApplicationContext context;

    public MrSpring() {
        Logger logger = Logger.getLogger(MrSpring.class.getName());
        logger.info(logger.getClass().getCanonicalName() + " los");
    }

    public static void main(String[] args) {
        context = SpringApplication.run(new Object[]{MrSpring.class, Value.class}, args);
    }

    static ConfigurableApplicationContext getContext() {
        return context;
    }
}

@Controller
class SampleController {
    @Inject
    private Value value;

    @GetMapping("/hello")
    @ResponseBody
    public String muffe() {
        return "SampleController " + value.name();
    }
}

@Controller
class DefaultController {

    @GetMapping("/check")
    @ResponseBody
    public String muffe() {
        return "DefaultController";
    }
}

