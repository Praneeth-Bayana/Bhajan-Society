package com.bs.bs.Controller;

import com.bs.bs.Model.DTO.ContactDTO;
import com.bs.bs.Model.Entity.Contact;
import com.bs.bs.Model.Entity.Events;
import com.bs.bs.Service.ContactService;
import org.json.JSONException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/bajansociety/user")
@CrossOrigin(origins = "https://bhajansociety.onrender.com")
public class ContactController {

    @Autowired
    private ContactService contactService;

    @PostMapping(path = "/saveContactForm")
    public String saveContact(@RequestBody ContactDTO contactDTO) throws JSONException {
        String id = contactService.addContact(contactDTO);
        return id;
    }

    @GetMapping("/listAllMessages")
    public List<Contact> getAllMessages(){
        return contactService.findAllMessages();
    }


}
