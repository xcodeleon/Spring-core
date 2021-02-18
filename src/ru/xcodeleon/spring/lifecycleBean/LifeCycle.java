package ru.xcodeleon.spring.lifecycleBean;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Random;

public class LifeCycle {

    private String secret;


    public void init() {
        System.out.println("Start generation secret...");
        byte[] bytes = new byte[7];

        new Random().nextBytes(bytes);
        secret = new String(bytes, Charset.forName("UTF-8"));

        System.out.println("Done");
    }

    public String showMySecret() {
        return secret;
    }

    public void destroy() throws IOException {
        System.out.println("Write secret data to file...");

        try (BufferedWriter bw = new BufferedWriter(new FileWriter("secret.txt"))) {
            bw.write(secret);
        }
        System.out.println("Done");
    }
}
