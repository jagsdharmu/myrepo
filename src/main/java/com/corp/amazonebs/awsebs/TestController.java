package com.corp.amazonebs.awsebs;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @RequestMapping("/test")
    public String testMethod(){
        return "Hello from amazonebs";
    }

    @PostMapping("/jsonTest")
    public String testJson(@RequestBody Device device){
        return device.getMake() + device.getModel() + device.getVendor();
    }

    @PostMapping(path="/xmlTest")
    public String testXml(@RequestBody Device device){
        return device.getMake() + device.getModel() + device.getVendor();
    }
}
