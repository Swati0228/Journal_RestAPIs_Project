package net.swatiisingh.JournalApplication.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthCheck {
    @GetMapping("health-checkUp")
    public String healthCheck(){
        return "FINE";
    }
}
