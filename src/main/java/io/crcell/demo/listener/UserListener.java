package io.crcell.demo.listener;

import io.crcell.demo.entities.User;
import io.crcell.demo.entities.store.UserRepository;
import io.crcell.pramework.eventable.consumer.ConsumerImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Slf4j
@Component
public class UserListener extends ConsumerImpl<User, Long> {

  private final UserRepository userRepository;


  public UserListener(UserRepository userRepository) {
    super(User.class);
    this.userRepository = userRepository;
  }

  @Override
  public User handleSave(User entity) {
    return userRepository.save(entity);
  }

  @Override
  public Boolean handleDelete(Long id) {
    userRepository.deleteById(id);
    Optional<User> byId = userRepository.findById(id);
    return !byId.isPresent();
  }
}

