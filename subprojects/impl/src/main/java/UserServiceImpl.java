import org.shipkit.demo.UserService;

public class UserServiceImpl implements UserService {
    @Override
    public void persist(String username) {
        System.out.println("persisted = " + username);
    }

    @Override
    public String findByName(String name) {
        return name;
    }
}
