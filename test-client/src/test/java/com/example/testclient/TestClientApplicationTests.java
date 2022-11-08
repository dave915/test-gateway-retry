package com.example.testclient;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class TestClientApplicationTests {
    @Autowired
    private TestClient testClient;

    @Test
    void contextLoads() throws InterruptedException {
        for (int i = 0; i < 100000; i++) {
            Thread.sleep(1000);
            System.out.println(String.format("%s , i : %s", testClient.hello(), i));
        }
    }

}
