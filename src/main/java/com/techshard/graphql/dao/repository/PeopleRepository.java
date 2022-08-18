package com.techshard.graphql.dao.repository;

import com.techshard.graphql.dao.entity.People;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PeopleRepository extends JpaRepository<People, Integer> {
}
