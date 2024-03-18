package com.bs.bs.Service.Impl;

import com.bs.bs.Model.Entity.Events;
import com.bs.bs.Repository.EventRepo;
import com.bs.bs.Service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class EventServiceImpl implements EventService {

    @Autowired
    private EventRepo eventRepository;

    @Override
    public List<Events> saveEvents(List<Events> events) {
        for (Events event : events) {
            event.setId(UUID.randomUUID().getMostSignificantBits() & Long.MAX_VALUE);
        }
        return eventRepository.saveAll(events);
    }

    @Override
    public Events findAllEvents(Events events) {
        return null;
    }

    @Override
    public List<Events> findAllEvents(){
        return eventRepository.findAll();
    }

//    @Override
//    public List<Events> modifyEvent(List<Events> events) {
//        List<Events> updatedEventList = new ArrayList<>();
//        for(Events event : events){
//            Events eventExits = eventRepository.findByEventName(event.getEventName());
//            if(eventExits != null){
//                eventExits.setEventName(event.getEventName());
//                eventExits.setPaymentMode(event.getPaymentMode());
//                eventRepository.save(eventExits);
//                updatedEventList.add(eventExits);
//            }
//        }
//        return updatedEventList;
//    }

    @Override
    public Events modifyEvent(Events events) {
        Events eventExits = eventRepository.findById(events.getId()).get();
        eventExits.setEventName(events.getEventName());
        eventExits.setPaymentMode(events.getPaymentMode());
        return eventRepository.save(eventExits);
    }

    @Override
    public String deleteEvent(Long id){
        eventRepository.deleteById(id);
        return "Event is successfully deleted from the List!";
    }
}
