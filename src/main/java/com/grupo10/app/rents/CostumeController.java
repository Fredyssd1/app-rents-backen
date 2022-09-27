package com.grupo10.app.rents;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/saludar")
public class CostumeController {
    
    @GetMapping("/hola")
    public String saludar(){
        return "<h1>hello group 10</h1>";
    }
}
