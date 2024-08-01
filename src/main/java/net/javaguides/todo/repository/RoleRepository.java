package net.javaguides.todo.repository;

import net.javaguides.todo.entity.Roles;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Roles, Long> {

}
