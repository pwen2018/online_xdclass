package net.xdclass.online_xdclass.utils;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import net.xdclass.online_xdclass.model.entity.User;

import java.util.Date;

/**
 * Json Web Token 工具类
 * 1.生成的token,是可以通过base64解密出明文信息的
 * 2.base64进行解密出明文信息,修改再进行编码,则会解密失败
 * 3.无法作废已颁布的token,除非改密钥
 */
public class JwtUtils {
    /**
     * subject 颁布者
     */
    private static final String SUBJECT = "sven";

    /**
     * 过期时间
     */
    private static final long EXPIRE = 60000 * 60 * 24 * 7;

    /**
     * 密钥
     */
    private static final String SECRET = "sven.class";


    /**
     * 根据用户信息,生成令牌
     *
     * @param user
     * @return
     */
    public static String geneJsonWebToken(User user) {
        // 设置颁布者
        String token = Jwts.builder().setSubject(SUBJECT)
                .claim("head_img", user.getHeadImg())
                .claim("id", user.getId())
                .claim("name", user.getName())
                // 生成时间
                .setIssuedAt(new Date())
                // 过期时间
                .setExpiration(new Date(System.currentTimeMillis() + EXPIRE))
                // 加密
                .signWith(SignatureAlgorithm.HS256, SECRET)
                .compact();
        return token;
    }

    /**
     * 校验 token
     * @param token
     * @return
     */
    public static Claims checkJWT(String token) {
        try {
            // 获取密钥
            final Claims claims = Jwts.parser().setSigningKey(SECRET)
                    // 获取token
                    .parseClaimsJws(token)
                    .getBody();

            return claims;
        } catch (Exception e) {
            return null;
        }
    }


}
