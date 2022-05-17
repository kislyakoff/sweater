package by.kislyakoff.sweater.repository;

import org.springframework.data.repository.CrudRepository;

import by.kislyakoff.sweater.domain.Message;

public interface MessageRepo extends CrudRepository<Message, Integer> {

}
