import com.google.gson.Gson;
import redis.clients.jedis.Jedis;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Main {
    public static void main(String[] args) {
        int[] a={3,5,3,4};
      new Solution().numRescueBoats(a,5);
    }
}


