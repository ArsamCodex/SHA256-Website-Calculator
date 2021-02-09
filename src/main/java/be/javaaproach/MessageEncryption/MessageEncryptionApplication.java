package be.javaaproach.MessageEncryption;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

@SpringBootApplication
public class MessageEncryptionApplication {





		public static void main(String[] args) {
			SpringApplication.run(MessageEncryptionApplication.class, args);


	}

}
