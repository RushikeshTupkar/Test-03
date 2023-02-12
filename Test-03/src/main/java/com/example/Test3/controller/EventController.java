package com.example.Test3.controller;

import com.example.Test3.model.Event;
import com.example.Test3.model.IeventInterface;
import com.example.Test3.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/event")
public class EventController {
    @Autowired
    IeventInterface eventInterface;

    @PostMapping("/addEvent")
    public String addStudentInDatabase(@RequestBody Event event){
        return eventInterface.addEvent(event);
    }
    @GetMapping("/getAllEvents")
    public List<Event> getAllEvents(){
        return eventInterface.getAllEvents();
    }

    @PutMapping("/updateEvent")
    public String updateEvent(@RequestBody Event event){
        return eventInterface.updateEvent(event);
    }

    @DeleteMapping("/deleteEvent/{id}")
    public String deleteEvent(@PathVariable Integer id){
        return eventInterface.deleteEvent(id);
    }

    @GetMapping("/get_Events_by_date/{date}")
    public List<Event> getEventsByDate(@PathVariable String date){
        return eventInterface.getDataByDate(date);
    }
}
