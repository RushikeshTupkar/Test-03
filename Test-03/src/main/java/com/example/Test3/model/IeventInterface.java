package com.example.Test3.model;

import java.util.List;

public interface IeventInterface {

    String addEvent(Event event);
    List<Event> getAllEvents();

    String updateEvent(Event event);

    String deleteEvent(Integer id);

    List<Event>getDataByDate(String date);
}
