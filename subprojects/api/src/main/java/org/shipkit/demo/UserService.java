package org.shipkit.demo;

public interface UserService {
    void persist(String username);
    String findByName(String name);
}
