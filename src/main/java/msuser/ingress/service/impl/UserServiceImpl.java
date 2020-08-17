package msuser.ingress.service.impl;

import lombok.RequiredArgsConstructor;
import msuser.ingress.exception.AlreadyExistException;
import msuser.ingress.exception.InvalidStateException;
import msuser.ingress.model.User;
import msuser.ingress.repository.UserRepository;
import msuser.ingress.service.UserService;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Stream;

@RequiredArgsConstructor
@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;


    @Transactional
    @Override
    public void createUser(User user) {
        if (!checkNulls(user)){
            throw new InvalidStateException("Field cannot be null!");
        }

        Optional<User> userOptional = userRepository.findByUsername(user.getUsername());
        if (!userOptional.isPresent()){
            userRepository.save(
                    User.builder()
                    .username(user.getUsername())
                    .firstName(user.getFirstName())
                    .lastName(user.getLastName())
                    .phone(user.getPhone())
                    .photo(user.getPhoto())
                    .email(user.getEmail())
                    .build()
            );
        }else {
            throw new AlreadyExistException("Username already exist:" +user.getUsername());
        }
    }

    private boolean checkNulls(User user){
        return Stream.of(user.getUsername(),user.getFirstName(),user.getLastName(),user.getEmail()).allMatch(Objects::nonNull);
    }
}
