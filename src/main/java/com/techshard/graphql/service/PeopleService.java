package com.techshard.graphql.service;

import com.techshard.graphql.dao.entity.People;
import com.techshard.graphql.dao.repository.PeopleRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class PeopleService {

    private final PeopleRepository peopleRepository ;

    public PeopleService(final PeopleRepository peopleRepository) {
        this.peopleRepository = peopleRepository ;
    }

    @Transactional
    public People createPeople(final String name, final String height, final String mass, final String gender, final String homeWorld) {
        final People people = new People();
        people.setName(name);
        people.setHeight(height);
        people.setMass(mass);
        people.setGender(gender);
        people.setHomeWorld(homeWorld);
        return this.peopleRepository.save(people);
    }

    @Transactional(readOnly = true)
    public List<People> getAllPeoples(final int count) {
        return this.peopleRepository.findAll().stream().limit(count).collect(Collectors.toList());
    }

    @Transactional(readOnly = true)
    public List<People> getAll() {
        return this.peopleRepository.findAll();
    }

    @Transactional(readOnly = true)
    public Optional<People> getPeople(final int id) {
        return this.peopleRepository.findById(id);
    }

}
