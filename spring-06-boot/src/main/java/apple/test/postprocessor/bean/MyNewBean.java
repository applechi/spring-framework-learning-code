package apple.test.postprocessor.bean;

public class MyNewBean {

    private String message;

    public MyNewBean() {
        this.message = "This is a new bean!";
    }

    public MyNewBean(String message) {
        this.message = message;
    }

    public void saySomething() {
        System.out.println(message);
    }
}
