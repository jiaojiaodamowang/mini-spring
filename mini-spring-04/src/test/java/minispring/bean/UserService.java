package minispring.bean;

public class UserService {

    private String name;

    private UserDao userDao;

    public UserService(){}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UserDao getUserDao() {
        return userDao;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void query(String name){
        System.out.println("query user info : " + userDao.queryUserName(name));
    }
}
