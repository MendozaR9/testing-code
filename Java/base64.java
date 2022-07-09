package Java;

import java.nio.charset.StandardCharsets;
import java.util.Base64;

public class base64 {
    public static void main(String[] args) {
        String encoded = Base64.getEncoder().withoutPadding().encodeToString("password".getBytes(StandardCharsets.UTF_8));
        byte[] result = Base64.getDecoder().decode(encoded);
        System.out.println(encoded);
        System.out.println(new String(result));
    }
}
