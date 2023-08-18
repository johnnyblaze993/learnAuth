package com.roxy.repositories;

import com.roxy.entities.Users;
import io.micronaut.data.jdbc.annotation.JdbcRepository;
import io.micronaut.data.model.query.builder.sql.Dialect;
import io.micronaut.data.repository.CrudRepository;

@JdbcRepository(dialect = Dialect.POSTGRES) // specify the dialect here
public interface UsersRepository extends CrudRepository<Users, Long> {
    // your repository methods

}