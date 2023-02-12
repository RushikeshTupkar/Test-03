package com.example.Test3.repository;

import com.example.Test3.model.Event;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IEventRepository extends JpaRepository<Event,Integer> {

}
