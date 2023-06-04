package com.bs.bs.Controller;

import com.bs.bs.Model.Entity.Events;
import com.bs.bs.Model.Entity.User;
import com.bs.bs.Request.EventRequest;
import com.bs.bs.Service.EventService;
import com.bs.bs.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.*;
import org.springframework.security.core.context.SecurityContextHolder;

import java.util.List;

@RestController
@RequestMapping("/bajansociety/events")
@CrossOrigin(origins = "https://bhajansociety.onrender.com")
public class EventController {
    @Autowired
    private EventService eventService;

    @Autowired
    private UserService userService;

    @PostMapping("/saveEvent")
    @ResponseStatus(HttpStatus.CREATED)
    public List<Events> saveAllEvents(@RequestBody List<Events> events){
        return eventService.saveEvents(events);
    }

    @PostMapping("/addEvent")
    public ResponseEntity<Void> addEventToUserProfile(@RequestBody List<EventRequest> eventRequests) {
        // Retrieve the authenticated user's details from the security context
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();

        // Assuming the user is already authenticated, you can retrieve the user details
        // from the security context.
        // For simplicity, let's assume the user details are stored in the principal object.
        // You should adapt this based on your authentication mechanism.
        String userId = ((User) authentication.getPrincipal()).getUserId();

        User user = userService.getUserById(userId);
        if (user == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND); // User not found
        }

        // Create Event objects for each event request and associate them with the user
        for (EventRequest eventRequest : eventRequests) {
            Events event = new Events();
            event.setEventName(eventRequest.getEventName());
            event.setPaymentMode(eventRequest.getPaymentMode());
            event.setUserName(user); // Associate the event with the user
            user.getEvents().add(event); // Add the event to the user's list of events
        }

        // Save the user with the updated events
        userService.saveUser(user);

        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @GetMapping("/listAllEvents")
    public List<Events> getAllEvents(){
        return eventService.findAllEvents();
    }

//    @PutMapping("/updateEvent")
//    public List<Events> updateEvent(@RequestBody List<Events> events){
//        return eventService.modifyEvent(events);
//    }

    @PutMapping("/updateEvent")
    public Events updateEvent(@RequestBody Events events){
        return eventService.modifyEvent(events);
    }

    @DeleteMapping("/deleteEvent/{id}")
    public String removeEvent(@PathVariable Long id){
        return eventService.deleteEvent(id);
    }

}
