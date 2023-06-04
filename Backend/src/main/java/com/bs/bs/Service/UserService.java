package com.bs.bs.Service;

import com.bs.bs.Model.DTO.LoginDTO;
import com.bs.bs.Model.DTO.UserDTO;
import com.bs.bs.Model.Entity.User;
import com.bs.bs.Response.LoginResponse;
import org.json.JSONException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {
    String addUser(UserDTO userDTO) throws JSONException;

    LoginResponse loginUser(LoginDTO loginDTO) throws JSONException;

    User getUserById(String userId); // Add this method

    void saveUser(User user); // Add this method

    void logout();

    List<User> findAllUsers();
}
