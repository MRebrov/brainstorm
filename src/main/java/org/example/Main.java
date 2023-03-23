package org.example;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Main {
    public static void main(String[] args) {
        HttpClient client = HttpClient.newBuilder().build();
        try {
            HttpResponse<String> send = client.send(HttpRequest.newBuilder().uri(URI.create("http://localhost:8080/test")).build(), HttpResponse.BodyHandlers.ofString());
            System.out.println(send.body());
        } catch (IOException | InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}