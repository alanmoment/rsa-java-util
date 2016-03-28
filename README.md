# README #

It's maven project and dependence by [rsa-util](https://github.com/alanmoment/rsa-util)

Transport encrypting for client to server. I use `X509EncodedKeySpec` when I get `RSA` public key for encrypt data.

### Use Libraries ###

* Gson
* Base64

### Build jar ###

    $ mvn clean install -Dmaven.test.skip=true

### Use ###

Authorize key it's base64 encode. Must be base64 decode before to decrypt.

Get encrypt authorize key

    String enAuthorizeKey = authorizeManager.getEnKey();

Get `Transport` object

	TransportEncrypt transportEncrypt = new TransportEncrypt();

Encrypt data

	String encryptData = transportEncrypt.encode(encryptKey, new User(1, "alan"));

**Exception**

If your project import Gson too. Have throw exception `Unable to execute dex: Multiple dex files define Lcom/google/gson/JsonSerializer;`