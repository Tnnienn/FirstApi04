package co.develhope.FirstApi04.controllers;

import org.springframework.http.HttpHeaders;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("headers")
public class HeaderController {

    @GetMapping
    public String getHeaders(@RequestHeader(HttpHeaders.HOST) String host) {
        String[] hostArray = host.split(":");
        StringBuilder sb = new StringBuilder();
        sb.append("Host Name: ").append(hostArray[0]);
        sb.append("\nPort: ").append(hostArray[1]);
        return sb.toString().trim();
    }
}
