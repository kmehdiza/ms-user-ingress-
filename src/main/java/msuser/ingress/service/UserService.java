package msuser.ingress.service;


import msuser.ingress.model.User;

public interface UserService {

    void createUser(User user);

    User getCurrentUser();

    User saveUser(User user);

    void userUpdated(User user);
}
