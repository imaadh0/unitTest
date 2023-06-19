package com.javatechie.azure.demo;

import com.javatechie.azure.demo.MyService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class SpringAzureDemoApplicationTests {

    @Test
    void testMyService() {
        // Test your component here
        MyService myService = new MyService();
        int result = myService.doSomeLogic(2, 3);
        assertEquals(5, result);
    }

    @Test
    void testAnotherComponent() {
        // Test another component here
        // ...
    }
}
