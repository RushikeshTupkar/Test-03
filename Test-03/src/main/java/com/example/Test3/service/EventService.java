package com.example.Test3.service;

import com.example.Test3.model.Event;
import com.example.Test3.model.IeventInterface;
import com.example.Test3.model.Student;
import com.example.Test3.repository.IEventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EventService implements IeventInterface {
@Autowired
    IEventRepository eventRepository;


    @Override
    public String addEvent(Event event) {
//         ev.setEventName("Rushi");
//         ev.setLocationOfEvent("ICOER");
//         ev.setStart_date("2023-02-19");
//         ev.setStartTime("10-05-05");
//         ev.setEndTime("11-02-03");
         Event ev2 = eventRepository.save(event);
        return "added";
    }

    @Override
    public List<Event> getAllEvents() {
        return eventRepository.findAll();
    }

    @Override
    public String updateEvent(Event event) {
         Integer id = event.getEventId();
        List<Integer>me = new ArrayList<>();
        me.add(id);
        List<Event>out =  eventRepository.findAllById(me);
        Event ev1 = out.get(0);
        ev1.setEventId(id);
        ev1.setEventName(event.getEventName());
        ev1.setLocationOfEvent(event.getLocationOfEvent());
        ev1.setStartTime(event.getStartTime());
        ev1.setEndTime(event.getEndTime());
        ev1.setStart_date(event.getStart_date());
        eventRepository.save(ev1);
        return "Updated";
    }

    @Override
    public String deleteEvent(Integer id) {
        eventRepository.deleteById(id);
        return "Deleted";
    }

    @Override
    public List<Event> getDataByDate(String date) {
        List<Event>eventsOnDate = new ArrayList<>();
        List<Event>events = new ArrayList<>();
        eventsOnDate = eventRepository.findAll();
        for(Event ele:eventsOnDate){
            if(ele.getStart_date().equals(date)){
                events.add(ele);
            }
        }if(events.size()==0){
            Event ev = new Event();
            ev.setStart_date(date);
        }
        return events;

    }


}
