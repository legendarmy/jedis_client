package jedis_client;

import redis.clients.jedis.Jedis;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        Jedis jedis = new Jedis("127.0.0.1", 6379);
        jedis.set("hello1", "world1");
        String value = jedis.get("hello1");
        System.out.println(value);
    }
}
