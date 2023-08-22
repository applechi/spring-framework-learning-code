package apple.test.postprocessor;

import apple.test.postprocessor.bean.HelloService;
import apple.test.postprocessor.bean.MyNewBean;
import apple.test.postprocessor.bean.WorldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Autowired
    private HelloService helloService;

    @Autowired
    private WorldService worldService;

    @Autowired
    private MyNewBean myNewBean;

    @GetMapping("/test")
    public String test() {
        helloService.sayHello();
        worldService.sayWorld();
        myNewBean.saySomething();
        return "Test done!";
    }
}
