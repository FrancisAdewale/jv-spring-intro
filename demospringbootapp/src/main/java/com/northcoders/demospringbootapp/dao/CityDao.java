package com.northcoders.demospringbootapp.dao;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.northcoders.demospringbootapp.model.Root;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Objects;

public class CityDao {

    private static final String BASE_URL = "https://geocoding-api.open-meteo.com/v1/search?name=";
    private static String city = "London";

    public static Root cityDAO(String input) {
        city = input;
        ObjectMapper om = new ObjectMapper();
        try {
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest req = HttpRequest.newBuilder()
                    .uri(new URI(BASE_URL + city))
                    .GET().build();
            var response = client.send(req, HttpResponse.BodyHandlers.ofString());

            var root = om.readValue(response.body(), Root.class);
            return root;
        } catch(IOException | InterruptedException | URISyntaxException e) {
            e.getMessage();
        }
        return null;
    }

    public static void main(String[] args) {
        Objects.requireNonNull(CityDao.cityDAO("London")).results
                .forEach(c -> System.out.println(c.name));
    }
}
