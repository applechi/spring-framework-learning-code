package apple.test.postprocessor.bean;

import org.springframework.stereotype.Service;

@Service
public class WorldService {

    private String message;

    public WorldService() {
        this.message = "World, Spring!";
    }

    public WorldService(String message) {
        this.message = message;
    }

    public void sayWorld() {
        System.out.println(message);
    }
}
