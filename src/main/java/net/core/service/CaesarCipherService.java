package net.core.service;

import org.springframework.stereotype.Service;

@Service
public class CaesarCipherService {

    public String encrypt(String text, int shift) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < text.length(); i++) {
            char charAt = text.charAt(i);
            if (Character.isLetter(charAt)) {
                char base = Character.isLowerCase(charAt) ? 'a' : 'A';
                char encryptedChar = (char) ((charAt - base + shift) % 26 + base);
                result.append(encryptedChar);
            } else {
                result.append(charAt);
            }
        }

        return result.toString();
    }

    public String decrypt(String text, int shift) {
        return encrypt(text, 26 - shift);
    }
}
