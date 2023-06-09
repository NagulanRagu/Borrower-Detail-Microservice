package com.lms.BI.FeignClient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;

import com.lms.BI.Pojo.AuthResponse;

@FeignClient(url = "https://ctslms03.azurewebsites.net/", name = "auth")
public interface FeignAuthorization {
    
    @GetMapping("/validate")
    public ResponseEntity<AuthResponse> getValidity(@RequestHeader("Authorization") String token);
}
