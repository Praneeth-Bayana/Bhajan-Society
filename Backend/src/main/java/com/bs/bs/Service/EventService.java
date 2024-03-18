package com.bs.bs.Service;

import com.bs.bs.Model.Entity.Events;

import java.util.List;

public interface EventService {
    List<Events> saveEvents(List<Events> events);

    Events findAllEvents(Events events);

    List<Events> findAllEvents();

    Events modifyEvent(Events events);

    String deleteEvent(Long id);
}
