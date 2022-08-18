package com.techshard.graphql.mutation;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.techshard.graphql.dao.entity.People;
import com.techshard.graphql.service.PeopleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PeopleMutation implements GraphQLMutationResolver {

    @Autowired
    private PeopleService peopleService;

    public People createPeople(final String name, final String height, final String mass, final String gender,final String homeWorld) {
        return this.peopleService.createPeople(name, height, mass, gender, homeWorld);
    }
}
