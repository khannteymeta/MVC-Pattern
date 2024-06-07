import controller.UserController;
import model.dto.UserDto;

public class Main {
    public static void main(String[] args) {
        UserController userController = new UserController();
        System.out.println(" ==> List of all users");
        userController.getAllUsers().forEach(System.out::println);
        System.out.println("\n ==> Add new user ");
        userController.addNewUser(new UserDto("meta", "meta@gmail.com"));
        userController.getAllUsers().forEach(System.out::println);
        System.out.println("\n ==> Delete user by id ");
        userController.deleteUserById(1);
        System.out.println("\n ==> List of all users ");
        userController.getAllUsers().forEach(System.out::println);
        System.out.println("\n ==> Update user by id ");
        userController.updateUser(3,new UserDto("alisa", "alisa@gmail.com"));
        System.out.println("\n ==> List of all users");
        userController.getAllUsers().forEach(System.out::println);
    }
}