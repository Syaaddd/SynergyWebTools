package net.core.synergywebtools.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Base64;

@RestController
public class UtilityController {

    @GetMapping("/encode")
    public String encodeToBase64(@RequestParam String input) {
        return Base64.getEncoder().encodeToString(input.getBytes());
    }

    @GetMapping("/decode")
    public String decodeFromBase64(@RequestParam String input) {
        return new String(Base64.getDecoder().decode(input));
    }
}
