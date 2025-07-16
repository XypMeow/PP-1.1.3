package jm.task.core.jdbc;

import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;
import jm.task.core.jdbc.util.Util;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        UserService userService = new UserServiceImpl();
        userService.createUsersTable();
        userService.saveUser("Alexey", "Petrov", (byte) 53);
        userService.saveUser("Roman", "Pavlov", (byte) 26);
        userService.saveUser("Artyom", "Alexeev", (byte) 24);
        userService.saveUser("Anastasia", "Lobanova", (byte) 33);
        List<User> allUsers = userService.getAllUsers();
        System.out.println("\nВсе пользователи базы данных:");
        for (User user : allUsers) {
            System.out.println(user);
        }
        userService.cleanUsersTable();
        userService.dropUsersTable();
    }
}
