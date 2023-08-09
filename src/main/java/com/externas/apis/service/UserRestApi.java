package com.externas.apis.service;

import com.externas.apis.model.User;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;
@Service
public class UserRestApi {
    public List<String> getUsuarios() {
        RestTemplate restTemplate = new RestTemplate();
        final String url = "https://jsonplaceholder.typicode.com/users";
        return restTemplate.getForObject(url, List.class);
    }

    public User getUserById(String id) {
        RestTemplate restTemplate = new RestTemplate();
        final String url = "https://jsonplaceholder.typicode.com/users";
        final String urlById = url + "/" + id;
        User  user=restTemplate.getForObject(urlById, User.class);
        return user;
    }

}
