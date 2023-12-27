package com.example.demo.Controller;

import com.example.demo.Pojos.Response.DummyResponse;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AuthenticationController {

    @GetMapping(value = "/authenticate")
    public ResponseEntity<Object> getJson(){
        DummyResponse dummyResponse = new DummyResponse();
        dummyResponse.setId(1);
        dummyResponse.setName("santhosh");
        return new ResponseEntity<>(dummyResponse, HttpStatusCode.valueOf(200));
    }
}
