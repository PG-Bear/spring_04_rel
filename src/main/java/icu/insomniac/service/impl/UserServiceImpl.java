package icu.insomniac.service.impl;

import icu.insomniac.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    public void save() {
        System.out.println("save...");
    }

    public void update() {
        System.out.println("update...");
    }

    public void delete() {
        System.out.println("delete...");
    }
}
