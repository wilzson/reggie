import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;
import redis.clients.jedis.Jedis;


import javax.annotation.Resource;
//@SpringBootTest
@RunWith(SpringRunner.class)
public class JedisTest {

    @Autowired
    private RedisTemplate redisTemplate;

//    @Test
//    public void Test() {
//        //1 获取连接
//        Jedis jedis = new Jedis("43.155.60.36",6379);
//        //2 执行具体操作
////        jedis.set("username","xiaoming");
//
//        String value = jedis.get("username");
//        System.out.println(value);
//
//        // 哈希
//        jedis.hset("myhash","addr","bg");
//        String hvalue = jedis.hget("myhash", "addr");
//        System.out.println(hvalue);
//
//        //3 关闭连接
//        jedis.close();
//    }

    @Test
    public void testString() {
        redisTemplate.opsForValue().set("city","guanghzhou");

    }
}
