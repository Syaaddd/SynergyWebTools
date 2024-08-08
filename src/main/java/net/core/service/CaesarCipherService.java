package net.core.service;

import org.springframework.stereotype.Service;

@Service
public class CaesarCipherService {

    public String encrypt(String text, int shift) {
        // Logic for Caesar Cipher encryption
        return cipher(text, shift);
    }

    public String decrypt(String text, int shift) {
        // Logic for Caesar Cipher decryption
        return cipher(text, -shift);
    }

    private String cipher(String text, int shift) {
        StringBuilder result = new StringBuilder();
        for (char character : text.toCharArray()) {
            if (Character.isLetter(character)) {
                char base = Character.isLowerCase(character) ? 'a' : 'A';
                character = (char) ((character - base + shift) % 26 + base);
            }
            result.append(character);
        }
        return result.toString();
    }
}
