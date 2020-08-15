package example;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(path="/web")
public class WebController {

    @RequestMapping(path="/test")
    public String sayhello() {
        return "test";
    }
}
