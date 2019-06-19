package com.techtalentsouth.Mockingbird.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.techtalentsouth.Mockingbird.model.Tag;

@Repository
public interface TagRepository extends CrudRepository<Tag, Long>  {
    Tag findByPhrase(String phrase);
}
