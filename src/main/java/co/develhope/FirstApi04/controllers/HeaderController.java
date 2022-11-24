package co.develhope.FirstApi04.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("headers")
public class HeaderController {

    @GetMapping
    public String getHeaders() {
        return null;
    }
}
