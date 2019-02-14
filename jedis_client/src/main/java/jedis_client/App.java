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
        // Jedis jedis = new Jedis("127.0.0.1", 6379);
        // jedis.set("hello1", "world1");
        // String value = jedis.get("hello1");
        // System.out.println(value);
        App app = new App();
        app.jedisBasic();
    }

    public void jedisBasic()
    {
        Jedis jedis = null;
        try {
            jedis = new Jedis("127.0.0.1", 6379);
            jedis.get("hello1");
        } catch (Exception e) {
            //TODO: handle exception
            System.out.println(e.getMessage());
        } finally {
            if (jedis != null)
                jedis.close();
        }
    }
}
