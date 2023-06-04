package com.bs.bs.Controller;

import com.bs.bs.Model.DTO.LoginDTO;
import com.bs.bs.Model.DTO.UserDTO;
import com.bs.bs.Model.Entity.Contact;
import com.bs.bs.Model.Entity.User;
import com.bs.bs.Response.LoginResponse;
import com.bs.bs.Service.UserService;
import org.json.JSONException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/bajansociety/user")
@CrossOrigin(origins = "https://bhajansociety.onrender.com")
public class UserController {
    @Autowired
    private UserService userService;
    @PostMapping(path = "/register")
    public String registerUser(@RequestBody UserDTO userDTO) throws JSONException {
        String id = userService.addUser(userDTO);
        return id;
    }

    @PostMapping(path = "/login")
    public ResponseEntity<?> loginUser(@RequestBody LoginDTO loginDTO) throws JSONException {
        LoginResponse loginResponse = userService.loginUser(loginDTO);
        return ResponseEntity.ok(loginResponse);
    }

    @GetMapping(path = "/logout")
    public ResponseEntity<?> logoutUser() {
        userService.logout();
        return ResponseEntity.ok("Logout successful");
    }

    @GetMapping("/listAllUsers")
    public List<User> getAllUsers(){
        return userService.findAllUsers();
    }

}
