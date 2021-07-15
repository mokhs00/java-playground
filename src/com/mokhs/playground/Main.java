package com.mokhs.playground;

public class Main {

    public static void main(String[] args) {

        String message = "mokhs XD";

        Base64Encoder base64Encoder = new Base64Encoder();
        Encoder iBase64Encoder = new Encoder(base64Encoder);

        String encode = iBase64Encoder.encode(message);
        System.out.println(encode);

    }
}
