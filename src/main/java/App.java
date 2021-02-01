public class App extends SpringBootServletInitalizer {
    public String sayHello() {
        System.out.println("세번째 test");
        System.out.println("submain test");
        return "Hello world!";

    }
}