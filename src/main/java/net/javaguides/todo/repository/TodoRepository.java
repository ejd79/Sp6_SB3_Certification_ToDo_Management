package net.javaguides.todo.repository;

import net.javaguides.todo.entity.Todo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

public interface TodoRepository extends JpaRepository<Todo, Long> {

    @Override
    @Transactional(propagation = Propagation.NEVER)
    <S extends Todo> S save(S entity);
}
