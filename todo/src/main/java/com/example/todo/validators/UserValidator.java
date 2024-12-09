package com.example.todo.validators;

import com.example.todo.dto.UserDto;

import java.util.ArrayList;
import java.util.List;
import org.springframework.util.StringUtils;

public class UserValidator{
    public static List<String> validateUser(UserDto user){
        List<String> errors = new ArrayList<>();
        if (user == null) {
            errors.add("Please fill the First name");
            errors.add("Please fill the Last name");
            errors.add("Please fill the User name");
            errors.add("Please fill the user Email");
            errors.add("Please fill the User Password");
            return errors;
        }

        if (StringUtils.isEmpty(user.getFirstName())) {
            errors.add("Please fill the First name");
        }
        if (StringUtils.isEmpty(user.getLastName())) {
            errors.add("Please fill the Last name");
        }
        if (StringUtils.isEmpty(user.getUserName())) {
            errors.add("Please fill the User name");
        }
        if (StringUtils.isEmpty(user.getEmail())) {
            errors.add("Please fill the user Email");
        }
        if (StringUtils.isEmpty(user.getPassword())) {
            errors.add("Please fill the User Password");
        }

        return errors;
    }

    public static List<String> validateUserCredentials(String email, String password) {
        List<String> errors = new ArrayList<>();
        if (StringUtils.isEmpty(email)) {
            errors.add("Email is empty");
        }
        if (StringUtils.isEmpty(password)) {
            errors.add("Password is empty");
        }
        return errors;
    }
}
