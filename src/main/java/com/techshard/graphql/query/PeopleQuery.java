package com.techshard.graphql.query;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.techshard.graphql.dao.entity.People;
import com.techshard.graphql.service.PeopleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class PeopleQuery implements GraphQLQueryResolver {

    @Autowired
    private PeopleService peopleService;

    public List<People> getPeoples(final int count) {
        return this.peopleService.getAllPeoples(count);
    }

    public List<People> getAll() {
        return this.peopleService.getAll();
    }

    public Optional<People> getPeople(final int id) {
        return this.peopleService.getPeople(id);
    }

}
