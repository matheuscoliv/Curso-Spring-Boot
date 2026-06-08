package med.voll.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello") /*Qual é a url que esse controller vai responder ("/hello")*/
public class HelloController {

    @GetMapping
    public String olaMundo() {
        return "Hello World!";
    }
}
