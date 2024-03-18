package com.bs.bs.Service;

import com.bs.bs.Model.DTO.ContactDTO;
import com.bs.bs.Model.Entity.Contact;
import org.json.JSONException;
import org.springframework.stereotype.Service;

import java.util.List;

public interface ContactService {
    String addContact(ContactDTO contactDTO) throws JSONException;

    List<Contact> findAllMessages();
}
