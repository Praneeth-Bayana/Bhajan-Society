package com.bs.bs.Service.Impl;

import com.bs.bs.Model.DTO.ContactDTO;
import com.bs.bs.Model.Entity.Contact;
import com.bs.bs.Repository.ContactRepo;
import com.bs.bs.Service.ContactService;
import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContactServiceImpl implements ContactService{
    @Autowired
    private ContactRepo contactRepo;

    @Override
    public String addContact(ContactDTO contactDTO) throws JSONException {
        Contact contact = new Contact(
                contactDTO.getContactId(),
                contactDTO.getContactName(),
                contactDTO.getContactEmail(),
                contactDTO.getContactSubject(),
                contactDTO.getContactPhone(),
                contactDTO.getContactMessage()
        );
        contactRepo.save(contact);
        JSONObject jsonResponse = new JSONObject();
        jsonResponse.put("contactId", contact.getContactId());
        jsonResponse.put("contactName", contact.getContactName());
        jsonResponse.put("contactEmail", contact.getContactEmail());
        jsonResponse.put("contactSubject", contact.getContactSubject());
        jsonResponse.put("contactPhone", contact.getContactPhone());
        jsonResponse.put("contactMessage", contact.getContactMessage());
        return jsonResponse.toString();
    }

    @Override
    public List<Contact> findAllMessages() {
        return contactRepo.findAll();
    }
}
