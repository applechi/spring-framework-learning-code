package apple.test.postprocessor.bean;

import org.springframework.stereotype.Service;

@Service
public class HelloService {

    private String message;

    public HelloService() {
        this.message = "Hello, Spring!";
    }

    public HelloService(String message) {
        this.message = message;
    }

    public void sayHello() {
        System.out.println(message);
    }
}
