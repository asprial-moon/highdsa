package pers.husen.highdsa.web.shiro.cache;

import org.springframework.beans.factory.annotation.Autowired;

import pers.husen.highdsa.service.redis.RedisOperation;
import pers.husen.highdsa.service.redis.RedisPools;

/**
 * @Desc 使用中间类解决RedisCache.jedisConnectionFactory的静态注入，从而使shiro实现第三方缓存
 *
 * @Author 何明胜
 *
 * @Created at 2018年3月30日 上午10:13:09
 * 
 * @Version 1.0.0
 */
public class ShiroRedisCacheTransfer {
	/**
	 * 注入静态redis操作示例
	 * 
	 * @param redisOperation
	 */
	@Autowired
	public ShiroRedisCacheTransfer(RedisOperation redisOperation, RedisPools redisPools) {
		ShiroRedisCache.setRedisFactory(redisOperation, redisPools);
	}
}