package com.encrypt;

import org.apache.commons.codec.binary.Base64;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import java.io.ByteArrayInputStream;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.util.logging.Logger;

/**
 * Encrypting transport to server request
 */
public class Transport {

    private static Logger _log = Logger.getLogger(Transport.class.getName());

    /**
     * Encrypting object
     * @param authorizeKey
     * @param <T> object
     * @return
     */
    public <T> String encode(String authorizeKey, T object) {
        String encryptData = "";
        byte[] keyBytes;
        Base64 b64 = new Base64();
        try {
            System.out.println("Encode Object: " + object.getClass().getName());
            keyBytes = b64.decode(authorizeKey);

            CertificateFactory certificateFactory = CertificateFactory.getInstance("X509");
            Certificate certificate = certificateFactory.generateCertificate(new ByteArrayInputStream(keyBytes));
            PublicKey publicKey = certificate.getPublicKey();

            Cipher cipher = Cipher.getInstance("RSA/ECB/PKCS1PADDING");
            cipher.init(Cipher.ENCRYPT_MODE, publicKey);
            JsonConverter jsonConverter = new JsonConverter();
            encryptData = Base64.encodeBase64String(cipher.doFinal(jsonConverter.objectToJson(object).getBytes()));
            System.out.println("Encrypt Data: " + encryptData);
        } catch (IllegalBlockSizeException e) {
            e.printStackTrace();
        } catch (BadPaddingException e) {
            e.printStackTrace();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        } catch (NoSuchPaddingException e) {
            e.printStackTrace();
        } catch (InvalidKeyException e) {
            e.printStackTrace();
        } catch (CertificateException e) {
            e.printStackTrace();
        }
        return encryptData;
    }

}