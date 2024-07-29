package dio.web_api_controller.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

    @GetMapping("/welcome")
    public String welcome(){
        return "Bem vindo a minha primeira API RestFull";
    }

}