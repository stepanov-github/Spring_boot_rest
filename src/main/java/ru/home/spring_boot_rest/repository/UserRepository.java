package ru.home.spring_boot_rest.repository;

import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestParam;
import ru.home.spring_boot_rest.service.Authorities;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Repository
public class UserRepository {

    public List<Authorities> getUserAuthorities(String user, String password) {
        List<Authorities> list = new ArrayList<>();
        if (user.equals("admin") && password.equals("admin")) {
            Collections.addAll(list, Authorities.READ, Authorities.WRITE);
        } else if (user.equals("user") && password.equals("user")) {
            Collections.addAll(list, Authorities.READ);
        }
        return list;
    }
}
