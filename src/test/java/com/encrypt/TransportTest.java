package com.encrypt;

import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import static org.junit.Assert.assertEquals;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TransportTest {

    private static String encryptKey;
    private static String encryptData;
    private Transport transport;

    @Before
    public void setUp() {
        this.transport = new Transport();
    }

    @Test
    public void firstTestGetEncryptKey() {
        this.encryptKey = "MIIFZDCCA0wCCQDCexcfG2gzxDANBgkqhkiG9w0BAQUFADB0MQswCQYDVQQGEwJUVzEKMAgGA1UECAwBLjEPMA0GA1UEBwwGVGFpcGVpMRAwDgYDVQQKDAdDb21wYW55MQowCAYDVQQLDAEuMQowCAYDVQQDDAEuMR4wHAYJKoZIhvcNAQkBFg94eHh4eEBnbWFpbC5jb20wHhcNMTYwMzI4MTc0MzAwWhcNMTYwNDI3MTc0MzAwWjB0MQswCQYDVQQGEwJUVzEKMAgGA1UECAwBLjEPMA0GA1UEBwwGVGFpcGVpMRAwDgYDVQQKDAdDb21wYW55MQowCAYDVQQLDAEuMQowCAYDVQQDDAEuMR4wHAYJKoZIhvcNAQkBFg94eHh4eEBnbWFpbC5jb20wggIiMA0GCSqGSIb3DQEBAQUAA4ICDwAwggIKAoICAQCxhwxUDiI9hyp9Fike51k1I184lhv1xUjOREMKtF64U4OLqLq4EidHoB7A203n8i+83+u6Vt2BmdubGu3fR3kBcZXe1dfYqcM6BYwYaLoWzF0g/vdpUD7LJoTeskuoRwBN8dB52XcIPRLW0/y7RZYz8QwtFgstETFMLrGspFgvjhxFn2FXmW7+pzhbUVWGJFSGaPkcRXkC/QfEdLbwMCDQkHn33i3jZrzpbBNVlYyCn/SKwY9bk2UQ5UxZ5+6czeu8UnahbLa6WMlZMad+TV4SrzyRkcs9gegj2dRA+Rkc5cPuMQTQWeZs/6rwciv8DLFgppSCH/uJQPJtzvnmZW+WL8o1JsmPtcDB4ktoddLx3Lrz5HNfoXCQQHls9Q2hPsbx+VV8ITV+Sj2Fj1/fX/WSie0MKUJs17gjNBbjdCC71M6Urmz1sTLczflFRl32TA+ZHK6aigFtyXk56OhI7fOXMvKxiN/KUe6dgB//6QFzFs1RFkTbulfiK0OIZJXy2j7OwhAuIFK9N4EFpl/rOYNU2LEP1VtEW3MSxA0+2dNU+W4ir33sHcxm9/6f4Vtu41nAsmw1NlEsp4NXeWKiepdH9B5+wLBxmVXeV5/g5QnhA04tzYjmZmsPV4G4YNYRoUM9XHd+aI1ecINwr1QNaG3/R9ZUJKLyJ5Gx8qwtuqK/CwIDAQABMA0GCSqGSIb3DQEBBQUAA4ICAQCOE2afqV65xk/C/UnyiZFmn6vVvTwgkovuUnZuXuC7KdNEPaOsXYEJzzffmeMOd6CgatrilrGWhLv8Km+2PS9WcZnUzO3fZUkEqYLwzbCGKlfyW0XHHJ4oMJ66O1+SRBx3wN1kh2wXTZEvNI7ldl8YXj9tndLGJKNZz09lFBopa5sJlonqTUGgfWivO8e1U0Ql+9wK8CGQQPnz8iNwY4ysDsZAr5Xhbq239LrtDBEvcpI3BgYMjw368yVTOdku1RVuaJrEN3F3OZk5nKNTf1kihSXEs1rpbhVBr69t7BDv4AOlc8mMcG6N1W+TZnJs/1mjAeNhhz9XYZ5j3YBUnATzUFvsxtOaSD832jmHmpkqqFL588AAOkqFUG+OuAkbreuyQYEGi2Dq1Y8g0B3GwD6sN5YYTGLygleD0snruUORkflTH7fyR93K1rbUaI3oP296isMJTJ32xXeLUv5LpCAnYsf7qhSohKDTIwYkznbkyHlkErZA0giAM8kx4spiSQc8W+RJU2lToDzer0PtEXdoa7pRQVNPO/sSc8PJV9RFFZbwNLMr0FHSYo50oYH9BSDdqXVMazsMV4dbWZU3itwr/cEDIQLzOAo03t+yeKT3l2L5lBzpxQHeRRO01tdn3E3/62enba4XNI/l5HivCp1RhjK2lkx1T9yCJSbZzduXKQ==";
    }

    @Test
    public void secondTestEncryptData() {
        User user = new User();
        user.setId("1");
        user.setUuid("uuid-1");
        user.setAge("28");
        user.setGender("men");
        this.encryptData = this.transport.encode(this.encryptKey, user);
    }

}