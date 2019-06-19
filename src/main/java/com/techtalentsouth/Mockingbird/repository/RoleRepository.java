package com.techtalentsouth.Mockingbird.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.techtalentsouth.Mockingbird.model.Role;

@Repository
public interface RoleRepository extends CrudRepository<Role, Long> {
    Role findByRole(String role);
}
