package minispring.bean;

import java.util.HashMap;
import java.util.Map;

public class UserDao {

    private static Map<String, String> hashMap = new HashMap<>();

    static {
        hashMap.put("Steve Rogers", "Captain America");
        hashMap.put("Tony Stark", "Iron Man");
        hashMap.put("Bruce Banner", "Hulk");
    }

    public String queryUserName(String userId) {
        return hashMap.get(userId);
    }
}
