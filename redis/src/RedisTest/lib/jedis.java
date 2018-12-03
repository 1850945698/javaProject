package RedisTest.lib;

import redis.clients.jedis.Jedis;

public class jedis {
public static void main(String[] args) {
	Jedis myjedis=new Jedis("127.0.0.1",6379);
	//Jedis myjedis=new Jedis("192.168.19.47",6379);
//	myjedis.auth("useroot");

	myjedis.auth("123");
	System.out.println(myjedis.ping());
	
	//String
	myjedis.set("name", "value1");
	myjedis.get("name");
	myjedis.append("name","value");
	myjedis.incr("hello");
	myjedis.decr("hello");
	//list<String> resutllist=myjedis.mget(key1,key2,key3);
	myjedis.bgsave();
	myjedis.setbit("choice",100,true);
	myjedis.echo("string");

}
}
