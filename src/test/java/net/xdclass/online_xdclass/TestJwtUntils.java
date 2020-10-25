package net.xdclass.online_xdclass;


import io.jsonwebtoken.Claims;
import net.xdclass.online_xdclass.utils.JwtUtils;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class TestJwtUntils {
    @Test
    public void testCheckJwt() {
        Claims claims = JwtUtils.checkJWT("eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJzdmVuIiwiaGVhZF9pbWciOiJodHRwczovL3hkLXZpZGVvLXBjLWltZy5vc3MtY24tYmVpamluZy5hbGl5dW5jcy5jb20veGRjbGFzc19wcm8vZGVmYXVsdC9oZWFkX2ltZy8xNS5qcGVnIiwiaWQiOjE0LCJuYW1lIjoic3ZlbiIsImlhdCI6MTYwMzAyNjUzNCwiZXhwIjoxNjAzMDg3MDE0fQ.qSDB-093kEQILuyDXIT_CCJwoYvedqfNP5kjCkIUXEU");
        System.out.println(claims);
    }
}
