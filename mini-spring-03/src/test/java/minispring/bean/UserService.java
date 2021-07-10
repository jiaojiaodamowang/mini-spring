package minispring.bean;

public class UserService {

    private String name;

    public UserService(){}

    public UserService(String name) {
        this.name = name;
    }

    public void query(){
        System.out.println("query user info : " + name);
    }
}
