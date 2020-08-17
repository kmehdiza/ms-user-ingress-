package msuser.ingress.controller;

import lombok.RequiredArgsConstructor;
import msuser.ingress.model.User;
import msuser.ingress.service.UserService;
import msuser.ingress.service.impl.UserServiceImpl;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Validated
@RequiredArgsConstructor
@RequestMapping("/user")
@RestController
public class UserController {

    private final UserServiceImpl userService;

    @PostMapping
    public void createUser(@Validated @RequestBody User user){
        userService.createUser(user);
    }
}
